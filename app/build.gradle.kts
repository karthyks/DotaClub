import com.gradle.karthyks.Libraries
import com.gradle.karthyks.Versions
import com.gradle.karthyks.Versions.Android

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    id("class-loader-plugin")
    id("project-report")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion(Android.compileSdkVersion)

    defaultConfig {
        applicationId = Android.applicationId
        minSdkVersion(Android.minSdkVersion)
        targetSdkVersion(Android.targetSdkVersion)
        versionCode = Android.versionCode
        versionName = Android.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        javaCompileOptions {
            annotationProcessorOptions {
                arguments["room.incremental"] = "true"
            }
        }
    }

    buildTypes {
        getByName("release") {
            minifyEnabled(true)
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Versions.jvmTarget
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Android.composeVersion
        kotlinCompilerVersion = Versions.kotlinVersion
    }

    packagingOptions {
        exclude("META-INF/LICENSE")
//        exclude("META-INF/gradle/incremental.annotation.processors")
    }
}

dependencies {
    implementation(Libraries.kotlin)
    implementation(Libraries.Android.kotlinCore)
    implementation(Libraries.Android.appCompat)
    implementation(Libraries.Android.materialDesign)
    implementation(Libraries.Android.composeUI)
    implementation(Libraries.Android.composeMaterialUI)
    implementation(Libraries.Android.composeFoundation)
    implementation(Libraries.Android.composeUiTooling)
    implementation(Libraries.Android.activityCompose)
    implementation(Libraries.Android.composeMaterialIconsCore)
    implementation(Libraries.Android.composeMaterialIconsExt)
    implementation(Libraries.Android.hilt)
    kapt(Libraries.Android.hiltKapt)
    implementation(Libraries.Android.lifeCycleRuntime)
    testImplementation(Libraries.Test.jUnit)
    androidTestImplementation(Libraries.Test.AndroidX.jUnit)
    androidTestImplementation(Libraries.Test.AndroidX.espressoCore)
}