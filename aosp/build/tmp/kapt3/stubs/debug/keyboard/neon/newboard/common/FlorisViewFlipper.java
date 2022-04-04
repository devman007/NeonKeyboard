package keyboard.neon.newboard.common;

import java.lang.System;

/**
 * Custom ViewFlipper class used to prevent an unnecessary exception to be thrown when it is
 * detached from a window.
 *
 * Based on the solution of this SO answer: https://stackoverflow.com/a/8208874/6801193
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014\u00a8\u0006\n"}, d2 = {"Lkeyboard/neon/newboard/common/FlorisViewFlipper;", "Landroid/widget/ViewFlipper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onDetachedFromWindow", "", "aosp_debug"})
public final class FlorisViewFlipper extends android.widget.ViewFlipper {
    
    public FlorisViewFlipper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public FlorisViewFlipper(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
}