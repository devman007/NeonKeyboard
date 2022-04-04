package keyboard.neon.newboard.ime.popup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0002*+B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0006\u0010 \u001a\u00020\u001cJ\b\u0010!\u001a\u00020\u001cH\u0014J\b\u0010\"\u001a\u00020\u001cH\u0014J\u0012\u0010#\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020(H\u0016J\u0016\u0010)\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lkeyboard/neon/newboard/ime/popup/PopupExtendedView;", "Landroid/view/View;", "Lkeyboard/neon/newboard/ime/theme/ThemeManager$OnThemeUpdatedListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "activeBackgroundDrawable", "Landroid/graphics/drawable/PaintDrawable;", "backgroundDrawable", "isShowing", "", "()Z", "labelPaint", "Landroid/graphics/Paint;", "properties", "Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Properties;", "getProperties", "()Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Properties;", "themeManager", "Lkeyboard/neon/newboard/ime/theme/ThemeManager;", "tldPaint", "applyProperties", "", "keyboardView", "anchor", "Lkeyboard/neon/newboard/ime/keyboard/Key;", "hide", "onAttachedToWindow", "onDetachedFromWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onThemeUpdated", "theme", "Lkeyboard/neon/newboard/ime/theme/Theme;", "show", "Element", "Properties", "aosp_debug"})
public final class PopupExtendedView extends android.view.View implements keyboard.neon.newboard.ime.theme.ThemeManager.OnThemeUpdatedListener {
    private final keyboard.neon.newboard.ime.theme.ThemeManager themeManager = null;
    private final android.graphics.drawable.PaintDrawable activeBackgroundDrawable = null;
    private android.graphics.drawable.PaintDrawable backgroundDrawable;
    private final android.graphics.Paint labelPaint = null;
    private final android.graphics.Paint tldPaint = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.popup.PopupExtendedView.Properties properties = null;
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.popup.PopupExtendedView.Properties getProperties() {
        return null;
    }
    
    public final boolean isShowing() {
        return false;
    }
    
    public PopupExtendedView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public PopupExtendedView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public PopupExtendedView(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\tH\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\rH\u00c6\u0003Je\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0012\u00101\u001a\u0004\u0018\u00010\n2\b\b\u0002\u00102\u001a\u00020\u0003J\t\u00103\u001a\u00020\u0003H\u00d6\u0001J\t\u00104\u001a\u000205H\u00d6\u0001R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012\u00a8\u00066"}, d2 = {"Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Properties;", "", "width", "", "height", "xOffset", "yOffset", "gravity", "elements", "", "Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Element;", "activeElementIndex", "labelTextSize", "", "(IIIIILjava/util/List;IF)V", "getActiveElementIndex", "()I", "setActiveElementIndex", "(I)V", "getElements", "()Ljava/util/List;", "setElements", "(Ljava/util/List;)V", "getGravity", "setGravity", "getHeight", "setHeight", "getLabelTextSize", "()F", "setLabelTextSize", "(F)V", "getWidth", "setWidth", "getXOffset", "setXOffset", "getYOffset", "setYOffset", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "getElementOrNull", "index", "hashCode", "toString", "", "aosp_debug"})
    public static final class Properties {
        private int width;
        private int height;
        private int xOffset;
        private int yOffset;
        private int gravity;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<java.util.List<keyboard.neon.newboard.ime.popup.PopupExtendedView.Element>> elements;
        private int activeElementIndex;
        private float labelTextSize;
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.popup.PopupExtendedView.Properties copy(int width, int height, int xOffset, int yOffset, int gravity, @org.jetbrains.annotations.NotNull()
        java.util.List<java.util.List<keyboard.neon.newboard.ime.popup.PopupExtendedView.Element>> elements, int activeElementIndex, float labelTextSize) {
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
        
        public Properties(int width, int height, int xOffset, int yOffset, int gravity, @org.jetbrains.annotations.NotNull()
        java.util.List<java.util.List<keyboard.neon.newboard.ime.popup.PopupExtendedView.Element>> elements, int activeElementIndex, float labelTextSize) {
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
        
        public final int component5() {
            return 0;
        }
        
        public final int getGravity() {
            return 0;
        }
        
        public final void setGravity(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.util.List<keyboard.neon.newboard.ime.popup.PopupExtendedView.Element>> component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.util.List<keyboard.neon.newboard.ime.popup.PopupExtendedView.Element>> getElements() {
            return null;
        }
        
        public final void setElements(@org.jetbrains.annotations.NotNull()
        java.util.List<java.util.List<keyboard.neon.newboard.ime.popup.PopupExtendedView.Element>> p0) {
        }
        
        public final int component7() {
            return 0;
        }
        
        public final int getActiveElementIndex() {
            return 0;
        }
        
        public final void setActiveElementIndex(int p0) {
        }
        
        public final float component8() {
            return 0.0F;
        }
        
        public final float getLabelTextSize() {
            return 0.0F;
        }
        
        public final void setLabelTextSize(float p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final keyboard.neon.newboard.ime.popup.PopupExtendedView.Element getElementOrNull(int index) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Element;", "", "adjustedIndex", "", "(I)V", "getAdjustedIndex", "()I", "Icon", "Label", "Tld", "Undefined", "Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Element$Label;", "Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Element$Tld;", "Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Element$Icon;", "Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Element$Undefined;", "aosp_debug"})
    public static abstract class Element {
        private final int adjustedIndex = 0;
        
        private Element(int adjustedIndex) {
            super();
        }
        
        public final int getAdjustedIndex() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Element$Label;", "Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Element;", "label", "", "adjustedIndex", "", "(Ljava/lang/String;I)V", "getLabel", "()Ljava/lang/String;", "aosp_debug"})
        public static final class Label extends keyboard.neon.newboard.ime.popup.PopupExtendedView.Element {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String label = null;
            
            public Label(@org.jetbrains.annotations.NotNull()
            java.lang.String label, int adjustedIndex) {
                super(0);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getLabel() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Element$Tld;", "Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Element;", "tld", "", "adjustedIndex", "", "(Ljava/lang/String;I)V", "getTld", "()Ljava/lang/String;", "aosp_debug"})
        public static final class Tld extends keyboard.neon.newboard.ime.popup.PopupExtendedView.Element {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String tld = null;
            
            public Tld(@org.jetbrains.annotations.NotNull()
            java.lang.String tld, int adjustedIndex) {
                super(0);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTld() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Element$Icon;", "Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Element;", "icon", "Landroid/graphics/drawable/Drawable;", "adjustedIndex", "", "(Landroid/graphics/drawable/Drawable;I)V", "getIcon", "()Landroid/graphics/drawable/Drawable;", "aosp_debug"})
        public static final class Icon extends keyboard.neon.newboard.ime.popup.PopupExtendedView.Element {
            @org.jetbrains.annotations.NotNull()
            private final android.graphics.drawable.Drawable icon = null;
            
            public Icon(@org.jetbrains.annotations.NotNull()
            android.graphics.drawable.Drawable icon, int adjustedIndex) {
                super(0);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.graphics.drawable.Drawable getIcon() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Element$Undefined;", "Lkeyboard/neon/newboard/ime/popup/PopupExtendedView$Element;", "()V", "aosp_debug"})
        public static final class Undefined extends keyboard.neon.newboard.ime.popup.PopupExtendedView.Element {
            @org.jetbrains.annotations.NotNull()
            public static final keyboard.neon.newboard.ime.popup.PopupExtendedView.Element.Undefined INSTANCE = null;
            
            private Undefined() {
                super(0);
            }
        }
    }
}