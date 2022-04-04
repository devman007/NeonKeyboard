package keyboard.neon.newboard.ime.popup;

import java.lang.System;

/**
 * Manages the creation and dismissal of key popups as well as the checks if the pointer moved
 * out of the popup bound (only for extended popups).
 *
 * @property keyboardView Reference to the keyboard view to which this manager class belongs to.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 5*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u00015B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J \u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0002J\u0006\u0010\'\u001a\u00020\u001fJ\u0016\u0010(\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020%J\u0010\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010 \u001a\u00020!J\u0018\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020%J\u0006\u0010,\u001a\u00020\u001fJ\u0010\u0010-\u001a\u00020\t2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010.\u001a\u00020\t2\u0006\u0010 \u001a\u00020!H\u0002J\u000e\u0010/\u001a\u00020\t2\u0006\u0010 \u001a\u00020!J\u001e\u00100\u001a\u00020\t2\u0006\u0010 \u001a\u00020!2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u000bJ\u0016\u00104\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020%R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0017R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lkeyboard/neon/newboard/ime/popup/PopupManager;", "V", "Landroid/view/View;", "", "keyboardView", "popupLayerView", "Lkeyboard/neon/newboard/ime/popup/PopupLayerView;", "(Landroid/view/View;Lkeyboard/neon/newboard/ime/popup/PopupLayerView;)V", "anchorLeft", "", "anchorOffset", "", "anchorRight", "exceptionsForKeyCodes", "", "isShowingExtendedPopup", "()Z", "isShowingPopup", "keyPopupDiffX", "keyPopupHeight", "keyPopupTextSize", "", "keyPopupWidth", "Landroid/view/View;", "popupView", "Lkeyboard/neon/newboard/ime/popup/PopupView;", "popupViewExt", "Lkeyboard/neon/newboard/ime/popup/PopupExtendedView;", "row0count", "row1count", "calc", "", "key", "Lkeyboard/neon/newboard/ime/keyboard/Key;", "createElement", "Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Element;", "keyHintConfiguration", "Lkeyboard/neon/newboard/ime/text/key/KeyHintConfiguration;", "adjustedIndex", "dismissAllPopups", "extend", "getActiveEmojiKeyData", "Lkeyboard/neon/newboard/ime/keyboard/KeyData;", "getActiveKeyData", "hide", "isSuitableForBasicPopup", "isSuitableForExtendedPopup", "isSuitableForPopups", "propagateMotionEvent", "event", "Landroid/view/MotionEvent;", "pointerIndex", "show", "Companion", "aosp_debug"})
public final class PopupManager<V extends android.view.View> {
    private final V keyboardView = null;
    private final keyboard.neon.newboard.ime.popup.PopupLayerView popupLayerView = null;
    private boolean anchorLeft = false;
    private boolean anchorRight = false;
    private int anchorOffset = 0;
    private final java.util.List<java.lang.Integer> exceptionsForKeyCodes = null;
    private int keyPopupWidth;
    private int keyPopupHeight;
    private float keyPopupTextSize;
    private int keyPopupDiffX = 0;
    private final keyboard.neon.newboard.ime.popup.PopupView popupView = null;
    private final keyboard.neon.newboard.ime.popup.PopupExtendedView popupViewExt = null;
    private int row0count = 0;
    private int row1count = 0;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.popup.PopupManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POPUP_EXTENSION_PATH_REL = "ime/text/characters/extended_popups";
    
    public PopupManager(@org.jetbrains.annotations.NotNull()
    V keyboardView, @org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.popup.PopupLayerView popupLayerView) {
        super();
    }
    
    public final boolean isShowingPopup() {
        return false;
    }
    
    public final boolean isShowingExtendedPopup() {
        return false;
    }
    
    /**
     * Helper function to create a element for the extended popup and preconfigure it.
     *
     * @param key Reference to the key currently controlling the popup.
     * @param keyHintConfiguration The key hint configuration to use.
     * @param adjustedIndex The index of the key in the key data popup array.
     * @return A preconfigured extended popup element.
     */
    private final keyboard.neon.newboard.ime.popup.PopupExtendedView.Element createElement(keyboard.neon.newboard.ime.keyboard.Key key, keyboard.neon.newboard.ime.text.key.KeyHintConfiguration keyHintConfiguration, int adjustedIndex) {
        return null;
    }
    
    public final boolean isSuitableForPopups(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.Key key) {
        return false;
    }
    
    private final boolean isSuitableForBasicPopup(keyboard.neon.newboard.ime.keyboard.Key key) {
        return false;
    }
    
    private final boolean isSuitableForExtendedPopup(keyboard.neon.newboard.ime.keyboard.Key key) {
        return false;
    }
    
    /**
     * Calculates all attributes required by both the normal and the extended popup, regardless of
     * the passed [key]'s code.
     */
    private final void calc(keyboard.neon.newboard.ime.keyboard.Key key) {
    }
    
    /**
     * Shows a preview popup for the passed [key]. Ignores show requests for keys which
     * key code is equal to or less than [KeyCode.SPACE].
     *
     * @param key Reference to the key currently controlling the popup.
     * @param keyHintConfiguration The key hint configuration to use.
     */
    public final void show(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.Key key, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.key.KeyHintConfiguration keyHintConfiguration) {
    }
    
    /**
     * Extends the currently showing key preview popup if there are popup keys defined in the
     * key data of the passed [key]. Ignores extend requests for key views which key code
     * is equal to or less than [KeyCode.SPACE]. An exception is made for the codes defined in
     * [exceptionsForKeyCodes], as they most likely have special keys bound to them.
     *
     * Layout of the extended key popup: (n = key.computedPopups.size)
     *  when n <= 5: single line, row0 only
     *    _ _ _ _ _
     *    K K K K K
     *  when n > 5 && n % 2 == 1: multi line, row0 has 1 more key than row1, empty space position
     *    is depending on the current anchor
     *    anchorLeft           anchorRight
     *    K K ... K _         _ K ... K K
     *    K K ... K K         K K ... K K
     *  when n > 5 && n % 2 == 0: multi line, both same length
     *    K K ... K K
     *    K K ... K K
     *
     * @param key Reference to the key currently controlling the popup.
     * @param keyHintConfiguration The key hint configuration to use.
     */
    public final void extend(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.Key key, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.key.KeyHintConfiguration keyHintConfiguration) {
    }
    
    /**
     * Updates the current selected key in extended popup according to the passed [event].
     * This function does nothing if the extended popup is not showing and will return false.
     *
     * @param key Reference to the key currently controlling the popup.
     * @param event The [MotionEvent] passed from the keyboard view's onTouch event.
     * @return True if the pointer movement is within the elements bounds, false otherwise.
     */
    public final boolean propagateMotionEvent(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.Key key, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event, int pointerIndex) {
        return false;
    }
    
    /**
     * Gets the [TextKeyData] of the currently active key. May be either the key of the popup preview
     * or one of the keys in extended popup, if shown. Returns null if [key] is not a subclass of [TextKey].
     *
     * @param key Reference to the key currently controlling the popup.
     * @param keyHintConfiguration The key hint configuration to be used.
     * @return The [TextKeyData] object of the currently active key or null.
     */
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.keyboard.KeyData getActiveKeyData(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.Key key, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.key.KeyHintConfiguration keyHintConfiguration) {
        return null;
    }
    
    /**
     * Gets the [EmojiKeyData] of the currently active key. May be either the key of the popup
     * preview or one of the keys in extended popup, if shown. Returns null if [key] is noz a subclass of [EmojiKey].
     *
     * @param key Reference to the key currently controlling the popup.
     * @return The [EmojiKeyData] object of the currently active key or null.
     */
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.keyboard.KeyData getActiveEmojiKeyData(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.Key key) {
        return null;
    }
    
    /**
     * Hides the key preview popup as well as the extended popup.
     */
    public final void hide() {
    }
    
    /**
     * Dismisses all currently shown popups. Should be called by the keyboard view when it
     * is closing.
     */
    public final void dismissAllPopups() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lkeyboard/neon/newboard/ime/popup/PopupManager$Companion;", "", "()V", "POPUP_EXTENSION_PATH_REL", "", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}