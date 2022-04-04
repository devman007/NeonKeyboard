package com.example.neonkeyboardnew.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.neonkeyboardnew.datarepo.getAllKeyboardThemes
import com.example.neonkeyboardnew.datarepo.getAllNeonTheme
import com.example.neonkeyboardnew.db.ThemeRepo
import com.example.neonkeyboardnew.models.ThemesModel

class ThemesViewModel(var themesRepo: ThemeRepo) : ViewModel() {

    var unSelectTheme: ((Int) -> Unit)? = null
    var unSelectNeonTheme: ((Int) -> Unit)? = null
    var changeFavTheme: ((Int) -> Unit)? = null
    var handleFavSelection: ((Int, Int) -> Unit)? = null

    private val allThemes = getAllKeyboardThemes()
    private val neonThemes = getAllNeonTheme()




//     fun getKbThemes(): LiveData<List<ThemesModel>> = keyboardThemes().asLiveData()


//    private val favThemes = mutableListOf<ThemesModel>()

    var keyBoardThemesListLiveData = MutableLiveData(allThemes)
    var keyBoardNeonThemesListLiveData = MutableLiveData(neonThemes)
//    var unSelectFav = MutableLiveData<Boolean>()
//    var keyboardFavThemesList = MutableLiveData<MutableList<ThemesModel>>()

    val keyboardFavThemesList: LiveData<List<ThemesModel>> =
        themesRepo.getFavThemesFromDb().asLiveData()


    fun toggleThemeStatus(id: Int, themeStatus: Boolean) {
        keyBoardThemesListLiveData.postValue(allThemes.map {
            if (it.themeId == id) {
                it.copy(themeIsSelected = themeStatus)
            } else {
                it
            }
        } as MutableList<ThemesModel>)
    }


    fun toggleNeonThemeStatus(id: Int, themeStatus: Boolean) {
        keyBoardNeonThemesListLiveData.postValue(neonThemes.map {
            if (it.themeId == id) {
                it.copy(themeIsSelected = themeStatus)
            } else {
                it
            }
        } as MutableList<ThemesModel>)

    }


    fun insertAdsTheme() {

        var adID = -94
        var adIndex = 4

        if (allThemes.isNotEmpty() && allThemes.size >= adIndex) {

            var numberOfAds = 3
            while (allThemes.size >= adIndex && numberOfAds > 0) {
                val adModel =
                    ThemesModel(
                        adID,
                        adID.toLong(),
                        adID,
                        "",
                        "",
                        "",
                        isNeon = false,
                        themeIsSelected = false,
                        true
                    )
                if (!allThemes.contains(adModel)) {
                    allThemes.add(adIndex, adModel)
//                    notifyItemInserted(adIndex)
                }
                adID--
                --numberOfAds
                adIndex += 4 + 1
            }

        }
//        else {
//            if (allThemes.isEmpty()) {
//                allThemes.add(
//                    ThemesModel(
//                        0,
//                        --adID,
//                        "",
//                        "",
//                        "",
//                        isNeon = false,
//                        themeIsSelected = false,
//                        true
//                    )
//                )
//            }
//        }

        keyBoardThemesListLiveData.postValue(allThemes)

    }

    fun insertAdsNeonTheme() {

        var adID = -84
        var adIndex = 4
        if (neonThemes.isNotEmpty() && neonThemes.size >= adIndex) {
            var numberOfAds = 3
            while (neonThemes.size >= adIndex && numberOfAds > 0) {
                val adModel =
                    ThemesModel(
                        adID,
                        adID.toLong(),
                        adID,
                        "",
                        "",
                        "",
                        isNeon = false,
                        themeIsSelected = false,
                        true
                    )
                if (!neonThemes.contains(adModel)) {
                    neonThemes.add(adIndex, adModel)
                }
                adID--
                --numberOfAds
                adIndex += 4 + 1
            }

        }


        keyBoardNeonThemesListLiveData.postValue(neonThemes)

    }


}