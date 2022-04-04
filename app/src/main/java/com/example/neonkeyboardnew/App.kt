package com.example.neonkeyboardnew

import android.app.Application
import com.example.neonkeyboardnew.ads.OpenApp
import com.example.neonkeyboardnew.koin.getApplicationModules
import com.google.android.gms.ads.MobileAds
import com.google.firebase.FirebaseApp
import keyboard.neon.newboard.KeyboardInitClass
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

@Suppress("unused")
class App : Application() {


    override fun onCreate() {
        super.onCreate()

        FirebaseApp.initializeApp(this)
        MobileAds.initialize(this)
        KeyboardInitClass(this).onCreate()
        OpenApp(this)

        startKoin {
            androidContext(this@App)
            androidLogger(Level.INFO)
            modules(
                getApplicationModules()
            )
        }
    }


}