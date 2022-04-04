package com.example.neonkeyboardnew

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.provider.Settings
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.example.neonkeyboardnew.ads.AdLoader
import com.example.neonkeyboardnew.apputils.ConstValues
import com.example.neonkeyboardnew.databinding.EnableKeyboardBinding
import com.example.neonkeyboardnew.keyboardutils.isVisible
import keyboard.neon.newboard.InputMethodChangedReceiver
import keyboard.neon.newboard.util.checkIfImeIsEnabled
import keyboard.neon.newboard.util.checkIfImeIsSelected

class EnableKeyboard : BaseActivity(), View.OnClickListener {

    private var adLoadingBox: AdLoader? = null

    companion object {
        private const val MSG_POLLING_IME_SETTINGS = 0
        private const val IME_SETTINGS_POLLING_INTERVAL: Long = 200
    }

    var userStep = 1

    private val enableKeyboardBinding: EnableKeyboardBinding by lazy {
        EnableKeyboardBinding.inflate(layoutInflater)
    }

    private val imeChangedReceiver = InputMethodChangedReceiver {
        updateUiState {

            if (intent.getBooleanExtra(ConstValues.fromSplash, false))
                startWithClearTop(MainActivity::class.java)
            else
                finish()

        }
    }

    @SuppressLint("SetTextI18n")
    private fun updateUiState(onExecute: (() -> Unit?)? = null) {


        if (checkIfImeIsSelected(this)) {
            onExecute?.invoke()
            userStep = 3
            enableKeyboardBinding.enableKeyboardBtn.text = "Switch Keyboard"
            enableKeyboardBinding.illusImage.setImageResource(R.drawable.stepthreebg)
            enableKeyboardBinding.settingsTv.text = getString(R.string.checkSettingsStepThree)
            enableKeyboardBinding.titleKeyboardTv.text = "Congratulation!"


        } else {
            userStep = 2
            enableKeyboardBinding.enableKeyboardBtn.text = "Switch Keyboard"
            enableKeyboardBinding.illusImage.setImageResource(R.drawable.steptwobg)
            enableKeyboardBinding.settingsTv.text = getString(R.string.checkSettingsStepTwo)
            enableKeyboardBinding.titleKeyboardTv.text = "Switch to Neon Keyboard"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(enableKeyboardBinding.root)
        adLoadingBox = AdLoader(this)


//        if (isInternetConnected()) {
//            if (intent.getBooleanExtra(ConstValues.fromSplash, false)) {
//                fullScreenAd.loadInterstitialAfterSplash(loaded = {
//
//
//                    when (it) {
//                        true -> {
//
//                            adLoadingBox?.closeDialog()
//                            fullScreenAd.showAfterSplash(this)
//
//                        }
//                        else -> {
//                            adLoadingBox?.closeDialog()
//
//                        }
//                    }
//
//
//                }, showLoader = {
//                    adLoadingBox?.showDialog()
//
//                })
//
//            }
//        }
        setSupportActionBar(enableKeyboardBinding.toolbar)
        enableKeyboardBinding.enableKeyboardBtn.setOnClickListener(this)
        registerReceiver(
            imeChangedReceiver,
            IntentFilter(Intent.ACTION_INPUT_METHOD_CHANGED)
        )

        loadAndShowNativeAd()
    }

    private fun startWithClearTop(targetClass: Class<*>, imeiChanged: Boolean = false) {
        val intent = Intent(this, targetClass)
        intent.flags = (Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED
                or Intent.FLAG_ACTIVITY_SINGLE_TOP or
                Intent.FLAG_ACTIVITY_REORDER_TO_FRONT
                or Intent.FLAG_ACTIVITY_CLEAR_TOP)
        intent.putExtra(ConstValues.fromSplash, true)
        startActivity(intent)
        if (!imeiChanged)
            finish()
    }

    override fun onResume() {
        super.onResume()
        if (!checkIfImeIsEnabled(this)) {
            userStep = 1

            with(enableKeyboardBinding)
            {
                illusImage.setImageResource(R.drawable.steponebg)
                enableKeyboardBinding.enableKeyboardBtn.text = "Enable Keyboard"
                enableKeyboardBinding.titleKeyboardTv.text = "Enable Neon Keyboard"
//                enableKeyboardBinding.pleaseChec.text = getString(R.string.please_chec)
            }

        } else
            updateUiState()
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(imeChangedReceiver)
        actNativeAd?.destroy()
    }

    override fun onClick(viewId: View?) {
        when (viewId?.id) {
            R.id.enableKeyboardBtn -> {
                when (userStep) {
                    1 -> {
                        SettingsPoolingHandler().startPollingImeSettings()

                        Intent().apply {
                            action = Settings.ACTION_INPUT_METHOD_SETTINGS
                            addCategory(Intent.CATEGORY_DEFAULT)
                        }.also { startActivity(it) }

                    }
                    else -> {
                        (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).showInputMethodPicker()
                    }
                }
            }
        }
    }


    @SuppressLint("HandlerLeak")
    private inner class SettingsPoolingHandler : Handler(
        Looper.myLooper()!!
    ) {
        override fun handleMessage(msg: Message) {
            if (msg.what == MSG_POLLING_IME_SETTINGS) {

                if (checkIfImeIsEnabled(this@EnableKeyboard)) {
                    startWithClearTop(EnableKeyboard::class.java, true)
                    removeCallbacksAndMessages(null)
                    return
                }
                startPollingImeSettings()
            }
        }

        fun startPollingImeSettings() {
            sendMessageDelayed(
                obtainMessage(MSG_POLLING_IME_SETTINGS),
                IME_SETTINGS_POLLING_INTERVAL
            )
        }
    }

    private fun loadAndShowNativeAd() {


        refreshAd(
            enableKeyboardBinding.nativeAdLiveContainer,
            adStatusCallBack = { isLoaded ->

                when (isLoaded) {
                    true -> {
                        enableKeyboardBinding.placeHolderSmallAd.placeholderAd.isVisible(false)

                    }
                    false -> {
                        enableKeyboardBinding.placeHolderSmallAd.placeholderAd.isVisible(isLoaded)
                    }
                }


            },
            getString(R.string.enableDisableNativeId), true
        )
    }


}