import org.gradle.kotlin.dsl.`kotlin-dsl`
plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

gradlePlugin {
    plugins.register("class-loader-plugin") {
        id = "class-loader-plugin"
        implementationClass = "com.gradle.karthyks.ClassLoaderPlugin"
    }
}
repositories {
    google()
    jcenter()
}
allprojects {
    repositories {
        google()
        jcenter()
    }
}