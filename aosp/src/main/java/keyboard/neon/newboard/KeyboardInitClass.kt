package keyboard.neon.newboard
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Build
import androidx.core.os.UserManagerCompat
import keyboard.neon.newboard.debug.Flog
import keyboard.neon.newboard.debug.LogTopic
import keyboard.neon.newboard.ime.core.Preferences
import keyboard.neon.newboard.ime.core.SubtypeManager
import keyboard.neon.newboard.ime.theme.ThemeManager
import keyboard.neon.newboard.res.AssetManager
import timber.log.Timber

class KeyboardInitClass(private val context: Context) {

    fun onCreate() {
        try {

            if (BuildConfig.DEBUG) {
                Timber.plant(Timber.DebugTree())
            }

            Flog.install(
                applicationContext = context,
                isFloggingEnabled = BuildConfig.DEBUG,
                flogTopics = LogTopic.ALL,
                flogLevels = Flog.LEVEL_ALL,
                flogOutputs = Flog.OUTPUT_CONSOLE
            )
            Timber.d("OnCreate working...")
//            initICU()
            init()
        } catch (e: Exception) {

            e.printStackTrace()
//            CrashUtility.stageException(e)
            return
        }

        /*Register a receiver so user config can be applied once device protracted storage is available*/
        if (!UserManagerCompat.isUserUnlocked(context) && Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            context.registerReceiver(BootComplete(), IntentFilter(Intent.ACTION_USER_UNLOCKED))
        }

    }

//    fun initICU(): Boolean {
//        try {
//            val context = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//                context.createDeviceProtectedStorageContext()
//            } else {
//                context
//            }
//            val androidAssetManager = context.assets ?: return false
//            val dstDataFile = File(context.cacheDir, "icudt.dat")
//            dstDataFile.outputStream().use { os ->
//                androidAssetManager.open(ICU_DATA_ASSET_PATH).use { it.copyTo(os) }
//            }
//            val status = nativeInitICUData(dstDataFile.absolutePath.toNativeStr())
//            return if (status != 0) {
//                flogError { "Native ICU data initializing failed with error code $status!" }
//                false
//            } else {
//                flogInfo { "Successfully loaded ICU data!" }
//                true
//            }
//        } catch (e: Exception) {
//            flogError { e.toString() }
//            return false
//        }
//    }

    fun init() {
//        CrashUtility.install(context)
        val prefs = Preferences.initDefault(context)
        val assetManager = AssetManager.init(context)
        SubtypeManager.init(context)
        ThemeManager.init(context, assetManager)
        prefs.initDefaultPreferences()


    }

    private inner class BootComplete : BroadcastReceiver() {

        override fun onReceive(context: Context?, intent: Intent?) {
            if (Intent.ACTION_USER_UNLOCKED == intent?.action) {
                try {
                    context?.unregisterReceiver(this)
                    init()
                } catch (e: Exception) {
                    e.fillInStackTrace()
                }
            }
        }
    }


}