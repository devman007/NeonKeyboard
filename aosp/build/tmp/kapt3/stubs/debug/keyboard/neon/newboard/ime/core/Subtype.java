package keyboard.neon.newboard.ime.core;

import java.lang.System;

/**
 * Data class which represents an user-specified set of language and layout. String representations
 * of this object are stored as an array in the shared prefs.
 * @property id The ID of this subtype. Although this can be any numeric value, its value
 * typically matches the one of the [DefaultSubtype] with the same locale.
 * @property locale The locale this subtype is bound to.
 * @property composerName The composer name to composer characters the way they should.
 * @property currencySetName The currency set name to display the correct currency symbols for this subtype.
 * @property layoutMap The layout map to properly display the correct layout for each layout type.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\nH\u00c6\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0006\u0010 \u001a\u00020\u0007J\b\u0010!\u001a\u00020\u0007H\u0016R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006#"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Subtype;", "", "id", "", "locale", "Lkeyboard/neon/newboard/common/FlorisLocale;", "composerName", "", "currencySetName", "layoutMap", "Lkeyboard/neon/newboard/ime/core/SubtypeLayoutMap;", "(ILkeyboard/neon/newboard/common/FlorisLocale;Ljava/lang/String;Ljava/lang/String;Lkeyboard/neon/newboard/ime/core/SubtypeLayoutMap;)V", "_hashCode", "getComposerName", "()Ljava/lang/String;", "getCurrencySetName", "getId", "()I", "getLayoutMap", "()Lkeyboard/neon/newboard/ime/core/SubtypeLayoutMap;", "getLocale", "()Lkeyboard/neon/newboard/common/FlorisLocale;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toShortString", "toString", "Companion", "aosp_debug"})
public final class Subtype {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.common.FlorisLocale locale = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String composerName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currencySetName = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.SubtypeLayoutMap layoutMap = null;
    private final int _hashCode = 0;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.core.Subtype.Companion Companion = null;
    
    /**
     * Subtype to use when prefs do not contain any valid subtypes.
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.core.Subtype DEFAULT = null;
    
    /**
     * Data class which represents an user-specified set of language and layout. String representations
     * of this object are stored as an array in the shared prefs.
     * @property id The ID of this subtype. Although this can be any numeric value, its value
     * typically matches the one of the [DefaultSubtype] with the same locale.
     * @property locale The locale this subtype is bound to.
     * @property composerName The composer name to composer characters the way they should.
     * @property currencySetName The currency set name to display the correct currency symbols for this subtype.
     * @property layoutMap The layout map to properly display the correct layout for each layout type.
     */
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.Subtype copy(int id, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.common.FlorisLocale locale, @org.jetbrains.annotations.NotNull()
    java.lang.String composerName, @org.jetbrains.annotations.NotNull()
    java.lang.String currencySetName, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.SubtypeLayoutMap layoutMap) {
        return null;
    }
    
    public Subtype(int id, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.common.FlorisLocale locale, @org.jetbrains.annotations.NotNull()
    java.lang.String composerName, @org.jetbrains.annotations.NotNull()
    java.lang.String currencySetName, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.SubtypeLayoutMap layoutMap) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.common.FlorisLocale component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.common.FlorisLocale getLocale() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getComposerName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrencySetName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.SubtypeLayoutMap component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.SubtypeLayoutMap getLayoutMap() {
        return null;
    }
    
    /**
     * Converts this object into its string representation. Format:
     * <id>/<language_tag>/<composer_name>/<currency_set_name>/<layout_map>
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Converts this object into its short string representation, used for debugging. Format:
     * <id>/<language_tag>/<currency_set_name>
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toShortString() {
        return null;
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Subtype$Companion;", "", "()V", "DEFAULT", "Lkeyboard/neon/newboard/ime/core/Subtype;", "getDEFAULT", "()Lkeyboard/neon/newboard/ime/core/Subtype;", "font", "charsName", "", "fromString", "str", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.core.Subtype getDEFAULT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.core.Subtype font(@org.jetbrains.annotations.NotNull()
        java.lang.String charsName) {
            return null;
        }
        
        /**
         * Converts the string representation of this object to a [Subtype]. Must be in the
         * following format:
         * <id>/<language_code>/<currency_set_name>/c=<layout_name>
         * or
         * <id>/<language_tag>/<currency_set_name>/c=<layout_name>
         * Eg: 101/en_US/dollar/c=qwerty
         *    201/de-DE/euro/c=qwertz
         * If the given [str] does not match this format an [InvalidPropertiesFormatException]
         * will be thrown.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.core.Subtype fromString(@org.jetbrains.annotations.NotNull()
        java.lang.String str) {
            return null;
        }
    }
}