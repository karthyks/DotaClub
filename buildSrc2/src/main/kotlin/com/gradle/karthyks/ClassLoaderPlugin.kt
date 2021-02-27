package com.gradle.karthyks

import org.gradle.api.Plugin
import org.gradle.api.Project

class ClassLoaderPlugin : Plugin<Project> {
    override fun apply(target: Project) {
    }
}

object Versions {
    const val androidGradle = "4.2.0-beta04"
    const val kotlinVersion = "1.4.30"
    const val jvmTarget = "1.8"
    const val coroutines = "1.4.1"

    object Android {
        const val applicationId = "com.github.karthyks.dotaclub"
        const val compileSdkVersion = 30
        const val buildToolsVersion = "30.0.2"
        const val minSdkVersion = 23
        const val targetSdkVersion = 30

        const val versionCode = 1
        const val versionName = "1.0.0"

        const val composeVersion = "1.0.0-beta01"
        const val activityCompose = "1.3.0-alpha03"

        const val kotlinCore = "1.3.2"
        const val appCompat = "1.2.0"
        const val material = "1.2.1"
        const val lifeCycleRuntime = "2.3.0-beta01"
        const val hilt = "2.32-alpha"
    }

    object Test {
        const val junit = "4.13.1"

        object AndroidX {
            const val junit = "1.1.2"
            const val espressoCore = "3.3.0"
        }
    }
}

object Libraries {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val androidGradle = "com.android.tools.build:gradle:${Versions.androidGradle}"
    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    const val hiltClassPath =
        "com.google.dagger:hilt-android-gradle-plugin:${Versions.Android.hilt}"

    object Android {
        const val kotlinCore = "androidx.core:core-ktx:${Versions.Android.kotlinCore}"
        const val coroutines =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.Android.appCompat}"
        const val materialDesign =
            "com.google.android.material:material:${Versions.Android.material}"
        const val composeFoundation = "androidx.compose.foundation:foundation:${Versions.Android.composeVersion}"
        const val composeUI = "androidx.compose.ui:ui:${Versions.Android.composeVersion}"
        const val composeMaterialUI =
            "androidx.compose.material:material:${Versions.Android.composeVersion}"
        const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.Android.composeVersion}"
        const val activityCompose = "androidx.activity:activity-compose:${Versions.Android.activityCompose}"
        const val composeMaterialIconsCore = "androidx.compose.material:material-icons-core:${Versions.Android.composeVersion}"
        const val composeMaterialIconsExt = "androidx.compose.material:material-icons-extended:${Versions.Android.composeVersion}"
        const val lifeCycleRuntime =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Android.lifeCycleRuntime}"
        const val hilt = "com.google.dagger:hilt-android:${Versions.Android.hilt}"
        const val hiltKapt = "com.google.dagger:hilt-compiler:${Versions.Android.hilt}"
    }

    object Test {
        const val jUnit = "junit:junit:${Versions.Test.junit}"

        object AndroidX {
            const val jUnit = "androidx.test.ext:junit:${Versions.Test.AndroidX.junit}"
            const val espressoCore =
                "androidx.test.espresso:espresso-core:${Versions.Test.AndroidX.espressoCore}"
        }
    }
}