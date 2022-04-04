package com.example.neonkeyboardnew.koin

import com.example.neonkeyboardnew.viewmodel.FavViewModel
import com.example.neonkeyboardnew.viewmodel.ThemesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel {
        ThemesViewModel(get())
    }

    viewModel {
        FavViewModel(get())
    }


}
