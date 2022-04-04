package com.example.neonkeyboardnew.koin


import com.example.neonkeyboardnew.ads.AdsManager
import com.example.neonkeyboardnew.db.ThemeRepo
import org.koin.dsl.module

val ListModules = module {


    single {
        ThemeRepo(get())
    }

    single {

        AdsManager(get())
    }


}

