package keyboard.neon.newboard.ime.text.keyboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\u0012\u00101\u001a\u00020\"2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0018\u00104\u001a\u00020.2\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\tH\u0014J\u0012\u00107\u001a\u00020\"2\b\u00102\u001a\u0004\u0018\u000103H\u0017R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u00068"}, d2 = {"Lkeyboard/neon/newboard/ime/text/keyboard/TextKeyView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bgDrawable", "Landroid/graphics/drawable/PaintDrawable;", "getBgDrawable", "()Landroid/graphics/drawable/PaintDrawable;", "borderPaint", "Landroid/graphics/Paint;", "getBorderPaint", "()Landroid/graphics/Paint;", "hintedLabelPaint", "getHintedLabelPaint", "key", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKey;", "getKey", "()Lkeyboard/neon/newboard/ime/text/keyboard/TextKey;", "setKey", "(Lkeyboard/neon/newboard/ime/text/keyboard/TextKey;)V", "labelPaint", "getLabelPaint", "parentKeyboardView", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKeyboardView;", "getParentKeyboardView", "()Lkeyboard/neon/newboard/ime/text/keyboard/TextKeyboardView;", "shouldShowBorder", "", "getShouldShowBorder", "()Z", "setShouldShowBorder", "(Z)V", "strokeRadius", "", "getStrokeRadius", "()F", "setStrokeRadius", "(F)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onHoverEvent", "event", "Landroid/view/MotionEvent;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "aosp_debug"})
public final class TextKeyView extends android.view.View {
    @org.jetbrains.annotations.Nullable()
    private keyboard.neon.newboard.ime.text.keyboard.TextKey key;
    private float strokeRadius = 6.0F;
    private boolean shouldShowBorder = true;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.drawable.PaintDrawable bgDrawable = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint labelPaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint hintedLabelPaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint borderPaint = null;
    
    private final keyboard.neon.newboard.ime.text.keyboard.TextKeyboardView getParentKeyboardView() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.text.keyboard.TextKey getKey() {
        return null;
    }
    
    public final void setKey(@org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.text.keyboard.TextKey p0) {
    }
    
    public final float getStrokeRadius() {
        return 0.0F;
    }
    
    public final void setStrokeRadius(float p0) {
    }
    
    public final boolean getShouldShowBorder() {
        return false;
    }
    
    public final void setShouldShowBorder(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.PaintDrawable getBgDrawable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Paint getLabelPaint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Paint getHintedLabelPaint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Paint getBorderPaint() {
        return null;
    }
    
    public TextKeyView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public TextKeyView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public TextKeyView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onHoverEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
}