package keyboard.neon.newboard.ime.text.gestures;

import java.lang.System;

/**
 * Enum for declaring the possible actions for swipe gestures.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0001\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c\u00a8\u0006\u001e"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/SwipeAction;", "", "(Ljava/lang/String;I)V", "toString", "", "NO_ACTION", "CYCLE_TO_PREVIOUS_KEYBOARD_MODE", "CYCLE_TO_NEXT_KEYBOARD_MODE", "DELETE_CHARACTERS_PRECISELY", "DELETE_WORD", "DELETE_WORDS_PRECISELY", "HIDE_KEYBOARD", "INSERT_SPACE", "MOVE_CURSOR_UP", "MOVE_CURSOR_DOWN", "MOVE_CURSOR_LEFT", "MOVE_CURSOR_RIGHT", "MOVE_CURSOR_START_OF_LINE", "MOVE_CURSOR_END_OF_LINE", "MOVE_CURSOR_START_OF_PAGE", "MOVE_CURSOR_END_OF_PAGE", "REDO", "SHIFT", "SHOW_INPUT_METHOD_PICKER", "SWITCH_TO_PREV_SUBTYPE", "SWITCH_TO_NEXT_SUBTYPE", "SWITCH_TO_CLIPBOARD_CONTEXT", "SWITCH_TO_PREV_KEYBOARD", "UNDO", "Companion", "aosp_debug"})
public enum SwipeAction {
    /*public static final*/ NO_ACTION /* = new NO_ACTION() */,
    /*public static final*/ CYCLE_TO_PREVIOUS_KEYBOARD_MODE /* = new CYCLE_TO_PREVIOUS_KEYBOARD_MODE() */,
    /*public static final*/ CYCLE_TO_NEXT_KEYBOARD_MODE /* = new CYCLE_TO_NEXT_KEYBOARD_MODE() */,
    /*public static final*/ DELETE_CHARACTERS_PRECISELY /* = new DELETE_CHARACTERS_PRECISELY() */,
    /*public static final*/ DELETE_WORD /* = new DELETE_WORD() */,
    /*public static final*/ DELETE_WORDS_PRECISELY /* = new DELETE_WORDS_PRECISELY() */,
    /*public static final*/ HIDE_KEYBOARD /* = new HIDE_KEYBOARD() */,
    /*public static final*/ INSERT_SPACE /* = new INSERT_SPACE() */,
    /*public static final*/ MOVE_CURSOR_UP /* = new MOVE_CURSOR_UP() */,
    /*public static final*/ MOVE_CURSOR_DOWN /* = new MOVE_CURSOR_DOWN() */,
    /*public static final*/ MOVE_CURSOR_LEFT /* = new MOVE_CURSOR_LEFT() */,
    /*public static final*/ MOVE_CURSOR_RIGHT /* = new MOVE_CURSOR_RIGHT() */,
    /*public static final*/ MOVE_CURSOR_START_OF_LINE /* = new MOVE_CURSOR_START_OF_LINE() */,
    /*public static final*/ MOVE_CURSOR_END_OF_LINE /* = new MOVE_CURSOR_END_OF_LINE() */,
    /*public static final*/ MOVE_CURSOR_START_OF_PAGE /* = new MOVE_CURSOR_START_OF_PAGE() */,
    /*public static final*/ MOVE_CURSOR_END_OF_PAGE /* = new MOVE_CURSOR_END_OF_PAGE() */,
    /*public static final*/ REDO /* = new REDO() */,
    /*public static final*/ SHIFT /* = new SHIFT() */,
    /*public static final*/ SHOW_INPUT_METHOD_PICKER /* = new SHOW_INPUT_METHOD_PICKER() */,
    /*public static final*/ SWITCH_TO_PREV_SUBTYPE /* = new SWITCH_TO_PREV_SUBTYPE() */,
    /*public static final*/ SWITCH_TO_NEXT_SUBTYPE /* = new SWITCH_TO_NEXT_SUBTYPE() */,
    /*public static final*/ SWITCH_TO_CLIPBOARD_CONTEXT /* = new SWITCH_TO_CLIPBOARD_CONTEXT() */,
    /*public static final*/ SWITCH_TO_PREV_KEYBOARD /* = new SWITCH_TO_PREV_KEYBOARD() */,
    /*public static final*/ UNDO /* = new UNDO() */;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.text.gestures.SwipeAction.Companion Companion = null;
    
    SwipeAction() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/SwipeAction$Companion;", "", "()V", "fromString", "Lkeyboard/neon/newboard/ime/text/gestures/SwipeAction;", "string", "", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.SwipeAction fromString(@org.jetbrains.annotations.NotNull()
        java.lang.String string) {
            return null;
        }
    }
}