package com.example

// data classではなくopen classであることに注意してください
// demo実行時に次のようなエラーが出たらおそらくそれが原因です。
// Caused by: org.gradle.api.reflect.ObjectInstantiationException: Could not create an instance of type com.example.MyPluginExtension.
open class MyPluginExtension {
    var enabled: Boolean = true
    var annotations: List<String> = emptyList()
}
