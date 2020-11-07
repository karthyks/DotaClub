import com.gradle.karthyks.Versions.Android
import com.gradle.karthyks.Versions

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    id("class-loader-plugin")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        applicationId = Android.applicationId
        minSdkVersion(23)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"

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
        jvmTarget = "1.8"
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.Android.composeVersion
        kotlinCompilerVersion = Versions.kotlinVersion
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}")
    implementation("androidx.core:core-ktx:${Android.kotlinCore}")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.compose.ui:ui:${Android.composeVersion}")
    implementation("androidx.compose.material:material:${Android.composeVersion}")
    implementation("androidx.ui:ui-tooling:${Android.composeVersion}")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.0-beta01")
    testImplementation("junit:junit:4.13.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
}