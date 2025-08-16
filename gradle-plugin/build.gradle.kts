plugins {
    kotlin("jvm")
    kotlin("kapt")
    `java-gradle-plugin`
    `maven-publish`
}

gradlePlugin {
    plugins {
        create("myPlugin") {
            id = "com.example.my-plugin"
            implementationClass = "com.example.MyPlugin"  // 次のステップで実装
        }
    }
}

dependencies {
    implementation(kotlin("stdlib", "1.9.0"))
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin-api:1.9.0")

    compileOnly("com.google.auto.service:auto-service:1.1.1")
    kapt("com.google.auto.service:auto-service:1.1.1")
}

publishing {
    publications {
        register("mavenJava", MavenPublication::class) {
            from(components["kotlin"])
            groupId = "com.example.my-plugin"
            artifactId = "com.example.my-plugin.gradle.plugin"
            version = "1.0.0"
        }
    }
    repositories {
        mavenLocal()
    }
}