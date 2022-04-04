package keyboard.neon.newboard.ime.keyboard;

import java.lang.System;

/**
 * Basic interface for a key data object. Base for all key data objects across the IME, such as text, emojis and
 * selectors. The implementation is as abstract as possible, as different features require different implementations.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "", "asString", "", "isForDisplay", "", "compute", "Lkeyboard/neon/newboard/ime/keyboard/KeyData;", "evaluator", "Lkeyboard/neon/newboard/ime/keyboard/ComputingEvaluator;", "aosp_debug"})
public abstract interface AbstractKeyData {
    
    /**
     * Computes a [KeyData] object for this key data. Returns null if no computation is possible or if the key is
     * not relevant based on the result of [evaluator].
     *
     * @param evaluator The evaluator used to retrieve different states from the parent controller.
     *
     * @return A [KeyData] object or null if no computation is possible.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract keyboard.neon.newboard.ime.keyboard.KeyData compute(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.ComputingEvaluator evaluator);
    
    /**
     * Returns the data described by this key as a string.
     *
     * @param isForDisplay Specifies if the returned string is intended to be displayed in a UI label (=true) or if
     * it should be computed to be sent to an input connection (=false).
     *
     * @return The computed string for the key data object. Note: some objects may return an empty string here, meaning
     * it is always required to check for the string's length before attempting to directly retrieve the first char.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String asString(boolean isForDisplay);
}