package keyboard.neon.newboard.ime.core;

import java.lang.System;

/**
 * Interface which represents an input key event receiver.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lkeyboard/neon/newboard/ime/core/InputKeyEventReceiver;", "", "onInputKeyCancel", "", "ev", "Lkeyboard/neon/newboard/ime/core/InputKeyEvent;", "onInputKeyDown", "onInputKeyRepeat", "onInputKeyUp", "aosp_debug"})
public abstract interface InputKeyEventReceiver {
    
    /**
     * Event method which gets called when a key went down.
     *
     * @param ev The associated input key event.
     */
    public abstract void onInputKeyDown(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.InputKeyEvent ev);
    
    /**
     * Event method which gets called when a key went up.
     *
     * @param ev The associated input key event.
     */
    public abstract void onInputKeyUp(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.InputKeyEvent ev);
    
    /**
     * Event method which gets called when a key is called repeatedly while being pressed down.
     *
     * @param ev The associated input key event.
     */
    public abstract void onInputKeyRepeat(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.InputKeyEvent ev);
    
    /**
     * Event method which gets called when a key press is cancelled.
     *
     * @param ev The associated input key event.
     */
    public abstract void onInputKeyCancel(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.InputKeyEvent ev);
}