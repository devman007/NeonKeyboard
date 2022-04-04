package com.example.neonkeyboardnew.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.neonkeyboardnew.EnableKeyboard
import com.example.neonkeyboardnew.MainActivity
import com.example.neonkeyboardnew.R
import com.example.neonkeyboardnew.RatingDialog
import com.example.neonkeyboardnew.apputils.privacyPolicy
import com.example.neonkeyboardnew.apputils.sendEmail
import com.example.neonkeyboardnew.apputils.shareApp
import com.example.neonkeyboardnew.databinding.FragmentMainSettingsBinding
import com.example.neonkeyboardnew.keyboardutils.isVisible
import keyboard.neon.newboard.util.checkIfImeIsSelected

class SettingsMainFragment : BaseFragment() {

    private lateinit var myActivity: MainActivity
    private lateinit var binding: FragmentMainSettingsBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        myActivity = context as MainActivity
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainSettingsBinding.inflate(inflater, container, false)


        // load pref settings fragment
        loadChildFragment(NeonKeyboardSettingsFragment(), binding.settingsPrefContainer.id)


        with(binding)
        {
            enableDisableKbSetting.setOnClickListener {
                startActivity(Intent(myActivity, EnableKeyboard::class.java))
            }
            shareSettings.setOnClickListener {

                myActivity.shareApp()
            }
            rateUsSettings.setOnClickListener {


                val dialog = RatingDialog()
                dialog.show(myActivity.supportFragmentManager, "ratingDialog")


//                RatingDialog(myActivity).createAndShowRatingDialog {
//
//
//                    if (it)
//                        rateUs(myActivity)
//                    else
//                        myActivity.showToast("Thanks for rating us.")
//
//                }

            }

            feedBackSetting.setOnClickListener {

                myActivity.sendEmail()
            }

            privacySettings.setOnClickListener {

                myActivity.privacyPolicy()
            }
        }


        loadAndShowNativeAd()

        return binding.root
    }


    private fun loadAndShowNativeAd() {


        refreshAd(
            binding.nativeAdLiveContainer,
            adStatusCallBack = { isLoaded ->

                when (isLoaded) {
                    true -> {
                        binding.placeHolderSmallAd.placeholderAd.isVisible(false)

                    }
                    false -> {
                        binding.placeHolderSmallAd.placeholderAd.isVisible(isLoaded)
                    }
                }


            },
            getString(R.string.enableDisableNativeId), true
        )
    }

    override fun onResume() {
        super.onResume()
        if (checkIfImeIsSelected(myActivity))
            binding.appCompatImageView.setImageResource(R.drawable.ic_settings_enabled_keyboard)
        else
            binding.appCompatImageView.setImageResource(R.drawable.ic_setting_enabledisable)
    }
}