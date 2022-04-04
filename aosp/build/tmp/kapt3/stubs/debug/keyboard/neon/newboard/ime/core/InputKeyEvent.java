package keyboard.neon.newboard.ime.core;

import java.lang.System;

/**
 * Data class representing a single input key event.
 *
 * @property eventTime The exact event time when this event occurred, measured in milliseconds since a static point in
 * the past. The exact point is irrelevant, but while this input dispatcher is active, the point must not change in
 * order for difference time calculation to succeed.
 * @property action The action of this event.
 * @property data The data of this event.
 * @property count The count how often this event occurred. Is only respected by other methods if the [action] of this
 * event is [Action.DOWN_UP] or [Action.REPEAT], else always 1 is assumed.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0002 !B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\tH\u00d6\u0001J\u0018\u0010\u001c\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\""}, d2 = {"Lkeyboard/neon/newboard/ime/core/InputKeyEvent;", "", "eventTime", "", "action", "Lkeyboard/neon/newboard/ime/core/InputKeyEvent$Action;", "data", "Lkeyboard/neon/newboard/ime/keyboard/KeyData;", "count", "", "(JLkeyboard/neon/newboard/ime/core/InputKeyEvent$Action;Lkeyboard/neon/newboard/ime/keyboard/KeyData;I)V", "getAction", "()Lkeyboard/neon/newboard/ime/core/InputKeyEvent$Action;", "getCount", "()I", "getData", "()Lkeyboard/neon/newboard/ime/keyboard/KeyData;", "getEventTime", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "isConsecutiveEventOf", "maxEventTimeDiff", "toString", "", "Action", "Companion", "aosp_debug"})
public final class InputKeyEvent {
    private final long eventTime = 0L;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.InputKeyEvent.Action action = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.keyboard.KeyData data = null;
    private final int count = 0;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.core.InputKeyEvent.Companion Companion = null;
    
    /**
     * Data class representing a single input key event.
     *
     * @property eventTime The exact event time when this event occurred, measured in milliseconds since a static point in
     * the past. The exact point is irrelevant, but while this input dispatcher is active, the point must not change in
     * order for difference time calculation to succeed.
     * @property action The action of this event.
     * @property data The data of this event.
     * @property count The count how often this event occurred. Is only respected by other methods if the [action] of this
     * event is [Action.DOWN_UP] or [Action.REPEAT], else always 1 is assumed.
     */
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.InputKeyEvent copy(long eventTime, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.InputKeyEvent.Action action, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data, int count) {
        return null;
    }
    
    /**
     * Data class representing a single input key event.
     *
     * @property eventTime The exact event time when this event occurred, measured in milliseconds since a static point in
     * the past. The exact point is irrelevant, but while this input dispatcher is active, the point must not change in
     * order for difference time calculation to succeed.
     * @property action The action of this event.
     * @property data The data of this event.
     * @property count The count how often this event occurred. Is only respected by other methods if the [action] of this
     * event is [Action.DOWN_UP] or [Action.REPEAT], else always 1 is assumed.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Data class representing a single input key event.
     *
     * @property eventTime The exact event time when this event occurred, measured in milliseconds since a static point in
     * the past. The exact point is irrelevant, but while this input dispatcher is active, the point must not change in
     * order for difference time calculation to succeed.
     * @property action The action of this event.
     * @property data The data of this event.
     * @property count The count how often this event occurred. Is only respected by other methods if the [action] of this
     * event is [Action.DOWN_UP] or [Action.REPEAT], else always 1 is assumed.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public InputKeyEvent(long eventTime, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.InputKeyEvent.Action action, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data, int count) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getEventTime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.InputKeyEvent.Action component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.InputKeyEvent.Action getAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.keyboard.KeyData component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.keyboard.KeyData getData() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getCount() {
        return 0;
    }
    
    /**
     * Checks if the [other] input key event is a consecutive event while respecting [maxEventTimeDiff].
     *
     * @param other The other input key event to compare with this one.
     * @param maxEventTimeDiff The maximum event time diff between this event and [other], in milliseconds.
     *
     * @return True if this event is a consecutive event of [other], false otherwise.
     */
    public final boolean isConsecutiveEventOf(@org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.core.InputKeyEvent other, long maxEventTimeDiff) {
        return false;
    }
    
    /**
     * Returns a string representation of this input key event.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * The action of an input key event.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lkeyboard/neon/newboard/ime/core/InputKeyEvent$Action;", "", "(Ljava/lang/String;I)V", "DOWN", "DOWN_UP", "UP", "REPEAT", "CANCEL", "aosp_debug"})
    public static enum Action {
        /*public static final*/ DOWN /* = new DOWN() */,
        /*public static final*/ DOWN_UP /* = new DOWN_UP() */,
        /*public static final*/ UP /* = new UP() */,
        /*public static final*/ REPEAT /* = new REPEAT() */,
        /*public static final*/ CANCEL /* = new CANCEL() */;
        
        Action() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\r"}, d2 = {"Lkeyboard/neon/newboard/ime/core/InputKeyEvent$Companion;", "", "()V", "cancel", "Lkeyboard/neon/newboard/ime/core/InputKeyEvent;", "keyData", "Lkeyboard/neon/newboard/ime/keyboard/KeyData;", "down", "downUp", "count", "", "repeat", "up", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Creates a new input key event with given [keyData] and sets the action to [Action.DOWN].
         *
         * @param keyData The key data of the input key event event to create.
         *
         * @return The created input key event.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.core.InputKeyEvent down(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.keyboard.KeyData keyData) {
            return null;
        }
        
        /**
         * Creates a new input key event with given [keyData] and sets the action to [Action.DOWN_UP].
         *
         * @param keyData The key data of the input key event event to create.
         * @param count How often this event occurred. Must be grater or equal to 1, defaults to 1.
         *
         * @return The created input key event.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.core.InputKeyEvent downUp(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.keyboard.KeyData keyData, int count) {
            return null;
        }
        
        /**
         * Creates a new input key event with given [keyData] and sets the action to [Action.UP].
         *
         * @param keyData The key data of the input key event event to create.
         *
         * @return The created input key event.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.core.InputKeyEvent up(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.keyboard.KeyData keyData) {
            return null;
        }
        
        /**
         * Creates a new input key event with given [keyData] and sets the action to [Action.REPEAT].
         *
         * @param keyData The key data of the input key event event to create.
         * @param count How often this event occurred. Must be grater or equal to 1, defaults to 1.
         *
         * @return The created input key event.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.core.InputKeyEvent repeat(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.keyboard.KeyData keyData, int count) {
            return null;
        }
        
        /**
         * Creates a new input key event with given [keyData] and sets the action to [Action.CANCEL].
         *
         * @param keyData The key data of the input key event event to create.
         *
         * @return The created input key event.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.core.InputKeyEvent cancel(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.keyboard.KeyData keyData) {
            return null;
        }
    }
}