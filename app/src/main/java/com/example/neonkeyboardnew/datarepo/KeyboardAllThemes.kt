package com.example.neonkeyboardnew.datarepo

import com.example.neonkeyboardnew.models.ThemesModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


fun keyboardThemes(): Flow<MutableList<ThemesModel>> = flow {

    val simpleTheme = mutableListOf<ThemesModel>()
    for (i in 1..50) {
        simpleTheme.add(generateModel("theme$i", "theme$i", i))
    }

    emit(simpleTheme)

}

fun getAllKeyboardThemes(): MutableList<ThemesModel> {

    val simpleTheme = mutableListOf<ThemesModel>()


    for (i in 1..50) {
        simpleTheme.add(generateModel("theme$i", "theme$i", i))
    }
    return simpleTheme
}

fun getAllNeonTheme(): MutableList<ThemesModel> {
    val neonTheme = mutableListOf<ThemesModel>()

    for (i in 1..22) {
        neonTheme.add(
            generateModelNeon(
                "neon$i",
                "neonbg$i",
                i + 200,
            )
        )
    }
    return neonTheme
}


private fun generateModel(
    themeJsonName: String,
    themeBgName: String,
    themeId: Int
): ThemesModel =
    ThemesModel(
        0,
        0,
        themeId,
        themeJsonName,
        themeBgName,
        "fullkeysbg",
        isNeon = false,
        false,
        false

    )


private fun generateModelNeon(
    themeJsonName: String,
    themeKeysBg: String,
    themeId: Int
): ThemesModel =
    ThemesModel(
        0,
        0L,
        themeId,
        themeJsonName,
        "neon1",
        themeKeysBg,
        isNeon = true
    )




