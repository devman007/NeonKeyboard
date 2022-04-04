package keyboard.neon.newboard.ime.core;

import java.lang.System;

/**
 * Data class which represents a predefined set of language and preferred layout.
 *
 * @property id The ID of this subtype.
 * @property locale The locale of this subtype. Beware its different name in json: 'languageTag'.
 * @property currencySetName The currency set name of this subtype. Beware its different name in json: 'currencySet'.
 * @property preferred The preferred layout map for this subtype's locale.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 92\u00020\u0001:\u000289BO\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eB-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000fJ\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\t\u0010(\u001a\u00020\bH\u00c6\u0003J\t\u0010)\u001a\u00020\bH\u00c6\u0003J\t\u0010*\u001a\u00020\u000bH\u00c6\u0003J;\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\t\u00100\u001a\u00020\bH\u00d6\u0001J!\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u00c7\u0001R$\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006:"}, d2 = {"Lkeyboard/neon/newboard/ime/core/DefaultSubtype;", "", "seen1", "", "id", "locale", "Lkeyboard/neon/newboard/common/FlorisLocale;", "composerName", "", "currencySetName", "preferred", "Lkeyboard/neon/newboard/ime/core/SubtypeLayoutMap;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILkeyboard/neon/newboard/common/FlorisLocale;Ljava/lang/String;Ljava/lang/String;Lkeyboard/neon/newboard/ime/core/SubtypeLayoutMap;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILkeyboard/neon/newboard/common/FlorisLocale;Ljava/lang/String;Ljava/lang/String;Lkeyboard/neon/newboard/ime/core/SubtypeLayoutMap;)V", "getComposerName$annotations", "()V", "getComposerName", "()Ljava/lang/String;", "setComposerName", "(Ljava/lang/String;)V", "getCurrencySetName$annotations", "getCurrencySetName", "setCurrencySetName", "getId", "()I", "setId", "(I)V", "getLocale$annotations", "getLocale", "()Lkeyboard/neon/newboard/common/FlorisLocale;", "setLocale", "(Lkeyboard/neon/newboard/common/FlorisLocale;)V", "getPreferred", "()Lkeyboard/neon/newboard/ime/core/SubtypeLayoutMap;", "setPreferred", "(Lkeyboard/neon/newboard/ime/core/SubtypeLayoutMap;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "aosp_debug"})
@kotlinx.serialization.Serializable()
public final class DefaultSubtype {
    
    /**
     * Data class which represents a predefined set of language and preferred layout.
     *
     * @property id The ID of this subtype.
     * @property locale The locale of this subtype. Beware its different name in json: 'languageTag'.
     * @property currencySetName The currency set name of this subtype. Beware its different name in json: 'currencySet'.
     * @property preferred The preferred layout map for this subtype's locale.
     */
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.core.DefaultSubtype.Companion Companion = null;
    private int id;
    @org.jetbrains.annotations.NotNull()
    private keyboard.neon.newboard.common.FlorisLocale locale;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String composerName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currencySetName;
    @org.jetbrains.annotations.NotNull()
    private keyboard.neon.newboard.ime.core.SubtypeLayoutMap preferred;
    
    /**
     * Data class which represents a predefined set of language and preferred layout.
     *
     * @property id The ID of this subtype.
     * @property locale The locale of this subtype. Beware its different name in json: 'languageTag'.
     * @property currencySetName The currency set name of this subtype. Beware its different name in json: 'currencySet'.
     * @property preferred The preferred layout map for this subtype's locale.
     */
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.DefaultSubtype copy(int id, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.common.FlorisLocale locale, @org.jetbrains.annotations.NotNull()
    java.lang.String composerName, @org.jetbrains.annotations.NotNull()
    java.lang.String currencySetName, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.SubtypeLayoutMap preferred) {
        return null;
    }
    
    /**
     * Data class which represents a predefined set of language and preferred layout.
     *
     * @property id The ID of this subtype.
     * @property locale The locale of this subtype. Beware its different name in json: 'languageTag'.
     * @property currencySetName The currency set name of this subtype. Beware its different name in json: 'currencySet'.
     * @property preferred The preferred layout map for this subtype's locale.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Data class which represents a predefined set of language and preferred layout.
     *
     * @property id The ID of this subtype.
     * @property locale The locale of this subtype. Beware its different name in json: 'languageTag'.
     * @property currencySetName The currency set name of this subtype. Beware its different name in json: 'currencySet'.
     * @property preferred The preferred layout map for this subtype's locale.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Data class which represents a predefined set of language and preferred layout.
     *
     * @property id The ID of this subtype.
     * @property locale The locale of this subtype. Beware its different name in json: 'languageTag'.
     * @property currencySetName The currency set name of this subtype. Beware its different name in json: 'currencySet'.
     * @property preferred The preferred layout map for this subtype's locale.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Data class which represents a predefined set of language and preferred layout.
     *
     * @property id The ID of this subtype.
     * @property locale The locale of this subtype. Beware its different name in json: 'languageTag'.
     * @property currencySetName The currency set name of this subtype. Beware its different name in json: 'currencySet'.
     * @property preferred The preferred layout map for this subtype's locale.
     */
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.DefaultSubtype self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public DefaultSubtype(int id, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.common.FlorisLocale locale, @org.jetbrains.annotations.NotNull()
    java.lang.String composerName, @org.jetbrains.annotations.NotNull()
    java.lang.String currencySetName, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.SubtypeLayoutMap preferred) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.common.FlorisLocale component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.common.FlorisLocale getLocale() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "languageTag")
    @kotlinx.serialization.Serializable(with = keyboard.neon.newboard.common.FlorisLocale.Serializer.class)
    @java.lang.Deprecated()
    public static void getLocale$annotations() {
    }
    
    public final void setLocale(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.common.FlorisLocale p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getComposerName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "composer")
    @java.lang.Deprecated()
    public static void getComposerName$annotations() {
    }
    
    public final void setComposerName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrencySetName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "currencySet")
    @java.lang.Deprecated()
    public static void getCurrencySetName$annotations() {
    }
    
    public final void setCurrencySetName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.SubtypeLayoutMap component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.SubtypeLayoutMap getPreferred() {
        return null;
    }
    
    public final void setPreferred(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.SubtypeLayoutMap p0) {
    }
    
    /**
     * Data class which represents a predefined set of language and preferred layout.
     *
     * @property id The ID of this subtype.
     * @property locale The locale of this subtype. Beware its different name in json: 'languageTag'.
     * @property currencySetName The currency set name of this subtype. Beware its different name in json: 'currencySet'.
     * @property preferred The preferred layout map for this subtype's locale.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lkeyboard/neon/newboard/ime/core/DefaultSubtype$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkeyboard/neon/newboard/ime/core/DefaultSubtype;", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Data class which represents a predefined set of language and preferred layout.
         *
         * @property id The ID of this subtype.
         * @property locale The locale of this subtype. Beware its different name in json: 'languageTag'.
         * @property currencySetName The currency set name of this subtype. Beware its different name in json: 'currencySet'.
         * @property preferred The preferred layout map for this subtype's locale.
         */
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<keyboard.neon.newboard.ime.core.DefaultSubtype> serializer() {
            return null;
        }
    }
    
    /**
     * Data class which represents a predefined set of language and preferred layout.
     *
     * @property id The ID of this subtype.
     * @property locale The locale of this subtype. Beware its different name in json: 'languageTag'.
     * @property currencySetName The currency set name of this subtype. Beware its different name in json: 'currencySet'.
     * @property preferred The preferred layout map for this subtype's locale.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"keyboard/neon/newboard/ime/core/DefaultSubtype.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lkeyboard/neon/newboard/ime/core/DefaultSubtype;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "aosp_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<keyboard.neon.newboard.ime.core.DefaultSubtype> {
        
        /**
         * Data class which represents a predefined set of language and preferred layout.
         *
         * @property id The ID of this subtype.
         * @property locale The locale of this subtype. Beware its different name in json: 'languageTag'.
         * @property currencySetName The currency set name of this subtype. Beware its different name in json: 'currencySet'.
         * @property preferred The preferred layout map for this subtype's locale.
         */
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.core.DefaultSubtype.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        /**
         * Data class which represents a predefined set of language and preferred layout.
         *
         * @property id The ID of this subtype.
         * @property locale The locale of this subtype. Beware its different name in json: 'languageTag'.
         * @property currencySetName The currency set name of this subtype. Beware its different name in json: 'currencySet'.
         * @property preferred The preferred layout map for this subtype's locale.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        /**
         * Data class which represents a predefined set of language and preferred layout.
         *
         * @property id The ID of this subtype.
         * @property locale The locale of this subtype. Beware its different name in json: 'languageTag'.
         * @property currencySetName The currency set name of this subtype. Beware its different name in json: 'currencySet'.
         * @property preferred The preferred layout map for this subtype's locale.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public keyboard.neon.newboard.ime.core.DefaultSubtype deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        /**
         * Data class which represents a predefined set of language and preferred layout.
         *
         * @property id The ID of this subtype.
         * @property locale The locale of this subtype. Beware its different name in json: 'languageTag'.
         * @property currencySetName The currency set name of this subtype. Beware its different name in json: 'currencySet'.
         * @property preferred The preferred layout map for this subtype's locale.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        /**
         * Data class which represents a predefined set of language and preferred layout.
         *
         * @property id The ID of this subtype.
         * @property locale The locale of this subtype. Beware its different name in json: 'languageTag'.
         * @property currencySetName The currency set name of this subtype. Beware its different name in json: 'currencySet'.
         * @property preferred The preferred layout map for this subtype's locale.
         */
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.DefaultSubtype value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}