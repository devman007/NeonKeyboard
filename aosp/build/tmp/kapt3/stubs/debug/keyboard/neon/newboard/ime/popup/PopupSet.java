package keyboard.neon.newboard.ime.popup;

import java.lang.System;

/**
 * A popup set for a single key. This set describes, if the key has a [main] character and other [relevant] popups.
 *
 * Note that a hint character cannot and should not be set in a json extended popup file, rather it
 * should only be dynamically set by the LayoutManager.
 *
 * The order in which these defined popups will be shown depends on the current [KeyHintConfiguration].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 %*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002$%B3\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bB!\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J;\u0010\u001a\u001a\u00020\u001b\"\u0004\b\u0001\u0010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u001c0#H\u00c7\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006&\u0080\u00e5\b\u0006\u0080\u00e5\b\u0007"}, d2 = {"Lkeyboard/neon/newboard/ime/popup/PopupSet;", "T", "Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "", "seen1", "", "main", "relevant", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;Ljava/util/List;)V", "getMain", "()Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "popupKeys", "Lkeyboard/neon/newboard/ime/popup/PopupKeys;", "getPopupKeys", "()Lkeyboard/neon/newboard/ime/popup/PopupKeys;", "popupKeys$delegate", "Lkotlin/Lazy;", "getRelevant", "()Ljava/util/List;", "keyHintConfiguration", "Lkeyboard/neon/newboard/ime/text/key/KeyHintConfiguration;", "write$Self", "", "T0", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "$serializer", "Companion", "aosp_debug"})
@kotlinx.serialization.Serializable()
public class PopupSet<T extends keyboard.neon.newboard.ime.keyboard.AbstractKeyData> {
    
    /**
     * A popup set for a single key. This set describes, if the key has a [main] character and other [relevant] popups.
     *
     * Note that a hint character cannot and should not be set in a json extended popup file, rather it
     * should only be dynamically set by the LayoutManager.
     *
     * The order in which these defined popups will be shown depends on the current [KeyHintConfiguration].
     */
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.popup.PopupSet.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private final T main = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<T> relevant = null;
    private final kotlin.Lazy popupKeys$delegate = null;
    
    /**
     * A popup set for a single key. This set describes, if the key has a [main] character and other [relevant] popups.
     *
     * Note that a hint character cannot and should not be set in a json extended popup file, rather it
     * should only be dynamically set by the LayoutManager.
     *
     * The order in which these defined popups will be shown depends on the current [KeyHintConfiguration].
     */
    @kotlin.jvm.JvmStatic()
    public static final <T0 extends java.lang.Object>void write$Self(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.popup.PopupSet<T0> self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.KSerializer<T0> typeSerial0) {
    }
    
    public PopupSet() {
        super();
    }
    
    public PopupSet(@org.jetbrains.annotations.Nullable()
    T main, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> relevant) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public T getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<T> getRelevant() {
        return null;
    }
    
    private final keyboard.neon.newboard.ime.popup.PopupKeys<T> getPopupKeys() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public keyboard.neon.newboard.ime.popup.PopupKeys<T> getPopupKeys(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.key.KeyHintConfiguration keyHintConfiguration) {
        return null;
    }
    
    /**
     * A popup set for a single key. This set describes, if the key has a [main] character and other [relevant] popups.
     *
     * Note that a hint character cannot and should not be set in a json extended popup file, rather it
     * should only be dynamically set by the LayoutManager.
     *
     * The order in which these defined popups will be shown depends on the current [KeyHintConfiguration].
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u0004\"\u0004\b\u0001\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004H\u00c6\u0001\u00a8\u0006\b"}, d2 = {"Lkeyboard/neon/newboard/ime/popup/PopupSet$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkeyboard/neon/newboard/ime/popup/PopupSet;", "T0", "typeSerial0", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * A popup set for a single key. This set describes, if the key has a [main] character and other [relevant] popups.
         *
         * Note that a hint character cannot and should not be set in a json extended popup file, rather it
         * should only be dynamically set by the LayoutManager.
         *
         * The order in which these defined popups will be shown depends on the current [KeyHintConfiguration].
         */
        @org.jetbrains.annotations.NotNull()
        public final <T0 extends java.lang.Object>kotlinx.serialization.KSerializer<keyboard.neon.newboard.ime.popup.PopupSet<T0>> serializer(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.KSerializer<T0> typeSerial0) {
            return null;
        }
    }
    
    /**
     * A popup set for a single key. This set describes, if the key has a [main] character and other [relevant] popups.
     *
     * Note that a hint character cannot and should not be set in a json extended popup file, rather it
     * should only be dynamically set by the LayoutManager.
     *
     * The order in which these defined popups will be shown depends on the current [KeyHintConfiguration].
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004B\u0015\b\u0017\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\rH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u001f\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u00d6\u0001J\u0018\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\rH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000eR\u0014\u0010\b\u001a\u00020\t8VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"keyboard/neon/newboard/ime/popup/PopupSet.$serializer", "T", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lkeyboard/neon/newboard/ime/popup/PopupSet;", "()V", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "typeParametersSerializers", "aosp_debug"})
    @java.lang.Deprecated()
    public static final class $serializer<T extends java.lang.Object> implements kotlinx.serialization.internal.GeneratedSerializer<keyboard.neon.newboard.ime.popup.PopupSet<T>> {
        
        private $serializer() {
            super();
        }
        
        /**
         * A popup set for a single key. This set describes, if the key has a [main] character and other [relevant] popups.
         *
         * Note that a hint character cannot and should not be set in a json extended popup file, rather it
         * should only be dynamically set by the LayoutManager.
         *
         * The order in which these defined popups will be shown depends on the current [KeyHintConfiguration].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        /**
         * A popup set for a single key. This set describes, if the key has a [main] character and other [relevant] popups.
         *
         * Note that a hint character cannot and should not be set in a json extended popup file, rather it
         * should only be dynamically set by the LayoutManager.
         *
         * The order in which these defined popups will be shown depends on the current [KeyHintConfiguration].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public keyboard.neon.newboard.ime.popup.PopupSet<T> deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        /**
         * A popup set for a single key. This set describes, if the key has a [main] character and other [relevant] popups.
         *
         * Note that a hint character cannot and should not be set in a json extended popup file, rather it
         * should only be dynamically set by the LayoutManager.
         *
         * The order in which these defined popups will be shown depends on the current [KeyHintConfiguration].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        /**
         * A popup set for a single key. This set describes, if the key has a [main] character and other [relevant] popups.
         *
         * Note that a hint character cannot and should not be set in a json extended popup file, rather it
         * should only be dynamically set by the LayoutManager.
         *
         * The order in which these defined popups will be shown depends on the current [KeyHintConfiguration].
         */
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.popup.PopupSet<T> value) {
        }
        
        /**
         * A popup set for a single key. This set describes, if the key has a [main] character and other [relevant] popups.
         *
         * Note that a hint character cannot and should not be set in a json extended popup file, rather it
         * should only be dynamically set by the LayoutManager.
         *
         * The order in which these defined popups will be shown depends on the current [KeyHintConfiguration].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}