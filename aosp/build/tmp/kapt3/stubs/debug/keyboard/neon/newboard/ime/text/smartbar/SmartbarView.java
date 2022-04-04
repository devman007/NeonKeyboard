package keyboard.neon.newboard.ime.text.smartbar;

import java.lang.System;

/**
 * View class which manages the state and the UI of the Smartbar, a key element in the usefulness
 * of FlorisBoard. The view automatically tries to get the current FlorisBoard instance, which it
 * needs to decide when a specific feature component is shown.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001RB\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010+\u001a\u00020,H\u0007JE\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020\u00122\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u00101\u001a\u00020\u00122\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0002\u00103J\b\u00104\u001a\u00020,H\u0014J\b\u00105\u001a\u00020,H\u0014J\b\u00106\u001a\u00020,H\u0014J\u0010\u00107\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u0017H\u0016J\u0018\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000bH\u0014J\u0006\u0010<\u001a\u00020,J\u0010\u0010=\u001a\u00020,2\u0006\u0010>\u001a\u00020?H\u0016J\u0010\u0010@\u001a\u00020,2\u0006\u00108\u001a\u00020\u0017H\u0016J#\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020\"2\b\u0010C\u001a\u0004\u0018\u00010D\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0002\bEJ\u0010\u0010F\u001a\u00020,2\b\u0010G\u001a\u0004\u0018\u00010\u001aJ\u0016\u0010H\u001a\u00020,2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020K0JH\u0007J\u0006\u0010L\u001a\u00020,J\u0006\u0010M\u001a\u00020,J\u0018\u0010N\u001a\u00020,2\u000e\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010P0JH\u0003J\b\u0010Q\u001a\u00020,H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020&8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006S"}, d2 = {"Lkeyboard/neon/newboard/ime/text/smartbar/SmartbarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkeyboard/neon/newboard/ime/keyboard/KeyboardState$OnUpdateStateListener;", "Lkeyboard/neon/newboard/ime/theme/ThemeManager$OnThemeUpdatedListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lkeyboard/neon/newboard/databinding/SmartbarBinding;", "cachedActionEndAreaId", "Ljava/lang/Integer;", "cachedActionEndAreaVisible", "", "cachedActionStartAreaId", "cachedActionStartAreaVisible", "cachedMainAreaId", "cachedState", "Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "eventListener", "Ljava/lang/ref/WeakReference;", "Lkeyboard/neon/newboard/ime/text/smartbar/SmartbarView$EventListener;", "florisboard", "Lkeyboard/neon/newboard/ime/core/FlorisBoard;", "indexedActionEndArea", "", "indexedActionStartArea", "indexedMainArea", "lastSuggestionInitDate", "", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "getPrefs", "()Lkeyboard/neon/newboard/ime/core/Preferences;", "themeManager", "Lkeyboard/neon/newboard/ime/theme/ThemeManager;", "clearInlineSuggestions", "", "configureFeatureVisibility", "actionStartAreaVisible", "actionStartAreaId", "mainAreaId", "actionEndAreaVisible", "actionEndAreaId", "(ZLjava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;)V", "onAttachedToWindow", "onDetachedFromWindow", "onFinishInflate", "onInterceptUpdateKeyboardState", "newState", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onPrimaryClipChanged", "onThemeUpdated", "theme", "Lkeyboard/neon/newboard/ime/theme/Theme;", "onUpdateKeyboardState", "setCandidateSuggestionWords", "suggestionInitDate", "suggestions", "Lkeyboard/neon/newboard/ime/nlp/SuggestionList;", "setCandidateSuggestionWords-YouIOyU", "setEventListener", "listener", "showInlineSuggestions", "inlineSuggestions", "", "Landroid/view/inputmethod/InlineSuggestion;", "sync", "updateCandidateSuggestionCapsState", "updateInlineSuggestionStrip", "suggestionViews", "Landroid/widget/inline/InlineContentView;", "updateUi", "EventListener", "aosp_debug"})
public final class SmartbarView extends androidx.constraintlayout.widget.ConstraintLayout implements keyboard.neon.newboard.ime.keyboard.KeyboardState.OnUpdateStateListener, keyboard.neon.newboard.ime.theme.ThemeManager.OnThemeUpdatedListener {
    private final keyboard.neon.newboard.ime.core.FlorisBoard florisboard = null;
    private final keyboard.neon.newboard.ime.theme.ThemeManager themeManager = null;
    private java.lang.ref.WeakReference<keyboard.neon.newboard.ime.text.smartbar.SmartbarView.EventListener> eventListener;
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    private long lastSuggestionInitDate = 0L;
    private boolean cachedActionStartAreaVisible = false;
    @androidx.annotation.IdRes()
    private java.lang.Integer cachedActionStartAreaId;
    @androidx.annotation.IdRes()
    private java.lang.Integer cachedMainAreaId;
    private boolean cachedActionEndAreaVisible = false;
    @androidx.annotation.IdRes()
    private java.lang.Integer cachedActionEndAreaId;
    private final keyboard.neon.newboard.ime.keyboard.KeyboardState cachedState = null;
    private keyboard.neon.newboard.databinding.SmartbarBinding binding;
    private java.util.List<java.lang.Integer> indexedActionStartArea;
    private java.util.List<java.lang.Integer> indexedMainArea;
    private java.util.List<java.lang.Integer> indexedActionEndArea;
    
    private final keyboard.neon.newboard.ime.core.Preferences getPrefs() {
        return null;
    }
    
    public SmartbarView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public SmartbarView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public SmartbarView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    /**
     * Called by Android when this view has been attached to a window. At this point we can be
     * certain that all children have been instantiated and that we can begin working with them.
     * After initializing all child views, this method registers the SmartbarView in the
     * TextInputManager, which then starts working together with this view.
     */
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    /**
     * Updates the visibility of features based on the provided attributes.
     *
     * @param actionStartAreaVisible True if the action start area should be shown, else false.
     * @param actionStartAreaId The ID of the element to show within the action start area. Set to
     * null to leave this area blank.
     * @param mainAreaId The ID of the element to show within the main area. Set to null to leave
     * this area blank.
     * @param actionEndAreaVisible True if the action end area should be shown, else false.
     * @param actionEndAreaId The ID of the element to show within the action end area. Set to null
     * to leave this area blank.
     */
    private final void configureFeatureVisibility(boolean actionStartAreaVisible, @androidx.annotation.IdRes()
    java.lang.Integer actionStartAreaId, @androidx.annotation.IdRes()
    java.lang.Integer mainAreaId, boolean actionEndAreaVisible, @androidx.annotation.IdRes()
    java.lang.Integer actionEndAreaId) {
    }
    
    @java.lang.Override()
    public boolean onInterceptUpdateKeyboardState(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyboardState newState) {
        return false;
    }
    
    @java.lang.Override()
    public void onUpdateKeyboardState(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyboardState newState) {
    }
    
    private final void updateUi() {
    }
    
    public final void sync() {
    }
    
    public final void onPrimaryClipChanged() {
    }
    
    public final void updateCandidateSuggestionCapsState() {
    }
    
    /**
     * Clears the inline suggestions and triggers thw Smartbar update cycle.
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    public final void clearInlineSuggestions() {
    }
    
    /**
     * Inflates the given inline suggestions. Once all provided views are ready, the suggestions
     * strip is updated and the Smartbar update cycle is triggered.
     *
     * @param inlineSuggestions A collection of inline suggestions to be inflated and shown.
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    public final void showInlineSuggestions(@org.jetbrains.annotations.NotNull()
    java.util.Collection<android.view.inputmethod.InlineSuggestion> inlineSuggestions) {
    }
    
    /**
     * Updates the suggestion strip with given inline content views and triggers the Smartbar
     * update cycle.
     *
     * @param suggestionViews A collection of inline content views to show.
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    private final void updateInlineSuggestionStrip(java.util.Collection<? extends android.widget.inline.InlineContentView> suggestionViews) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    public void onThemeUpdated(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.theme.Theme theme) {
    }
    
    public final void setEventListener(@org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.text.smartbar.SmartbarView.EventListener listener) {
    }
    
    /**
     * Event listener interface which can be used by other classes to receive updates when something
     * important happens in the Smartbar.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\u0016\u00a8\u0006\u000e"}, d2 = {"Lkeyboard/neon/newboard/ime/text/smartbar/SmartbarView$EventListener;", "", "onSmartbarBackButtonPressed", "", "onSmartbarCandidatePressed", "word", "", "onSmartbarClipboardCandidatePressed", "clipboardItem", "Lkeyboard/neon/newboard/ime/clip/provider/ClipboardItem;", "onSmartbarPrivateModeButtonClicked", "onSmartbarQuickActionPressed", "quickActionId", "", "aosp_debug"})
    public static abstract interface EventListener {
        
        public abstract void onSmartbarBackButtonPressed();
        
        public abstract void onSmartbarCandidatePressed(@org.jetbrains.annotations.NotNull()
        java.lang.String word);
        
        public abstract void onSmartbarClipboardCandidatePressed(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.clip.provider.ClipboardItem clipboardItem);
        
        public abstract void onSmartbarPrivateModeButtonClicked();
        
        public abstract void onSmartbarQuickActionPressed(@androidx.annotation.IdRes()
        int quickActionId);
        
        /**
         * Event listener interface which can be used by other classes to receive updates when something
         * important happens in the Smartbar.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class DefaultImpls {
            
            public static void onSmartbarBackButtonPressed(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.text.smartbar.SmartbarView.EventListener $this) {
            }
            
            public static void onSmartbarCandidatePressed(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.text.smartbar.SmartbarView.EventListener $this, @org.jetbrains.annotations.NotNull()
            java.lang.String word) {
            }
            
            public static void onSmartbarClipboardCandidatePressed(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.text.smartbar.SmartbarView.EventListener $this, @org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.clip.provider.ClipboardItem clipboardItem) {
            }
            
            public static void onSmartbarPrivateModeButtonClicked(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.text.smartbar.SmartbarView.EventListener $this) {
            }
            
            public static void onSmartbarQuickActionPressed(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.text.smartbar.SmartbarView.EventListener $this, @androidx.annotation.IdRes()
            int quickActionId) {
            }
        }
    }
}