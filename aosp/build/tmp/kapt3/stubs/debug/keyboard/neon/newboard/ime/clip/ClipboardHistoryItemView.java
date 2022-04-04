package keyboard.neon.newboard.ime.clip;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u0015J\u0006\u0010\u001d\u001a\u00020\u0015R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/ClipboardHistoryItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkeyboard/neon/newboard/ime/theme/ThemeManager$OnThemeUpdatedListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "keyboardView", "Lkeyboard/neon/newboard/ime/clip/ClipboardHistoryView;", "getKeyboardView", "()Lkeyboard/neon/newboard/ime/clip/ClipboardHistoryView;", "setKeyboardView", "(Lkeyboard/neon/newboard/ime/clip/ClipboardHistoryView;)V", "popupManager", "Lkeyboard/neon/newboard/ime/clip/ClipboardPopupManager;", "onAttachedToWindow", "", "onClickItem", "onLongClickItem", "", "onThemeUpdated", "theme", "Lkeyboard/neon/newboard/ime/theme/Theme;", "setPinned", "setUnpinned", "aosp_debug"})
public final class ClipboardHistoryItemView extends androidx.constraintlayout.widget.ConstraintLayout implements keyboard.neon.newboard.ime.theme.ThemeManager.OnThemeUpdatedListener {
    public keyboard.neon.newboard.ime.clip.ClipboardHistoryView keyboardView;
    private keyboard.neon.newboard.ime.clip.ClipboardPopupManager popupManager;
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.clip.ClipboardHistoryView getKeyboardView() {
        return null;
    }
    
    public final void setKeyboardView(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.clip.ClipboardHistoryView p0) {
    }
    
    public ClipboardHistoryItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public ClipboardHistoryItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ClipboardHistoryItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override()
    public void onThemeUpdated(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.theme.Theme theme) {
    }
    
    private final boolean onLongClickItem() {
        return false;
    }
    
    private final void onClickItem() {
    }
    
    public final void setPinned() {
    }
    
    public final void setUnpinned() {
    }
}