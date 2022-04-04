package keyboard.neon.newboard.ime.text.keyboard;

import java.lang.System;

/**
 * Data class which describes a single key and its attributes.
 *
 * @property type The type of the key. Some actions require both [code] and [type] to match in order
 * to be successfully executed. Defaults to [KeyType.CHARACTER].
 * @property code The UTF-8 encoded code of the character. The code defined here is used as the
 * data passed to the system. Defaults to 0.
 * @property label The string used to display the key in the UI. Is not used for the actual data
 * passed to the system. Should normally be the exact same as the [code]. Defaults to an empty
 * string.
 */
@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002()BM\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fB?\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\bH\u0016J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u00c7\u0001R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006*"}, d2 = {"Lkeyboard/neon/newboard/ime/text/keyboard/TextKeyData;", "Lkeyboard/neon/newboard/ime/keyboard/KeyData;", "seen1", "", "type", "Lkeyboard/neon/newboard/ime/text/key/KeyType;", "code", "label", "", "groupId", "popup", "Lkeyboard/neon/newboard/ime/popup/PopupSet;", "Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkeyboard/neon/newboard/ime/text/key/KeyType;ILjava/lang/String;ILkeyboard/neon/newboard/ime/popup/PopupSet;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lkeyboard/neon/newboard/ime/text/key/KeyType;ILjava/lang/String;ILkeyboard/neon/newboard/ime/popup/PopupSet;)V", "getCode", "()I", "getGroupId", "getLabel", "()Ljava/lang/String;", "getPopup", "()Lkeyboard/neon/newboard/ime/popup/PopupSet;", "getType", "()Lkeyboard/neon/newboard/ime/text/key/KeyType;", "asString", "isForDisplay", "", "compute", "evaluator", "Lkeyboard/neon/newboard/ime/keyboard/ComputingEvaluator;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "aosp_debug"})
@kotlinx.serialization.SerialName(value = "text_key")
@kotlinx.serialization.Serializable()
public final class TextKeyData implements keyboard.neon.newboard.ime.keyboard.KeyData {
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.text.key.KeyType type = null;
    private final int code = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String label = null;
    private final int groupId = 0;
    @org.jetbrains.annotations.Nullable()
    private final keyboard.neon.newboard.ime.popup.PopupSet<keyboard.neon.newboard.ime.keyboard.AbstractKeyData> popup = null;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData.Companion Companion = null;
    
    /**
     * Predefined key data for [KeyCode.ARROW_DOWN]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData ARROW_DOWN = null;
    
    /**
     * Predefined key data for [KeyCode.ARROW_LEFT]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData ARROW_LEFT = null;
    
    /**
     * Predefined key data for [KeyCode.ARROW_RIGHT]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData ARROW_RIGHT = null;
    
    /**
     * Predefined key data for [KeyCode.ARROW_UP]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData ARROW_UP = null;
    
    /**
     * Predefined key data for [KeyCode.CLIPBOARD_COPY]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData CLIPBOARD_COPY = null;
    
    /**
     * Predefined key data for [KeyCode.CLIPBOARD_CUT]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData CLIPBOARD_CUT = null;
    
    /**
     * Predefined key data for [KeyCode.CLIPBOARD_PASTE]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData CLIPBOARD_PASTE = null;
    
    /**
     * Predefined key data for [KeyCode.CLIPBOARD_SELECT]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData CLIPBOARD_SELECT = null;
    
    /**
     * Predefined key data for [KeyCode.CLIPBOARD_SELECT_ALL]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData CLIPBOARD_SELECT_ALL = null;
    
    /**
     * Predefined key data for [KeyCode.DELETE]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData DELETE = null;
    
    /**
     * Predefined key data for [KeyCode.DELETE_WORD]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData DELETE_WORD = null;
    
    /**
     * Predefined key data for [KeyCode.INTERNAL_BATCH_EDIT]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData INTERNAL_BATCH_EDIT = null;
    
    /**
     * Predefined key data for [KeyCode.MOVE_START_OF_LINE]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData MOVE_START_OF_LINE = null;
    
    /**
     * Predefined key data for [KeyCode.MOVE_END_OF_LINE]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData MOVE_END_OF_LINE = null;
    
    /**
     * Predefined key data for [KeyCode.MOVE_START_OF_PAGE]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData MOVE_START_OF_PAGE = null;
    
    /**
     * Predefined key data for [KeyCode.MOVE_END_OF_PAGE]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData MOVE_END_OF_PAGE = null;
    
    /**
     * Predefined key data for [KeyCode.REDO]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData REDO = null;
    
    /**
     * Predefined key data for [KeyCode.SHOW_INPUT_METHOD_PICKER]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData SHOW_INPUT_METHOD_PICKER = null;
    
    /**
     * Predefined key data for [KeyCode.SWITCH_TO_TEXT_CONTEXT]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData SWITCH_TO_TEXT_CONTEXT = null;
    
    /**
     * Predefined key data for [KeyCode.SWITCH_TO_CLIPBOARD_CONTEXT]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData SWITCH_TO_CLIPBOARD_CONTEXT = null;
    
    /**
     * Predefined key data for [KeyCode.SHIFT]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData SHIFT = null;
    
    /**
     * Predefined key data for [KeyCode.SHIFT_LOCK]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData SHIFT_LOCK = null;
    
    /**
     * Predefined key data for [KeyCode.SPACE]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData SPACE = null;
    
    /**
     * Predefined key data for [KeyCode.UNDO]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData UNDO = null;
    
    /**
     * Predefined key data for [KeyCode.UNSPECIFIED]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData UNSPECIFIED = null;
    
    /**
     * Predefined key data for [KeyCode.VIEW_CHARACTERS]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData VIEW_CHARACTERS = null;
    
    /**
     * Predefined key data for [KeyCode.VIEW_SYMBOLS]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData VIEW_SYMBOLS = null;
    
    /**
     * Predefined key data for [KeyCode.VIEW_SYMBOLS2]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData VIEW_SYMBOLS2 = null;
    
    /**
     * Predefined key data for [KeyCode.VIEW_NUMERIC_ADVANCED]
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData VIEW_NUMERIC_ADVANCED = null;
    
    /**
     * Data class which describes a single key and its attributes.
     *
     * @property type The type of the key. Some actions require both [code] and [type] to match in order
     * to be successfully executed. Defaults to [KeyType.CHARACTER].
     * @property code The UTF-8 encoded code of the character. The code defined here is used as the
     * data passed to the system. Defaults to 0.
     * @property label The string used to display the key in the UI. Is not used for the actual data
     * passed to the system. Should normally be the exact same as the [code]. Defaults to an empty
     * string.
     */
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.keyboard.TextKeyData self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public TextKeyData() {
        super();
    }
    
    public TextKeyData(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.key.KeyType type, int code, @org.jetbrains.annotations.NotNull()
    java.lang.String label, int groupId, @org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.popup.PopupSet<keyboard.neon.newboard.ime.keyboard.AbstractKeyData> popup) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public keyboard.neon.newboard.ime.text.key.KeyType getType() {
        return null;
    }
    
    @java.lang.Override()
    public int getCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLabel() {
        return null;
    }
    
    @java.lang.Override()
    public int getGroupId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public keyboard.neon.newboard.ime.popup.PopupSet<keyboard.neon.newboard.ime.keyboard.AbstractKeyData> getPopup() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public keyboard.neon.newboard.ime.keyboard.KeyData compute(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.ComputingEvaluator evaluator) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String asString(boolean isForDisplay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040@H\u00c6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0011\u0010!\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0011\u0010#\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0011\u0010%\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006R\u0011\u0010\'\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0006R\u0011\u0010)\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0006R\u0011\u0010+\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0006R\u0011\u0010-\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0006R\u0011\u0010/\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0006R\u0011\u00101\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0006R\u0011\u00103\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0006R\u0011\u00105\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0006R\u0011\u00107\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0006R\u0011\u00109\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0006R\u0011\u0010;\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0006R\u0011\u0010=\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0006\u00a8\u0006A"}, d2 = {"Lkeyboard/neon/newboard/ime/text/keyboard/TextKeyData$Companion;", "", "()V", "ARROW_DOWN", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKeyData;", "getARROW_DOWN", "()Lkeyboard/neon/newboard/ime/text/keyboard/TextKeyData;", "ARROW_LEFT", "getARROW_LEFT", "ARROW_RIGHT", "getARROW_RIGHT", "ARROW_UP", "getARROW_UP", "CLIPBOARD_COPY", "getCLIPBOARD_COPY", "CLIPBOARD_CUT", "getCLIPBOARD_CUT", "CLIPBOARD_PASTE", "getCLIPBOARD_PASTE", "CLIPBOARD_SELECT", "getCLIPBOARD_SELECT", "CLIPBOARD_SELECT_ALL", "getCLIPBOARD_SELECT_ALL", "DELETE", "getDELETE", "DELETE_WORD", "getDELETE_WORD", "INTERNAL_BATCH_EDIT", "getINTERNAL_BATCH_EDIT", "MOVE_END_OF_LINE", "getMOVE_END_OF_LINE", "MOVE_END_OF_PAGE", "getMOVE_END_OF_PAGE", "MOVE_START_OF_LINE", "getMOVE_START_OF_LINE", "MOVE_START_OF_PAGE", "getMOVE_START_OF_PAGE", "REDO", "getREDO", "SHIFT", "getSHIFT", "SHIFT_LOCK", "getSHIFT_LOCK", "SHOW_INPUT_METHOD_PICKER", "getSHOW_INPUT_METHOD_PICKER", "SPACE", "getSPACE", "SWITCH_TO_CLIPBOARD_CONTEXT", "getSWITCH_TO_CLIPBOARD_CONTEXT", "SWITCH_TO_TEXT_CONTEXT", "getSWITCH_TO_TEXT_CONTEXT", "UNDO", "getUNDO", "UNSPECIFIED", "getUNSPECIFIED", "VIEW_CHARACTERS", "getVIEW_CHARACTERS", "VIEW_NUMERIC_ADVANCED", "getVIEW_NUMERIC_ADVANCED", "VIEW_SYMBOLS", "getVIEW_SYMBOLS", "VIEW_SYMBOLS2", "getVIEW_SYMBOLS2", "serializer", "Lkotlinx/serialization/KSerializer;", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<keyboard.neon.newboard.ime.text.keyboard.TextKeyData> serializer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getARROW_DOWN() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getARROW_LEFT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getARROW_RIGHT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getARROW_UP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getCLIPBOARD_COPY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getCLIPBOARD_CUT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getCLIPBOARD_PASTE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getCLIPBOARD_SELECT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getCLIPBOARD_SELECT_ALL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getDELETE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getDELETE_WORD() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getINTERNAL_BATCH_EDIT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getMOVE_START_OF_LINE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getMOVE_END_OF_LINE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getMOVE_START_OF_PAGE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getMOVE_END_OF_PAGE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getREDO() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getSHOW_INPUT_METHOD_PICKER() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getSWITCH_TO_TEXT_CONTEXT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getSWITCH_TO_CLIPBOARD_CONTEXT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getSHIFT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getSHIFT_LOCK() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getSPACE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getUNDO() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getUNSPECIFIED() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getVIEW_CHARACTERS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getVIEW_SYMBOLS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getVIEW_SYMBOLS2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.keyboard.TextKeyData getVIEW_NUMERIC_ADVANCED() {
            return null;
        }
    }
    
    /**
     * Data class which describes a single key and its attributes.
     *
     * @property type The type of the key. Some actions require both [code] and [type] to match in order
     * to be successfully executed. Defaults to [KeyType.CHARACTER].
     * @property code The UTF-8 encoded code of the character. The code defined here is used as the
     * data passed to the system. Defaults to 0.
     * @property label The string used to display the key in the UI. Is not used for the actual data
     * passed to the system. Should normally be the exact same as the [code]. Defaults to an empty
     * string.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"keyboard/neon/newboard/ime/text/keyboard/TextKeyData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKeyData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "aosp_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<keyboard.neon.newboard.ime.text.keyboard.TextKeyData> {
        
        /**
         * Data class which describes a single key and its attributes.
         *
         * @property type The type of the key. Some actions require both [code] and [type] to match in order
         * to be successfully executed. Defaults to [KeyType.CHARACTER].
         * @property code The UTF-8 encoded code of the character. The code defined here is used as the
         * data passed to the system. Defaults to 0.
         * @property label The string used to display the key in the UI. Is not used for the actual data
         * passed to the system. Should normally be the exact same as the [code]. Defaults to an empty
         * string.
         */
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.text.keyboard.TextKeyData.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        /**
         * Data class which describes a single key and its attributes.
         *
         * @property type The type of the key. Some actions require both [code] and [type] to match in order
         * to be successfully executed. Defaults to [KeyType.CHARACTER].
         * @property code The UTF-8 encoded code of the character. The code defined here is used as the
         * data passed to the system. Defaults to 0.
         * @property label The string used to display the key in the UI. Is not used for the actual data
         * passed to the system. Should normally be the exact same as the [code]. Defaults to an empty
         * string.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        /**
         * Data class which describes a single key and its attributes.
         *
         * @property type The type of the key. Some actions require both [code] and [type] to match in order
         * to be successfully executed. Defaults to [KeyType.CHARACTER].
         * @property code The UTF-8 encoded code of the character. The code defined here is used as the
         * data passed to the system. Defaults to 0.
         * @property label The string used to display the key in the UI. Is not used for the actual data
         * passed to the system. Should normally be the exact same as the [code]. Defaults to an empty
         * string.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public keyboard.neon.newboard.ime.text.keyboard.TextKeyData deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        /**
         * Data class which describes a single key and its attributes.
         *
         * @property type The type of the key. Some actions require both [code] and [type] to match in order
         * to be successfully executed. Defaults to [KeyType.CHARACTER].
         * @property code The UTF-8 encoded code of the character. The code defined here is used as the
         * data passed to the system. Defaults to 0.
         * @property label The string used to display the key in the UI. Is not used for the actual data
         * passed to the system. Should normally be the exact same as the [code]. Defaults to an empty
         * string.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        /**
         * Data class which describes a single key and its attributes.
         *
         * @property type The type of the key. Some actions require both [code] and [type] to match in order
         * to be successfully executed. Defaults to [KeyType.CHARACTER].
         * @property code The UTF-8 encoded code of the character. The code defined here is used as the
         * data passed to the system. Defaults to 0.
         * @property label The string used to display the key in the UI. Is not used for the actual data
         * passed to the system. Should normally be the exact same as the [code]. Defaults to an empty
         * string.
         */
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.keyboard.TextKeyData value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}