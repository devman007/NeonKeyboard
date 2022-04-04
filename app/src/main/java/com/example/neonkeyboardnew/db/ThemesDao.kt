package com.example.neonkeyboardnew.db

import androidx.room.*
import com.example.neonkeyboardnew.models.ThemesModel
import kotlinx.coroutines.flow.Flow

@Dao
interface ThemesDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertThemeItem(note: ThemesModel): Long


    @Delete
    suspend fun deleteSingleTheme(note: ThemesModel): Int

    @Query("DELETE FROM themes")
    suspend fun deleteAllFav()

    @Query("SELECT * FROM themes where themeId=:themeId")
    suspend fun checkIfExist(themeId: Int): MutableList<ThemesModel>


//    @Query("SELECT * FROM themes order by id Desc")
//    suspend fun getAllFavThemes(): MutableList<ThemesModel>?

    @Query("SELECT * FROM themes order by date Desc")
    fun getFavThemes(): Flow<List<ThemesModel>>

    @Query("DELETE FROM themes")
    suspend fun clearThemes(): Int

}

