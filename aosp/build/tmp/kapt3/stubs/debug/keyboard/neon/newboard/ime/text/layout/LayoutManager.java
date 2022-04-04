package keyboard.neon.newboard.ime.text.layout;

import java.lang.System;

/**
 * Class which manages layout loading and caching.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J1\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010%\u001a\u00020&H\u0002\u00a2\u0006\u0002\u0010\'J\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\n2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u0018\u0010.\u001a\u0004\u0018\u00010\u00152\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\tJ\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\t022\u0006\u0010/\u001a\u00020\u0011J\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020\t022\u0006\u0010/\u001a\u00020\u0011J#\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-H\u0002\u00f8\u0001\u0000J!\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000b0\n2\b\u00106\u001a\u0004\u0018\u000107H\u0002\u00f8\u0001\u0000JE\u00108\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\n\b\u0002\u0010!\u001a\u0004\u0018\u0001072\n\b\u0002\u00109\u001a\u0004\u0018\u0001072\n\b\u0002\u0010:\u001a\u0004\u0018\u000107H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u0006\u0010<\u001a\u00020 R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R)\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\bX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u000f\u001a \u0012\u0004\u0012\u00020\u0011\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u00120\u0010X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000b0\n0\bX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006="}, d2 = {"Lkeyboard/neon/newboard/ime/text/layout/LayoutManager;", "", "()V", "assetManager", "Lkeyboard/neon/newboard/res/AssetManager;", "getAssetManager", "()Lkeyboard/neon/newboard/res/AssetManager;", "extendedPopupsCache", "Ljava/util/HashMap;", "", "Lkotlinx/coroutines/Deferred;", "Lkotlin/Result;", "Lkeyboard/neon/newboard/ime/popup/PopupExtension;", "extendedPopupsCacheGuard", "Lkotlinx/coroutines/sync/Mutex;", "indexedLayoutRefs", "Ljava/util/EnumMap;", "Lkeyboard/neon/newboard/ime/text/layout/LayoutType;", "", "Lkotlin/Pair;", "Lkeyboard/neon/newboard/res/FlorisRef;", "Lkeyboard/neon/newboard/ime/text/layout/LayoutMetaOnly;", "ioScope", "Lkotlinx/coroutines/CoroutineScope;", "layoutCache", "Lkeyboard/neon/newboard/ime/text/layout/Layout;", "layoutCacheGuard", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "getPrefs", "()Lkeyboard/neon/newboard/ime/core/Preferences;", "addRowHints", "", "main", "", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKey;", "hint", "hintType", "Lkeyboard/neon/newboard/ime/text/key/KeyType;", "([Lkeyboard/neon/newboard/ime/text/keyboard/TextKey;[Lkeyboard/neon/newboard/ime/text/keyboard/TextKey;Lkeyboard/neon/newboard/ime/text/key/KeyType;)V", "computeKeyboardAsync", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKeyboard;", "keyboardMode", "Lkeyboard/neon/newboard/ime/text/keyboard/KeyboardMode;", "subtype", "Lkeyboard/neon/newboard/ime/core/Subtype;", "getMetaFor", "type", "name", "getMetaLabelListFor", "", "getMetaNameListFor", "loadExtendedPopupsAsync", "loadLayoutAsync", "ltn", "Lkeyboard/neon/newboard/ime/text/layout/LTN;", "mergeLayoutsAsync", "modifier", "extension", "(Lkeyboard/neon/newboard/ime/text/keyboard/KeyboardMode;Lkeyboard/neon/newboard/ime/core/Subtype;Lkeyboard/neon/newboard/ime/text/layout/LTN;Lkeyboard/neon/newboard/ime/text/layout/LTN;Lkeyboard/neon/newboard/ime/text/layout/LTN;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDestroy", "aosp_debug"})
public final class LayoutManager {
    private final java.util.HashMap<java.lang.String, kotlinx.coroutines.Deferred<kotlin.Result<keyboard.neon.newboard.ime.text.layout.Layout>>> layoutCache = null;
    private final kotlinx.coroutines.sync.Mutex layoutCacheGuard = null;
    private final java.util.HashMap<java.lang.String, kotlinx.coroutines.Deferred<kotlin.Result<keyboard.neon.newboard.ime.popup.PopupExtension>>> extendedPopupsCache = null;
    private final kotlinx.coroutines.sync.Mutex extendedPopupsCacheGuard = null;
    private final kotlinx.coroutines.CoroutineScope ioScope = null;
    private final java.util.EnumMap<keyboard.neon.newboard.ime.text.layout.LayoutType, java.util.List<kotlin.Pair<keyboard.neon.newboard.res.FlorisRef, keyboard.neon.newboard.ime.text.layout.LayoutMetaOnly>>> indexedLayoutRefs = null;
    
    public LayoutManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.res.AssetManager getAssetManager() {
        return null;
    }
    
    private final keyboard.neon.newboard.ime.core.Preferences getPrefs() {
        return null;
    }
    
    /**
     * Loads the layout for the specified type and name.
     *
     * @return the [Layout] or null.
     */
    private final kotlinx.coroutines.Deferred<kotlin.Result<keyboard.neon.newboard.ime.text.layout.Layout>> loadLayoutAsync(keyboard.neon.newboard.ime.text.layout.LTN ltn) {
        return null;
    }
    
    private final kotlinx.coroutines.Deferred<kotlin.Result<keyboard.neon.newboard.ime.popup.PopupExtension>> loadExtendedPopupsAsync(keyboard.neon.newboard.ime.core.Subtype subtype) {
        return null;
    }
    
    /**
     * Merges the specified layouts (LTNs) and returns the computed layout.
     * The computed layout may looks like this:
     *  e e e e e e e e e e      e = extension
     *  c c c c c c c c c c      c = main
     *   c c c c c c c c c       m = mod
     *  m c c c c c c c c m
     *  m m m m m m m m m m
     *
     * @param keyboardMode The keyboard mode for the returning [TextKeyboard].
     * @param subtype The subtype used for populating the extended popups.
     * @param main The main layout type and name.
     * @param modifier The modifier (mod) layout type and name.
     * @param extension The extension layout type and name.
     * @return a [TextKeyboard] object, regardless of the specified LTNs or errors.
     */
    private final java.lang.Object mergeLayoutsAsync(keyboard.neon.newboard.ime.text.keyboard.KeyboardMode keyboardMode, keyboard.neon.newboard.ime.core.Subtype subtype, keyboard.neon.newboard.ime.text.layout.LTN main, keyboard.neon.newboard.ime.text.layout.LTN modifier, keyboard.neon.newboard.ime.text.layout.LTN extension, kotlin.coroutines.Continuation<? super keyboard.neon.newboard.ime.text.keyboard.TextKeyboard> continuation) {
        return null;
    }
    
    private final void addRowHints(keyboard.neon.newboard.ime.text.keyboard.TextKey[] main, keyboard.neon.newboard.ime.text.keyboard.TextKey[] hint, keyboard.neon.newboard.ime.text.key.KeyType hintType) {
    }
    
    /**
     * Computes a layout for [keyboardMode] based on the given [subtype] and returns it.
     *
     * @param keyboardMode The keyboard mode for which the layout should be computed.
     * @param subtype The subtype which localizes the computed layout.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Deferred<keyboard.neon.newboard.ime.text.keyboard.TextKeyboard> computeKeyboardAsync(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.keyboard.KeyboardMode keyboardMode, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype subtype) {
        return null;
    }
    
    /**
     * Called when the application is destroyed. Used to cancel any pending coroutines.
     */
    public final void onDestroy() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.text.layout.LayoutMetaOnly getMetaFor(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.layout.LayoutType type, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getMetaNameListFor(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.layout.LayoutType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getMetaLabelListFor(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.layout.LayoutType type) {
        return null;
    }
}