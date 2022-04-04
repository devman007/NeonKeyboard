plugins {
    id("com.android.library") version "7.1.2"
    kotlin("android") version "1.5.20"
    kotlin("kapt") version "1.5.20"
    kotlin("plugin.serialization") version "1.5.20"
}

android {
    compileSdk = 31
    buildToolsVersion = "30.0.3"
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
        freeCompilerArgs = listOf(
            "-Xallow-result-return-type",
            "-Xopt-in=kotlin.RequiresOptIn",
            "-Xopt-in=kotlin.contracts.ExperimentalContracts"
        )
    }
//
//    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
//        kotlinOptions {
//            jvmTarget = "1.8"
//        }
//    }

    defaultConfig {
//        applicationId = "dev.patrickgold.florisboard"
        minSdk = 23
        targetSdk = 31

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"


    }


//    externalNativeBuild {
//        cmake {
//            path("src/main/cpp/CMakeLists.txt")
//        }
//    }

    buildTypes {
        getByName("debug") {


            resValue("string", "bannerId", "ca-app-pub-3940256099942544/6300978111")
            proguardFiles.add(getDefaultProguardFile("proguard-android-optimize.txt"))
        }


        getByName("release") {

            resValue("string", "bannerId", "ca-app-pub-8764236594340763/4567248047")
            proguardFiles.add(getDefaultProguardFile("proguard-android-optimize.txt"))
        }
    }

    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }

//    lint {
//        isAbortOnError = false
//    }

    buildFeatures {
        viewBinding = true
    }


}

dependencies {


    api("androidx.core", "core-ktx", "1.7.0")
    implementation("androidx.activity", "activity-ktx", "1.2.1")
    api("androidx.appcompat", "appcompat", "1.4.0")
    api("androidx.constraintlayout", "constraintlayout", "2.1.2")
    api("com.google.android.material", "material", "1.4.0")

    api("androidx.lifecycle", "lifecycle-service", "2.2.0")
    api("org.jetbrains.kotlinx", "kotlinx-coroutines-android", "1.4.2")
    api("org.jetbrains.kotlinx", "kotlinx-serialization-json", "1.1.0")
    api("androidx.preference", "preference-ktx", "1.1.1")
    api("com.jakewharton.timber", "timber", "4.7.1")

    implementation("androidx.room", "room-ktx", "2.4.0-beta02")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    kapt("androidx.room", "room-compiler", "2.4.0-beta02")

    api("com.airbnb.android:lottie:3.6.1")
    implementation("androidx.autofill", "autofill", "1.1.0")

    implementation("androidx.fragment", "fragment-ktx", "1.3.0")
    implementation("com.google.android.flexbox", "flexbox", "3.0.0")
    implementation("com.jaredrummler", "colorpicker", "1.1.0")
    implementation("com.nambimobile.widgets", "expandable-fab", "1.0.2")
    api("com.google.android.gms:play-services-ads-lite:20.6.0")
//    api("com.google.android.gms:play-services-ads-lite:20.6.0")


    testImplementation(kotlin("test"))
    testImplementation("androidx.test", "core", "1.3.0")
}
