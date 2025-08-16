package com.example

import org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext
import org.jetbrains.kotlin.backend.common.extensions.IrGenerationExtension
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext
import org.jetbrains.kotlin.ir.IrStatement
import org.jetbrains.kotlin.ir.declarations.IrFunction
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment
import org.jetbrains.kotlin.ir.expressions.IrCall
import org.jetbrains.kotlin.ir.expressions.IrExpression
import org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl
import org.jetbrains.kotlin.ir.util.fqNameWhenAvailable
import org.jetbrains.kotlin.ir.util.hasAnnotation
import org.jetbrains.kotlin.ir.util.parentClassOrNull
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.cli.common.messages.MessageCollector
import org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity

class MyIrGenerationExtension(
    private val annotations: List<String> = listOf("com.example.HogeAnnotation"),
    private val messageCollector: MessageCollector? = null
) : IrGenerationExtension {

    private fun log(message: String) {
        messageCollector?.report(CompilerMessageSeverity.WARNING, "IR_PLUGIN: $message")
        System.err.println("IR_PLUGIN: $message") // fallback
    }

    override fun generate(moduleFragment: IrModuleFragment, pluginContext: IrPluginContext) {
        log("MyIrGenerationExtension is running!")
        log("Looking for annotations: $annotations")

        moduleFragment.transformChildren(
            object : IrElementTransformerVoidWithContext() {
                private val keyCounters = mutableMapOf<String, Int>()
                private var insideAnnotatedFunction = false

                override fun visitFunctionNew(declaration: IrFunction): IrStatement {
                    val prev = insideAnnotatedFunction

                    // アノテーションの検出をデバッグ
                    val hasTargetAnnotation = if (annotations.isEmpty()) {
                        true
                    } else {
                        annotations.any { annotationFqName ->
                            val hasAnno = declaration.hasAnnotation(FqName(annotationFqName))
                            if (hasAnno) {
                                log("Found annotated function: ${declaration.name} with annotation: $annotationFqName")
                            }
                            hasAnno
                        }
                    }

                    insideAnnotatedFunction = insideAnnotatedFunction || hasTargetAnnotation

                    val result = super.visitFunctionNew(declaration)
                    insideAnnotatedFunction = prev
                    return result
                }

                override fun visitCall(expression: IrCall): IrExpression {
                    val result = super.visitCall(expression) as IrCall

                    // 詳細なデバッグ情報を出力
                    IrDebugHelper.printIrCall(result)

                    // アノテーションが指定されている場合、アノテーション付き関数内でのみ処理
                    if (!insideAnnotatedFunction && annotations.isNotEmpty()) {
                        return result
                    }

                    // Component1.invokeの呼び出しをより正確に特定
                    if (isComponentInvoke(result) && result.getValueArgument(0) == null) {
                        val componentName = extractComponentName(result)
                        val keyValue = generateKeyForComponent(componentName)

                        log("Injecting key '$keyValue' into component call")

                        result.putValueArgument(
                            0,
                            IrConstImpl.string(
                                startOffset = expression.startOffset,
                                endOffset = expression.endOffset,
                                type = pluginContext.irBuiltIns.stringType,
                                value = keyValue
                            )
                        )
                    }
                    return result
                }

                private fun generateKeyForComponent(name: String): String {
                    val count = keyCounters.getOrDefault(name, 0) + 1
                    keyCounters[name] = count
                    return "$name-$count"
                }

                private fun extractComponentName(call: IrCall): String {
                    // より詳細なコンポーネント名の抽出
                    val owner = call.symbol.owner
                    val parentClass = owner.parentClassOrNull

                    return when {
                        parentClass != null -> parentClass.name.asString()
                        else -> {
                            // dispatchReceiverからコンポーネント名を取得を試みる
                            val dispatchReceiver = call.dispatchReceiver
                            if (dispatchReceiver != null) {
                                val receiverType = dispatchReceiver.type.toString()
                                // 型名から最後の部分を抽出 (例: Component1<Tag, DSL> -> Component1)
                                receiverType.substringAfterLast('.').substringBefore('<')
                            } else {
                                "component"
                            }
                        }
                    }
                }

                private fun isComponentInvoke(call: IrCall): Boolean {
                    val owner = call.symbol.owner
                    val fqName = owner.fqNameWhenAvailable?.asString()

                    // デバッグ出力
                    log("Checking call: $fqName")

                    // より柔軟な判定条件
                    return when {
                        // 完全一致
                        fqName == "net.kigawa.renlin.tag.component.Component1.invoke" -> true
                        // 短縮形での一致
                        fqName == "net.kigawa.renlin.Component1.invoke" -> true
                        // 関数名とパラメータでの判定
                        owner.name.asString() == "invoke" &&
                                owner.valueParameters.size >= 2 && // key, block
                                owner.valueParameters[0].name.asString() == "key" &&
                                owner.valueParameters[1].name.asString() == "block" -> {
                            log("Found invoke by parameter structure")
                            true
                        }
                        // 演算子オーバーロードの判定
                        owner.name.asString() == "invoke" &&
                                fqName?.contains("Component") == true -> {
                            log("Found component invoke by name pattern")
                            true
                        }
                        else -> false
                    }
                }
            },
            null
        )
    }
}

// デバッグ用のヘルパークラス
object IrDebugHelper {
    fun printIrFunction(function: IrFunction) {
        System.err.println("=== IR Function Debug ===")
        System.err.println("Name: ${function.name}")
        System.err.println("FQ Name: ${function.fqNameWhenAvailable}")
        System.err.println("Annotations: ${function.annotations.map { it.type.toString() }}")
        System.err.println("Parameters: ${function.valueParameters.map { "${it.name}: ${it.type}" }}")
        System.err.println("========================")
    }

    fun printIrCall(call: IrCall) {
        System.err.println("=== IR Call Debug ===")
        System.err.println("Symbol: ${call.symbol.owner.fqNameWhenAvailable}")
        System.err.println("Function Name: ${call.symbol.owner.name}")
        System.err.println("Parameters: ${call.symbol.owner.valueParameters.map { "${it.name}: ${it.type}" }}")
        System.err.println("Arguments: ${(0 until call.valueArgumentsCount).map { call.getValueArgument(it) }}")
        System.err.println("Dispatch Receiver: ${call.dispatchReceiver?.type}")
        System.err.println("Extension Receiver: ${call.extensionReceiver?.type}")
        System.err.println("====================")
    }
}