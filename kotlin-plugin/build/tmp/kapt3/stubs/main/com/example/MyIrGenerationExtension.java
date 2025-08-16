package com.example;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/MyIrGenerationExtension;", "Lorg/jetbrains/kotlin/backend/common/extensions/IrGenerationExtension;", "annotations", "", "", "messageCollector", "Lorg/jetbrains/kotlin/cli/common/messages/MessageCollector;", "(Ljava/util/List;Lorg/jetbrains/kotlin/cli/common/messages/MessageCollector;)V", "generate", "", "moduleFragment", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "pluginContext", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "log", "message", "kotlin-plugin"})
public final class MyIrGenerationExtension implements org.jetbrains.kotlin.backend.common.extensions.IrGenerationExtension {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> annotations = null;
    @org.jetbrains.annotations.Nullable
    private final org.jetbrains.kotlin.cli.common.messages.MessageCollector messageCollector = null;
    
    public MyIrGenerationExtension(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> annotations, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.cli.common.messages.MessageCollector messageCollector) {
        super();
    }
    
    private final void log(java.lang.String message) {
    }
    
    @java.lang.Override
    public void generate(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrModuleFragment moduleFragment, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.backend.common.extensions.IrPluginContext pluginContext) {
    }
    
    public MyIrGenerationExtension() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public org.jetbrains.kotlin.ir.declarations.IrDeclaration resolveSymbol(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.symbols.IrSymbol symbol, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.TranslationPluginContext context) {
        return null;
    }
}