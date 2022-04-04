package keyboard.neon.newboard.common;

import java.lang.System;

/**
 * This file has been taken from the Android LatinIME project. Following modifications were done to
 * the original source code:
 * - Convert the code from Java to Kotlin
 * - Change package name to match the current project's one
 * - Remove method newLayoutParam()
 * - Remove method placeViewAt()
 * - Remove unnecessary variable params in updateLayoutGravityOf(), lp can directly be used due to
 *   Kotlin's smart cast feature
 * - Remove unused imports
 *
 * The original source code can be found at the following location:
 * https://android.googlesource.com/platform/packages/inputmethods/LatinIME/+/refs/heads/master/java/src/com/android/inputmethod/latin/utils/ViewLayoutUtils.java
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0011\u00a8\u0006\u0016"}, d2 = {"Lkeyboard/neon/newboard/common/ViewUtils;", "", "()V", "dp2px", "", "dp", "px2dp", "px", "setEnabled", "", "view", "Landroid/view/View;", "v", "", "setVisible", "updateLayoutGravityOf", "layoutGravity", "", "updateLayoutHeightOf", "layoutHeight", "window", "Landroid/view/Window;", "aosp_debug"})
public final class ViewUtils {
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.common.ViewUtils INSTANCE = null;
    
    private ViewUtils() {
        super();
    }
    
    public final void updateLayoutHeightOf(@org.jetbrains.annotations.NotNull()
    android.view.Window window, int layoutHeight) {
    }
    
    public final void updateLayoutHeightOf(@org.jetbrains.annotations.NotNull()
    android.view.View view, int layoutHeight) {
    }
    
    public final void updateLayoutGravityOf(@org.jetbrains.annotations.NotNull()
    android.view.View view, int layoutGravity) {
    }
    
    /**
     * This method converts dp unit to equivalent pixels, depending on device density.
     *
     * Source: https://stackoverflow.com/a/9563438/6801193 (by Muhammad Nabeel Arif)
     *
     * @param dp A value in dp (density independent pixels) unit. Which we need to convert into pixels
     * @return A float value to represent px equivalent to dp depending on device density
     */
    public final float dp2px(float dp) {
        return 0.0F;
    }
    
    /**
     * This method converts device specific pixels to density independent pixels.
     *
     * Source: https://stackoverflow.com/a/9563438/6801193 (by Muhammad Nabeel Arif)
     *
     * @param px A value in px (pixels) unit. Which we need to convert into db
     * @return A float value to represent dp equivalent to px value
     */
    public final float px2dp(float px) {
        return 0.0F;
    }
    
    public final void setEnabled(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean v) {
    }
    
    public final void setVisible(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean v) {
    }
}