package com.example.neonkeyboardnew.apputils

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.widget.Toast
import com.example.neonkeyboardnew.BuildConfig
import keyboard.neon.newboard.util.showToast

fun Activity.privacyPolicy() {
    val uri =
        Uri.parse("https://ninelogix.blogspot.com/")
    val myAppLinkToMarket = Intent(Intent.ACTION_VIEW, uri)
    try {
        startActivity(myAppLinkToMarket)
    } catch (e: ActivityNotFoundException) {
        Toast.makeText(this, " unable to find market app", Toast.LENGTH_LONG).show()
    }
}

fun Activity.sendEmail() {
    val sendIntent = Intent()
    sendIntent.action = Intent.ACTION_SEND
    sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Neon Keyboard Feedback")
    sendIntent.putExtra(Intent.EXTRA_TEXT, "Kindly tell us your kind suggestions?")
    sendIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("ninelogixstudio@gmail.com"))
    sendIntent.type = "text/plain"
    val pm: PackageManager = packageManager
    if (isPackageInstalled(pm, "com.google.android.gm")) {
        sendIntent.setPackage("com.google.android.gm")
    }

    try {
        startActivity(sendIntent)
    } catch (ex: ActivityNotFoundException) {

        showToast("No app found to perform this action")
    }

}

private fun isPackageInstalled(
    packageManager: PackageManager, name: String,
): Boolean {
    return try {
        packageManager.getPackageInfo(name, 0)
        true
    } catch (e: PackageManager.NameNotFoundException) {
        false
    }
}


fun rateUs(context: Context) {
    val intent = Intent(
        Intent.ACTION_VIEW, Uri.parse(
            "https://play.google.com/store/apps/details?id=" +
                    BuildConfig.APPLICATION_ID
        )
    )
    context.startActivity(intent)
}


fun Context.shareApp() =
    this.startActivity(Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(
            Intent.EXTRA_TEXT,
            "Use this Neon keyboard with new  and trending themes \n and enjoy new keyboard look and feel  \n https://play.google.com/store/apps/details?id=${BuildConfig.APPLICATION_ID}"
        )
        type = "text/plain"
    })