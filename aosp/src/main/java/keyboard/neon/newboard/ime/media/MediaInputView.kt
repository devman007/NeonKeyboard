package keyboard.neon.newboard.ime.media

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import com.google.android.material.tabs.TabLayout
import keyboard.neon.newboard.R
import keyboard.neon.newboard.ime.core.FlorisBoard
import keyboard.neon.newboard.ime.theme.Theme
import keyboard.neon.newboard.ime.theme.ThemeManager
import kotlin.math.roundToInt

class MediaInputView : LinearLayout, FlorisBoard.EventListener,
    ThemeManager.OnThemeUpdatedListener {
    private val florisboard: FlorisBoard? = FlorisBoard.getInstanceOrNull()
    private val themeManager: ThemeManager = ThemeManager.default()

    var tabLayout: TabLayout? = null
        private set
    var switchToTextInputButton: Button? = null
        private set
    var backspaceButton: ImageButton? = null
        private set

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        florisboard?.addEventListener(this)
        themeManager.registerOnThemeUpdatedListener(this)
        tabLayout = findViewById(R.id.media_input_tabs)
        switchToTextInputButton = findViewById(R.id.media_input_switch_to_text_input_button)
        backspaceButton = findViewById(R.id.media_input_backspace_button)
        onApplyThemeAttributes()
    }

    override fun onDetachedFromWindow() {
        themeManager.unregisterOnThemeUpdatedListener(this)
        florisboard?.removeEventListener(this)
        super.onDetachedFromWindow()
    }

    override fun onThemeUpdated(theme: Theme) {
        val fgColor = theme.getAttr(Theme.Attr.MEDIA_FOREGROUND).toSolidColor().color
        val colorPrimary = theme.getAttr(Theme.Attr.WINDOW_COLOR_PRIMARY).toSolidColor().color
        tabLayout?.setTabTextColors(fgColor, fgColor)
        tabLayout?.tabIconTint = ColorStateList.valueOf(fgColor)
        tabLayout?.setSelectedTabIndicatorColor(colorPrimary)
        switchToTextInputButton?.setTextColor(fgColor)
        backspaceButton?.imageTintList = ColorStateList.valueOf(fgColor)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val height = florisboard?.uiBinding?.inputView?.desiredMediaKeyboardViewHeight ?: 0.0f
        super.onMeasure(
            widthMeasureSpec,
            MeasureSpec.makeMeasureSpec(height.roundToInt(), MeasureSpec.EXACTLY)
        )
    }
}
