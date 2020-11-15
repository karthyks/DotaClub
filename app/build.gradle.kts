import com.gradle.karthyks.Libraries
import com.gradle.karthyks.Versions
import com.gradle.karthyks.Versions.Android

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    id("class-loader-plugin") }

android {
    compileSdkVersion(Android.compileSdkVersion)

    defaultConfig {
        applicationId = Android.applicationId
        minSdkVersion(Android.minSdkVersion)
        targetSdkVersion(Android.targetSdkVersion)
        versionCode = Android.versionCode
        versionName = Android.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {
    implementation(Libraries.kotlin)
    implementation(Libraries.Android.kotlinCore)
    implementation(Libraries.Android.appCompat)
    implementation(Libraries.Android.materialDesign)
    implementation(Libraries.Android.composeUI)
    implementation(Libraries.Android.composeMaterialUI)
    implementation(Libraries.Android.hilt)
    implementation(Libraries.Android.hiltKapt)
    implementation(Libraries.Android.composeUiTooling)
    implementation(Libraries.Android.lifeCycleRuntime)
    testImplementation(Libraries.Test.jUnit)
    androidTestImplementation(Libraries.Test.AndroidX.jUnit)
    androidTestImplementation(Libraries.Test.AndroidX.espressoCore)
}