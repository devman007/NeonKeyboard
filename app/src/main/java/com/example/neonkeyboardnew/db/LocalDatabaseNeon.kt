package com.example.neonkeyboardnew.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.neonkeyboardnew.models.ThemesModel

@Database(entities = [ThemesModel::class], version = 1, exportSchema = false)
abstract class LocalDatabaseNeon : RoomDatabase() {

    abstract fun themesDao(): ThemesDao

    companion object {
        @Volatile
        private var INSTANCE: LocalDatabaseNeon? = null
        private const val DATABASE_NAME = "myKeyboardDatabase.db"

        fun getInstance(context: Context): LocalDatabaseNeon =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also {
                    INSTANCE = it
                }
            }

        private fun buildDatabase(appContext: Context): LocalDatabaseNeon {
            return Room.databaseBuilder(appContext, LocalDatabaseNeon::class.java, DATABASE_NAME)
                .fallbackToDestructiveMigration() // Data is cache, so it is OK to delete
                .build()
        }
    }
}
