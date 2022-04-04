package keyboard.neon.newboard.ime.keyboard;

import java.lang.System;

/**
 * Allows to select an [AbstractKeyData] based on the kana state. Note that this type of selector only really
 * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
 * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `kana_selector`.
 *
 * Example usage in a layout JSON file:
 * ```
 * { "$": "kana_selector",
 *  "hira": { "code": 12354, "label": "あ" },
 *  "kata": { "code": 12450, "label": "ア" }
 * }
 * ```
 *
 * @property hira The key data to use if the current kana state is hiragana.
 * @property kata The key data to use if the current kana state is katakana.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u00c7\u0001R\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/KanaSelector;", "Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "seen1", "", "hira", "kata", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;)V", "getHira", "()Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "getKata", "asString", "", "isForDisplay", "", "compute", "Lkeyboard/neon/newboard/ime/keyboard/KeyData;", "evaluator", "Lkeyboard/neon/newboard/ime/keyboard/ComputingEvaluator;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "aosp_debug"})
@kotlinx.serialization.SerialName(value = "kana_selector")
@kotlinx.serialization.Serializable()
public final class KanaSelector implements keyboard.neon.newboard.ime.keyboard.AbstractKeyData {
    
    /**
     * Allows to select an [AbstractKeyData] based on the kana state. Note that this type of selector only really
     * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
     * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `kana_selector`.
     *
     * Example usage in a layout JSON file:
     * ```
     * { "$": "kana_selector",
     *  "hira": { "code": 12354, "label": "あ" },
     *  "kata": { "code": 12450, "label": "ア" }
     * }
     * ```
     *
     * @property hira The key data to use if the current kana state is hiragana.
     * @property kata The key data to use if the current kana state is katakana.
     */
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.keyboard.KanaSelector.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.keyboard.AbstractKeyData hira = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.keyboard.AbstractKeyData kata = null;
    
    /**
     * Allows to select an [AbstractKeyData] based on the kana state. Note that this type of selector only really
     * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
     * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `kana_selector`.
     *
     * Example usage in a layout JSON file:
     * ```
     * { "$": "kana_selector",
     *  "hira": { "code": 12354, "label": "あ" },
     *  "kata": { "code": 12450, "label": "ア" }
     * }
     * ```
     *
     * @property hira The key data to use if the current kana state is hiragana.
     * @property kata The key data to use if the current kana state is katakana.
     */
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KanaSelector self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public KanaSelector(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.AbstractKeyData hira, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.AbstractKeyData kata) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.keyboard.AbstractKeyData getHira() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.keyboard.AbstractKeyData getKata() {
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
    
    /**
     * Allows to select an [AbstractKeyData] based on the kana state. Note that this type of selector only really
     * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
     * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `kana_selector`.
     *
     * Example usage in a layout JSON file:
     * ```
     * { "$": "kana_selector",
     *  "hira": { "code": 12354, "label": "あ" },
     *  "kata": { "code": 12450, "label": "ア" }
     * }
     * ```
     *
     * @property hira The key data to use if the current kana state is hiragana.
     * @property kata The key data to use if the current kana state is katakana.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/KanaSelector$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkeyboard/neon/newboard/ime/keyboard/KanaSelector;", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Allows to select an [AbstractKeyData] based on the kana state. Note that this type of selector only really
         * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
         * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `kana_selector`.
         *
         * Example usage in a layout JSON file:
         * ```
         * { "$": "kana_selector",
         *  "hira": { "code": 12354, "label": "あ" },
         *  "kata": { "code": 12450, "label": "ア" }
         * }
         * ```
         *
         * @property hira The key data to use if the current kana state is hiragana.
         * @property kata The key data to use if the current kana state is katakana.
         */
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<keyboard.neon.newboard.ime.keyboard.KanaSelector> serializer() {
            return null;
        }
    }
    
    /**
     * Allows to select an [AbstractKeyData] based on the kana state. Note that this type of selector only really
     * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
     * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `kana_selector`.
     *
     * Example usage in a layout JSON file:
     * ```
     * { "$": "kana_selector",
     *  "hira": { "code": 12354, "label": "あ" },
     *  "kata": { "code": 12450, "label": "ア" }
     * }
     * ```
     *
     * @property hira The key data to use if the current kana state is hiragana.
     * @property kata The key data to use if the current kana state is katakana.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"keyboard/neon/newboard/ime/keyboard/KanaSelector.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lkeyboard/neon/newboard/ime/keyboard/KanaSelector;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "aosp_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<keyboard.neon.newboard.ime.keyboard.KanaSelector> {
        
        /**
         * Allows to select an [AbstractKeyData] based on the kana state. Note that this type of selector only really
         * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
         * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `kana_selector`.
         *
         * Example usage in a layout JSON file:
         * ```
         * { "$": "kana_selector",
         *  "hira": { "code": 12354, "label": "あ" },
         *  "kata": { "code": 12450, "label": "ア" }
         * }
         * ```
         *
         * @property hira The key data to use if the current kana state is hiragana.
         * @property kata The key data to use if the current kana state is katakana.
         */
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.keyboard.KanaSelector.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        /**
         * Allows to select an [AbstractKeyData] based on the kana state. Note that this type of selector only really
         * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
         * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `kana_selector`.
         *
         * Example usage in a layout JSON file:
         * ```
         * { "$": "kana_selector",
         *  "hira": { "code": 12354, "label": "あ" },
         *  "kata": { "code": 12450, "label": "ア" }
         * }
         * ```
         *
         * @property hira The key data to use if the current kana state is hiragana.
         * @property kata The key data to use if the current kana state is katakana.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        /**
         * Allows to select an [AbstractKeyData] based on the kana state. Note that this type of selector only really
         * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
         * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `kana_selector`.
         *
         * Example usage in a layout JSON file:
         * ```
         * { "$": "kana_selector",
         *  "hira": { "code": 12354, "label": "あ" },
         *  "kata": { "code": 12450, "label": "ア" }
         * }
         * ```
         *
         * @property hira The key data to use if the current kana state is hiragana.
         * @property kata The key data to use if the current kana state is katakana.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public keyboard.neon.newboard.ime.keyboard.KanaSelector deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        /**
         * Allows to select an [AbstractKeyData] based on the kana state. Note that this type of selector only really
         * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
         * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `kana_selector`.
         *
         * Example usage in a layout JSON file:
         * ```
         * { "$": "kana_selector",
         *  "hira": { "code": 12354, "label": "あ" },
         *  "kata": { "code": 12450, "label": "ア" }
         * }
         * ```
         *
         * @property hira The key data to use if the current kana state is hiragana.
         * @property kata The key data to use if the current kana state is katakana.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        /**
         * Allows to select an [AbstractKeyData] based on the kana state. Note that this type of selector only really
         * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
         * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `kana_selector`.
         *
         * Example usage in a layout JSON file:
         * ```
         * { "$": "kana_selector",
         *  "hira": { "code": 12354, "label": "あ" },
         *  "kata": { "code": 12450, "label": "ア" }
         * }
         * ```
         *
         * @property hira The key data to use if the current kana state is hiragana.
         * @property kata The key data to use if the current kana state is katakana.
         */
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.keyboard.KanaSelector value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}