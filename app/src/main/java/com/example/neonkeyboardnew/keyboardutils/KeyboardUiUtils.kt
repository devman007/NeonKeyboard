package com.example.neonkeyboardnew.keyboardutils

import android.content.Context
import android.content.SharedPreferences
import android.view.View


fun View.isVisible(isVisible: Boolean) {
    visibility = if (isVisible) View.VISIBLE else View.GONE
}


fun Context.getMyPreferences(): SharedPreferences =
    this.getSharedPreferences("neonKeyboard", Context.MODE_PRIVATE)

inline fun SharedPreferences.editPrefs(editor: SharedPreferences.Editor.() -> Unit) {
    val editPrefs = this.edit()
    editor(editPrefs)
    editPrefs.apply()
}