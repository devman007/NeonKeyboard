package keyboard.neon.newboard.banads

import android.content.Context
import android.util.DisplayMetrics
import android.view.WindowManager
import com.google.android.gms.ads.AdSize

class AdaptiveAds(private var context: Context) {
    val adSize: AdSize
        get() {
            val window =
                (context.getSystemService(Context.WINDOW_SERVICE) as WindowManager)
            val display =
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
                    context.display
                } else {
                    window.defaultDisplay
                }
            val outMetrics = DisplayMetrics()
            display!!.getRealMetrics(outMetrics)
            val widthPixels = outMetrics.widthPixels.toFloat()
            val density = outMetrics.density
            val adWidth = (widthPixels / density).toInt()
            return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(
                context,
                adWidth
            )
        }
}