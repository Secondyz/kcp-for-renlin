package com.example;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0016\u00a8\u0006\u0013"}, d2 = {"Lcom/example/MyPlugin;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilerPluginSupportPlugin;", "()V", "apply", "", "target", "Lorg/gradle/api/Project;", "applyToCompilation", "Lorg/gradle/api/provider/Provider;", "", "Lorg/jetbrains/kotlin/gradle/plugin/SubpluginOption;", "kotlinCompilation", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilation;", "getCompilerPluginId", "", "getPluginArtifact", "Lorg/jetbrains/kotlin/gradle/plugin/SubpluginArtifact;", "isApplicable", "", "gradle-plugin"})
@kotlin.Suppress(names = {"unused"})
@com.google.auto.service.AutoService(value = {org.jetbrains.kotlin.gradle.plugin.KotlinCompilerPluginSupportPlugin.class})
public final class MyPlugin implements org.jetbrains.kotlin.gradle.plugin.KotlinCompilerPluginSupportPlugin {
    
    public MyPlugin() {
        super();
    }
    
    @java.lang.Override
    public void apply(@org.jetbrains.annotations.NotNull
    org.gradle.api.Project target) {
    }
    
    @java.lang.Override
    public boolean isApplicable(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.gradle.plugin.KotlinCompilation<?> kotlinCompilation) {
        return false;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.gradle.api.provider.Provider<java.util.List<org.jetbrains.kotlin.gradle.plugin.SubpluginOption>> applyToCompilation(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.gradle.plugin.KotlinCompilation<?> kotlinCompilation) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getCompilerPluginId() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact getPluginArtifact() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact getPluginArtifactForNative() {
        return null;
    }
}