import com.gradle.karthyks.Libraries

plugins {
    id("java-library")
    id("kotlin")
    id("class-loader-plugin")
}

dependencies {
    implementation(Libraries.kotlin)
}
java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}