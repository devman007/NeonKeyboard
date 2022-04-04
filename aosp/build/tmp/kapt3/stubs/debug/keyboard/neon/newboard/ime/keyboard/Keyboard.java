package keyboard.neon.newboard.ime.keyboard;

import java.lang.System;

/**
 * Abstract class describing a computed keyboard. The exact implementation is dependent on the subclass and the
 * structure can vary quite much between different subclasses.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/Keyboard;", "", "()V", "getKeyForPos", "Lkeyboard/neon/newboard/ime/keyboard/Key;", "pointerX", "", "pointerY", "keys", "", "layout", "", "keyboardView", "Lkeyboard/neon/newboard/ime/keyboard/KeyboardView;", "aosp_debug"})
public abstract class Keyboard {
    
    public Keyboard() {
        super();
    }
    
    /**
     * Returns the key for given [pointerX] and [pointerY] coords or null if no key touch hit box is defined at the
     * given coords.
     *
     * @param pointerX The x-coordinate of the input event, absolute within the parent keyboard view.
     * @param pointerY The y-coordinate of the input event, absolute within the parent keyboard view.
     *
     * @return The key for given coords or null if no key touch hit box is defined for this position.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract keyboard.neon.newboard.ime.keyboard.Key getKeyForPos(int pointerX, int pointerY);
    
    /**
     * Returns an iterator which allows to loop through all keys within the layout, independent of the actual
     * structure and layout.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Iterator<keyboard.neon.newboard.ime.keyboard.Key> keys();
    
    /**
     * Layouts the keys according the the dimensions and parameters provided by given [keyboardView]. This method's
     * exact behavior is highly dependent aon the actual subclass.
     *
     * @param keyboardView The parent keyboard view which is used to gather the absolute dimensions and other
     * subclass specific parameters.
     */
    public abstract void layout(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyboardView keyboardView);
}