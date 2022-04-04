package keyboard.neon.newboard.ime.keyboard;

import java.lang.System;

/**
 * Interface describing a basic key which can carry a character, an emoji, a special function etc. while being as
 * abstract as possible.
 *
 * @property type The type of the key.
 * @property code The Unicode code point of this key, or a special code from [KeyCode].
 * @property label The label of the key. This should always be a representative string for [code].
 * @property groupId The group which this key belongs to.
 * @property popup The popups for ths key. Can also dynamically be provided via popup extensions.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/KeyData;", "Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "code", "", "getCode", "()I", "groupId", "getGroupId", "label", "", "getLabel", "()Ljava/lang/String;", "popup", "Lkeyboard/neon/newboard/ime/popup/PopupSet;", "getPopup", "()Lkeyboard/neon/newboard/ime/popup/PopupSet;", "type", "Lkeyboard/neon/newboard/ime/text/key/KeyType;", "getType", "()Lkeyboard/neon/newboard/ime/text/key/KeyType;", "Companion", "aosp_debug"})
public abstract interface KeyData extends keyboard.neon.newboard.ime.keyboard.AbstractKeyData {
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.keyboard.KeyData.Companion Companion = null;
    
    /**
     * Constant for the default group. If not otherwise specified, any key is automatically
     * assigned to this group.
     */
    public static final int GROUP_DEFAULT = 0;
    
    /**
     * Constant for the Left modifier key group. Any key belonging to this group will get the
     * popups specified for "~left" in the popup mapping.
     */
    public static final int GROUP_LEFT = 1;
    
    /**
     * Constant for the right modifier key group. Any key belonging to this group will get the
     * popups specified for "~right" in the popup mapping.
     */
    public static final int GROUP_RIGHT = 2;
    
    /**
     * Constant for the enter modifier key group. Any key belonging to this group will get the
     * popups specified for "~enter" in the popup mapping.
     */
    public static final int GROUP_ENTER = 3;
    
    /**
     * Constant for the enter modifier key group. Any key belonging to this group will get the
     * popups specified for "~kana" in the popup mapping.
     */
    public static final int GROUP_KANA = 97;
    
    @org.jetbrains.annotations.NotNull()
    public abstract keyboard.neon.newboard.ime.text.key.KeyType getType();
    
    public abstract int getCode();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLabel();
    
    public abstract int getGroupId();
    
    @org.jetbrains.annotations.Nullable()
    public abstract keyboard.neon.newboard.ime.popup.PopupSet<keyboard.neon.newboard.ime.keyboard.AbstractKeyData> getPopup();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/KeyData$Companion;", "", "()V", "GROUP_DEFAULT", "", "GROUP_ENTER", "GROUP_KANA", "GROUP_LEFT", "GROUP_RIGHT", "aosp_debug"})
    public static final class Companion {
        
        /**
         * Constant for the default group. If not otherwise specified, any key is automatically
         * assigned to this group.
         */
        public static final int GROUP_DEFAULT = 0;
        
        /**
         * Constant for the Left modifier key group. Any key belonging to this group will get the
         * popups specified for "~left" in the popup mapping.
         */
        public static final int GROUP_LEFT = 1;
        
        /**
         * Constant for the right modifier key group. Any key belonging to this group will get the
         * popups specified for "~right" in the popup mapping.
         */
        public static final int GROUP_RIGHT = 2;
        
        /**
         * Constant for the enter modifier key group. Any key belonging to this group will get the
         * popups specified for "~enter" in the popup mapping.
         */
        public static final int GROUP_ENTER = 3;
        
        /**
         * Constant for the enter modifier key group. Any key belonging to this group will get the
         * popups specified for "~kana" in the popup mapping.
         */
        public static final int GROUP_KANA = 97;
        
        private Companion() {
            super();
        }
    }
}