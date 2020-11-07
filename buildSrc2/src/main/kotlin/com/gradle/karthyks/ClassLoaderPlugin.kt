package com.gradle.karthyks

import org.gradle.api.Plugin
import org.gradle.api.Project

class ClassLoaderPlugin: Plugin<Project> {
    override fun apply(target: Project) {
    }
}

object Versions {

    const val kotlinVersion = "1.4.10"
    const val jvmTarget = "1.8"
    const val coroutines = "1.3.9"

    object Android {
        const val applicationId = "com.github.karthyks.dotaclub"
        const val compileSdkVersion = "30"
        const val buildToolsVersion = "30.0.2"
        const val minSdkVersion = 23
        const val targetSdkVersion = 30

        const val versionCode = 1
        const val versionName = "1.0.0"

        const val composeVersion = "1.0.0-alpha04"

        const val kotlinCore = "1.3.1"
        const val appCompat = "1.2.0"
        const val material = "1.2.1"
    }

    object Test {
        const val junit = "4.13"

        object AndroidX {
            const val junit = "1.1.2"
            const val espressoCore = "3.3.0"
        }
    }
}

object Libraries {

    val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
}