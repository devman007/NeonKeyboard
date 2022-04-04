package keyboard.neon.newboard.util

import android.content.Context
import android.provider.Settings
import keyboard.neon.newboard.BuildConfig
import keyboard.neon.newboard.debug.flogInfo

//private const val IME_ID: String = "com.neon.keyboard.fancyfonts.fancy.keyboard/keyboard.neon.newboard.KeyboardImeiService"
private const val IME_ID =
    "com.neon.keyboard.fancyfonts.fancy.keyboard/keyboard.neon.newboard.KeyboardImeiService"


fun checkIfImeIsEnabled(context: Context): Boolean {
    val activeImeIds = Settings.Secure.getString(
        context.contentResolver,
        Settings.Secure.ENABLED_INPUT_METHODS
    ) ?: "(none)"
    flogInfo { "List of active IMEs: $activeImeIds" }
    return when {
        BuildConfig.DEBUG -> {
            activeImeIds.split(":").contains(IME_ID)

        }
//        context.packageName.endsWith(".beta") -> {
//            activeImeIds.split(":").contains(IME_ID_BETA)
//        }
        else -> {
            activeImeIds.split(":").contains(IME_ID)
        }


    }
}

fun checkIfImeIsSelected(context: Context): Boolean {
    val selectedImeId = Settings.Secure.getString(
        context.contentResolver,
        Settings.Secure.DEFAULT_INPUT_METHOD
    ) ?: "(none)"
    flogInfo { "Selected IME: $selectedImeId" }
    return when {
        BuildConfig.DEBUG -> {
            selectedImeId == IME_ID
        }
//        context.packageName.endsWith(".beta") -> {
//            selectedImeId.split(":").contains(IME_ID_BETA)
//        }
        else -> {
            selectedImeId == IME_ID
        }
    }
}
