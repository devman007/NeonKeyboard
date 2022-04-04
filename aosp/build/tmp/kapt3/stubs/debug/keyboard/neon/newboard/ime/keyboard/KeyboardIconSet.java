package keyboard.neon.newboard.ime.keyboard;

import java.lang.System;

/**
 * Abstract class definition for providing icons to a keyboard view. This class has been introduced to remove the need
 * for keyboard vies to re-fetch drawable resources every time they draw on the canvas. The exact implementation is
 * dependent on the subclass.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H&J<\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\u0002\b\u000bH\u0086\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\f"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/KeyboardIconSet;", "", "()V", "getDrawable", "Landroid/graphics/drawable/Drawable;", "id", "", "withDrawable", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "aosp_debug"})
public abstract class KeyboardIconSet {
    
    public KeyboardIconSet() {
        super();
    }
    
    /**
     * Get the drawable for the given [id].
     *
     * @param id The Android resource id of the drawable which should be returned.
     *
     * @return The drawable for given [id] or null if this icon set does not contain a drawable for this id.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract android.graphics.drawable.Drawable getDrawable(@androidx.annotation.DrawableRes()
    int id);
    
    /**
     * Performs [block] on the drawable with the given [id]. If no drawable for the id exists,[block] will not be
     * called at all.
     *
     * @param id The Android resource id of the drawable which should be used to execute block with.
     * @param block The block which should be executed with the returned drawable.
     */
    public final void withDrawable(@androidx.annotation.DrawableRes()
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> block) {
    }
}