package com.example.neonkeyboardnew

import android.os.Bundle
import androidx.core.view.isVisible
import com.example.neonkeyboardnew.databinding.TestkeyboardLayoutBinding
import com.example.neonkeyboardnew.keyboardutils.isVisible
import com.example.neonkeyboardnew.models.ThemesModel
import com.example.neonkeyboardnew.viewmodel.FavViewModel
import keyboard.neon.newboard.util.showToast
import org.koin.androidx.viewmodel.ext.android.viewModel

class TestKeyboardActivity : BaseActivity() {


    private val favViewModel: FavViewModel by viewModel()
    private val testKeyboardBinding: TestkeyboardLayoutBinding by lazy {
        TestkeyboardLayoutBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(testKeyboardBinding.root)
        setSupportActionBar(testKeyboardBinding.toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        testKeyboardBinding.testKeyboardEt.requestFocus()
        openKeyboard(testKeyboardBinding.testKeyboardEt)


        val themesModel = intent.getSerializableExtra("themeModel") as ThemesModel
        themesModel.id = 0
        themesModel.date = System.currentTimeMillis()


        favViewModel.themesRepo.checkIfThemeExist(themesModel.themeId) {

            testKeyboardBinding.adToFavBtn.isVisible = !it
        }


        with(testKeyboardBinding)
        {
            adToFavBtn.setOnClickListener {

                favViewModel.adThemeToFav(themesModel) {


                    runOnUiThread {
                        when (it) {

                            true -> {
                                showToast("Theme added to favourite")
                                adToFavBtn.text = "Theme is favourite"
                            }
                            else -> showToast("This theme is already exist in favourite")
                        }
                    }


                }
            }
        }


        loadAndShowNativeAd()

    }

    private fun loadAndShowNativeAd() {


        refreshAd(
            testKeyboardBinding.nativeAdLiveContainer,
            adStatusCallBack = { isLoaded ->

                when (isLoaded) {
                    true -> {
                        testKeyboardBinding.placeHolderSmallAd.placeholderAd.isVisible(false)

                    }
                    false -> {
                        testKeyboardBinding.placeHolderSmallAd.placeholderAd.isVisible(isLoaded)
                    }
                }


            },
            getString(R.string.keyboardTestScreenNativeId)
        )
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()

    }


    override fun onDestroy() {
        super.onDestroy()
        actNativeAd?.destroy()
    }
}