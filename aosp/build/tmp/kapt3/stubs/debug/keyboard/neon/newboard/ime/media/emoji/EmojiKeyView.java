package keyboard.neon.newboard.ime.media.emoji;

import java.lang.System;

/**
 * View class for managing the rendering and the events of a single emoji keyboard key.
 *
 * @property florisboard Reference to instance of core class [FlorisBoard].
 * @property emojiKeyboardView Reference to the parent [EmojiKeyboardView].
 * @property key The current key. Is used to determine rendering and possible behaviour when events occur.
 */
@android.annotation.SuppressLint(value = {"ViewConstructor"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B-\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u00a2\u0006\u0002\u0010\rJ\b\u0010%\u001a\u00020\fH\u0014J\b\u0010&\u001a\u00020\fH\u0014J\u0012\u0010\'\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J0\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020-H\u0014J\u0018\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020-2\u0006\u00103\u001a\u00020-H\u0014J\u0010\u00104\u001a\u00020\f2\u0006\u00105\u001a\u000206H\u0016J\u0012\u00107\u001a\u00020\u00172\b\u00108\u001a\u0004\u0018\u000109H\u0017R\u0012\u0010\u000e\u001a\u00020\u000fX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lkotlinx/coroutines/CoroutineScope;", "Lkeyboard/neon/newboard/ime/core/FlorisBoard$EventListener;", "Lkeyboard/neon/newboard/ime/theme/ThemeManager$OnThemeUpdatedListener;", "emojiKeyboardView", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyboardView;", "key", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiKey;", "emojiClick", "Lkotlin/Function1;", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyData;", "", "(Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyboardView;Lkeyboard/neon/newboard/ime/media/emoji/EmojiKey;Lkotlin/jvm/functions/Function1;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getEmojiClick", "()Lkotlin/jvm/functions/Function1;", "florisboard", "Lkeyboard/neon/newboard/ime/core/FlorisBoard;", "isCancelled", "", "value", "getKey", "()Lkeyboard/neon/newboard/ime/media/emoji/EmojiKey;", "setKey", "(Lkeyboard/neon/newboard/ime/media/emoji/EmojiKey;)V", "osHandler", "Landroid/os/Handler;", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "getPrefs", "()Lkeyboard/neon/newboard/ime/core/Preferences;", "triangleDrawable", "Landroid/graphics/drawable/Drawable;", "onAttachedToWindow", "onDetachedFromWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "left", "", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onThemeUpdated", "theme", "Lkeyboard/neon/newboard/ime/theme/Theme;", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "aosp_debug"})
public final class EmojiKeyView extends androidx.appcompat.widget.AppCompatTextView implements kotlinx.coroutines.CoroutineScope, keyboard.neon.newboard.ime.core.FlorisBoard.EventListener, keyboard.neon.newboard.ime.theme.ThemeManager.OnThemeUpdatedListener {
    private final keyboard.neon.newboard.ime.media.emoji.EmojiKeyboardView emojiKeyboardView = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function1<keyboard.neon.newboard.ime.media.emoji.EmojiKeyData, kotlin.Unit> emojiClick = null;
    private final keyboard.neon.newboard.ime.core.FlorisBoard florisboard = null;
    private boolean isCancelled = false;
    private android.os.Handler osHandler;
    private android.graphics.drawable.Drawable triangleDrawable;
    @org.jetbrains.annotations.NotNull()
    private keyboard.neon.newboard.ime.media.emoji.EmojiKey key;
    
    public EmojiKeyView(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.media.emoji.EmojiKeyboardView emojiKeyboardView, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.media.emoji.EmojiKey key, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super keyboard.neon.newboard.ime.media.emoji.EmojiKeyData, kotlin.Unit> emojiClick) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<keyboard.neon.newboard.ime.media.emoji.EmojiKeyData, kotlin.Unit> getEmojiClick() {
        return null;
    }
    
    private final keyboard.neon.newboard.ime.core.Preferences getPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.media.emoji.EmojiKey getKey() {
        return null;
    }
    
    public final void setKey(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.media.emoji.EmojiKey value) {
    }
    
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    /**
     * Logic for handling a touch event. Cancels the touch event if the pointer moves to far from
     * popup and/or key.
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
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }
    
    @java.lang.Override()
    public void onThemeUpdated(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.theme.Theme theme) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
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