@file:SuppressWarnings("MaxLineLength")
object Dependencies {

    object Android {
        const val material = "com.google.android.material:material:${Versions.material}"
        const val googleServices = "com.google.gms:google-services:${Versions.googleServices}"
        const val firebaseBom = "com.google.firebase:firebase-bom:${Versions.firebaseBom}"
        const val firebaseAnalytics = "com.google.firebase:firebase-analytics-ktx"
        const val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics-ktx"
        const val crashlyticsGradle = "com.google.firebase:firebase-crashlytics-gradle:${Versions.crashlyticsGradle}"
    }

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val navigation = "androidx.navigation:navigation-compose:${Versions.navigation}"
    }

    object Core {
        const val coreKt: String = "com.htec.android:core-kt:" + Versions.coreHtec
        const val coreTesting: String = "androidx.arch.core:core-testing:${Versions.coreTesting}"
    }

    object Database {
        const val sqlDelightPlugin = "com.squareup.sqldelight:gradle-plugin:${Versions.sqlDelight}"
        const val sqlDelightRuntime = "com.squareup.sqldelight:runtime:${Versions.sqlDelight}"
        const val driverAndroid = "com.squareup.sqldelight:android-driver:${Versions.sqlDelight}"
        const val driverIOS = "com.squareup.sqldelight:native-driver:${Versions.sqlDelight}"
        const val coroutinesExtensions = "com.squareup.sqldelight:coroutines-extensions:${Versions.sqlDelight}"
    }

    object KotlinX {
        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
        const val coroutinesTasks = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.kotlinCoroutines}"
        const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinCoroutines}"
        const val dateTime = "org.jetbrains.kotlinx:kotlinx-datetime:${Versions.dateTime}"
        const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.serialization}"
    }

    object Koin {
        const val core = "io.insert-koin:koin-core:${Versions.koin}"
        const val compose = "io.insert-koin:koin-androidx-compose:${Versions.koin}"
        const val android = "io.insert-koin:koin-android:${Versions.koin}"
    }

    object Ktor {
        const val core = "io.ktor:ktor-client-core:${Versions.ktor}"
        const val ktorAndroid = "io.ktor:ktor-client-okhttp:${Versions.ktor}"
        const val ktorIOS = "io.ktor:ktor-client-ios:${Versions.ktor}"
        const val logging = "io.ktor:ktor-client-logging:${Versions.ktor}"
        const val serialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
        const val jsonSerialization = "io.ktor:ktor-serialization-kotlinx-json:${Versions.ktor}"
        const val contentNegotiation = "io.ktor:ktor-client-content-negotiation:${Versions.ktor}"
        const val clientMock = "io.ktor:ktor-client-mock:${Versions.ktor}"
    }

    object Compose {
        const val activity = "androidx.activity:activity-compose:${Versions.composeActivity}"
        const val material = "androidx.compose.material:material:${Versions.composeUiTooling}"
        const val ui = "androidx.compose.ui:ui:${Versions.compose}"
        const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.composeUiTooling}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout-compose:${Versions.constraintLayout}"
        const val viewModel =
            "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.composeViewModel}"
        const val themeAdapter =
            "com.google.android.material:compose-theme-adapter:${Versions.composeThemeAdapter}"
        const val accompanistUiController =
            "com.google.accompanist:accompanist-systemuicontroller:${Versions.accompanist}"
        const val accompanistNavAnimation =
            "com.google.accompanist:accompanist-navigation-animation:${Versions.accompanist}"
        const val accompanistPermissions =
            "com.google.accompanist:accompanist-permissions:${Versions.accompanist}"
    }

    object MLKit {
        const val barcodeAndroid = "com.google.mlkit:barcode-scanning:${Versions.mlKitBarcode}"
    }

    object CameraX {
        const val core = "androidx.camera:camera-core:${Versions.camerax}"
        const val camera2 = "androidx.camera:camera-camera2:${Versions.camerax}"
        const val lifecycle = "androidx.camera:camera-lifecycle:${Versions.camerax}"
        const val video = "androidx.camera:camera-video:${Versions.camerax}"
        const val view = "androidx.camera:camera-view:${Versions.camerax}"
        const val extensions = "androidx.camera:camera-extensions:${Versions.camerax}"
    }

    object Test {
        const val junit = "junit:junit:${Versions.junit}"
        const val compose = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
        const val koin = "io.insert-koin:koin-test:${Versions.koin}"
        const val koinJUnit = "io.insert-koin:koin-test-junit4:${Versions.koin}"
        const val mockk = "io.mockk:mockk:${Versions.mockk}"
        const val mockkCommon = "io.mockk:mockk-common:${Versions.mockk}"
    }

    object BuildTools {
        const val flavors = "com.codingfeline.buildkonfig:buildkonfig-gradle-plugin:${Versions.flavors}"
    }

    object Logging {
        const val kermit = "co.touchlab:kermit:${Versions.kermit}"
        const val kermitCrashlytics = "co.touchlab:kermit-crashlytics:${Versions.kermit}"
        const val kermitGradlePlugin = "co.touchlab:kermit-gradle-plugin:${Versions.kermit}"
    }
}

object Modules {
    const val junit = "test-junit"
    const val testCommon = "test-common"
    const val testAnnotationCommon = "test-annotations-common"
}

object Versions {
    const val firebaseBom = "30.2.0"
    const val googleServices = "4.3.13"
    const val appCompat = "1.4.2"
    const val material = "1.6.1"
    const val constraintLayout = "1.0.1"

    const val accompanist = "0.25.0"
    const val compose = "1.2.0"
    const val composeUiTooling = "1.2.0"
    const val composeActivity = "1.5.0"
    const val composeViewModel = "2.5.0"
    const val composeThemeAdapter = "1.1.14"
    const val coreHtec = "2.0.1"
    const val coreTesting = "2.1.0"
    const val dateTime = "0.3.3"
    const val mockk = "1.12.4"
    const val navigation = "2.5.0"

    const val kotlinCoroutines = "1.6.4"

    const val ktor = "2.0.3"

    const val koin = "3.2.0"

    const val junit = "4.13.2"

    const val kotlin = "1.7.20"
    const val sqlDelight = "1.5.3"
    const val mlKitBarcode = "17.0.2"
    const val camerax = "1.1.0-rc02"
    const val serialization = "1.3.3"

    const val flavors = "0.13.3"
    const val kermit = "1.1.3"
    const val crashlyticsGradle = "2.9.1"
}

object Repositories {
    const val htec = "http://git.htec.rs:9081/nexus/content/repositories/android-release"
}
