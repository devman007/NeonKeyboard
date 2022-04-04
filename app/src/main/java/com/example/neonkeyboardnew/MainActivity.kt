package com.example.neonkeyboardnew

import android.os.Bundle
import android.view.Menu
import androidx.fragment.app.DialogFragment
import com.example.neonkeyboardnew.ads.AdLoader
import com.example.neonkeyboardnew.apputils.ConstValues
import com.example.neonkeyboardnew.databinding.ActivityMainBinding
import com.example.neonkeyboardnew.fragments.SettingsMainFragment
import com.example.neonkeyboardnew.fragments.ThemeOptionsFragment
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.VideoOptions
import com.google.android.gms.ads.nativead.NativeAd
import com.google.android.gms.ads.nativead.NativeAdOptions
import timber.log.Timber


private const val SELECTED_ITEM_ID = "SELECTED_ITEM_ID"

class MainActivity : BaseActivity() {
     var listNativeAd: NativeAd? = null
    private var adCount = 0
    private val mainActivityBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private var adLoadingBox: AdLoader? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainActivityBinding.root)
        adLoadingBox = AdLoader(this)
        setSupportActionBar(mainActivityBinding.toolbar)
        mainActivityBinding.toolbar.title = "Neon Keyboard"

        with(mainActivityBinding)
        {

            bottomNavigationView.itemIconTintList = null
            bottomNavigationView.setOnItemSelectedListener { menuItem ->
                showAdOnSwitch()
                when (menuItem.itemId) {
                    R.id.themesNav -> loadFragment(ThemeOptionsFragment())
                    R.id.settingsNav -> loadFragment(SettingsMainFragment())
                }
                true
            }
        }


//        when (intent.getIntExtra("openAct", 2)) {
//            1 -> {
//                mainActivityBinding.bottomNavigationView.selectedItemId = R.id.settingsNav
//            }
//            2 -> {
////                loadFragment(ThemeOptionsFragment())
//                mainActivityBinding.bottomNavigationView.selectedItemId = R.id.themesNav
//            }
//        }
//        loadFragment(ThemeOptionsFragment())

        mainActivityBinding.bottomNavigationView.selectedItemId =
            savedInstanceState?.getInt(SELECTED_ITEM_ID)
                ?: R.id.themesNav



        mainActivityBinding.bottomNavigationView.setOnItemReselectedListener {


            if (it.itemId != mainActivityBinding.bottomNavigationView.selectedItemId) {

                mainActivityBinding.bottomNavigationView.selectedItemId = it.itemId

            }

        }


        if (isInternetConnected()) {
            if (intent.getBooleanExtra(ConstValues.fromSplash, false)) {
                fullScreenAd.loadInterstitialAfterSplash(loaded = {


                    when (it) {
                        true -> {

                            adLoadingBox?.closeDialog()
                            fullScreenAd.showAfterSplash(this)

                        }
                        else -> {
                            adLoadingBox?.closeDialog()

                        }
                    }


                }, showLoader = {
                    adLoadingBox?.showDialog()

                })

            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }


    override fun onBackPressed() {


        if (intent.getBooleanExtra("fromKeyboard2", false)) {
            finishAffinity()
        } else {
            if (mainActivityBinding.bottomNavigationView.selectedItemId == R.id.themesNav)
                showExitBottomSheet()
            else
                mainActivityBinding.bottomNavigationView.selectedItemId = R.id.themesNav
        }


    }


    private fun showExitBottomSheet() {


        supportFragmentManager.let {
            ExitButtonDialog.newInstance()
                .apply {
                    setStyle(DialogFragment.STYLE_NO_FRAME, R.style.CustomBottomSheetDialogTheme)
                    show(it, tag)
                }
        }
    }


    private fun showAdOnSwitch() {


        if (isInternetConnected()) {
            if (adCount == 2) {
                adCount = 0
                fullScreenAd.loadInterstitialMainScreen(loaded = {


                    when (it) {
                        true -> {

                            adLoadingBox?.closeDialog()
                            fullScreenAd.showMainInterstitial(this)

                        }
                        else -> {
                            adLoadingBox?.closeDialog()

                        }
                    }


                }, showLoader = {
                    adLoadingBox?.showDialog()

                })
            } else {
                adCount++
            }


        }

    }

    fun loadAndShowAdList(
        sendNativeAd: ((NativeAd?) -> Unit), nativeAdId: String,
    ) {

        listNativeAd?.let {
            sendNativeAd.invoke(it)
        } ?: run {


            if (isInternetConnected()) {
                val builder = com.google.android.gms.ads.AdLoader.Builder(this, nativeAdId)

                builder.forNativeAd { nativeAd ->

                    val activityDestroyed: Boolean = isDestroyed
                    if (activityDestroyed || isFinishing || isChangingConfigurations) {
                        nativeAd.destroy()
                        return@forNativeAd
                    }

                    // You must call destroy on old ads when you are done with them,
                    // otherwise you will have a memory leak.


                    listNativeAd?.destroy()
                    listNativeAd = nativeAd

                    listNativeAd?.let { myNativeAd ->

                        sendNativeAd.invoke(myNativeAd)
                    }


                }


                val videoOptions = VideoOptions.Builder()
                    .setStartMuted(true)
                    .build()

                val adOptions = NativeAdOptions.Builder()
                    .setVideoOptions(videoOptions)
                    .build()

                builder.withNativeAdOptions(adOptions)

                val adLoader = builder.withAdListener(object : AdListener() {
                    override fun onAdFailedToLoad(loadAdError: LoadAdError) {

                        Timber.d(loadAdError.toString())


                    }

                    override fun onAdLoaded() {
                        Timber.d("native ad loaded")

                    }
                }).build()

                adLoader.loadAd(AdRequest.Builder().build())
            }


        }


    }




    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(SELECTED_ITEM_ID, mainActivityBinding.bottomNavigationView.selectedItemId)
    }


}