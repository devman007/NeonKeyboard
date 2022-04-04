package com.example.neonkeyboardnew.fragments

import android.annotation.SuppressLint
import android.content.SharedPreferences
import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.example.neonkeyboardnew.R
import keyboard.neon.newboard.ime.core.Preferences


class NeonKeyboardSettingsFragment : PreferenceFragmentCompat(),
    SharedPreferences.OnSharedPreferenceChangeListener {

    private val prefs get() = Preferences.default()

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.pref_my_keyboard)
    }

    @SuppressLint("RestrictedApi")
    override fun onBindPreferences() {
        super.onBindPreferences()
        setDividerHeight(0)
    }


    override fun onSharedPreferenceChanged(p0: SharedPreferences?, p1: String?) {

    }

    override fun onResume() {
        prefs.shared.registerOnSharedPreferenceChangeListener(this)
        super.onResume()
    }

    override fun onPause() {
        prefs.shared.unregisterOnSharedPreferenceChangeListener(this)
        super.onPause()
    }
}