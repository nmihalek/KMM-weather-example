@file:SuppressWarnings("MaxLineLength")

object Libs {

    object Android {
        const val material = "com.google.android.material:material:${Versions.material}"
    }

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val navigation = "androidx.navigation:navigation-compose:${Versions.navigation}"
    }

    object Koin {
        const val core = "io.insert-koin:koin-core:${Versions.koin}"
        const val compose = "io.insert-koin:koin-androidx-compose:${Versions.koin}"
        const val android = "io.insert-koin:koin-android:${Versions.koin}"
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

    object KotlinX {
        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
        const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinCoroutines}"
        const val dateTime = "org.jetbrains.kotlinx:kotlinx-datetime:${Versions.dateTime}"
        const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.serialization}"
    }

    object Test {
        const val junit = "junit:junit:${Versions.junit}"
        const val compose = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
        const val koin = "io.insert-koin:koin-test:${Versions.koin}"
        const val koinJUnit = "io.insert-koin:koin-test-junit4:${Versions.koin}"
        const val mockk = "io.mockk:mockk:${Versions.mockk}"
        const val mockkCommon = "io.mockk:mockk-common:${Versions.mockk}"
    }

    object Logging {
        const val kermit = "co.touchlab:kermit:${Versions.kermit}"
        const val kermitGradlePlugin = "co.touchlab:kermit-gradle-plugin:${Versions.kermit}"
    }

    object Versions {
        const val appCompat = "1.4.2"
        const val material = "1.6.1"
        const val constraintLayout = "1.0.1"

        const val accompanist = "0.25.0"
        const val compose = "1.2.0"
        const val composeUiTooling = "1.2.0"
        const val composeActivity = "1.5.0"
        const val composeViewModel = "2.5.0"
        const val composeThemeAdapter = "1.1.14"
        const val coreTesting = "2.1.0"
        const val dateTime = "0.3.3"
        const val mockk = "1.12.4"
        const val navigation = "2.5.0"

        const val kotlinCoroutines = "1.6.4"

        const val ktor = "2.0.3"

        const val koin = "3.2.0"

        const val junit = "4.13.2"

        const val kotlin = "1.7.20"
        const val kermit = "1.1.3"
        const val serialization = "1.3.3"

    }
}