package keyboard.neon.newboard.ime.core;

import java.lang.System;

/**
 * Root view of the keyboard.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010/\u001a\u00020\u0015H\u0002J\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0014J\u0018\u00104\u001a\u0002012\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\tH\u0014R\u001e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0015@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0015@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u001e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0015@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0015@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020 8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0015@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\u00020(8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010*R\u001e\u0010,\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020+@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.\u00a8\u00067"}, d2 = {"Lkeyboard/neon/newboard/ime/core/InputView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "desiredInlineSuggestionsMaxHeight", "getDesiredInlineSuggestionsMaxHeight", "()I", "desiredInlineSuggestionsMaxWidth", "getDesiredInlineSuggestionsMaxWidth", "desiredInlineSuggestionsMinHeight", "getDesiredInlineSuggestionsMinHeight", "desiredInlineSuggestionsMinWidth", "getDesiredInlineSuggestionsMinWidth", "", "desiredInputViewHeight", "getDesiredInputViewHeight", "()F", "desiredMediaKeyboardViewHeight", "getDesiredMediaKeyboardViewHeight", "desiredSmartbarHeight", "getDesiredSmartbarHeight", "desiredTextKeyboardViewHeight", "getDesiredTextKeyboardViewHeight", "florisboard", "Lkeyboard/neon/newboard/ime/core/FlorisBoard;", "getFlorisboard", "()Lkeyboard/neon/newboard/ime/core/FlorisBoard;", "heightFactor", "getHeightFactor", "overlayTextPaint", "Landroid/text/TextPaint;", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "getPrefs", "()Lkeyboard/neon/newboard/ime/core/Preferences;", "", "shouldGiveAdditionalSpace", "getShouldGiveAdditionalSpace", "()Z", "calcInputViewHeight", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "aosp_debug"})
public final class InputView extends android.widget.LinearLayout {
    private float desiredInputViewHeight;
    private float desiredSmartbarHeight;
    private float desiredTextKeyboardViewHeight;
    private float desiredMediaKeyboardViewHeight;
    private float heightFactor = 1.0F;
    private boolean shouldGiveAdditionalSpace = false;
    private int desiredInlineSuggestionsMinWidth = 0;
    private int desiredInlineSuggestionsMinHeight = 0;
    private int desiredInlineSuggestionsMaxWidth = 0;
    private int desiredInlineSuggestionsMaxHeight = 0;
    private final android.text.TextPaint overlayTextPaint = null;
    
    private final keyboard.neon.newboard.ime.core.FlorisBoard getFlorisboard() {
        return null;
    }
    
    private final keyboard.neon.newboard.ime.core.Preferences getPrefs() {
        return null;
    }
    
    public final float getDesiredInputViewHeight() {
        return 0.0F;
    }
    
    public final float getDesiredSmartbarHeight() {
        return 0.0F;
    }
    
    public final float getDesiredTextKeyboardViewHeight() {
        return 0.0F;
    }
    
    public final float getDesiredMediaKeyboardViewHeight() {
        return 0.0F;
    }
    
    public final float getHeightFactor() {
        return 0.0F;
    }
    
    public final boolean getShouldGiveAdditionalSpace() {
        return false;
    }
    
    public final int getDesiredInlineSuggestionsMinWidth() {
        return 0;
    }
    
    public final int getDesiredInlineSuggestionsMinHeight() {
        return 0;
    }
    
    public final int getDesiredInlineSuggestionsMaxWidth() {
        return 0;
    }
    
    public final int getDesiredInlineSuggestionsMaxHeight() {
        return 0;
    }
    
    public InputView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public InputView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public InputView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    /**
     * Calculates the input view height based on the current screen dimensions and the auto
     * selected dimension values.
     *
     * This method and the fraction values have been inspired by [OpenBoard](https://github.com/dslul/openboard)
     * but are not 1:1 the same. This implementation differs from the
     * [original](https://github.com/dslul/openboard/blob/90ae4c8aec034a8935e1fd02b441be25c7dba6ce/app/src/main/java/org/dslul/openboard/inputmethod/latin/utils/ResourceUtils.java)
     * by calculating the average of the min and max height values, then taking at least the input
     * view base height and return this resulting value.
     */
    private final float calcInputViewHeight() {
        return 0.0F;
    }
    
    @java.lang.Override()
    protected void dispatchDraw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
}