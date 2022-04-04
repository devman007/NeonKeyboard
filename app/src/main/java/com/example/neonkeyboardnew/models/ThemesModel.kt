package com.example.neonkeyboardnew.models

import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.Index
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.io.Serializable

@Keep
@Entity(tableName = "themes", indices = [Index(value = ["themeJsonName"], unique = true)])
data class ThemesModel constructor(
    @NotNull
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var date: Long,
    var themeId: Int,
    var themeJsonName: String?,
    var themeDrawableName: String?,
    var keysBgName: String?,
    var isNeon: Boolean?,
    @Ignore var themeIsSelected: Boolean = false,
    @Ignore var isNativeAd: Boolean = false,

    ) : Serializable {
    constructor() : this(
        id = 0,
        date = 0L,
        themeId = 0,
        themeJsonName = null,
        themeDrawableName = null,
        keysBgName = null,
        isNeon = false,
        themeIsSelected = false,
        isNativeAd = false
    )
}


//@Entity
//data class User(
//    @PrimaryKey val id: Int,
//    val firstName: String?,
//    val lastName: String?,
//    @Ignore val picture: Bitmap?
//){
//    constructor():this(id=null,firstName=null,lastName=null,picture=null) }