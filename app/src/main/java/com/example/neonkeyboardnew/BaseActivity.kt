package com.example.neonkeyboardnew

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.neonkeyboardnew.ads.AdsManager
import com.google.android.gms.ads.*
import com.google.android.gms.ads.nativead.NativeAd
import com.google.android.gms.ads.nativead.NativeAdOptions
import com.google.android.gms.ads.nativead.NativeAdView
import org.koin.android.ext.android.inject

abstract class BaseActivity : AppCompatActivity() {


    protected var actNativeAd: NativeAd? = null

    protected val fullScreenAd: AdsManager by inject()
    protected fun loadFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }


    fun openKeyboard(view: EditText) {
        val imm: InputMethodManager =
            getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)
    }


    protected fun refreshAd(
        adFrame: FrameLayout,
        adStatusCallBack: ((Boolean) -> Unit), nativeAdId: String,
        isSmall: Boolean = false
    ) {


        if (isInternetConnected()) {
            val builder = AdLoader.Builder(this, nativeAdId)

            builder.forNativeAd { nativeAd ->


                val activityDestroyed: Boolean = isDestroyed
                if (activityDestroyed || isFinishing || isChangingConfigurations) {
                    nativeAd.destroy()
                    return@forNativeAd
                }

                actNativeAd?.destroy()
                actNativeAd = nativeAd
                // You must call destroy on old ads when you are done with them,
                // otherwise you will have a memory leak.
                /*      currentNativeAd?.destroy()
                      currentNativeAd = nativeAd*/

                actNativeAd?.let { myNativeAd ->
                    val adView = if (!isSmall) {
                        layoutInflater
                            .inflate(
                                R.layout.large_nativead_layout,
                                null
                            ) as NativeAdView
                    } else {
                        layoutInflater
                            .inflate(
                                R.layout.small_nativead_layout,
                                null
                            ) as NativeAdView
                    }

                    populateNativeAdView(myNativeAd, adView)
                    adFrame.removeAllViews()
                    adFrame.addView(adView)
                }


            }

            // OnUnifiedNativeAdLoadedListener implementation.
            // If this callback occurs after the activity is destroyed, you must call
            // destroy and return or you may get a memory leak.


            val videoOptions = VideoOptions.Builder()
                .setStartMuted(true)
                .build()

            val adOptions = NativeAdOptions.Builder()
                .setVideoOptions(videoOptions)
                .build()

            builder.withNativeAdOptions(adOptions)

            val adLoader = builder.withAdListener(object : AdListener() {
                override fun onAdFailedToLoad(loadAdError: LoadAdError) {
                    adStatusCallBack.invoke(false)

                    Log.e("AdFailedReloadRequest", loadAdError.toString())


                }

                override fun onAdLoaded() {

                    adStatusCallBack.invoke(true)

                }
            }).build()


            adLoader.loadAd(AdRequest.Builder().build())
        } else {
            adStatusCallBack.invoke(false)
        }


    }


    private fun populateNativeAdView(nativeAd: NativeAd, adView: NativeAdView) {
        // Set the media view.
        adView.mediaView = adView.findViewById(R.id.ad_media)

        // Set other ad assets.
        adView.headlineView = adView.findViewById(R.id.ad_headline)
        adView.bodyView = adView.findViewById(R.id.ad_body)
        adView.callToActionView = adView.findViewById(R.id.ad_call_to_action)
        adView.iconView = adView.findViewById(R.id.ad_app_icon)
//        adView.priceView = adView.findViewById(R.id.ad_price)
//        adView.storeView = adView.findViewById(R.id.ad_store)
        adView.advertiserView = adView.findViewById(R.id.ad_advertiser)

        // The headline and media content are guaranteed to be in every UnifiedNativeAd.
        (adView.headlineView as TextView).text = nativeAd.headline
        adView.mediaView?.setMediaContent(nativeAd.mediaContent!!)
        adView.mediaView?.setImageScaleType(ImageView.ScaleType.CENTER_CROP)
        // These assets aren't guaranteed to be in every UnifiedNativeAd, so it's important to
        // check before trying to display them.
        if (nativeAd.body == null) {
            adView.bodyView?.visibility = View.INVISIBLE
        } else {
            adView.bodyView?.visibility = View.VISIBLE
            (adView.bodyView as TextView).text = nativeAd.body
        }

        if (nativeAd.callToAction == null) {
            adView.callToActionView?.visibility = View.INVISIBLE
        } else {
            adView.callToActionView?.visibility = View.VISIBLE
            (adView.callToActionView as Button).text = nativeAd.callToAction
        }

        if (nativeAd.icon == null) {
            adView.iconView?.visibility = View.GONE
        } else {
            (adView.iconView as ImageView).setImageDrawable(
                nativeAd.icon?.drawable
            )
            adView.iconView?.visibility = View.VISIBLE
        }

        adView.setNativeAd(nativeAd)

        val vc = nativeAd.mediaContent?.videoController!!

        if (vc.hasVideoContent()) {

            vc.videoLifecycleCallbacks = object : VideoController.VideoLifecycleCallbacks() {
            }
        }
    }


    protected fun isInternetConnected(): Boolean {
        val connectivityManager =
            getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            val capabilities =
                connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
            if (capabilities != null) {
                when {
                    capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> {
                        return true
                    }
                    capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> {
                        return true
                    }
                    capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> {
                        return true
                    }
                }
            }
        } else {
            val activeNetworkInfo = connectivityManager.activeNetworkInfo
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected) {
                return true
            }
        }


        return false
    }


}



