package com.example.neonkeyboardnew

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import com.example.neonkeyboardnew.apputils.ConstValues
import com.example.neonkeyboardnew.databinding.IntroScreenBinding
import com.example.neonkeyboardnew.keyboardutils.isVisible
import keyboard.neon.newboard.util.checkIfImeIsEnabled
import keyboard.neon.newboard.util.checkIfImeIsSelected
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class IntroActivity : BaseActivity() {

    private var fromKeyboard: Boolean = false

    private val splashBinding: IntroScreenBinding by lazy {
        IntroScreenBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(splashBinding.root)

        fromKeyboard = intent.getBooleanExtra("fromKeyboard", false)
        with(splashBinding)
        {

            lifecycleScope.launch {
                delay(7000)
                lottieAnimationView.visibility = View.GONE
                startBtn.visibility = View.VISIBLE
            }

            startBtn.setOnClickListener {


                if (checkIfImeIsEnabled(this@IntroActivity) && checkIfImeIsSelected(this@IntroActivity)) {

                    startActivity(
                        Intent(this@IntroActivity, MainActivity::class.java).putExtra(
                            ConstValues.fromSplash,
                            true
                        ).putExtra(
                            "fromKeyboard2",
                            fromKeyboard
                        )
                    )

                } else
                    startActivity(
                        Intent(this@IntroActivity, EnableKeyboard::class.java).putExtra(
                            ConstValues.fromSplash,
                            true
                        )
                    )
                finish()
            }


        }

//        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
//            if (!task.isSuccessful) {
//                Timber.d("Fetching FCM registration token failed")
//                return@OnCompleteListener
//            }
//
//            // Get new FCM registration token
//            val token = task.result
//
//
//            Timber.d("token: $token")
//        })


        showNativeAd()
    }


    private fun showNativeAd() {


        refreshAd(
            splashBinding.nativeAdLiveContainer,
            adStatusCallBack = { isLoaded ->

                when (isLoaded) {
                    true -> {
                        splashBinding.placeHolderSmallAd.placeholderAd.isVisible(false)

                    }
                    false -> {
                        splashBinding.placeHolderSmallAd.placeholderAd.isVisible(isLoaded)
                    }
                }


            },
            getString(R.string.splashNativeId)
        )
    }


    override fun onDestroy() {
        super.onDestroy()
        actNativeAd?.destroy()
    }
}