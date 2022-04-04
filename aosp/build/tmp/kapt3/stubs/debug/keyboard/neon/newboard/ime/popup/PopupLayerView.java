package keyboard.neon.newboard.ime.popup;

import java.lang.System;

/**
 * Basic helper view class which acts as a non-interactive layer view, which sits above the whole
 * input UI. Automatically rejects any touch events and passes it through to the View below.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010 \u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006!"}, d2 = {"Lkeyboard/neon/newboard/ime/popup/PopupLayerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "clipboardPopupManager", "Lkeyboard/neon/newboard/ime/clip/ClipboardPopupManager;", "getClipboardPopupManager", "()Lkeyboard/neon/newboard/ime/clip/ClipboardPopupManager;", "setClipboardPopupManager", "(Lkeyboard/neon/newboard/ime/clip/ClipboardPopupManager;)V", "intercept", "Lkeyboard/neon/newboard/ime/clip/ClipboardPopupView;", "getIntercept", "()Lkeyboard/neon/newboard/ime/clip/ClipboardPopupView;", "setIntercept", "(Lkeyboard/neon/newboard/ime/clip/ClipboardPopupView;)V", "shouldIntercept", "", "getShouldIntercept", "()Z", "setShouldIntercept", "(Z)V", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "aosp_debug"})
public final class PopupLayerView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.Nullable()
    private keyboard.neon.newboard.ime.clip.ClipboardPopupManager clipboardPopupManager;
    @org.jetbrains.annotations.Nullable()
    private keyboard.neon.newboard.ime.clip.ClipboardPopupView intercept;
    private boolean shouldIntercept = true;
    
    public PopupLayerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public PopupLayerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public PopupLayerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.clip.ClipboardPopupManager getClipboardPopupManager() {
        return null;
    }
    
    public final void setClipboardPopupManager(@org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.clip.ClipboardPopupManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.clip.ClipboardPopupView getIntercept() {
        return null;
    }
    
    public final void setIntercept(@org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.clip.ClipboardPopupView p0) {
    }
    
    public final boolean getShouldIntercept() {
        return false;
    }
    
    public final void setShouldIntercept(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent ev) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent ev) {
        return false;
    }
}