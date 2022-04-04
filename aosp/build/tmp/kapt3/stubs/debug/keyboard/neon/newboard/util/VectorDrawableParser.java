package keyboard.neon.newboard.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lkeyboard/neon/newboard/util/VectorDrawableParser;", "", "()V", "digitsOnly", "Lkotlin/text/Regex;", "getAttrPosition", "", "xml", "Lorg/xmlpull/v1/XmlPullParser;", "attrName", "", "parsedVectorDrawable", "Lkeyboard/neon/newboard/util/VectorDrawableParser$ParsedVectorDrawable;", "resources", "Landroid/content/res/Resources;", "drawable", "ParsedVectorDrawable", "aosp_debug"})
public final class VectorDrawableParser {
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.util.VectorDrawableParser INSTANCE = null;
    private static final kotlin.text.Regex digitsOnly = null;
    
    private VectorDrawableParser() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"ResourceType"})
    public final keyboard.neon.newboard.util.VectorDrawableParser.ParsedVectorDrawable parsedVectorDrawable(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources, @androidx.annotation.DrawableRes()
    int drawable) {
        return null;
    }
    
    private final int getAttrPosition(org.xmlpull.v1.XmlPullParser xml, java.lang.String attrName) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lkeyboard/neon/newboard/util/VectorDrawableParser$ParsedVectorDrawable;", "", "width", "", "height", "viewportWidth", "viewportHeight", "pathData", "", "(FFFFLjava/lang/String;)V", "getHeight", "()F", "getPathData", "()Ljava/lang/String;", "getViewportHeight", "getViewportWidth", "getWidth", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "aosp_debug"})
    public static final class ParsedVectorDrawable {
        private final float width = 0.0F;
        private final float height = 0.0F;
        private final float viewportWidth = 0.0F;
        private final float viewportHeight = 0.0F;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String pathData = null;
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.util.VectorDrawableParser.ParsedVectorDrawable copy(float width, float height, float viewportWidth, float viewportHeight, @org.jetbrains.annotations.NotNull()
        java.lang.String pathData) {
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
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ParsedVectorDrawable(float width, float height, float viewportWidth, float viewportHeight, @org.jetbrains.annotations.NotNull()
        java.lang.String pathData) {
            super();
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        public final float getWidth() {
            return 0.0F;
        }
        
        public final float component2() {
            return 0.0F;
        }
        
        public final float getHeight() {
            return 0.0F;
        }
        
        public final float component3() {
            return 0.0F;
        }
        
        public final float getViewportWidth() {
            return 0.0F;
        }
        
        public final float component4() {
            return 0.0F;
        }
        
        public final float getViewportHeight() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPathData() {
            return null;
        }
    }
}