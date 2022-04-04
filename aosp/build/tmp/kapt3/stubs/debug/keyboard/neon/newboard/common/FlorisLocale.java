package keyboard.neon.newboard.common;

import java.lang.System;

/**
 * Project-specific locale class wrapping [java.util.Locale]. The wrapping is
 * necessary to provide consistent language display names and tags across the
 * whole code base.
 *
 * This class would be ideal for Kotlin's value classes, though AndroidX.Room
 * does not like this at all, so this is a "normal" class.
 *
 * To construct a FlorisLocale, use one of the many from() methods provided.
 *
 * @see java.util.Locale
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002#$B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0000J\u0010\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0000J\u0010\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0000J\u0010\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0000J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0006\u0010 \u001a\u00020\bJ\u0006\u0010!\u001a\u00020\bJ\b\u0010\"\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\n\u00a8\u0006%"}, d2 = {"Lkeyboard/neon/newboard/common/FlorisLocale;", "", "base", "Ljava/util/Locale;", "(Ljava/util/Locale;)V", "getBase", "()Ljava/util/Locale;", "country", "", "getCountry", "()Ljava/lang/String;", "iso3Country", "getIso3Country", "iso3Language", "getIso3Language", "language", "getLanguage", "variant", "getVariant", "buildLocaleString", "delimiter", "", "displayCountry", "locale", "displayLanguage", "displayName", "displayVariant", "equals", "", "other", "hashCode", "", "languageTag", "localeTag", "toString", "Companion", "Serializer", "aosp_debug"})
@kotlinx.serialization.Serializable(with = keyboard.neon.newboard.common.FlorisLocale.Serializer.class)
public final class FlorisLocale {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Locale base = null;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.common.FlorisLocale.Companion Companion = null;
    
    /**
     * Delimiter for a language tag.
     */
    private static final char DELIMITER_LANGUAGE_TAG = '-';
    
    /**
     * Delimiter for a locale tag.
     */
    private static final char DELIMITER_LOCALE_TAG = '_';
    
    /**
     * Delimiter regex to split language/locale tags.
     */
    private static final kotlin.text.Regex DELIMITER_SPLITTER = null;
    
    /**
     * Constant locale for ROOT
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.common.FlorisLocale ROOT = null;
    
    /**
     * Constant locale for ENGLISH
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.common.FlorisLocale ENGLISH = null;
    
    private FlorisLocale(java.util.Locale base) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Locale getBase() {
        return null;
    }
    
    /**
     * Builds a locale or language tag for this locale by using [delimiter].
     *
     * @param delimiter The delimiter to use between the components.
     *
     * @return The generated tag for this locale. May be an empty string if
     * [language], [country] and [variant] are not specified.
     */
    private final java.lang.String buildLocaleString(char delimiter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVariant() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIso3Language() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIso3Country() {
        return null;
    }
    
    /**
     * Generates the language tag for this locale in the format `xx`,
     * `xx-YY` or `xx-YY-zzz` and returns it as a string.
     *
     * xx: Two-letter language code
     * YY: Two-letter country code
     * zzz: Three letter variant
     *
     * @return The language tag for this locale. May be an empty string if
     * [language], [country] and [variant] are not specified.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String languageTag() {
        return null;
    }
    
    /**
     * Generates the locale tag for this locale in the format `xx`,
     * `xx_YY` or `xx_YY_zzz` and returns it as a string.
     *
     * xx: Two-letter language code
     * YY: Two-letter country code
     * zzz: Three letter variant
     *
     * @return The locale tag for this locale. May be an empty string if
     * [language], [country] and [variant] are not specified.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String localeTag() {
        return null;
    }
    
    /**
     * Returns the name of this locale's language, localized to [locale].
     *
     * @see java.util.Locale.getDisplayLanguage
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String displayLanguage(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.common.FlorisLocale locale) {
        return null;
    }
    
    /**
     * Returns the name of this locale's country, localized to [locale].
     *
     * @see java.util.Locale.getDisplayCountry
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String displayCountry(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.common.FlorisLocale locale) {
        return null;
    }
    
    /**
     * Returns a name for the locale's variant code that is appropriate for
     * display to the user.
     *
     * @see java.util.Locale.getDisplayVariant
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String displayVariant(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.common.FlorisLocale locale) {
        return null;
    }
    
    /**
     * Returns the display name for this locale, localized to [locale] in
     * the format `Language`, `Language (Country)` or `Language (Country) \[VARIANT]`.
     *
     * @param locale The locale to use for generating the display name for
     * this locale, or [default] if otherwise.
     *
     * @return The display name for this locale. May be an empty string if
     * [language], [country] and [variant] are not specified.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String displayName(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.common.FlorisLocale locale) {
        return null;
    }
    
    /**
     * Generate a debug string representing this locale. Not to be confused
     * with [java.util.Locale.toString], which produces a locale tag. If such
     * tag is needed, use [localeTag].
     *
     * @return The debug representation of this locale.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Equality check for this locale.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Returns the hash code for this locale.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * The JSON (de)serializer for FlorisLocale.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lkeyboard/neon/newboard/common/FlorisLocale$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lkeyboard/neon/newboard/common/FlorisLocale;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "aosp_debug"})
    public static final class Serializer implements kotlinx.serialization.KSerializer<keyboard.neon.newboard.common.FlorisLocale> {
        @org.jetbrains.annotations.NotNull()
        private final kotlinx.serialization.descriptors.SerialDescriptor descriptor = null;
        
        public Serializer() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.common.FlorisLocale value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public keyboard.neon.newboard.common.FlorisLocale deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u001e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0013J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H\u00c6\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lkeyboard/neon/newboard/common/FlorisLocale$Companion;", "", "()V", "DELIMITER_LANGUAGE_TAG", "", "DELIMITER_LOCALE_TAG", "DELIMITER_SPLITTER", "Lkotlin/text/Regex;", "ENGLISH", "Lkeyboard/neon/newboard/common/FlorisLocale;", "getENGLISH", "()Lkeyboard/neon/newboard/common/FlorisLocale;", "ROOT", "getROOT", "default", "from", "javaLocale", "Ljava/util/Locale;", "language", "", "country", "variant", "fromTag", "str", "serializer", "Lkotlinx/serialization/KSerializer;", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<keyboard.neon.newboard.common.FlorisLocale> serializer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.common.FlorisLocale getROOT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.common.FlorisLocale getENGLISH() {
            return null;
        }
        
        /**
         * Wraps a [java.util.Locale] and returns the [FlorisLocale].
         *
         * @return The wrapped locale.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.common.FlorisLocale from(@org.jetbrains.annotations.NotNull()
        java.util.Locale javaLocale) {
            return null;
        }
        
        /**
         * Constructs a new [FlorisLocale] with given [language].
         *
         * @param language A two-letter language code.
         *
         * @return A new [FlorisLocale].
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.common.FlorisLocale from(@org.jetbrains.annotations.NotNull()
        java.lang.String language) {
            return null;
        }
        
        /**
         * Constructs a new [FlorisLocale] with given [language] and [country].
         *
         * @param language A two-letter language code.
         * @param country A two-letter country code.
         *
         * @return A new [FlorisLocale].
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.common.FlorisLocale from(@org.jetbrains.annotations.NotNull()
        java.lang.String language, @org.jetbrains.annotations.NotNull()
        java.lang.String country) {
            return null;
        }
        
        /**
         * Constructs a new [FlorisLocale] with given [language], [country] and [variant].
         *
         * @param language A two-letter language code.
         * @param country A two-letter country code.
         * @param variant A two-letter variant code.
         *
         * @return A new [FlorisLocale].
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.common.FlorisLocale from(@org.jetbrains.annotations.NotNull()
        java.lang.String language, @org.jetbrains.annotations.NotNull()
        java.lang.String country, @org.jetbrains.annotations.NotNull()
        java.lang.String variant) {
            return null;
        }
        
        /**
         * Constructs a new [FlorisLocale] from given [str].
         *
         * @param str Either a language or locale tag in string form.
         *
         * @return A new [FlorisLocale].
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.common.FlorisLocale fromTag(@org.jetbrains.annotations.NotNull()
        java.lang.String str) {
            return null;
        }
    }
}