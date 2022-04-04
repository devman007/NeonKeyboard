plugins {
    id("com.android.application") version "7.1.2"
    kotlin("android") version "1.5.20"
    kotlin("kapt") version "1.5.20"
    id("com.google.firebase.crashlytics") version "2.8.1"
    id("com.google.gms.google-services") version "4.3.10"
}
android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.neon.keyboard.fancyfonts.fancy.keyboard"
//        applicationId = "com.neonkeyboard.themes"
        minSdk = 23
        targetSdk = 31
        versionCode = 2
        versionName = "1.0_test"
        setProperty("archivesBaseName", "Neon Keyboard  $versionName")
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        javaCompileOptions {
            annotationProcessorOptions {
                arguments += mapOf(
                    Pair("room.schemaLocation", "$projectDir/schemas"),
                    Pair("room.incremental", "true"),
                    Pair("room.expandProjection", "true")
                )
            }
        }
    }

    buildTypes {
        getByName("debug") {

//            isMinifyEnabled = true
//            isShrinkResources = true
            isDebuggable = true
            resValue("string", "appId", "ca-app-pub-3940256099942544~3347511713")
            resValue("string", "appOpenId", "ca-app-pub-3940256099942544/3419835294")
            resValue("string", "splashFullScreenAdId", "ca-app-pub-3940256099942544/1033173712")
            resValue("string", "splashNativeId", "ca-app-pub-3940256099942544/2247696110")
            resValue("string", "enableDisableNativeId", "ca-app-pub-3940256099942544/2247696110")
            resValue("string", "bottomNavClicksAdID", "ca-app-pub-3940256099942544/1033173712")
            resValue("string", "listNativeAdId", "ca-app-pub-3940256099942544/2247696110")
            resValue("string", "themeAlternateClickAdId", "ca-app-pub-3940256099942544/1033173712")

            resValue(
                "string",
                "keyboardTestScreenNativeId",
                "ca-app-pub-3940256099942544/2247696110"
            )

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        getByName("release") {

            isMinifyEnabled = true
            isShrinkResources = true


            resValue("string", "appId", "ca-app-pub-8764236594340763~9081208128")
            resValue("string", "appOpenId", "ca-app-pub-8764236594340763/5458013108")
            resValue("string", "splashFullScreenAdId", "ca-app-pub-8764236594340763/2324228088")
            resValue("string", "splashNativeId", "ca-app-pub-8764236594340763/1066986738")
            resValue("string", "enableDisableNativeId", "ca-app-pub-8764236594340763/6127741720")
            resValue("string", "bottomNavClicksAdID", "ca-app-pub-8764236594340763/8611306978")
            resValue("string", "themeAlternateClickAdId", "ca-app-pub-8764236594340763/7298225305")
            resValue("string", "listNativeAdId", "ca-app-pub-8764236594340763/4672061961")
            resValue(
                "string",
                "keyboardTestScreenNativeId",
                "ca-app-pub-8764236594340763/1065442142"
            )

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }


    }


    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }



    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }



    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }


    buildFeatures {
        viewBinding = true
    }

}

dependencies {

    implementation("com.github.bumptech.glide:glide:4.12.0")
    implementation("com.intuit.sdp:sdp-android:1.0.6")

    implementation(platform("com.google.firebase:firebase-bom:29.1.0"))
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.google.firebase:firebase-crashlytics-ktx")
//    implementation("com.google.firebase:firebase-messaging-ktx:23.0.2")


    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.4.1")
//    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
//    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.4.1")

    implementation(project(mapOf("path" to ":aosp")))
    implementation("androidx.room", "room-ktx", "2.4.0-beta02")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")

    kapt("androidx.room", "room-compiler", "2.4.0-beta02")
    val koinVersion = "3.1.4"
    implementation("io.insert-koin:koin-core:$koinVersion")
    implementation("io.insert-koin:koin-android:$koinVersion")

}