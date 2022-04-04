package keyboard.neon.newboard.ime.keyboard;

import java.lang.System;

/**
 * Abstract class describing the smallest computed unit in a computed keyboard. Each key represents exactly one key
 * displayed in the UI. It allows to save the absolute location within the parent keyboard, save touch and visual
 * bounds, managing the state (enabled, pressed, visibility) as well as layout sizing factors. Each key in this IME
 * inherits from this base key class. This allows for a inter-operable usage of a key without knowing the exact
 * subclass upfront.
 *
 * @property data The base key data this key represents.This can be anything - from a basic text key to an emoji key
 * to a complex selector.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020!X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001a\u0010\'\u001a\u00020!X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\"\"\u0004\b(\u0010$R\u001c\u0010)\u001a\u0004\u0018\u00010\u001bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u0014\u0010,\u001a\u00020-X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u00020-X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010/R\u0014\u00102\u001a\u00020-X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0014\u00104\u001a\u00020-X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010/\u00a8\u00066"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/Key;", "", "data", "Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "(Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;)V", "getData", "()Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "flayGrow", "", "getFlayGrow", "()D", "setFlayGrow", "(D)V", "flayShrink", "getFlayShrink", "setFlayShrink", "flayWidthFactor", "getFlayWidthFactor", "setFlayWidthFactor", "foregroundDrawableId", "", "getForegroundDrawableId", "()Ljava/lang/Integer;", "setForegroundDrawableId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "hintedLabel", "", "getHintedLabel", "()Ljava/lang/String;", "setHintedLabel", "(Ljava/lang/String;)V", "isEnabled", "", "()Z", "setEnabled", "(Z)V", "isPressed", "setPressed", "isVisible", "setVisible", "label", "getLabel", "setLabel", "touchBounds", "Landroid/graphics/Rect;", "getTouchBounds", "()Landroid/graphics/Rect;", "visibleBounds", "getVisibleBounds", "visibleDrawableBounds", "getVisibleDrawableBounds", "visibleLabelBounds", "getVisibleLabelBounds", "aosp_debug"})
public abstract class Key {
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.keyboard.AbstractKeyData data = null;
    
    /**
     * Specifies whether this key is enabled or not.
     */
    private boolean isEnabled = true;
    
    /**
     * Specifies whether this key is actively pressed or not. Is used by the parent keyboard view to draw the key
     * differently to indicate this state.
     */
    private boolean isPressed = false;
    
    /**
     * Specifies whether this key is visible or not. Is used by the parent keyboard view to omit this key in the
     * layout and drawing process. A `false`-value is equivalent to `VISIBILITY_GONE` on Android's View class.
     */
    private boolean isVisible = true;
    
    /**
     * The touch bounds of this key. All bounds defined here are absolute coordinates within the parent keyboard.
     */
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Rect touchBounds = null;
    
    /**
     * The visible bounds of this key. All bounds defined here are absolute coordinates within the parent keyboard.
     */
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Rect visibleBounds = null;
    
    /**
     * The visible drawable bounds of this key. All bounds defined here are absolute coordinates within the parent
     * keyboard.
     */
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Rect visibleDrawableBounds = null;
    
    /**
     * The visible label bounds of this key. All bounds defined here are absolute coordinates within the parent
     * keyboard.
     */
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Rect visibleLabelBounds = null;
    
    /**
     * Specifies how much this key is willing to shrink if too many keys are in a keyboard row. A value of 0.0
     * indicates that the key does not want to shrink in such scenario. This value should not be set manually, only
     * by the key's compute method and is used in the layout process to determine the real key width.
     */
    private double flayShrink = 0.0;
    
    /**
     * Specifies how much this key is willing to grow if too few keys are in a keyboard row. A value of 0.0
     * indicates that the key does not want to grow in such scenario. This value should not be set manually, only
     * by the key's compute method and is used in the layout process to determine the real key width.
     */
    private double flayGrow = 0.0;
    
    /**
     * Specifies the relative proportional width this key aims to get in respective to the keyboard view's desired key
     * width. A value of 1.0 indicates that the key wants to be exactly as wide as the desired key width, a value of
     * 0.0 is basically equivalent to setting [isVisible] to false. This value should not be set manually, only
     * by the key's compute method and is used in the layout process to determine the real key width.
     */
    private double flayWidthFactor = 0.0;
    
    /**
     * The computed UI label of this key. This value is used by the keyboard view to temporarily save the label string
     * for UI rendering and should not be set manually.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String label;
    
    /**
     * The computed UI hint label of this key. This value is used by the keyboard view to temporarily save the hint
     * label string for UI rendering and should not be set manually.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hintedLabel;
    
    /**
     * The computed UI drawable ID of this key. This value is used by the keyboard view to temporarily save the
     * drawable ID for UI rendering and should not be set manually.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer foregroundDrawableId;
    
    public Key(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.AbstractKeyData data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public keyboard.neon.newboard.ime.keyboard.AbstractKeyData getData() {
        return null;
    }
    
    public boolean isEnabled() {
        return false;
    }
    
    public void setEnabled(boolean p0) {
    }
    
    public boolean isPressed() {
        return false;
    }
    
    public void setPressed(boolean p0) {
    }
    
    public boolean isVisible() {
        return false;
    }
    
    public void setVisible(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.graphics.Rect getTouchBounds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.graphics.Rect getVisibleBounds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.graphics.Rect getVisibleDrawableBounds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.graphics.Rect getVisibleLabelBounds() {
        return null;
    }
    
    public double getFlayShrink() {
        return 0.0;
    }
    
    public void setFlayShrink(double p0) {
    }
    
    public double getFlayGrow() {
        return 0.0;
    }
    
    public void setFlayGrow(double p0) {
    }
    
    public double getFlayWidthFactor() {
        return 0.0;
    }
    
    public void setFlayWidthFactor(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getLabel() {
        return null;
    }
    
    public void setLabel(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getHintedLabel() {
        return null;
    }
    
    public void setHintedLabel(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer getForegroundDrawableId() {
        return null;
    }
    
    public void setForegroundDrawableId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
}