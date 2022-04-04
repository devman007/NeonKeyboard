package keyboard.neon.newboard.ime.media.emoji;

import java.lang.System;

/**
 * Data class for a single emoji (with possible emoji variants in [popup]). The JSON class identifier for this selector
 * is `emoji_key`.
 *
 * @property codePoints The code points of the emoji.
 * @property asString The name of the emoji.
 * @property popup List of possible variants of the emoji.
 */
@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 72\u00020\u0001:\u000267BM\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rB-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\t\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020)H\u0016J\u0012\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u0007H\u0016J!\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u00c7\u0001R\u001c\u0010\u000f\u001a\u00020\u00038\u0016X\u0097D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u00020\u00038\u0016X\u0097D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0097\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\t\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u00020#8\u0016X\u0097\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010&\u00a8\u00068"}, d2 = {"Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyData;", "Lkeyboard/neon/newboard/ime/keyboard/KeyData;", "seen1", "", "codePoints", "", "label", "", "popupList", "", "string", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "code", "getCode$annotations", "()V", "getCode", "()I", "getCodePoints", "()Ljava/util/List;", "groupId", "getGroupId$annotations", "getGroupId", "getLabel", "()Ljava/lang/String;", "popup", "Lkeyboard/neon/newboard/ime/popup/PopupSet;", "Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "getPopup$annotations", "getPopup", "()Lkeyboard/neon/newboard/ime/popup/PopupSet;", "getPopupList", "type", "Lkeyboard/neon/newboard/ime/text/key/KeyType;", "getType$annotations", "getType", "()Lkeyboard/neon/newboard/ime/text/key/KeyType;", "asString", "isForDisplay", "", "compute", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKeyData;", "evaluator", "Lkeyboard/neon/newboard/ime/keyboard/ComputingEvaluator;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "aosp_debug"})
@kotlinx.serialization.SerialName(value = "emoji_key")
@kotlinx.serialization.Serializable()
public final class EmojiKeyData implements keyboard.neon.newboard.ime.keyboard.KeyData {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Integer> codePoints = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String label = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<keyboard.neon.newboard.ime.media.emoji.EmojiKeyData> popupList = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.text.key.KeyType type = keyboard.neon.newboard.ime.text.key.KeyType.CHARACTER;
    private final int code = 0;
    private final int groupId = 0;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.popup.PopupSet<keyboard.neon.newboard.ime.keyboard.AbstractKeyData> popup = null;
    private java.lang.String string;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.media.emoji.EmojiKeyData.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.media.emoji.EmojiKeyData EMPTY = null;
    
    /**
     * Data class for a single emoji (with possible emoji variants in [popup]). The JSON class identifier for this selector
     * is `emoji_key`.
     *
     * @property codePoints The code points of the emoji.
     * @property asString The name of the emoji.
     * @property popup List of possible variants of the emoji.
     */
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.media.emoji.EmojiKeyData self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public EmojiKeyData(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> codePoints, @org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.util.List<keyboard.neon.newboard.ime.media.emoji.EmojiKeyData> popupList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getCodePoints() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<keyboard.neon.newboard.ime.media.emoji.EmojiKeyData> getPopupList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public keyboard.neon.newboard.ime.text.key.KeyType getType() {
        return null;
    }
    
    @java.lang.Override()
    @kotlinx.serialization.Transient()
    @java.lang.Deprecated()
    public static void getType$annotations() {
    }
    
    @java.lang.Override()
    public int getCode() {
        return 0;
    }
    
    @java.lang.Override()
    @kotlinx.serialization.Transient()
    @java.lang.Deprecated()
    public static void getCode$annotations() {
    }
    
    @java.lang.Override()
    public int getGroupId() {
        return 0;
    }
    
    @java.lang.Override()
    @kotlinx.serialization.Transient()
    @java.lang.Deprecated()
    public static void getGroupId$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public keyboard.neon.newboard.ime.popup.PopupSet<keyboard.neon.newboard.ime.keyboard.AbstractKeyData> getPopup() {
        return null;
    }
    
    @java.lang.Override()
    @kotlinx.serialization.Transient()
    @java.lang.Deprecated()
    public static void getPopup$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public keyboard.neon.newboard.ime.text.keyboard.TextKeyData compute(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u00c6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyData$Companion;", "", "()V", "EMPTY", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyData;", "getEMPTY", "()Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyData;", "serializer", "Lkotlinx/serialization/KSerializer;", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<keyboard.neon.newboard.ime.media.emoji.EmojiKeyData> serializer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.media.emoji.EmojiKeyData getEMPTY() {
            return null;
        }
    }
    
    /**
     * Data class for a single emoji (with possible emoji variants in [popup]). The JSON class identifier for this selector
     * is `emoji_key`.
     *
     * @property codePoints The code points of the emoji.
     * @property asString The name of the emoji.
     * @property popup List of possible variants of the emoji.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"keyboard/neon/newboard/ime/media/emoji/EmojiKeyData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "aosp_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<keyboard.neon.newboard.ime.media.emoji.EmojiKeyData> {
        
        /**
         * Data class for a single emoji (with possible emoji variants in [popup]). The JSON class identifier for this selector
         * is `emoji_key`.
         *
         * @property codePoints The code points of the emoji.
         * @property asString The name of the emoji.
         * @property popup List of possible variants of the emoji.
         */
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.media.emoji.EmojiKeyData.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        /**
         * Data class for a single emoji (with possible emoji variants in [popup]). The JSON class identifier for this selector
         * is `emoji_key`.
         *
         * @property codePoints The code points of the emoji.
         * @property asString The name of the emoji.
         * @property popup List of possible variants of the emoji.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        /**
         * Data class for a single emoji (with possible emoji variants in [popup]). The JSON class identifier for this selector
         * is `emoji_key`.
         *
         * @property codePoints The code points of the emoji.
         * @property asString The name of the emoji.
         * @property popup List of possible variants of the emoji.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public keyboard.neon.newboard.ime.media.emoji.EmojiKeyData deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        /**
         * Data class for a single emoji (with possible emoji variants in [popup]). The JSON class identifier for this selector
         * is `emoji_key`.
         *
         * @property codePoints The code points of the emoji.
         * @property asString The name of the emoji.
         * @property popup List of possible variants of the emoji.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        /**
         * Data class for a single emoji (with possible emoji variants in [popup]). The JSON class identifier for this selector
         * is `emoji_key`.
         *
         * @property codePoints The code points of the emoji.
         * @property asString The name of the emoji.
         * @property popup List of possible variants of the emoji.
         */
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.media.emoji.EmojiKeyData value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}