package keyboard.neon.newboard.ime.theme;

import java.lang.System;

/**
 * Sealed class which allows for a field to have dynamic types, dependent on the configuration.
 * This class is a key component in providing a way to dynamically change the type of an attribute
 * while sealing this process within one class. Allows for easy addition of new theme types in the
 * future.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u0082\u0001\u0007\u0015\u0004\b\u0016\u0017\u0006\u0018\u00a8\u0006\u0019"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/ThemeValue;", "", "()V", "toDrawable", "Lkeyboard/neon/newboard/ime/theme/ThemeValue$Drawable;", "toOnOff", "Lkeyboard/neon/newboard/ime/theme/ThemeValue$OnOff;", "toSolidColor", "Lkeyboard/neon/newboard/ime/theme/ThemeValue$SolidColor;", "toSummaryString", "", "context", "Landroid/content/Context;", "Companion", "Drawable", "LinearGradient", "OnOff", "Other", "RadialGradient", "Reference", "SolidColor", "Lkeyboard/neon/newboard/ime/theme/ThemeValue$Reference;", "Lkeyboard/neon/newboard/ime/theme/ThemeValue$LinearGradient;", "Lkeyboard/neon/newboard/ime/theme/ThemeValue$RadialGradient;", "Lkeyboard/neon/newboard/ime/theme/ThemeValue$Other;", "aosp_debug"})
@kotlinx.serialization.Serializable(with = keyboard.neon.newboard.ime.theme.ThemeValueSerializer.class)
public abstract class ThemeValue {
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.theme.ThemeValue.Companion Companion = null;
    private static final kotlin.text.Regex REFERENCE_REGEX = null;
    private static final kotlin.text.Regex SOLID_COLOR_REGEX = null;
    private static final kotlin.text.Regex ON_OFF_REGEX = null;
    private static final kotlin.text.Regex STRING_REGEX = null;
    private static final kotlin.text.Regex DECIMAL_REGEX = null;
    
    /**
     * A map of the theme value type names and their corresponding UI strings.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.String, java.lang.Integer> UI_STRING_MAP = null;
    
    private ThemeValue() {
        super();
    }
    
    /**
     * Converts this theme value to a [SolidColor], regardless of this value's type. If the
     * conversion fails, a [SolidColor] with full transparency will be returned.
     */
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor toSolidColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.theme.ThemeValue.Drawable toDrawable() {
        return null;
    }
    
    /**
     * Converts this theme value to [OnOff], regardless of this value's type. If the
     * conversion fails, a [OnOff] with state false will be returned.
     */
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.theme.ThemeValue.OnOff toOnOff() {
        return null;
    }
    
    /**
     * Converts this theme value to a string representation which can be shown to the user.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toSummaryString(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * This holds a reference to another [ThemeValue] by specifying a group and attribute name.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/ThemeValue$Reference;", "Lkeyboard/neon/newboard/ime/theme/ThemeValue;", "group", "", "attr", "(Ljava/lang/String;Ljava/lang/String;)V", "getAttr", "()Ljava/lang/String;", "getGroup", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "aosp_debug"})
    public static final class Reference extends keyboard.neon.newboard.ime.theme.ThemeValue {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String group = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String attr = null;
        
        /**
         * This holds a reference to another [ThemeValue] by specifying a group and attribute name.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference copy(@org.jetbrains.annotations.NotNull()
        java.lang.String group, @org.jetbrains.annotations.NotNull()
        java.lang.String attr) {
            return null;
        }
        
        /**
         * This holds a reference to another [ThemeValue] by specifying a group and attribute name.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * This holds a reference to another [ThemeValue] by specifying a group and attribute name.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        public Reference(@org.jetbrains.annotations.NotNull()
        java.lang.String group, @org.jetbrains.annotations.NotNull()
        java.lang.String attr) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGroup() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAttr() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/ThemeValue$Drawable;", "Lkeyboard/neon/newboard/ime/theme/ThemeValue;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "getDrawableId", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "hashCode", "", "toString", "aosp_debug"})
    public static final class Drawable extends keyboard.neon.newboard.ime.theme.ThemeValue {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.theme.ThemeValue.Drawable copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
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
        
        public Drawable(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.graphics.drawable.Drawable getDrawableId(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * This holds a solid color as a color int.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\tJ\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/ThemeValue$SolidColor;", "Lkeyboard/neon/newboard/ime/theme/ThemeValue;", "color", "", "(I)V", "getColor", "()I", "complimentaryTextColor", "isAlt", "", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "Companion", "aosp_debug"})
    public static final class SolidColor extends keyboard.neon.newboard.ime.theme.ThemeValue {
        private final int color = 0;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor TRANSPARENT = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor BLACK = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor WHITE = null;
        
        /**
         * This holds a solid color as a color int.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor copy(@androidx.annotation.ColorInt()
        int color) {
            return null;
        }
        
        /**
         * This holds a solid color as a color int.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * This holds a solid color as a color int.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        public SolidColor(@androidx.annotation.ColorInt()
        int color) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getColor() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor complimentaryTextColor(boolean isAlt) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/ThemeValue$SolidColor$Companion;", "", "()V", "BLACK", "Lkeyboard/neon/newboard/ime/theme/ThemeValue$SolidColor;", "getBLACK", "()Lkeyboard/neon/newboard/ime/theme/ThemeValue$SolidColor;", "TRANSPARENT", "getTRANSPARENT", "WHITE", "getWHITE", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor getTRANSPARENT() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor getBLACK() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor getWHITE() {
                return null;
            }
        }
    }
    
    /**
     * This holds a linear gradient. Currently NYI.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/ThemeValue$LinearGradient;", "Lkeyboard/neon/newboard/ime/theme/ThemeValue;", "dummy", "", "(I)V", "getDummy", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "aosp_debug"})
    public static final class LinearGradient extends keyboard.neon.newboard.ime.theme.ThemeValue {
        private final int dummy = 0;
        
        /**
         * This holds a linear gradient. Currently NYI.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.theme.ThemeValue.LinearGradient copy(int dummy) {
            return null;
        }
        
        /**
         * This holds a linear gradient. Currently NYI.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * This holds a linear gradient. Currently NYI.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        public LinearGradient(int dummy) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getDummy() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * This holds a radial gradient. Currently NYI.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/ThemeValue$RadialGradient;", "Lkeyboard/neon/newboard/ime/theme/ThemeValue;", "dummy", "", "(I)V", "getDummy", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "aosp_debug"})
    public static final class RadialGradient extends keyboard.neon.newboard.ime.theme.ThemeValue {
        private final int dummy = 0;
        
        /**
         * This holds a radial gradient. Currently NYI.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.theme.ThemeValue.RadialGradient copy(int dummy) {
            return null;
        }
        
        /**
         * This holds a radial gradient. Currently NYI.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * This holds a radial gradient. Currently NYI.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        public RadialGradient(int dummy) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getDummy() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * This holds a boolean state variable.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/ThemeValue$OnOff;", "Lkeyboard/neon/newboard/ime/theme/ThemeValue;", "state", "", "(Z)V", "getState", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "aosp_debug"})
    public static final class OnOff extends keyboard.neon.newboard.ime.theme.ThemeValue {
        private final boolean state = false;
        
        /**
         * This holds a boolean state variable.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.theme.ThemeValue.OnOff copy(boolean state) {
            return null;
        }
        
        /**
         * This holds a boolean state variable.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * This holds a boolean state variable.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        public OnOff(boolean state) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean getState() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * This holds a value as a string. Often used as a fallback when the input text does not match
     * any other theme value type.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/ThemeValue$Other;", "Lkeyboard/neon/newboard/ime/theme/ThemeValue;", "rawValue", "", "(Ljava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "aosp_debug"})
    public static final class Other extends keyboard.neon.newboard.ime.theme.ThemeValue {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String rawValue = null;
        
        /**
         * This holds a value as a string. Often used as a fallback when the input text does not match
         * any other theme value type.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.theme.ThemeValue.Other copy(@org.jetbrains.annotations.NotNull()
        java.lang.String rawValue) {
            return null;
        }
        
        /**
         * This holds a value as a string. Often used as a fallback when the input text does not match
         * any other theme value type.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * This holds a value as a string. Often used as a fallback when the input text does not match
         * any other theme value type.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        public Other(@org.jetbrains.annotations.NotNull()
        java.lang.String rawValue) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRawValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u00c6\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/ThemeValue$Companion;", "", "()V", "DECIMAL_REGEX", "Lkotlin/text/Regex;", "ON_OFF_REGEX", "REFERENCE_REGEX", "SOLID_COLOR_REGEX", "STRING_REGEX", "UI_STRING_MAP", "", "", "", "getUI_STRING_MAP", "()Ljava/util/Map;", "fromString", "Lkeyboard/neon/newboard/ime/theme/ThemeValue;", "str", "serializer", "Lkotlinx/serialization/KSerializer;", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<keyboard.neon.newboard.ime.theme.ThemeValue> serializer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.Integer> getUI_STRING_MAP() {
            return null;
        }
        
        /**
         * Generates a [ThemeValue] from a given [str]. Returns [Other] if no matches are found.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.theme.ThemeValue fromString(@org.jetbrains.annotations.NotNull()
        java.lang.String str) {
            return null;
        }
    }
}