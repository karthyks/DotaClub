import com.gradle.karthyks.Versions

plugins {
    id("java-library")
    id("kotlin")
    id("class-loader-plugin")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}")
}
java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}