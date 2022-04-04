package com.example.neonkeyboardnew.ads

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import com.example.neonkeyboardnew.R


class AdLoader(var context: Activity) {
    private var dialog: Dialog? = null

    init {
        createLoadingDialog()
    }

    private fun createLoadingDialog() {
        dialog = Dialog(context)
        dialog?.let {

            it.setContentView(R.layout.ad_loader)
            it.setCancelable(false)
            it.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        }

    }

    fun showDialog() {
        dialog?.show()
    }

    fun closeDialog() {
        if (dialog!!.isShowing) {
            dialog?.dismiss()
        }

    }


}



