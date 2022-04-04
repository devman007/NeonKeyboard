package com.example.neonkeyboardnew.ads

import android.app.Activity
import android.app.Application
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ProcessLifecycleOwner
import com.example.neonkeyboardnew.App
import com.example.neonkeyboardnew.IntroActivity
import com.example.neonkeyboardnew.R
import com.example.neonkeyboardnew.ads.AdsManager.Companion.isInterstitialAdVisible
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.appopen.AppOpenAd
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback
import org.jetbrains.annotations.NotNull
import org.koin.core.component.KoinComponent
import timber.log.Timber


class OpenApp(private val globalClass: App) : Application.ActivityLifecycleCallbacks,
    LifecycleObserver, KoinComponent {


    private var adVisible = false
    private var appOpenAd: AppOpenAd? = null

    private var currentActivity: Activity? = null
    private var isShowingAd = false
    private var myApplication: App? = globalClass
    var fullScreenContentCallback: FullScreenContentCallback? = null


    init {
        this.myApplication?.registerActivityLifecycleCallbacks(this)
        ProcessLifecycleOwner.get().lifecycle.addObserver(this)
    }

    /**
     * Request an ad
     */
    fun fetchAd() {

        // Have unused ad, no need to fetch another.
        if (isAdAvailable()) {
            return
        }

        /*
          Called when an app open ad has failed to load.

          @param loadAdError the error.
         */
        // Handle the error.


        val loadCallback: AppOpenAdLoadCallback = object : AppOpenAdLoadCallback() {

            override fun onAdLoaded(ad: AppOpenAd) {
                appOpenAd = ad
            }

            override fun onAdFailedToLoad(p0: LoadAdError) {
                super.onAdFailedToLoad(p0)
                Timber.d(p0.message)
            }

        }
        val request: AdRequest = getAdRequest()

        myApplication?.applicationContext?.apply {

            AppOpenAd.load(
                this,
                globalClass.getString(R.string.appOpenId),
                request,
                AppOpenAd.APP_OPEN_AD_ORIENTATION_PORTRAIT,
                loadCallback
            )
        }


    }

    private fun showAdIfAvailable() {
        // Only show ad if there is not already an app open ad currently showing
        // and an ad is available.
        if (!isShowingAd && isAdAvailable()) {
            fullScreenContentCallback = object : FullScreenContentCallback() {
                override fun onAdDismissedFullScreenContent() {
                    // Set the reference to null so isAdAvailable() returns false.
                    appOpenAd = null
                    isShowingAd = false
                    adVisible = false
                    fetchAd()

                }

                override fun onAdFailedToShowFullScreenContent(adError: AdError?) {

                }

                override fun onAdShowedFullScreenContent() {
                    isShowingAd = true
                }
            }


//                if (COUNTER % 2 == 0) {
//                    adVisible = true
//                    showLoading()
//                    appOpenAd?.fullScreenContentCallback = fullScreenContentCallback
//                    appOpenAd!!.show(currentActivity!!)
//                } else {
//                    dismissLoading()
//                }


            adVisible = true

            appOpenAd?.fullScreenContentCallback = fullScreenContentCallback
            appOpenAd!!.show(currentActivity!!)

//


        } else {

            fetchAd()
        }

    }



    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private fun onAppForegrounded() {


//        isAppForeground = false

        currentActivity?.let {

            when (it) {
                is IntroActivity -> return
                else -> {
                    if (!isInterstitialAdVisible) {
                        showAdIfAvailable()
                    }
                }
            }
        }

    }


    /**
     * Creates and returns ad request.
     */
    @NotNull
    private fun getAdRequest(): AdRequest {
        return AdRequest.Builder().build()
    }

    /**
     * Utility method that checks if ad exists and can be shown.
     */
    private fun isAdAvailable(): Boolean {
        return appOpenAd != null
    }


    override fun onActivityCreated(p0: Activity, p1: Bundle?) {
    }

    override fun onActivityStarted(p0: Activity) {
        currentActivity = p0
    }

    override fun onActivityResumed(p0: Activity) {
        currentActivity = p0
    }

    override fun onActivityPaused(p0: Activity) {
    }

    override fun onActivityStopped(p0: Activity) {
    }

    override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {
    }

    override fun onActivityDestroyed(p0: Activity) {
    }
}