package keyboard.neon.newboard.ime.keyboard;

import java.lang.System;

@kotlin.Suppress(names = {"MemberVisibilityCanBePrivate"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010)\u001a\u00020*H\u0014J\b\u0010+\u001a\u00020*H\u0014J\u0012\u0010,\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010&H\u0016J\u0018\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0014J\u0012\u00101\u001a\u00020\u00122\b\u00102\u001a\u0004\u0018\u00010&H\u0017J\u0010\u00103\u001a\u00020*2\u0006\u00102\u001a\u00020&H$J\b\u00104\u001a\u00020*H&R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0012X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0014\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u0004\u0018\u00010!8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(\u00a8\u00065"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/KeyboardView;", "Landroid/view/ViewGroup;", "Lkeyboard/neon/newboard/ime/keyboard/KeyboardState$OnUpdateStateListener;", "Lkeyboard/neon/newboard/ime/theme/ThemeManager$OnThemeUpdatedListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "florisboard", "Lkeyboard/neon/newboard/ime/core/FlorisBoard;", "getFlorisboard", "()Lkeyboard/neon/newboard/ime/core/FlorisBoard;", "<set-?>", "", "isMeasured", "()Z", "isTouchable", "setTouchable", "(Z)V", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "getMainScope", "()Lkotlinx/coroutines/CoroutineScope;", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "getPrefs", "()Lkeyboard/neon/newboard/ime/core/Preferences;", "themeManager", "Lkeyboard/neon/newboard/ime/theme/ThemeManager;", "getThemeManager", "()Lkeyboard/neon/newboard/ime/theme/ThemeManager;", "touchEventChannel", "Lkotlinx/coroutines/channels/Channel;", "Landroid/view/MotionEvent;", "getTouchEventChannel", "()Lkotlinx/coroutines/channels/Channel;", "onAttachedToWindow", "", "onDetachedFromWindow", "onInterceptTouchEvent", "ev", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "event", "onTouchEventInternal", "sync", "aosp_debug"})
public abstract class KeyboardView extends android.view.ViewGroup implements keyboard.neon.newboard.ime.keyboard.KeyboardState.OnUpdateStateListener, keyboard.neon.newboard.ime.theme.ThemeManager.OnThemeUpdatedListener {
    private boolean isMeasured = false;
    private boolean isTouchable = true;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.channels.Channel<android.view.MotionEvent> touchEventChannel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    
    @org.jetbrains.annotations.Nullable()
    protected final keyboard.neon.newboard.ime.core.FlorisBoard getFlorisboard() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final keyboard.neon.newboard.ime.core.Preferences getPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final keyboard.neon.newboard.ime.theme.ThemeManager getThemeManager() {
        return null;
    }
    
    public final boolean isMeasured() {
        return false;
    }
    
    protected final boolean isTouchable() {
        return false;
    }
    
    protected final void setTouchable(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.channels.Channel<android.view.MotionEvent> getTouchEventChannel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.CoroutineScope getMainScope() {
        return null;
    }
    
    public KeyboardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public KeyboardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public KeyboardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override()
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent ev) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent event) {
        return false;
    }
    
    protected abstract void onTouchEventInternal(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event);
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    public abstract void sync();
    
    /**
     * Adds the ability for Views to intercept a update keyboard state dispatch.
     *
     * @param newState Reference to the new state.
     *
     * @return True if the update was intercepted (and thus the child views have to
     * be manually updated if needed, false if no interception happened.
     */
    public boolean onInterceptUpdateKeyboardState(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyboardState newState) {
        return false;
    }
}