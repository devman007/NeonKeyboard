package keyboard.neon.newboard.ime.core;

import java.lang.System;

/**
 * Interface which represents an input key event sender.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lkeyboard/neon/newboard/ime/core/InputKeyEventSender;", "", "send", "", "ev", "Lkeyboard/neon/newboard/ime/core/InputKeyEvent;", "aosp_debug"})
public abstract interface InputKeyEventSender {
    
    /**
     * Sends given input key event [ev] to the underlying input channel, awaiting to be processed.
     *
     * @param ev The input key event to send.
     */
    public abstract void send(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.InputKeyEvent ev);
}