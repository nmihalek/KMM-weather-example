import org.jetbrains.kotlin.config.JvmAnalysisFlags.useIR

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.kmmdemo.android"
    compileSdk = 32
    defaultConfig {
        applicationId = "com.example.kmmdemo.android"
        minSdk = 26
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))

    with(Dependencies.Android) {
        implementation(material)
    }

    with(Dependencies.AndroidX) {
        implementation(appCompat)
        implementation(navigation)
    }

    with(Dependencies.Compose) {
        implementation(accompanistUiController)
        implementation(accompanistNavAnimation)
        implementation(accompanistPermissions)
        implementation(activity)
        implementation(material)
        implementation(constraintLayout)
        implementation(uiTooling)
        implementation(viewModel)
        implementation(ui)
        implementation(themeAdapter)
    }

    with(Dependencies.Koin) {
        implementation(core)
        implementation(compose)
        implementation(android)
    }
}
