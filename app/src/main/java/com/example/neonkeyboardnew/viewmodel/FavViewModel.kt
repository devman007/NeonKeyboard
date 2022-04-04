package com.example.neonkeyboardnew.viewmodel

import androidx.lifecycle.ViewModel
import com.example.neonkeyboardnew.db.ThemeRepo
import com.example.neonkeyboardnew.models.ThemesModel

class FavViewModel(var themesRepo: ThemeRepo) : ViewModel() {


    fun adThemeToFav(item: ThemesModel, favStatus: (Boolean) -> Unit) {

        themesRepo.addToFav(item, favStatus = { status ->
            favStatus.invoke(status)

        })


    }




}