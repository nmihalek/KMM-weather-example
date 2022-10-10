plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("co.touchlab.kermit")
    kotlin("plugin.serialization") version Versions.kotlin
}

kotlin {
    android()
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                with(Libs.KotlinX) {
                    implementation(coroutinesCore)
                    implementation(dateTime)
                }

                with(Libs.Ktor) {
                    implementation(core)
                    implementation(logging)
                    implementation(serialization)
                    implementation(jsonSerialization)
                    implementation(contentNegotiation)
                }

                with(Libs.Koin) {
                    api(core)
                }

                with(Libs.Test) {
                    api(koin)
                }

                with(Libs.Logging) {
                    implementation(kermit)
                }
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
                with(Modules) {
                    implementation(kotlin(testCommon))
                    implementation(kotlin(testAnnotationCommon))
                }

                with(Dependencies.KotlinX) {
                    implementation(coroutinesTest)
                }
                with(Dependencies.Test) {
                    implementation(mockkCommon)
                }
                with(Dependencies.Ktor) {
                    implementation(clientMock)
                }
            }
        }
        val androidMain by getting {
            dependencies {
                with(Dependencies.Ktor) {
                    implementation(ktorAndroid)
                }
            }
        }
        val androidTest by getting
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
            dependencies {
                with(Dependencies.Ktor) {
                    implementation(ktorIOS)
                }
            }
        }
        val iosX64Test by getting
        val iosArm64Test by getting
        val iosSimulatorArm64Test by getting
        val iosTest by creating {
            dependsOn(commonTest)
            iosX64Test.dependsOn(this)
            iosArm64Test.dependsOn(this)
            iosSimulatorArm64Test.dependsOn(this)
        }
    }
}

android {
    namespace = "com.example.kmmdemo"
    compileSdk = 32
    defaultConfig {
        minSdk = 26
        targetSdk = 32
    }
}