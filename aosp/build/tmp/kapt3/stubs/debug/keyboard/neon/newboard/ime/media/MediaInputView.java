package keyboard.neon.newboard.ime.media;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u001fH\u0014J\u0018\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH\u0014J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&H\u0016R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u0014@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\r\u001a\u0004\u0018\u00010\u0018@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lkeyboard/neon/newboard/ime/media/MediaInputView;", "Landroid/widget/LinearLayout;", "Lkeyboard/neon/newboard/ime/core/FlorisBoard$EventListener;", "Lkeyboard/neon/newboard/ime/theme/ThemeManager$OnThemeUpdatedListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "Landroid/widget/ImageButton;", "backspaceButton", "getBackspaceButton", "()Landroid/widget/ImageButton;", "florisboard", "Lkeyboard/neon/newboard/ime/core/FlorisBoard;", "Landroid/widget/Button;", "switchToTextInputButton", "getSwitchToTextInputButton", "()Landroid/widget/Button;", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "getTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "themeManager", "Lkeyboard/neon/newboard/ime/theme/ThemeManager;", "onAttachedToWindow", "", "onDetachedFromWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onThemeUpdated", "theme", "Lkeyboard/neon/newboard/ime/theme/Theme;", "aosp_debug"})
public final class MediaInputView extends android.widget.LinearLayout implements keyboard.neon.newboard.ime.core.FlorisBoard.EventListener, keyboard.neon.newboard.ime.theme.ThemeManager.OnThemeUpdatedListener {
    private final keyboard.neon.newboard.ime.core.FlorisBoard florisboard = null;
    private final keyboard.neon.newboard.ime.theme.ThemeManager themeManager = null;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.tabs.TabLayout tabLayout;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button switchToTextInputButton;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageButton backspaceButton;
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.material.tabs.TabLayout getTabLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getSwitchToTextInputButton() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageButton getBackspaceButton() {
        return null;
    }
    
    public MediaInputView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public MediaInputView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public MediaInputView(@org.jetbrains.annotations.NotNull()
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
    public void onThemeUpdated(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.theme.Theme theme) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    public void onApplyThemeAttributes() {
    }
    
    public void onCreate() {
    }
    
    public void onDestroy() {
    }
    
    public void onFinishInputView(boolean finishingInput) {
    }
    
    public void onInitializeInputUi(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.databinding.FlorisboardBinding uiBinding) {
    }
    
    public void onPrimaryClipChanged() {
    }
    
    public void onStartInputView(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.EditorInstance instance, boolean restarting) {
    }
    
    public void onSubtypeChanged(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype newSubtype, boolean doRefreshLayouts) {
    }
    
    public void onUpdateSelection() {
    }
    
    public void onWindowHidden() {
    }
    
    public void onWindowShown() {
    }
}