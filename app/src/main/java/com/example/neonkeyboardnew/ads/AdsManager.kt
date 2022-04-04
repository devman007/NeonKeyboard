package com.example.neonkeyboardnew.ads

import android.app.Activity
import android.app.Application
import com.example.neonkeyboardnew.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import timber.log.Timber

class AdsManager(var applicationContext: Application) {


    companion object {
        var isInterstitialAdVisible = false
    }


    var splashFullScreenAd: InterstitialAd? = null
    var bottomNavAds: InterstitialAd? = null
    var themeAd: InterstitialAd? = null


    fun loadInterstitialAfterSplash(
        loaded: ((Boolean) -> Unit)? = null,
        showLoader: () -> Unit
    ) {


        if (splashFullScreenAd == null) {

            showLoader.invoke()
            val adRequest = AdRequest.Builder().build()

            InterstitialAd.load(applicationContext,
                applicationContext.getString(R.string.splashFullScreenAdId),
                adRequest,
                object : InterstitialAdLoadCallback() {


                    override fun onAdFailedToLoad(ad: LoadAdError) {
                        Timber.d("ad failed")
                        isInterstitialAdVisible = false
                        splashFullScreenAd = null
                        loaded?.invoke(false)
                    }

                    override fun onAdLoaded(ad: InterstitialAd) {

                        splashFullScreenAd = ad

                        loaded?.invoke(true)
                        Timber.d("trans Loaded")


                    }

                })

        } else {
            loaded?.invoke(true)
        }


    }


    fun loadInterstitialMainScreen(
        loaded: ((Boolean) -> Unit)? = null,
        showLoader: () -> Unit
    ) {


        if (bottomNavAds == null) {

            showLoader.invoke()
            val adRequest = AdRequest.Builder().build()

            InterstitialAd.load(applicationContext,
                applicationContext.getString(R.string.bottomNavClicksAdID),
                adRequest,
                object : InterstitialAdLoadCallback() {

                    override fun onAdFailedToLoad(ad: LoadAdError) {
                        Timber.d("ad failed")
                        bottomNavAds = null
                        loaded?.invoke(false)
                    }

                    override fun onAdLoaded(ad: InterstitialAd) {

                        bottomNavAds = ad

                        loaded?.invoke(true)
                        Timber.d("trans Loaded")


                    }

                })

        } else {
            loaded?.invoke(true)
        }


    }

    fun loadInterstitialThemeAd(
        loaded: ((Boolean) -> Unit)? = null,
        showLoader: () -> Unit
    ) {


        if (themeAd == null) {

            showLoader.invoke()
            val adRequest = AdRequest.Builder().build()

            InterstitialAd.load(applicationContext,
                applicationContext.getString(R.string.themeAlternateClickAdId),
                adRequest,
                object : InterstitialAdLoadCallback() {

                    override fun onAdFailedToLoad(ad: LoadAdError) {
                        themeAd = null
                        loaded?.invoke(false)
                    }

                    override fun onAdLoaded(ad: InterstitialAd) {

                        themeAd = ad

                        loaded?.invoke(true)


                    }

                })

        } else {
            loaded?.invoke(true)
        }


    }


    fun showAfterSplash(activity: Activity, onDismissAd: (() -> Unit)? = null) {


        if (splashFullScreenAd != null) {
            splashFullScreenAd?.fullScreenContentCallback =
                object : FullScreenContentCallback() {

                    override fun onAdDismissedFullScreenContent() {
                        isInterstitialAdVisible = false
                        splashFullScreenAd = null
                        onDismissAd?.invoke()


                    }

                }

            splashFullScreenAd?.show(activity)


            isInterstitialAdVisible = true


        }


    }


    fun showMainInterstitial(activity: Activity, onDismissAd: (() -> Unit)? = null) {


        if (bottomNavAds != null) {
            bottomNavAds?.fullScreenContentCallback =
                object : FullScreenContentCallback() {

                    override fun onAdDismissedFullScreenContent() {
                        isInterstitialAdVisible = false
                        bottomNavAds = null
                        onDismissAd?.invoke()


                    }

                }

            bottomNavAds?.show(activity)
            isInterstitialAdVisible = true

        }


    }

    fun showThemesInterstitial(activity: Activity, onDismissAd: (() -> Unit)? = null) {


        if (themeAd != null) {
            themeAd?.fullScreenContentCallback =
                object : FullScreenContentCallback() {

                    override fun onAdDismissedFullScreenContent() {
                        isInterstitialAdVisible = false
                        themeAd = null
                        onDismissAd?.invoke()


                    }

                }

            themeAd?.show(activity)
            isInterstitialAdVisible = true

        }


    }

}