package keyboard.neon.newboard.ime.keyboard;

import java.lang.System;

/**
 * This class is a helper managing the state of the text input logic which
 * affects the keyboard view in rendering and layouting the keys.
 *
 * The state class can hold flags or small unsigned integers, all added up
 * at max 64-bit though.
 *
 * The structure of this 8-byte state register is as follows: (Lower 4 bytes are pretty experimental rn)
 *
 * <Byte 3> | <Byte 2> | <Byte 1> | <Byte 0> | Description
 * ---------|----------|----------|----------|---------------------------------
 *         |          |          |     1111 | Active [KeyboardMode]
 *         |          |          | 1111     | Active [KeyVariation]
 *         |          |        1 |          | Caps flag
 *         |          |       1  |          | Caps lock flag
 *         |          |      1   |          | Is selection active (length > 0)
 *         |          | 1        |          | Is private mode
 *         |        1 |          |          | Is Smartbar quick actions visible
 *         |       1  |          |          | Is Smartbar showing inline suggestions
 *         |      1   |          |          | Is composing enabled
 *         |   1      |          |          | Is character half-width enabled
 *         |  1       |          |          | Is Kana Kata enabled
 *         | 1        |          |          | Is Kana small
 *
 * <Byte 7> | <Byte 6> | <Byte 5> | <Byte 4> | Description
 * ---------|----------|----------|----------|---------------------------------
 *         |          |          |     1111 | [ImeOptions.enterAction]
 *         |          |          |    1     | [ImeOptions.flagForceAscii]
 *         |          |          |   1      | [ImeOptions.flagNavigateNext]
 *         |          |          |  1       | [ImeOptions.flagNavigatePrevious]
 *         |          |          | 1        | [ImeOptions.flagNoAccessoryAction]
 *         |          |        1 |          | [ImeOptions.flagNoEnterAction]
 *         |          |       1  |          | [ImeOptions.flagNoExtractUi]
 *         |          |      1   |          | [ImeOptions.flagNoFullscreen]
 *         |          |     1    |          | [ImeOptions.flagNoPersonalizedLearning]
 *         |          |  111     |          | [InputAttributes.type]
 *         |     1111 | 1        |          | [InputAttributes.variation]
 *         |   11     |          |          | [InputAttributes.capsMode]
 *         |  1       |          |          | [InputAttributes.flagNumberDecimal]
 *         | 1        |          |          | [InputAttributes.flagNumberSigned]
 *       1 |          |          |          | [InputAttributes.flagTextAutoComplete]
 *      1  |          |          |          | [InputAttributes.flagTextAutoCorrect]
 *     1   |          |          |          | [InputAttributes.flagTextImeMultiLine]
 *    1    |          |          |          | [InputAttributes.flagTextMultiLine]
 *   1     |          |          |          | [InputAttributes.flagTextNoSuggestions]
 *
 * The resulting structure is only relevant during a runtime lifespan and
 * thus can easily be changed without worrying about destroying some saved state.
 *
 * @property value The internal register used to store the flags and region ints that
 * this keyboard state represents.
 * @property maskOfInterest The mask which is applied when comparing this state with another.
 * Is useful if only parts of a state instance is relevant to look at.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \\2\u00020\u0001:\u0002\\]B\u001a\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0013\u0010?\u001a\u00020\u00072\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u001d\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0003H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bC\u0010DJ%\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00032\u0006\u0010H\u001a\u00020FH\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bI\u0010JJ\b\u0010K\u001a\u00020FH\u0016J\u000e\u0010L\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u0000J\u000e\u0010M\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u0000J\u000e\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0000J\u001d\u0010N\u001a\u00020O2\b\b\u0002\u0010Q\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bR\u0010;J%\u0010S\u001a\u00020O2\u0006\u0010B\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bT\u0010UJ-\u0010V\u001a\u00020O2\u0006\u0010G\u001a\u00020\u00032\u0006\u0010H\u001a\u00020F2\u0006\u0010\u0006\u001a\u00020FH\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bW\u0010XJ\u000e\u0010Y\u001a\u00020O2\u0006\u0010Z\u001a\u00020[R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001c\u0010\u0010\u001a\u00020\u0011\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u00020\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013R$\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\fR$\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\fR$\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\fR$\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\n\"\u0004\b\u001f\u0010\fR$\u0010 \u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\fR$\u0010\"\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010\n\"\u0004\b#\u0010\fR$\u0010$\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010\n\"\u0004\b%\u0010\fR\u0011\u0010&\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\nR\u0011\u0010\'\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\nR$\u0010(\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010\n\"\u0004\b)\u0010\fR$\u0010*\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b*\u0010\n\"\u0004\b+\u0010\fR$\u0010-\u001a\u00020,2\u0006\u0010\u0006\u001a\u00020,8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00103\u001a\u0002022\u0006\u0010\u0006\u001a\u0002028F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R%\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R%\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\b=\u00109\"\u0004\b>\u0010;\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006^"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "", "value", "Lkotlin/ULong;", "maskOfInterest", "(JJ)V", "v", "", "caps", "getCaps", "()Z", "setCaps", "(Z)V", "capsLock", "getCapsLock", "setCapsLock", "imeOptions", "Lkeyboard/neon/newboard/ime/keyboard/ImeOptions;", "getImeOptions-C0Ix0R4", "()Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "inputAttributes", "Lkeyboard/neon/newboard/ime/keyboard/InputAttributes;", "getInputAttributes-w9gCD3o", "isCharHalfWidth", "setCharHalfWidth", "isComposingEnabled", "setComposingEnabled", "isCursorMode", "setCursorMode", "isKanaKata", "setKanaKata", "isKanaSmall", "setKanaSmall", "isPrivateMode", "setPrivateMode", "isQuickActionsVisible", "setQuickActionsVisible", "isRawInputEditor", "isRichInputEditor", "isSelectionMode", "setSelectionMode", "isShowingInlineSuggestions", "setShowingInlineSuggestions", "Lkeyboard/neon/newboard/ime/text/key/KeyVariation;", "keyVariation", "getKeyVariation", "()Lkeyboard/neon/newboard/ime/text/key/KeyVariation;", "setKeyVariation", "(Lkeyboard/neon/newboard/ime/text/key/KeyVariation;)V", "Lkeyboard/neon/newboard/ime/text/keyboard/KeyboardMode;", "keyboardMode", "getKeyboardMode", "()Lkeyboard/neon/newboard/ime/text/keyboard/KeyboardMode;", "setKeyboardMode", "(Lkeyboard/neon/newboard/ime/text/keyboard/KeyboardMode;)V", "getMaskOfInterest-s-VKNKU", "()J", "setMaskOfInterest-VKZWuLQ", "(J)V", "J", "getValue-s-VKNKU", "setValue-VKZWuLQ", "equals", "other", "getFlag", "f", "getFlag-VKZWuLQ$aosp_debug", "(J)Z", "getRegion", "", "m", "o", "getRegion-4PLdz1A$aosp_debug", "(JI)I", "hashCode", "isDifferentTo", "isEqualTo", "reset", "", "newState", "newValue", "reset-VKZWuLQ", "setFlag", "setFlag-4PLdz1A$aosp_debug", "(JZ)V", "setRegion", "setRegion-E0BElUM$aosp_debug", "(JII)V", "update", "editorInfo", "Landroid/view/inputmethod/EditorInfo;", "Companion", "OnUpdateStateListener", "aosp_debug"})
public final class KeyboardState {
    private long value;
    private long maskOfInterest;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.keyboard.KeyboardState.Companion Companion = null;
    public static final long M_KEYBOARD_MODE = 15L;
    public static final int O_KEYBOARD_MODE = 0;
    public static final long M_KEY_VARIATION = 15L;
    public static final int O_KEY_VARIATION = 4;
    public static final long F_CAPS = 256L;
    public static final long F_CAPS_LOCK = 512L;
    public static final long F_IS_SELECTION_MODE = 1024L;
    public static final long F_IS_PRIVATE_MODE = 32768L;
    public static final long F_IS_QUICK_ACTIONS_VISIBLE = 65536L;
    public static final long F_IS_SHOWING_INLINE_SUGGESTIONS = 131072L;
    public static final long F_IS_COMPOSING_ENABLED = 262144L;
    public static final long F_IS_CHAR_HALF_WIDTH = 2097152L;
    public static final long F_IS_KANA_KATA = 4194304L;
    public static final long F_IS_KANA_SMALL = 8388608L;
    public static final long STATE_ALL_ZERO = 0L;
    public static final long INTEREST_ALL = -1L;
    public static final long INTEREST_NONE = 0L;
    public static final long INTEREST_TEXT = -4278190081L;
    public static final long INTEREST_MEDIA = 4278190080L;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.keyboard.KeyboardState imeOptions = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.keyboard.KeyboardState inputAttributes = null;
    
    private KeyboardState(long value, long maskOfInterest) {
        super();
    }
    
    /**
     * Resets this state register.
     *
     * @param newState A reference to a state which register value should be copied after
     * the reset.
     */
    public final void reset(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyboardState newState) {
    }
    
    /**
     * Updates this state based on the info passed from [editorInfo].
     *
     * @param editorInfo The [EditorInfo] used to initialize all flags and regions relevant
     * to the info this object provides.
     */
    public final void update(@org.jetbrains.annotations.NotNull()
    android.view.inputmethod.EditorInfo editorInfo) {
    }
    
    public final boolean isEqualTo(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyboardState other) {
        return false;
    }
    
    public final boolean isDifferentTo(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyboardState other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.text.key.KeyVariation getKeyVariation() {
        return null;
    }
    
    public final void setKeyVariation(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.key.KeyVariation v) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.text.keyboard.KeyboardMode getKeyboardMode() {
        return null;
    }
    
    public final void setKeyboardMode(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.keyboard.KeyboardMode v) {
    }
    
    public final boolean getCaps() {
        return false;
    }
    
    public final void setCaps(boolean v) {
    }
    
    public final boolean getCapsLock() {
        return false;
    }
    
    public final void setCapsLock(boolean v) {
    }
    
    public final boolean isSelectionMode() {
        return false;
    }
    
    public final void setSelectionMode(boolean v) {
    }
    
    public final boolean isCursorMode() {
        return false;
    }
    
    public final void setCursorMode(boolean v) {
    }
    
    public final boolean isPrivateMode() {
        return false;
    }
    
    public final void setPrivateMode(boolean v) {
    }
    
    public final boolean isRawInputEditor() {
        return false;
    }
    
    public final boolean isRichInputEditor() {
        return false;
    }
    
    public final boolean isQuickActionsVisible() {
        return false;
    }
    
    public final void setQuickActionsVisible(boolean v) {
    }
    
    public final boolean isShowingInlineSuggestions() {
        return false;
    }
    
    public final void setShowingInlineSuggestions(boolean v) {
    }
    
    public final boolean isComposingEnabled() {
        return false;
    }
    
    public final void setComposingEnabled(boolean v) {
    }
    
    public final boolean isKanaKata() {
        return false;
    }
    
    public final void setKanaKata(boolean v) {
    }
    
    public final boolean isCharHalfWidth() {
        return false;
    }
    
    public final void setCharHalfWidth(boolean v) {
    }
    
    public final boolean isKanaSmall() {
        return false;
    }
    
    public final void setKanaSmall(boolean v) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/KeyboardState$OnUpdateStateListener;", "", "onInterceptUpdateKeyboardState", "", "newState", "Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "onUpdateKeyboardState", "", "aosp_debug"})
    public static abstract interface OnUpdateStateListener {
        
        /**
         * Adds the ability for Views to intercept a update keyboard state dispatch.
         *
         * @param newState Reference to the new state.
         *
         * @return True if the update was intercepted (and thus the child views have to
         * be manually updated if needed, false if no interception happened.
         */
        public abstract boolean onInterceptUpdateKeyboardState(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.keyboard.KeyboardState newState);
        
        /**
         * A new keyboard state is dispatched to all views in this view tree.
         *
         * @param newState Reference to the new state.
         */
        public abstract void onUpdateKeyboardState(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.keyboard.KeyboardState newState);
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class DefaultImpls {
            
            /**
             * Adds the ability for Views to intercept a update keyboard state dispatch.
             *
             * @param newState Reference to the new state.
             *
             * @return True if the update was intercepted (and thus the child views have to
             * be manually updated if needed, false if no interception happened.
             */
            public static boolean onInterceptUpdateKeyboardState(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.keyboard.KeyboardState.OnUpdateStateListener $this, @org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.keyboard.KeyboardState newState) {
                return false;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\b\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\t\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\n\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000b\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\f\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\r\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000e\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000f\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0010\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0011\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0012\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0013\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0014\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0015\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0018\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u001f"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/KeyboardState$Companion;", "", "()V", "F_CAPS", "Lkotlin/ULong;", "J", "F_CAPS_LOCK", "F_IS_CHAR_HALF_WIDTH", "F_IS_COMPOSING_ENABLED", "F_IS_KANA_KATA", "F_IS_KANA_SMALL", "F_IS_PRIVATE_MODE", "F_IS_QUICK_ACTIONS_VISIBLE", "F_IS_SELECTION_MODE", "F_IS_SHOWING_INLINE_SUGGESTIONS", "INTEREST_ALL", "INTEREST_MEDIA", "INTEREST_NONE", "INTEREST_TEXT", "M_KEYBOARD_MODE", "M_KEY_VARIATION", "O_KEYBOARD_MODE", "", "O_KEY_VARIATION", "STATE_ALL_ZERO", "new", "Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "value", "maskOfInterest", "new-PWzV0Is", "(JJ)Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}