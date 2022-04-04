package keyboard.neon.newboard.ime.media.emoji;

import java.lang.System;

/**
 * Manages the layout creation and touch events for the emoji section of the media context. Parts
 * of the layout of this view will be generated in coroutines and will therefore not instantly be
 * visible.
 *
 * @property florisboard Reference to instance of core class [FlorisBoard].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010@\u001a\u00020\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010AJ!\u0010B\u001a\u00020?2\u0006\u0010C\u001a\u00020\r2\u0006\u0010D\u001a\u00020EH\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010FJ\u000e\u0010G\u001a\u00020\u00112\u0006\u0010H\u001a\u00020IJ\b\u0010J\u001a\u00020\u0011H\u0014J\b\u0010K\u001a\u00020\u0011H\u0014J\u0012\u0010L\u001a\u00020 2\b\u0010M\u001a\u0004\u0018\u00010NH\u0016J\u0010\u0010O\u001a\u00020\u00112\u0006\u0010P\u001a\u00020QH\u0016J\u000e\u0010R\u001a\u00020\u00112\u0006\u0010S\u001a\u00020\rJ\u001a\u0010T\u001a\u00020\u00112\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020&0%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\'\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100)0%j\u0002`*0(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00000.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u00103\u001a\u000204X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00105\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0018\"\u0004\b;\u00108R\u000e\u0010<\u001a\u00020=X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020?0%X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006U"}, d2 = {"Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyboardView;", "Landroid/widget/LinearLayout;", "Lkeyboard/neon/newboard/ime/core/FlorisBoard$EventListener;", "Lkeyboard/neon/newboard/ime/theme/ThemeManager$OnThemeUpdatedListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defstyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "activeCategory", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiCategory;", "emojiClick", "Lkotlin/Function1;", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyData;", "", "getEmojiClick", "()Lkotlin/jvm/functions/Function1;", "setEmojiClick", "(Lkotlin/jvm/functions/Function1;)V", "emojiKeyHeight", "getEmojiKeyHeight", "()I", "emojiKeyWidth", "getEmojiKeyWidth", "emojiViewFlipper", "Landroid/widget/ViewFlipper;", "florisboard", "Lkeyboard/neon/newboard/ime/core/FlorisBoard;", "isScrollBlocked", "", "()Z", "setScrollBlocked", "(Z)V", "layoutAdapters", "Ljava/util/EnumMap;", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyAdapter;", "layouts", "Lkotlinx/coroutines/Deferred;", "", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiLayoutDataMap;", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "popupManager", "Lkeyboard/neon/newboard/ime/popup/PopupManager;", "getPopupManager", "()Lkeyboard/neon/newboard/ime/popup/PopupManager;", "setPopupManager", "(Lkeyboard/neon/newboard/ime/popup/PopupManager;)V", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "tabShowMode", "getTabShowMode", "setTabShowMode", "(I)V", "tabsPos", "getTabsPos", "setTabsPos", "themeManager", "Lkeyboard/neon/newboard/ime/theme/ThemeManager;", "uiLayouts", "Landroidx/recyclerview/widget/RecyclerView;", "buildLayout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildLayoutForCategory", "category", "recycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "(Lkeyboard/neon/newboard/ime/media/emoji/EmojiCategory;Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismissKeyView", "keyView", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyView;", "onAttachedToWindow", "onDetachedFromWindow", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onThemeUpdated", "theme", "Lkeyboard/neon/newboard/ime/theme/Theme;", "setActiveCategory", "newActiveCategory", "setEmojiClickListener", "aosp_debug"})
public final class EmojiKeyboardView extends android.widget.LinearLayout implements keyboard.neon.newboard.ime.core.FlorisBoard.EventListener, keyboard.neon.newboard.ime.theme.ThemeManager.OnThemeUpdatedListener {
    private int tabsPos = 0;
    private int tabShowMode = 0;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super keyboard.neon.newboard.ime.media.emoji.EmojiKeyData, kotlin.Unit> emojiClick;
    private final keyboard.neon.newboard.ime.core.FlorisBoard florisboard = null;
    private final keyboard.neon.newboard.ime.theme.ThemeManager themeManager = null;
    private keyboard.neon.newboard.ime.media.emoji.EmojiCategory activeCategory = keyboard.neon.newboard.ime.media.emoji.EmojiCategory.SMILEYS_EMOTION;
    private android.widget.ViewFlipper emojiViewFlipper;
    private final int emojiKeyWidth = 0;
    private final int emojiKeyHeight = 0;
    private kotlinx.coroutines.Deferred<? extends java.util.EnumMap<keyboard.neon.newboard.ime.media.emoji.EmojiCategory, java.util.List<keyboard.neon.newboard.ime.media.emoji.EmojiKeyData>>> layouts;
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    private final com.google.android.material.tabs.TabLayout tabLayout = null;
    private final java.util.EnumMap<keyboard.neon.newboard.ime.media.emoji.EmojiCategory, androidx.recyclerview.widget.RecyclerView> uiLayouts = null;
    private final java.util.EnumMap<keyboard.neon.newboard.ime.media.emoji.EmojiCategory, keyboard.neon.newboard.ime.media.emoji.EmojiKeyAdapter> layoutAdapters = null;
    private boolean isScrollBlocked = false;
    @org.jetbrains.annotations.NotNull()
    private keyboard.neon.newboard.ime.popup.PopupManager<keyboard.neon.newboard.ime.media.emoji.EmojiKeyboardView> popupManager;
    
    @kotlin.jvm.JvmOverloads()
    public EmojiKeyboardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public EmojiKeyboardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public EmojiKeyboardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defstyleAttr) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public EmojiKeyboardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defstyleAttr, int defStyleRes) {
        super(null);
    }
    
    public final int getTabsPos() {
        return 0;
    }
    
    public final void setTabsPos(int p0) {
    }
    
    public final int getTabShowMode() {
        return 0;
    }
    
    public final void setTabShowMode(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<keyboard.neon.newboard.ime.media.emoji.EmojiKeyData, kotlin.Unit> getEmojiClick() {
        return null;
    }
    
    public final void setEmojiClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super keyboard.neon.newboard.ime.media.emoji.EmojiKeyData, kotlin.Unit> p0) {
    }
    
    public final int getEmojiKeyWidth() {
        return 0;
    }
    
    public final int getEmojiKeyHeight() {
        return 0;
    }
    
    public final boolean isScrollBlocked() {
        return false;
    }
    
    public final void setScrollBlocked(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.popup.PopupManager<keyboard.neon.newboard.ime.media.emoji.EmojiKeyboardView> getPopupManager() {
        return null;
    }
    
    public final void setPopupManager(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.popup.PopupManager<keyboard.neon.newboard.ime.media.emoji.EmojiKeyboardView> p0) {
    }
    
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    /**
     * Requests the layout for each category and attaches the built layout to [emojiViewFlipper].
     * This method runs in the [Dispatchers.Default] context and will block the main thread only
     * when it attaches a built category layout to the view hierarchy.
     */
    private final java.lang.Object buildLayout(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Builds the layout for a given [category]. This function runs in the [Dispatchers.Default]
     * context and will not block the main UI thread.
     *
     * @param category The category for which a layout should be built.
     * @return The layout (top-most view is a [ScrollView]).
     */
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final java.lang.Object buildLayoutForCategory(keyboard.neon.newboard.ime.media.emoji.EmojiCategory category, androidx.recyclerview.widget.RecyclerView.RecycledViewPool recycledViewPool, kotlin.coroutines.Continuation<? super androidx.recyclerview.widget.RecyclerView> continuation) {
        return null;
    }
    
    public final void setEmojiClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super keyboard.neon.newboard.ime.media.emoji.EmojiKeyData, kotlin.Unit> emojiClick) {
    }
    
    /**
     * Sets the [activeCategory] and changes the active view of [emojiViewFlipper] accordingly.
     *
     * @param newActiveCategory The new active category.
     */
    public final void setActiveCategory(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.media.emoji.EmojiCategory newActiveCategory) {
    }
    
    /**
     * Resets the [isScrollBlocked] flag whenever a [MotionEvent.ACTION_DOWN] occurs. This method
     * never intercepts any events and thus always returns false.
     *
     * @param ev The [MotionEvent] of the current touch event.
     * @return If this view wants to intercept the touch event. Always returns false here.
     */
    @java.lang.Override()
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent ev) {
        return false;
    }
    
    /**
     * Invalidates the passed [keyView], sends a [MotionEvent.ACTION_CANCEL] to indicate the loss
     * of focus and prevents the HorizontalScrollView to scroll within this MotionEvent.
     */
    public final void dismissKeyView(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.media.emoji.EmojiKeyView keyView) {
    }
    
    @java.lang.Override()
    public void onThemeUpdated(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.theme.Theme theme) {
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