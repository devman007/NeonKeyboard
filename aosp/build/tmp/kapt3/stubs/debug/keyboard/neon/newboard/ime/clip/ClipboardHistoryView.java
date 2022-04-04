package keyboard.neon.newboard.ime.clip;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020!H\u0014J\u0018\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000bH\u0014J\u0010\u0010&\u001a\u00020!2\u0006\u0010\'\u001a\u00020(H\u0016R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u0013@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0001@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/ClipboardHistoryView;", "Landroid/widget/LinearLayout;", "Lkeyboard/neon/newboard/ime/core/FlorisBoard$EventListener;", "Lkeyboard/neon/newboard/ime/theme/ThemeManager$OnThemeUpdatedListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "Landroid/widget/ImageButton;", "backButton", "getBackButton", "()Landroid/widget/ImageButton;", "clearAll", "Landroid/widget/TextView;", "clipText", "getClipText", "()Landroid/widget/TextView;", "clipboardBar", "getClipboardBar", "()Landroid/widget/LinearLayout;", "clipboardHistory", "Landroidx/recyclerview/widget/RecyclerView;", "florisboard", "Lkeyboard/neon/newboard/ime/core/FlorisBoard;", "themeManager", "Lkeyboard/neon/newboard/ime/theme/ThemeManager;", "onAttachedToWindow", "", "onDetachedFromWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onThemeUpdated", "theme", "Lkeyboard/neon/newboard/ime/theme/Theme;", "aosp_debug"})
public final class ClipboardHistoryView extends android.widget.LinearLayout implements keyboard.neon.newboard.ime.core.FlorisBoard.EventListener, keyboard.neon.newboard.ime.theme.ThemeManager.OnThemeUpdatedListener {
    private final keyboard.neon.newboard.ime.core.FlorisBoard florisboard = null;
    private final keyboard.neon.newboard.ime.theme.ThemeManager themeManager = null;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageButton backButton;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView clipText;
    @org.jetbrains.annotations.Nullable()
    private android.widget.LinearLayout clipboardBar;
    private androidx.recyclerview.widget.RecyclerView clipboardHistory;
    private android.widget.ImageButton clearAll;
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageButton getBackButton() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getClipText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.LinearLayout getClipboardBar() {
        return null;
    }
    
    public ClipboardHistoryView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public ClipboardHistoryView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ClipboardHistoryView(@org.jetbrains.annotations.NotNull()
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