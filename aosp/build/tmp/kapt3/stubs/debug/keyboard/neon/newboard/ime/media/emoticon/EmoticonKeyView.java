package keyboard.neon.newboard.ime.media.emoticon;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lkeyboard/neon/newboard/ime/media/emoticon/EmoticonKeyView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lkeyboard/neon/newboard/ime/media/emoticon/EmoticonKeyData;", "data", "getData", "()Lkeyboard/neon/newboard/ime/media/emoticon/EmoticonKeyData;", "setData", "(Lkeyboard/neon/newboard/ime/media/emoticon/EmoticonKeyData;)V", "florisboard", "Lkeyboard/neon/newboard/ime/core/FlorisBoard;", "mediaInputManager", "Lkeyboard/neon/newboard/ime/media/MediaInputManager;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "aosp_debug"})
public final class EmoticonKeyView extends androidx.appcompat.widget.AppCompatTextView {
    private final keyboard.neon.newboard.ime.core.FlorisBoard florisboard = null;
    private final keyboard.neon.newboard.ime.media.MediaInputManager mediaInputManager = null;
    @org.jetbrains.annotations.Nullable()
    private keyboard.neon.newboard.ime.media.emoticon.EmoticonKeyData data;
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.media.emoticon.EmoticonKeyData getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.media.emoticon.EmoticonKeyData value) {
    }
    
    public EmoticonKeyView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public EmoticonKeyView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public EmoticonKeyView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    /**
     * Logic for handling a touch event.
     *
     * @param event The [MotionEvent] that should be processed by this view.
     * @return If this view has handled the touch event.
     */
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent event) {
        return false;
    }
}