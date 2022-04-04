package com.example.neonkeyboardnew.fragments

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.neonkeyboardnew.EnableKeyboard
import com.example.neonkeyboardnew.R
import com.example.neonkeyboardnew.ads.AdsManager
import com.example.neonkeyboardnew.viewmodel.ThemesViewModel
import com.google.android.gms.ads.*
import com.google.android.gms.ads.nativead.NativeAd
import com.google.android.gms.ads.nativead.NativeAdOptions
import com.google.android.gms.ads.nativead.NativeAdView
import com.google.android.material.bottomsheet.BottomSheetDialog
import keyboard.neon.newboard.ime.core.Preferences
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import timber.log.Timber

abstract class BaseFragment : Fragment() {
    val FRAGMENT_TAG = "FRAGMENT_TAG"


    protected val themesViewModel: ThemesViewModel by sharedViewModel()
    private var fragNativeAd: NativeAd? = null
    protected val fullScreenAd: AdsManager by inject()
    protected val keyboardPrefs = Preferences.default()

    protected fun loadChildFragment(fragment: Fragment, frameId: Int) {
        childFragmentManager
            .beginTransaction()
            .replace(frameId, fragment, FRAGMENT_TAG)
            .commit()
    }

    protected fun showEnableKbBottomSheet(context: Context, titleText: String = "") {


        val modalSheetView =
            layoutInflater.inflate(R.layout.action_bottomsheet_enablekeyboard, null)
        val dialog = BottomSheetDialog(context, R.style.CustomBottomSheetDialogTheme)
        dialog.let {

            it.setContentView(modalSheetView)
            it.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            it.show()
        }


        if (titleText.isNotBlank()) {
            dialog.findViewById<TextView>(R.id.deleteTextTvBs)?.text = titleText
        }


        dialog.findViewById<TextView>(R.id.cancelBtnEk)?.setOnClickListener {

            dialog.dismiss()
        }

        dialog.findViewById<TextView>(R.id.enableKeyboardButtonEk)?.setOnClickListener {

            startActivity(
                Intent(context, EnableKeyboard::class.java)
            )

            dialog.dismiss()

        }

        dialog.show()

    }

    protected fun refreshAd(
        adFrame: FrameLayout,
        adStatusCallBack: ((Boolean) -> Unit), nativeAdId: String,
        isSmall: Boolean = false
    ) {


        if (isAdded) {

            if (isInternetConnected()) {
                val builder = AdLoader.Builder(requireContext(), nativeAdId)

                builder.forNativeAd { nativeAd ->

                    if (isAdded) {
                        val activityDestroyed: Boolean = requireActivity().isDestroyed
                        if (activityDestroyed || requireActivity().isFinishing || requireActivity().isChangingConfigurations) {
                            nativeAd.destroy()
                            return@forNativeAd
                        }

                        // You must call destroy on old ads when you are done with them,
                        // otherwise you will have a memory leak.
                        fragNativeAd?.destroy()
                        fragNativeAd = nativeAd

                        /*      currentNativeAd?.destroy()
                              currentNativeAd = nativeAd*/

                        fragNativeAd?.let { myNativeAd ->
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


                            val act = activity
                            if (act != null && isAdded) {
                                populateNativeAdView(myNativeAd, adView)
                                adFrame.removeAllViews()
                                adFrame.addView(adView)

                            }


                        }
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
                        adStatusCallBack.invoke(false)

                        Timber.d(loadAdError.toString())


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


    }


    protected fun populateNativeAdView(nativeAd: NativeAd, adView: NativeAdView) {
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
            requireContext().getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

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