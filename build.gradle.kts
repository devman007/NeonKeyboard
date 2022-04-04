// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    base // adds clean task to root project
}
//id("org.jetbrains.kotlin.android") version "1.6.10" apply false
subprojects {
    repositories {
        mavenCentral()
        google()
    }


//    buildscript {
//        repositories {
//            gradlePluginPortal()
//        }
//        dependencies {
////            classpath("com.android.tools.build:gradle:7.1.1")
////            classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
////            classpath("org.jetbrains.kotlin:kotlin-serialization:1.6.10")
//            classpath("com.google.gms:google-services:4.3.10")
//            classpath("com.google.firebase:firebase-crashlytics-gradle:2.8.1")
//
//        }
//    }
}