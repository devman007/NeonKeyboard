package keyboard.neon.newboard.ime.popup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001*B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0006\u0010 \u001a\u00020\u001cJ\b\u0010!\u001a\u00020\u001cH\u0014J\b\u0010\"\u001a\u00020\u001cH\u0014J\u0012\u0010#\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020(H\u0016J\u0016\u0010)\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lkeyboard/neon/newboard/ime/popup/PopupView;", "Landroid/view/View;", "Lkeyboard/neon/newboard/ime/theme/ThemeManager$OnThemeUpdatedListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backgroundDrawable", "Landroid/graphics/drawable/PaintDrawable;", "isShowing", "", "()Z", "labelPaint", "Landroid/graphics/Paint;", "properties", "Lkeyboard/neon/newboard/ime/popup/PopupView$Properties;", "getProperties", "()Lkeyboard/neon/newboard/ime/popup/PopupView$Properties;", "themeManager", "Lkeyboard/neon/newboard/ime/theme/ThemeManager;", "threeDotsDrawable", "Landroid/graphics/drawable/Drawable;", "applyProperties", "", "keyboardView", "anchor", "Lkeyboard/neon/newboard/ime/keyboard/Key;", "hide", "onAttachedToWindow", "onDetachedFromWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onThemeUpdated", "theme", "Lkeyboard/neon/newboard/ime/theme/Theme;", "show", "Properties", "aosp_debug"})
public final class PopupView extends android.view.View implements keyboard.neon.newboard.ime.theme.ThemeManager.OnThemeUpdatedListener {
    private final keyboard.neon.newboard.ime.theme.ThemeManager themeManager = null;
    private android.graphics.drawable.PaintDrawable backgroundDrawable;
    private final android.graphics.Paint labelPaint = null;
    private final android.graphics.drawable.Drawable threeDotsDrawable = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.popup.PopupView.Properties properties = null;
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.popup.PopupView.Properties getProperties() {
        return null;
    }
    
    public final boolean isShowing() {
        return false;
    }
    
    public PopupView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public PopupView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public PopupView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override()
    public void onThemeUpdated(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.theme.Theme theme) {
    }
    
    private final void applyProperties(android.view.View keyboardView, keyboard.neon.newboard.ime.keyboard.Key anchor) {
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    android.view.View keyboardView, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.Key anchor) {
    }
    
    public final void hide() {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\'\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\bH\u00c6\u0003J\t\u0010,\u001a\u00020\nH\u00c6\u0003J\t\u0010-\u001a\u00020\bH\u00c6\u0003J\t\u0010.\u001a\u00020\rH\u00c6\u0003JY\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u00100\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u0003H\u00d6\u0001J\t\u00103\u001a\u00020\nH\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012\u00a8\u00064"}, d2 = {"Lkeyboard/neon/newboard/ime/popup/PopupView$Properties;", "", "width", "", "height", "xOffset", "yOffset", "innerLabelFactor", "", "label", "", "labelTextSize", "shouldIndicateExtendedPopups", "", "(IIIIFLjava/lang/String;FZ)V", "getHeight", "()I", "setHeight", "(I)V", "getInnerLabelFactor", "()F", "setInnerLabelFactor", "(F)V", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "getLabelTextSize", "setLabelTextSize", "getShouldIndicateExtendedPopups", "()Z", "setShouldIndicateExtendedPopups", "(Z)V", "getWidth", "setWidth", "getXOffset", "setXOffset", "getYOffset", "setYOffset", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "aosp_debug"})
    public static final class Properties {
        private int width;
        private int height;
        private int xOffset;
        private int yOffset;
        private float innerLabelFactor;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String label;
        private float labelTextSize;
        private boolean shouldIndicateExtendedPopups;
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.popup.PopupView.Properties copy(int width, int height, int xOffset, int yOffset, float innerLabelFactor, @org.jetbrains.annotations.NotNull()
        java.lang.String label, float labelTextSize, boolean shouldIndicateExtendedPopups) {
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
        
        public Properties(int width, int height, int xOffset, int yOffset, float innerLabelFactor, @org.jetbrains.annotations.NotNull()
        java.lang.String label, float labelTextSize, boolean shouldIndicateExtendedPopups) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getWidth() {
            return 0;
        }
        
        public final void setWidth(int p0) {
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getHeight() {
            return 0;
        }
        
        public final void setHeight(int p0) {
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getXOffset() {
            return 0;
        }
        
        public final void setXOffset(int p0) {
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int getYOffset() {
            return 0;
        }
        
        public final void setYOffset(int p0) {
        }
        
        public final float component5() {
            return 0.0F;
        }
        
        public final float getInnerLabelFactor() {
            return 0.0F;
        }
        
        public final void setInnerLabelFactor(float p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLabel() {
            return null;
        }
        
        public final void setLabel(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final float component7() {
            return 0.0F;
        }
        
        public final float getLabelTextSize() {
            return 0.0F;
        }
        
        public final void setLabelTextSize(float p0) {
        }
        
        public final boolean component8() {
            return false;
        }
        
        public final boolean getShouldIndicateExtendedPopups() {
            return false;
        }
        
        public final void setShouldIndicateExtendedPopups(boolean p0) {
        }
    }
}