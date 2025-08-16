package com.example;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/example/MyCompilerRegistrar;", "Lorg/jetbrains/kotlin/compiler/plugin/CompilerPluginRegistrar;", "()V", "supportsK2", "", "getSupportsK2", "()Z", "registerExtensions", "", "Lorg/jetbrains/kotlin/compiler/plugin/CompilerPluginRegistrar$ExtensionStorage;", "configuration", "Lorg/jetbrains/kotlin/config/CompilerConfiguration;", "kotlin-plugin"})
@kotlin.Suppress(names = {"unused"})
@kotlin.OptIn(markerClass = {org.jetbrains.kotlin.compiler.plugin.ExperimentalCompilerApi.class})
@com.google.auto.service.AutoService(value = {org.jetbrains.kotlin.compiler.plugin.CompilerPluginRegistrar.class})
public final class MyCompilerRegistrar extends org.jetbrains.kotlin.compiler.plugin.CompilerPluginRegistrar {
    
    public MyCompilerRegistrar() {
        super();
    }
    
    @java.lang.Override
    public boolean getSupportsK2() {
        return false;
    }
    
    @java.lang.Override
    public void registerExtensions(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.compiler.plugin.CompilerPluginRegistrar.ExtensionStorage $this$registerExtensions, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.config.CompilerConfiguration configuration) {
    }
}