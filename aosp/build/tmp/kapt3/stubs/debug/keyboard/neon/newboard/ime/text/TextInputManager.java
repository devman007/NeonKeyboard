package keyboard.neon.newboard.ime.text;

import java.lang.System;

/**
 * TextInputManager is responsible for managing everything which is related to text input. All of
 * the following count as text input: character, numeric (+advanced), phone and symbol layouts.
 *
 * All of the UI for the different keyboard layouts are kept under the same container element and
 * are separated from media-related UI. The core [FlorisBoard] will pass any event defined in
 * [FlorisBoard.EventListener] through to this class.
 *
 * TextInputManager is also the hub in the communication between the system, the active editor
 * instance and the Smartbar.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 |2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001|B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AJ\u0010\u0010B\u001a\u0002052\u0006\u0010C\u001a\u000205H\u0002J\u0006\u0010D\u001a\u00020EJ\u0018\u0010F\u001a\u00020\u00062\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020HH\u0002J\b\u0010J\u001a\u00020?H\u0002J\b\u0010K\u001a\u00020?H\u0002J\b\u0010L\u001a\u00020?H\u0002J\b\u0010M\u001a\u00020\u0006H\u0002J\b\u0010N\u001a\u00020?H\u0002J\b\u0010O\u001a\u00020?H\u0002J\b\u0010P\u001a\u00020?H\u0002J\u000e\u0010Q\u001a\u00020?2\u0006\u0010C\u001a\u000205J\b\u0010R\u001a\u00020?H\u0002J\b\u0010S\u001a\u00020?H\u0002J\b\u0010T\u001a\u00020?H\u0002J\b\u0010U\u001a\u00020?H\u0002J\b\u0010V\u001a\u00020?H\u0002J\b\u0010W\u001a\u00020?H\u0002J\u0010\u0010X\u001a\u00020?2\u0006\u0010Y\u001a\u00020ZH\u0002J\b\u0010[\u001a\u00020?H\u0002J\b\u0010\\\u001a\u00020?H\u0002J\u0010\u0010]\u001a\u00020?2\u0006\u0010Y\u001a\u00020ZH\u0002J\b\u0010^\u001a\u00020?H\u0002J\b\u0010_\u001a\u00020?H\u0016J\b\u0010`\u001a\u00020?H\u0016J\u0010\u0010a\u001a\u00020?2\u0006\u0010b\u001a\u00020cH\u0016J\u0010\u0010d\u001a\u00020?2\u0006\u0010Y\u001a\u00020ZH\u0016J\u0010\u0010e\u001a\u00020?2\u0006\u0010Y\u001a\u00020ZH\u0016J\u0010\u0010f\u001a\u00020?2\u0006\u0010Y\u001a\u00020ZH\u0016J\u0010\u0010g\u001a\u00020?2\u0006\u0010Y\u001a\u00020ZH\u0016J\b\u0010h\u001a\u00020?H\u0016J\u0018\u0010i\u001a\u00020?2\u0006\u0010j\u001a\u00020\u00062\u0006\u0010k\u001a\u00020\u001eH\u0016J\u0018\u0010l\u001a\u00020?2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020\u001eH\u0016J\b\u0010p\u001a\u00020?H\u0016J\b\u0010q\u001a\u00020?H\u0016J\u0018\u0010r\u001a\u00020?2\u0006\u0010s\u001a\u0002052\u0006\u0010t\u001a\u00020HH\u0002J\"\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020E2\u0006\u0010x\u001a\u00020n2\b\b\u0002\u0010y\u001a\u00020\u001eH\u0002J\u001a\u0010z\u001a\u00020?2\u0006\u0010w\u001a\u00020E2\b\b\u0002\u0010y\u001a\u00020\u001eH\u0002J\b\u0010{\u001a\u00020?H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u000e\u0010$\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020*@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u0002008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b1\u00102R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020504\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010;\u001a\u00020:2\u0006\u0010)\u001a\u00020:@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=\u00a8\u0006}"}, d2 = {"Lkeyboard/neon/newboard/ime/text/TextInputManager;", "Lkotlinx/coroutines/CoroutineScope;", "Lkeyboard/neon/newboard/ime/core/InputKeyEventReceiver;", "Lkeyboard/neon/newboard/ime/core/FlorisBoard$EventListener;", "()V", "activeEditorInstance", "Lkeyboard/neon/newboard/ime/core/EditorInstance;", "getActiveEditorInstance", "()Lkeyboard/neon/newboard/ime/core/EditorInstance;", "activeState", "Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "getActiveState", "()Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "evaluator", "Lkeyboard/neon/newboard/ime/keyboard/ComputingEvaluator;", "getEvaluator", "()Lkeyboard/neon/newboard/ime/keyboard/ComputingEvaluator;", "florisboard", "Lkeyboard/neon/newboard/ime/core/FlorisBoard;", "getFlorisboard", "()Lkeyboard/neon/newboard/ime/core/FlorisBoard;", "inputEventDispatcher", "Lkeyboard/neon/newboard/ime/core/InputEventDispatcher;", "getInputEventDispatcher", "()Lkeyboard/neon/newboard/ime/core/InputEventDispatcher;", "isGlidePostEffect", "", "()Z", "setGlidePostEffect", "(Z)V", "isManualSelectionMode", "setManualSelectionMode", "isManualSelectionModeEnd", "isManualSelectionModeStart", "isNumberRowVisible", "keyboards", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKeyboardCache;", "<set-?>", "Lkeyboard/neon/newboard/ime/text/layout/LayoutManager;", "layoutManager", "getLayoutManager", "()Lkeyboard/neon/newboard/ime/text/layout/LayoutManager;", "newCapsState", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "getPrefs", "()Lkeyboard/neon/newboard/ime/core/Preferences;", "symbolsWithSpaceAfter", "", "", "getSymbolsWithSpaceAfter", "()Ljava/util/List;", "textInputKeyboardView", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKeyboardView;", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKeyboardIconSet;", "textKeyboardIconSet", "getTextKeyboardIconSet", "()Lkeyboard/neon/newboard/ime/text/keyboard/TextKeyboardIconSet;", "executeSwipeAction", "", "swipeAction", "Lkeyboard/neon/newboard/ime/text/gestures/SwipeAction;", "fixCase", "word", "getActiveKeyboardMode", "Lkeyboard/neon/newboard/ime/text/keyboard/KeyboardMode;", "handleArrow", "code", "", "count", "handleCharWidthFull", "handleCharWidthHalf", "handleCharWidthSwitch", "handleClipboardSelect", "handleDelete", "handleDeleteWord", "handleEnter", "handleGesture", "handleKanaHalfKata", "handleKanaHira", "handleKanaKata", "handleKanaSwitch", "handleLanguageSwitch", "handleShiftCancel", "handleShiftDown", "ev", "Lkeyboard/neon/newboard/ime/core/InputKeyEvent;", "handleShiftLock", "handleShiftUp", "handleSpace", "initializeAdds", "onCreate", "onDestroy", "onInitializeInputUi", "uiBinding", "Lkeyboard/neon/newboard/databinding/FlorisboardBinding;", "onInputKeyCancel", "onInputKeyDown", "onInputKeyRepeat", "onInputKeyUp", "onPrimaryClipChanged", "onStartInputView", "instance", "restarting", "onSubtypeChanged", "newSubtype", "Lkeyboard/neon/newboard/ime/core/Subtype;", "doRefreshLayouts", "onUpdateSelection", "onWindowShown", "openActivity", "className", "type", "setActiveKeyboard", "Lkotlinx/coroutines/Job;", "mode", "subtype", "updateState", "setActiveKeyboardMode", "updateCapsState", "Companion", "aosp_debug"})
public final class TextInputManager implements kotlinx.coroutines.CoroutineScope, keyboard.neon.newboard.ime.core.InputKeyEventReceiver, keyboard.neon.newboard.ime.core.FlorisBoard.EventListener {
    private boolean isGlidePostEffect = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> symbolsWithSpaceAfter = null;
    private keyboard.neon.newboard.ime.text.layout.LayoutManager layoutManager;
    private final keyboard.neon.newboard.ime.text.keyboard.TextKeyboardCache keyboards = null;
    private keyboard.neon.newboard.ime.text.keyboard.TextKeyboardView textInputKeyboardView;
    private keyboard.neon.newboard.ime.text.keyboard.TextKeyboardIconSet textKeyboardIconSet;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.InputEventDispatcher inputEventDispatcher = null;
    private boolean newCapsState = false;
    private boolean isNumberRowVisible = false;
    private boolean isManualSelectionMode = false;
    private boolean isManualSelectionModeStart = false;
    private boolean isManualSelectionModeEnd = false;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.text.TextInputManager.Companion Companion = null;
    private static keyboard.neon.newboard.ime.text.TextInputManager instance;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.keyboard.ComputingEvaluator evaluator = null;
    
    private TextInputManager() {
        super();
    }
    
    public final boolean isGlidePostEffect() {
        return false;
    }
    
    public final void setGlidePostEffect(boolean p0) {
    }
    
    private final keyboard.neon.newboard.ime.core.FlorisBoard getFlorisboard() {
        return null;
    }
    
    private final keyboard.neon.newboard.ime.core.Preferences getPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSymbolsWithSpaceAfter() {
        return null;
    }
    
    private final keyboard.neon.newboard.ime.core.EditorInstance getActiveEditorInstance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.text.layout.LayoutManager getLayoutManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.text.keyboard.TextKeyboardIconSet getTextKeyboardIconSet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.InputEventDispatcher getInputEventDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.keyboard.KeyboardState getActiveState() {
        return null;
    }
    
    public final boolean isManualSelectionMode() {
        return false;
    }
    
    public final void setManualSelectionMode(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.keyboard.ComputingEvaluator getEvaluator() {
        return null;
    }
    
    /**
     * Non-UI-related setup + preloading of all required computed layouts (asynchronous in the
     * background).
     */
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onInitializeInputUi(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.databinding.FlorisboardBinding uiBinding) {
    }
    
    private final void openActivity(java.lang.String className, int type) {
    }
    
    /**
     * Cancels all coroutines and cleans up.
     */
    @java.lang.Override()
    public void onDestroy() {
    }
    
    /**
     * Evaluates the [KeyboardState.keyboardMode], [KeyboardState.keyVariation] and [KeyboardState.isComposingEnabled]
     * property values when starting to interact with a input editor. Also resets the composing
     * texts and sets the initial caps mode accordingly.
     */
    @java.lang.Override()
    public void onStartInputView(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.EditorInstance instance, boolean restarting) {
    }
    
    @java.lang.Override()
    public void onWindowShown() {
    }
    
    /**
     * Gets the active keyboard mode.
     *
     * @return The active keyboard mode.
     */
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.text.keyboard.KeyboardMode getActiveKeyboardMode() {
        return null;
    }
    
    /**
     * Sets the active keyboard mode and updates the [KeyboardState.isQuickActionsVisible] state.
     */
    private final void setActiveKeyboardMode(keyboard.neon.newboard.ime.text.keyboard.KeyboardMode mode, boolean updateState) {
    }
    
    private final kotlinx.coroutines.Job setActiveKeyboard(keyboard.neon.newboard.ime.text.keyboard.KeyboardMode mode, keyboard.neon.newboard.ime.core.Subtype subtype, boolean updateState) {
        return null;
    }
    
    @java.lang.Override()
    public void onSubtypeChanged(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype newSubtype, boolean doRefreshLayouts) {
    }
    
    /**
     * Main logic point for processing cursor updates as well as parsing the current composing word
     * and passing this info on to the [SmartbarView] to turn it into candidate suggestions.
     */
    @java.lang.Override()
    public void onUpdateSelection() {
    }
    
    @java.lang.Override()
    public void onPrimaryClipChanged() {
    }
    
    /**
     * Updates the current caps state according to the [EditorInstance.cursorCapsMode], while
     * respecting [KeyboardState.capsLock] property and the correction.autoCapitalization preference.
     */
    private final void updateCapsState() {
    }
    
    /**
     * Executes a given [SwipeAction]. Ignores any [SwipeAction] but the ones relevant for this
     * class.
     */
    public final void executeSwipeAction(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.gestures.SwipeAction swipeAction) {
    }
    
    /**
     * Handles a [KeyCode.DELETE] event.
     */
    private final void handleDelete() {
    }
    
    /**
     * Handles a [KeyCode.DELETE_WORD] event.
     */
    private final void handleDeleteWord() {
    }
    
    /**
     * Handles a [KeyCode.ENTER] event.
     */
    private final void handleEnter() {
    }
    
    /**
     * Handles a [KeyCode.LANGUAGE_SWITCH] event. Also handles if the language switch should cycle
     * FlorisBoard internal or system-wide.
     */
    private final void handleLanguageSwitch() {
    }
    
    /**
     * Handles a [KeyCode.SHIFT] down event.
     */
    private final void handleShiftDown(keyboard.neon.newboard.ime.core.InputKeyEvent ev) {
    }
    
    /**
     * Handles a [KeyCode.SHIFT] up event.
     */
    private final void handleShiftUp() {
    }
    
    /**
     * Handles a [KeyCode.SHIFT] cancel event.
     */
    private final void handleShiftCancel() {
    }
    
    /**
     * Handles a [KeyCode.SHIFT] up event.
     */
    private final void handleShiftLock() {
    }
    
    /**
     * Handles a [KeyCode.KANA_SWITCHER] event
     */
    private final void handleKanaSwitch() {
    }
    
    /**
     * Handles a [KeyCode.KANA_HIRA] event
     */
    private final void handleKanaHira() {
    }
    
    /**
     * Handles a [KeyCode.KANA_KATA] event
     */
    private final void handleKanaKata() {
    }
    
    /**
     * Handles a [KeyCode.KANA_HALF_KATA] event
     */
    private final void handleKanaHalfKata() {
    }
    
    /**
     * Handles a [KeyCode.CHAR_WIDTH_SWITCHER] event
     */
    private final void handleCharWidthSwitch() {
    }
    
    /**
     * Handles a [KeyCode.CHAR_WIDTH_SWITCHER] event
     */
    private final void handleCharWidthFull() {
    }
    
    /**
     * Handles a [KeyCode.CHAR_WIDTH_SWITCHER] event
     */
    private final void handleCharWidthHalf() {
    }
    
    /**
     * Handles a [KeyCode.SPACE] event. Also handles the auto-correction of two space taps if
     * enabled by the user.
     */
    private final void handleSpace(keyboard.neon.newboard.ime.core.InputKeyEvent ev) {
    }
    
    /**
     * Handles [KeyCode] arrow and move events, behaves differently depending on text selection.
     */
    private final keyboard.neon.newboard.ime.core.EditorInstance handleArrow(int code, int count) {
        return null;
    }
    
    /**
     * Handles a [KeyCode.CLIPBOARD_SELECT] event.
     */
    private final keyboard.neon.newboard.ime.core.EditorInstance handleClipboardSelect() {
        return null;
    }
    
    @java.lang.Override()
    public void onInputKeyDown(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.InputKeyEvent ev) {
    }
    
    @java.lang.Override()
    public void onInputKeyUp(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.InputKeyEvent ev) {
    }
    
    @java.lang.Override()
    public void onInputKeyRepeat(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.InputKeyEvent ev) {
    }
    
    @java.lang.Override()
    public void onInputKeyCancel(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.InputKeyEvent ev) {
    }
    
    public final void handleGesture(@org.jetbrains.annotations.NotNull()
    java.lang.String word) {
    }
    
    /**
     * Changes a word to the current case.
     * eg if [KeyboardState.capsLock] is true, abc -> ABC
     *   if [caps]     is true, abc -> Abc
     *   otherwise            , abc -> abc
     */
    private final java.lang.String fixCase(java.lang.String word) {
        return null;
    }
    
    private final void initializeAdds() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    public void onApplyThemeAttributes() {
    }
    
    public void onFinishInputView(boolean finishingInput) {
    }
    
    public void onWindowHidden() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lkeyboard/neon/newboard/ime/text/TextInputManager$Companion;", "", "()V", "instance", "Lkeyboard/neon/newboard/ime/text/TextInputManager;", "getInstance", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Synchronized()
        public final synchronized keyboard.neon.newboard.ime.text.TextInputManager getInstance() {
            return null;
        }
    }
}