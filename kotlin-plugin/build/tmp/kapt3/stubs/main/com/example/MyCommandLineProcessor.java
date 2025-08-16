package com.example;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lcom/example/MyCommandLineProcessor;", "Lorg/jetbrains/kotlin/compiler/plugin/CommandLineProcessor;", "()V", "pluginId", "", "getPluginId", "()Ljava/lang/String;", "pluginOptions", "", "Lorg/jetbrains/kotlin/compiler/plugin/AbstractCliOption;", "getPluginOptions", "()Ljava/util/Collection;", "processOption", "", "option", "value", "configuration", "Lorg/jetbrains/kotlin/config/CompilerConfiguration;", "Companion", "kotlin-plugin"})
@kotlin.OptIn(markerClass = {org.jetbrains.kotlin.compiler.plugin.ExperimentalCompilerApi.class})
@com.google.auto.service.AutoService(value = {org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor.class})
public final class MyCommandLineProcessor implements org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor {
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.config.CompilerConfigurationKey<java.lang.Boolean> KEY_ENABLED = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.config.CompilerConfigurationKey<java.util.List<java.lang.String>> KEY_ANNOTATIONS = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String pluginId = "my-plugin";
    @org.jetbrains.annotations.NotNull
    private final java.util.Collection<org.jetbrains.kotlin.compiler.plugin.AbstractCliOption> pluginOptions = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.MyCommandLineProcessor.Companion Companion = null;
    
    public MyCommandLineProcessor() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getPluginId() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<org.jetbrains.kotlin.compiler.plugin.AbstractCliOption> getPluginOptions() {
        return null;
    }
    
    @java.lang.Override
    public void processOption(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.compiler.plugin.AbstractCliOption option, @org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.config.CompilerConfiguration configuration) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R+\u0010\u0003\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u000b0\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/example/MyCommandLineProcessor$Companion;", "", "()V", "KEY_ANNOTATIONS", "Lorg/jetbrains/kotlin/config/CompilerConfigurationKey;", "", "", "kotlin.jvm.PlatformType", "getKEY_ANNOTATIONS", "()Lorg/jetbrains/kotlin/config/CompilerConfigurationKey;", "KEY_ENABLED", "", "getKEY_ENABLED", "kotlin-plugin"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.jetbrains.kotlin.config.CompilerConfigurationKey<java.lang.Boolean> getKEY_ENABLED() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.jetbrains.kotlin.config.CompilerConfigurationKey<java.util.List<java.lang.String>> getKEY_ANNOTATIONS() {
            return null;
        }
    }
}