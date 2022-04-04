
package keyboard.neon.newboard.ime.keyboard

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.ViewGroup
import keyboard.neon.newboard.ime.core.FlorisBoard
import keyboard.neon.newboard.ime.core.Preferences
import keyboard.neon.newboard.ime.theme.ThemeManager
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.sendBlocking

@Suppress("MemberVisibilityCanBePrivate")
abstract class KeyboardView : ViewGroup, KeyboardState.OnUpdateStateListener, ThemeManager.OnThemeUpdatedListener {
    protected val florisboard get() = FlorisBoard.getInstanceOrNull()
    protected val prefs get() = Preferences.default()
    protected val themeManager get() = ThemeManager.defaultOrNull()

    var isMeasured: Boolean = false
        private set
    protected var isTouchable: Boolean = true
    protected val touchEventChannel: Channel<MotionEvent> = Channel(64)
    protected val mainScope: CoroutineScope = CoroutineScope(Dispatchers.Main.immediate + SupervisorJob())

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        layoutDirection = LAYOUT_DIRECTION_LTR
        mainScope.launch {
            for (event in touchEventChannel) {
                if (!isActive) break
                onTouchEventInternal(event)
            }
        }
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        themeManager?.registerOnThemeUpdatedListener(this)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        themeManager?.unregisterOnThemeUpdatedListener(this)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        return true
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        event ?: return false
        if (!isTouchable) return false

        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN,
            MotionEvent.ACTION_POINTER_DOWN,
            MotionEvent.ACTION_MOVE,
            MotionEvent.ACTION_POINTER_UP,
            MotionEvent.ACTION_UP,
            MotionEvent.ACTION_CANCEL -> {
                touchEventChannel.sendBlocking(event)
                return true
            }
        }
        return false
    }

    protected abstract fun onTouchEventInternal(event: MotionEvent)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        isMeasured = true
    }

    abstract fun sync()
}
