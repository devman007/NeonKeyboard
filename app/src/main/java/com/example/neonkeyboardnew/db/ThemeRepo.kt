package com.example.neonkeyboardnew.db

import android.app.Application
import com.example.neonkeyboardnew.models.ThemesModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class ThemeRepo(application: Application) {

    var themeDb: LocalDatabaseNeon = LocalDatabaseNeon.getInstance(application)


    fun addToFav(item: ThemesModel, favStatus: (Boolean) -> Unit) {

        CoroutineScope(Dispatchers.IO).launch {

            val def = async {
                themeDb.themesDao().insertThemeItem(item)
            }

            if (def.await() != -1L) {

                favStatus.invoke(true)
//                favAdded?.invoke()

            } else {
                favStatus.invoke(false)
            }


        }
    }


//    fun removeAllFavThemes(removedStatus: () -> Unit) {
//        CoroutineScope(Dispatchers.IO).launch {
//
//            val removeAll = async {
//                themeDb.themesDao().clearThemes()
//            }
//
//            if (removeAll.await() != -1) {
//
//
//                removedStatus.invoke()
//            }
//
//
//        }
//    }

    fun removeAllFavThemes(removeStatus: (Boolean) -> Unit) {
        CoroutineScope(Dispatchers.IO).launch {
            val def = async {
                themeDb.themesDao().clearThemes()
            }

            if (def.await() != -1)
                removeStatus.invoke(true)
            else
                removeStatus.invoke(false)


        }

    }


    fun checkIfThemeExist(themeId: Int, existStatus: (Boolean) -> Unit) {

        CoroutineScope(Dispatchers.IO).launch {
            val status = async {
                themeDb.themesDao().checkIfExist(themeId)
            }

            if (status.await().isEmpty())
                existStatus.invoke(false)
            else
                existStatus.invoke(true)

        }

    }


    fun getFavThemesFromDb(): Flow<List<ThemesModel>> =
        themeDb.themesDao().getFavThemes()


}