package keyboard.neon.newboard.ime.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u0096\u00012\u00020\u0001:\n\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010F\u001a\u00020GJ\u000e\u0010H\u001a\u00020.2\u0006\u0010I\u001a\u00020JJ\u000e\u0010K\u001a\u00020.2\u0006\u0010L\u001a\u00020\rJ\u000e\u0010M\u001a\u00020.2\u0006\u0010L\u001a\u00020\rJ\u000e\u0010N\u001a\u00020.2\u0006\u0010L\u001a\u00020\rJ\u0006\u0010O\u001a\u00020GJ\u0006\u0010P\u001a\u00020.J\u0006\u0010Q\u001a\u00020.J\u001a\u0010R\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\r0S2\u0006\u0010L\u001a\u00020\rJ\u0006\u0010T\u001a\u00020GJ\u0006\u0010U\u001a\u00020GJ\u000e\u0010V\u001a\u00020\r2\u0006\u0010W\u001a\u00020\u001cJ\u000e\u0010X\u001a\u00020\r2\u0006\u0010W\u001a\u00020\u001cJ\u0006\u0010Y\u001a\u00020.J\u0006\u0010Z\u001a\u00020.J\u0014\u0010[\u001a\u00020.2\f\u0010\\\u001a\b\u0018\u000108R\u00020\u0000J$\u0010]\u001a\u00020\u001c2\b\b\u0002\u0010^\u001a\u00020.2\b\b\u0002\u0010_\u001a\u00020.2\b\b\u0002\u0010`\u001a\u00020.J\u001d\u0010a\u001a\u0002032\u0006\u0010b\u001a\u00020\u001c2\u0006\u0010c\u001a\u00020\u001cH\u0000\u00a2\u0006\u0002\bdJ\u0006\u0010e\u001a\u00020.J\u0006\u0010f\u001a\u00020.J\u0006\u0010g\u001a\u00020.J\u0006\u0010h\u001a\u00020.J\u0006\u0010i\u001a\u00020.J\u000e\u0010j\u001a\u00020.2\u0006\u0010k\u001a\u00020lJ\u0006\u0010m\u001a\u00020.J\u0006\u0010n\u001a\u00020.J\u0006\u0010o\u001a\u00020GJ\u000e\u0010p\u001a\u00020.2\u0006\u0010W\u001a\u00020\u001cJ \u0010q\u001a\u00020.2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020\u001c2\u0006\u0010u\u001a\u00020\u001cH\u0002J\"\u0010v\u001a\u00020.2\u0006\u0010t\u001a\u00020\u001c2\b\b\u0002\u0010u\u001a\u00020\u001c2\b\b\u0002\u0010w\u001a\u00020\u001cJ \u0010x\u001a\u00020.2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020\u001c2\u0006\u0010u\u001a\u00020\u001cH\u0002J\u0010\u0010y\u001a\u00020G2\b\u0010z\u001a\u0004\u0018\u00010\u0018J\u0010\u0010{\u001a\u00020G2\b\u0010z\u001a\u0004\u0018\u00010\u0018J\u0006\u0010|\u001a\u00020GJ\u001f\u0010}\u001a\u00020G2\u0006\u0010~\u001a\u0002032\u0006\u0010\u007f\u001a\u0002032\u0007\u0010\u0080\u0001\u001a\u000203J<\u0010}\u001a\u00020G2\u0007\u0010\u0081\u0001\u001a\u00020\u001c2\u0007\u0010\u0082\u0001\u001a\u00020\u001c2\u0007\u0010\u0083\u0001\u001a\u00020\u001c2\u0007\u0010\u0084\u0001\u001a\u00020\u001c2\u0007\u0010\u0085\u0001\u001a\u00020\u001c2\u0007\u0010\u0086\u0001\u001a\u00020\u001cJ\u001c\u0010\u0087\u0001\u001a\u00020G2\u0007\u0010\u0088\u0001\u001a\u00020\u001c2\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001J\u000e\u0010\u008b\u0001\u001a\u00020\r*\u00030\u008a\u0001H\u0002J\u0014\u0010\u008c\u0001\u001a\u000203*\u00030\u008a\u0001H\u0000\u00a2\u0006\u0003\b\u008d\u0001J\u0014\u0010\u008e\u0001\u001a\u000203*\u00030\u008a\u0001H\u0000\u00a2\u0006\u0003\b\u008f\u0001J\u0014\u0010\u0090\u0001\u001a\u00020\r*\u00030\u008a\u0001H\u0000\u00a2\u0006\u0003\b\u0091\u0001J\u0014\u0010\u0092\u0001\u001a\u00020.*\u00030\u008a\u0001H\u0000\u00a2\u0006\u0003\b\u0093\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u0007\u001a\u00060\bR\u00020\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010%\u001a\u0004\u0018\u00010&8F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010*8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00100\u001a\u00020.2\u0006\u0010/\u001a\u00020.@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u00104\u001a\u0004\u0018\u00010\r8F\u00a2\u0006\u0006\u001a\u0004\b5\u00106R\u0015\u00107\u001a\u000608R\u00020\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u00101\"\u0004\b=\u0010>R\u000e\u0010?\u001a\u00020.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010@\u001a\u0004\u0018\u00010AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E\u00a8\u0006\u0099\u0001"}, d2 = {"Lkeyboard/neon/newboard/ime/core/EditorInstance;", "", "ims", "Landroid/inputmethodservice/InputMethodService;", "activeState", "Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "(Landroid/inputmethodservice/InputMethodService;Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;)V", "cachedInput", "Lkeyboard/neon/newboard/ime/core/EditorInstance$CachedInput;", "getCachedInput", "()Lkeyboard/neon/newboard/ime/core/EditorInstance$CachedInput;", "contentMimeTypes", "", "", "getContentMimeTypes", "()[Ljava/lang/String;", "setContentMimeTypes", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "cursorCapsMode", "Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$CapsMode;", "getCursorCapsMode", "()Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$CapsMode;", "editorInfo", "Landroid/view/inputmethod/EditorInfo;", "getEditorInfo", "()Landroid/view/inputmethod/EditorInfo;", "extractedToken", "", "getExtractedToken$aosp_debug", "()I", "setExtractedToken$aosp_debug", "(I)V", "florisClipboardManager", "Lkeyboard/neon/newboard/ime/clip/FlorisClipboardManager;", "getFlorisClipboardManager", "()Lkeyboard/neon/newboard/ime/clip/FlorisClipboardManager;", "inputBinding", "Landroid/view/inputmethod/InputBinding;", "getInputBinding", "()Landroid/view/inputmethod/InputBinding;", "inputConnection", "Landroid/view/inputmethod/InputConnection;", "getInputConnection", "()Landroid/view/inputmethod/InputConnection;", "isInputBindingActive", "", "<set-?>", "isPhantomSpaceActive", "()Z", "lastReportedComposingBounds", "Lkeyboard/neon/newboard/ime/core/EditorInstance$Bounds;", "packageName", "getPackageName", "()Ljava/lang/String;", "selection", "Lkeyboard/neon/newboard/ime/core/EditorInstance$Region;", "getSelection", "()Lkeyboard/neon/newboard/ime/core/EditorInstance$Region;", "shouldReevaluateComposingSuggestions", "getShouldReevaluateComposingSuggestions", "setShouldReevaluateComposingSuggestions", "(Z)V", "wasPhantomSpaceActiveLastUpdate", "wordHistoryChangedListener", "Lkeyboard/neon/newboard/ime/core/EditorInstance$WordHistoryChangedListener;", "getWordHistoryChangedListener", "()Lkeyboard/neon/newboard/ime/core/EditorInstance$WordHistoryChangedListener;", "setWordHistoryChangedListener", "(Lkeyboard/neon/newboard/ime/core/EditorInstance$WordHistoryChangedListener;)V", "bindInput", "", "commitClipboardItem", "item", "Lkeyboard/neon/newboard/ime/clip/provider/ClipboardItem;", "commitCompletion", "text", "commitGesture", "commitText", "composingEnabledChanged", "deleteBackwards", "deleteWordBackwards", "doCommitText", "Lkotlin/Pair;", "finishInput", "finishInputView", "getTextAfterCursor", "n", "getTextBeforeCursor", "leftAppendWordToSelection", "leftPopWordFromSelection", "markComposingRegion", "region", "meta", "ctrl", "alt", "shift", "normalizeBounds", "start", "end", "normalizeBounds$aosp_debug", "performClipboardCopy", "performClipboardCut", "performClipboardPaste", "performClipboardSelectAll", "performEnter", "performEnterAction", "action", "Lkeyboard/neon/newboard/ime/keyboard/ImeOptions$EnterAction;", "performRedo", "performUndo", "reset", "selectionSetNWordsLeft", "sendDownKeyEvent", "eventTime", "", "keyEventCode", "metaState", "sendDownUpKeyEvent", "count", "sendUpKeyEvent", "startInput", "ei", "startInputView", "unbindInput", "updateSelection", "oldSel", "newSel", "candidates", "oldSelStart", "oldSelEnd", "newSelStart", "newSelEnd", "candidatesStart", "candidatesEnd", "updateText", "token", "exText", "Landroid/view/inputmethod/ExtractedText;", "debugSummarize", "getPartialChangeBounds", "getPartialChangeBounds$aosp_debug", "getSelectionBounds", "getSelectionBounds$aosp_debug", "getTextStr", "getTextStr$aosp_debug", "isPartialChange", "isPartialChange$aosp_debug", "Bounds", "CachedInput", "Companion", "Region", "WordHistoryChangedListener", "aosp_debug"})
public final class EditorInstance {
    private final android.inputmethodservice.InputMethodService ims = null;
    private final keyboard.neon.newboard.ime.keyboard.KeyboardState activeState = null;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.core.EditorInstance.Companion Companion = null;
    private static final int CAPACITY_CHARS = 1000;
    private static final int CAPACITY_LINES = 10;
    private static final int CACHED_N_CHARS_BEFORE_CURSOR = 320;
    private static final int CACHED_N_CHARS_AFTER_CURSOR = 64;
    private static final int UNSET = -1;
    private static final int CURSOR_UPDATE_DISABLED = 0;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.EditorInstance.CachedInput cachedInput = null;
    private int extractedToken = 0;
    private keyboard.neon.newboard.ime.core.EditorInstance.Bounds lastReportedComposingBounds;
    private boolean isInputBindingActive = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String[] contentMimeTypes;
    private boolean shouldReevaluateComposingSuggestions = false;
    private boolean isPhantomSpaceActive = false;
    private boolean wasPhantomSpaceActiveLastUpdate = false;
    @org.jetbrains.annotations.Nullable()
    private keyboard.neon.newboard.ime.core.EditorInstance.WordHistoryChangedListener wordHistoryChangedListener;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.EditorInstance.Region selection = null;
    
    public EditorInstance(@org.jetbrains.annotations.NotNull()
    android.inputmethodservice.InputMethodService ims, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyboardState activeState) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.EditorInstance.CachedInput getCachedInput() {
        return null;
    }
    
    public final int getExtractedToken$aosp_debug() {
        return 0;
    }
    
    public final void setExtractedToken$aosp_debug(int p0) {
    }
    
    private final keyboard.neon.newboard.ime.clip.FlorisClipboardManager getFlorisClipboardManager() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String[] getContentMimeTypes() {
        return null;
    }
    
    public final void setContentMimeTypes(@org.jetbrains.annotations.Nullable()
    java.lang.String[] p0) {
    }
    
    public final boolean getShouldReevaluateComposingSuggestions() {
        return false;
    }
    
    public final void setShouldReevaluateComposingSuggestions(boolean p0) {
    }
    
    public final boolean isPhantomSpaceActive() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.core.EditorInstance.WordHistoryChangedListener getWordHistoryChangedListener() {
        return null;
    }
    
    public final void setWordHistoryChangedListener(@org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.core.EditorInstance.WordHistoryChangedListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.inputmethod.InputBinding getInputBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.inputmethod.InputConnection getInputConnection() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.inputmethod.EditorInfo getEditorInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.keyboard.InputAttributes.CapsMode getCursorCapsMode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPackageName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.EditorInstance.Region getSelection() {
        return null;
    }
    
    public final void updateSelection(int oldSelStart, int oldSelEnd, int newSelStart, int newSelEnd, int candidatesStart, int candidatesEnd) {
    }
    
    public final void updateSelection(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.EditorInstance.Bounds oldSel, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.EditorInstance.Bounds newSel, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.EditorInstance.Bounds candidates) {
    }
    
    public final void updateText(int token, @org.jetbrains.annotations.Nullable()
    android.view.inputmethod.ExtractedText exText) {
    }
    
    public final void bindInput() {
    }
    
    public final void startInput(@org.jetbrains.annotations.Nullable()
    android.view.inputmethod.EditorInfo ei) {
    }
    
    public final void startInputView(@org.jetbrains.annotations.Nullable()
    android.view.inputmethod.EditorInfo ei) {
    }
    
    public final void finishInputView() {
    }
    
    public final void finishInput() {
    }
    
    public final void unbindInput() {
    }
    
    public final void composingEnabledChanged() {
    }
    
    /**
     * Completes the given [text] in the current composing region. Does nothing if the current
     * composing region is of zero length or null.
     *
     * @param text The text to complete in this editor's composing region.
     * @return True on success, false if an error occurred or the input connection is invalid.
     */
    public final boolean commitCompletion(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return false;
    }
    
    /**
     * Internal helper, replacing a call to inputConnection.commitText with text composition in mind.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.Boolean, java.lang.String> doCommitText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    /**
     * Commits the given [text] to this editor instance and adjusts both the cursor position and
     * composing region, if any.
     *
     * This method overwrites any selected text and replaces it with given [text]. If there is no
     * text selected (selection is in cursor mode), then this method will insert the [text] after
     * the cursor, then set the cursor position to the first character after the inserted text.
     *
     * @param text The text to commit.
     * @return True on success, false if an error occurred or the input connection is invalid.
     */
    public final boolean commitText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return false;
    }
    
    /**
     * Commit a word generated by a gesture.
     */
    public final boolean commitGesture(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return false;
    }
    
    /**
     * Commits the given [ClipboardItem]. If the clip data is text (incl. HTML), it delegates to [commitText].
     * If the item has a content URI (and the EditText supports it), the item is committed as rich data.
     * This allows for committing (e.g) images.
     *
     * @param item The ClipboardItem to commit
     * @return True on success, false if something went wrong.
     */
    public final boolean commitClipboardItem(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.clip.provider.ClipboardItem item) {
        return false;
    }
    
    /**
     * Executes a backward delete on this editor's text. If a text selection is active, all
     * characters inside this selection will be removed, else only the left-most character from
     * the cursor's position.
     *
     * @return True on success, false if an error occurred or the input connection is invalid.
     */
    public final boolean deleteBackwards() {
        return false;
    }
    
    /**
     * Executes a backward delete on this editor's text. If a text selection is active, all
     * characters inside this selection will be removed, else only the left-most character from
     * the cursor's position.
     *
     * @return True on success, false if an error occurred or the input connection is invalid.
     */
    public final boolean deleteWordBackwards() {
        return false;
    }
    
    /**
     * Gets [n] characters after the cursor's current position. The resulting string may be any
     * length ranging from 0 to n.
     *
     * @param n The number of characters to get after the cursor. Must be greater than 0 or this
     * method will fail.
     * @return [n] or less characters after the cursor.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTextAfterCursor(int n) {
        return null;
    }
    
    /**
     * Gets [n] characters before the cursor's current position. The resulting string may be any
     * length ranging from 0 to n.
     *
     * @param n The number of characters to get before the cursor. Must be greater than 0 or this
     * method will fail.
     * @return [n] or less characters before the cursor.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTextBeforeCursor(int n) {
        return null;
    }
    
    /**
     * Adds one word on the left of selection to it.
     *
     * @return True on success, false if no new words are selected.
     */
    public final boolean leftAppendWordToSelection() {
        return false;
    }
    
    /**
     * Removes one word on the left from the selection.
     *
     * @return True on success, false if no new words are deselected.
     */
    public final boolean leftPopWordFromSelection() {
        return false;
    }
    
    public final boolean selectionSetNWordsLeft(int n) {
        return false;
    }
    
    /**
     * Marks a given [region] as composing and notifies the input connection.
     *
     * @param region The region which should be marked as composing.
     *
     * @return True on success, false if an error occurred or the input connection is invalid.
     */
    public final boolean markComposingRegion(@org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.core.EditorInstance.Region region) {
        return false;
    }
    
    /**
     * Performs a cut command on this editor instance and adjusts both the cursor position and
     * composing region, if any.
     *
     * @return True on success, false if an error occurred or the input connection is invalid.
     */
    public final boolean performClipboardCut() {
        return false;
    }
    
    /**
     * Performs a copy command on this editor instance and adjusts both the cursor position and
     * composing region, if any.
     *
     * @return True on success, false if an error occurred or the input connection is invalid.
     */
    public final boolean performClipboardCopy() {
        return false;
    }
    
    /**
     * Performs a paste command on this editor instance and adjusts both the cursor position and
     * composing region, if any.
     *
     * @return True on success, false if an error occurred or the input connection is invalid.
     */
    public final boolean performClipboardPaste() {
        return false;
    }
    
    /**
     * Performs a select all on this editor instance and adjusts both the cursor position and
     * composing region, if any.
     *
     * @return True on success, false if an error occurred or the input connection is invalid.
     */
    public final boolean performClipboardSelectAll() {
        return false;
    }
    
    /**
     * Performs an enter key press on the current input editor.
     *
     * @return True on success, false if an error occurred or the input connection is invalid.
     */
    public final boolean performEnter() {
        return false;
    }
    
    /**
     * Performs a given [action] on the current input editor.
     *
     * @param action The action to be performed on this editor instance.
     *
     * @return True on success, false if an error occurred or the input connection is invalid.
     */
    public final boolean performEnterAction(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.ImeOptions.EnterAction action) {
        return false;
    }
    
    /**
     * Undoes the last action.
     *
     * @return True on success, false if an error occurred or the input connection is invalid.
     */
    public final boolean performUndo() {
        return false;
    }
    
    /**
     * Redoes the last Undo action.
     *
     * @return True on success, false if an error occurred or the input connection is invalid.
     */
    public final boolean performRedo() {
        return false;
    }
    
    /**
     * Constructs a meta state integer flag which can be used for setting the `metaState` field when sending a KeyEvent
     * to the input connection. If this method is called without a meta modifier set to true, the default value `0` is
     * returned.
     *
     * @param ctrl Set to true to enable the CTRL meta modifier. Defaults to false.
     * @param alt Set to true to enable the ALT meta modifier. Defaults to false.
     * @param shift Set to true to enable the SHIFT meta modifier. Defaults to false.
     *
     * @return An integer containing all meta flags passed and formatted for use in a [KeyEvent].
     */
    public final int meta(boolean ctrl, boolean alt, boolean shift) {
        return 0;
    }
    
    private final boolean sendDownKeyEvent(long eventTime, int keyEventCode, int metaState) {
        return false;
    }
    
    private final boolean sendUpKeyEvent(long eventTime, int keyEventCode, int metaState) {
        return false;
    }
    
    /**
     * Same as [InputMethodService.sendDownUpKeyEvents] but also allows to set meta state.
     *
     * @param keyEventCode The key code to send, use a key code defined in Android's [KeyEvent].
     * @param metaState Flags indicating which meta keys are currently pressed.
     * @param count How often the key is pressed while the meta keys passed are down. Must be greater than or equal to
     * `1`, else this method will immediately return false.
     *
     * @return True on success, false if an error occurred or the input connection is invalid.
     */
    public final boolean sendDownUpKeyEvent(int keyEventCode, int metaState, int count) {
        return false;
    }
    
    public final void reset() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.EditorInstance.Bounds normalizeBounds$aosp_debug(int start, int end) {
        return null;
    }
    
    public final boolean isPartialChange$aosp_debug(@org.jetbrains.annotations.NotNull()
    android.view.inputmethod.ExtractedText $this$isPartialChange) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.EditorInstance.Bounds getPartialChangeBounds$aosp_debug(@org.jetbrains.annotations.NotNull()
    android.view.inputmethod.ExtractedText $this$getPartialChangeBounds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.EditorInstance.Bounds getSelectionBounds$aosp_debug(@org.jetbrains.annotations.NotNull()
    android.view.inputmethod.ExtractedText $this$getSelectionBounds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTextStr$aosp_debug(@org.jetbrains.annotations.NotNull()
    android.view.inputmethod.ExtractedText $this$getTextStr) {
        return null;
    }
    
    private final java.lang.String debugSummarize(android.view.inputmethod.ExtractedText $this$debugSummarize) {
        return null;
    }
    
    /**
     * Data class which specifies the bounds for a region between [start]
     * and [end].
     *
     * @property start The start marker of this bounds.
     * @property end The end marker of this bounds.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003H\u0086\u0002J\t\u0010\r\u001a\u00020\u0003H\u0086\u0002J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lkeyboard/neon/newboard/ime/core/EditorInstance$Bounds;", "", "start", "", "end", "(II)V", "getEnd", "()I", "setEnd", "(I)V", "getStart", "setStart", "component1", "component2", "equals", "", "other", "hashCode", "toString", "", "aosp_debug"})
    public static class Bounds {
        private int start;
        private int end;
        
        public Bounds(int start, int end) {
            super();
        }
        
        public final int getStart() {
            return 0;
        }
        
        public final void setStart(int p0) {
        }
        
        public final int getEnd() {
            return 0;
        }
        
        public final void setEnd(int p0) {
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * Class which marks a region of [CachedInput.rawText], which provides length, validation
     * and text access fields.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003J\u0016\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003R$\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00018F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lkeyboard/neon/newboard/ime/core/EditorInstance$Region;", "Lkeyboard/neon/newboard/ime/core/EditorInstance$Bounds;", "initStart", "", "initEnd", "(Lkeyboard/neon/newboard/ime/core/EditorInstance;II)V", "v", "bounds", "getBounds", "()Lkeyboard/neon/newboard/ime/core/EditorInstance$Bounds;", "setBounds", "(Lkeyboard/neon/newboard/ime/core/EditorInstance$Bounds;)V", "icText", "", "getIcText", "()Ljava/lang/String;", "isCursorMode", "", "()Z", "isSelectionMode", "isValid", "length", "getLength", "()I", "text", "getText", "update", "newStart", "newEnd", "updateAndNotify", "aosp_debug"})
    public final class Region extends keyboard.neon.newboard.ime.core.EditorInstance.Bounds {
        
        public Region(int initStart, int initEnd) {
            super(0, 0);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.core.EditorInstance.Bounds getBounds() {
            return null;
        }
        
        public final void setBounds(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.EditorInstance.Bounds v) {
        }
        
        public final boolean isValid() {
            return false;
        }
        
        public final int getLength() {
            return 0;
        }
        
        public final boolean isCursorMode() {
            return false;
        }
        
        public final boolean isSelectionMode() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIcText() {
            return null;
        }
        
        /**
         * Updates this region's [start] and [end] values.
         *
         * @param newStart The new start value for this region.
         * @param newEnd The new end value for this region.
         */
        public final boolean update(int newStart, int newEnd) {
            return false;
        }
        
        /**
         * Same as [update], but also notifies the input connection linked by editor instance of this
         * selection change.
         */
        public final boolean updateAndNotify(int newStart, int newEnd) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0010\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dR*\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u00052\f\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u0005@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR&\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\n\u0010\u0003\u001a\u00060\rj\u0002`\u000e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R2\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u00122\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0012@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R2\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u00122\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0012@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015\u00a8\u0006\u001e"}, d2 = {"Lkeyboard/neon/newboard/ime/core/EditorInstance$CachedInput;", "", "(Lkeyboard/neon/newboard/ime/core/EditorInstance;)V", "<set-?>", "Lkeyboard/neon/newboard/ime/core/EditorInstance$Region;", "Lkeyboard/neon/newboard/ime/core/EditorInstance;", "currentWord", "getCurrentWord", "()Lkeyboard/neon/newboard/ime/core/EditorInstance$Region;", "", "offset", "getOffset", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "rawText", "getRawText", "()Ljava/lang/StringBuilder;", "", "wordsAfterCurrent", "getWordsAfterCurrent", "()Ljava/util/List;", "wordsBeforeCurrent", "getWordsBeforeCurrent", "reevaluateWords", "", "reset", "updateText", "exText", "Landroid/view/inputmethod/ExtractedText;", "aosp_debug"})
    public final class CachedInput {
        
        /**
         * The raw cached input text of the target app's editor. This cached value may be incomplete if
         * the target app's editor text is bigger than [CAPACITY_CHARS] or [CAPACITY_LINES], but always
         * caches the relevant text around the cursor.
         */
        @org.jetbrains.annotations.NotNull()
        private java.lang.StringBuilder rawText;
        
        /**
         * The offset of the [rawText] from the selection root (index 0).
         */
        private int offset = 0;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<keyboard.neon.newboard.ime.core.EditorInstance.Region> wordsBeforeCurrent;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<keyboard.neon.newboard.ime.core.EditorInstance.Region> wordsAfterCurrent;
        @org.jetbrains.annotations.Nullable()
        private keyboard.neon.newboard.ime.core.EditorInstance.Region currentWord;
        
        public CachedInput() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.StringBuilder getRawText() {
            return null;
        }
        
        public final int getOffset() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<keyboard.neon.newboard.ime.core.EditorInstance.Region> getWordsBeforeCurrent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<keyboard.neon.newboard.ime.core.EditorInstance.Region> getWordsAfterCurrent() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final keyboard.neon.newboard.ime.core.EditorInstance.Region getCurrentWord() {
            return null;
        }
        
        public final void updateText(@org.jetbrains.annotations.Nullable()
        android.view.inputmethod.ExtractedText exText) {
        }
        
        public final void reevaluateWords() {
        }
        
        public final void reset() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0018\u00010\u0005R\u00020\u00062\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005R\u00020\u00060\b2\u0010\u0010\t\u001a\f\u0012\b\u0012\u00060\u0005R\u00020\u00060\bH&\u00a8\u0006\n"}, d2 = {"Lkeyboard/neon/newboard/ime/core/EditorInstance$WordHistoryChangedListener;", "", "onWordHistoryChanged", "", "currentWord", "Lkeyboard/neon/newboard/ime/core/EditorInstance$Region;", "Lkeyboard/neon/newboard/ime/core/EditorInstance;", "wordsBeforeCurrent", "", "wordsAfterCurrent", "aosp_debug"})
    public static abstract interface WordHistoryChangedListener {
        
        public abstract void onWordHistoryChanged(@org.jetbrains.annotations.Nullable()
        keyboard.neon.newboard.ime.core.EditorInstance.Region currentWord, @org.jetbrains.annotations.NotNull()
        java.util.List<keyboard.neon.newboard.ime.core.EditorInstance.Region> wordsBeforeCurrent, @org.jetbrains.annotations.NotNull()
        java.util.List<keyboard.neon.newboard.ime.core.EditorInstance.Region> wordsAfterCurrent);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lkeyboard/neon/newboard/ime/core/EditorInstance$Companion;", "", "()V", "CACHED_N_CHARS_AFTER_CURSOR", "", "CACHED_N_CHARS_BEFORE_CURSOR", "CAPACITY_CHARS", "CAPACITY_LINES", "CURSOR_UPDATE_DISABLED", "UNSET", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}