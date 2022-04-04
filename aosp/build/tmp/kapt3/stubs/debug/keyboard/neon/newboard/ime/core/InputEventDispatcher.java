package keyboard.neon.newboard.ime.core;

import java.lang.System;

/**
 * The main logic point of processing input events and delegating them to the registered event receivers. Currently,
 * only [InputKeyEvent]s are supported, but in the future this class is thought to be the single point where input
 * events can be dispatched.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0002&\'B\'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003J\u0010\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\fH\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lkeyboard/neon/newboard/ime/core/InputEventDispatcher;", "Lkeyboard/neon/newboard/ime/core/InputKeyEventSender;", "channelCapacity", "", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "repeatableKeyCodes", "", "(ILkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;[I)V", "channel", "Lkotlinx/coroutines/channels/Channel;", "Lkeyboard/neon/newboard/ime/core/InputKeyEvent;", "defaultScope", "Lkotlinx/coroutines/CoroutineScope;", "keyEventReceiver", "Lkeyboard/neon/newboard/ime/core/InputKeyEventReceiver;", "getKeyEventReceiver", "()Lkeyboard/neon/newboard/ime/core/InputKeyEventReceiver;", "setKeyEventReceiver", "(Lkeyboard/neon/newboard/ime/core/InputKeyEventReceiver;)V", "<set-?>", "lastKeyEventDown", "getLastKeyEventDown", "()Lkeyboard/neon/newboard/ime/core/InputKeyEvent;", "lastKeyEventUp", "getLastKeyEventUp", "mainScope", "pressedKeys", "Landroid/util/SparseArray;", "Lkeyboard/neon/newboard/ime/core/InputEventDispatcher$PressedKeyInfo;", "close", "", "isPressed", "", "code", "send", "ev", "Companion", "PressedKeyInfo", "aosp_debug"})
public final class InputEventDispatcher implements keyboard.neon.newboard.ime.core.InputKeyEventSender {
    private final kotlinx.coroutines.CoroutineDispatcher mainDispatcher = null;
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher = null;
    private final int[] repeatableKeyCodes = null;
    private final kotlinx.coroutines.channels.Channel<keyboard.neon.newboard.ime.core.InputKeyEvent> channel = null;
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    private final kotlinx.coroutines.CoroutineScope defaultScope = null;
    private final android.util.SparseArray<keyboard.neon.newboard.ime.core.InputEventDispatcher.PressedKeyInfo> pressedKeys = null;
    @org.jetbrains.annotations.Nullable()
    private keyboard.neon.newboard.ime.core.InputKeyEvent lastKeyEventDown;
    @org.jetbrains.annotations.Nullable()
    private keyboard.neon.newboard.ime.core.InputKeyEvent lastKeyEventUp;
    
    /**
     * The input key event register. If null, the dispatcher will still process input, but won't dispatch them to an
     * event receiver.
     */
    @org.jetbrains.annotations.Nullable()
    private keyboard.neon.newboard.ime.core.InputKeyEventReceiver keyEventReceiver;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.core.InputEventDispatcher.Companion Companion = null;
    
    /**
     * The default input event channel capacity to be used in [new].
     */
    private static final int DEFAULT_CHANNEL_CAPACITY = 64;
    
    private InputEventDispatcher(int channelCapacity, kotlinx.coroutines.CoroutineDispatcher mainDispatcher, kotlinx.coroutines.CoroutineDispatcher defaultDispatcher, int[] repeatableKeyCodes) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.core.InputKeyEvent getLastKeyEventDown() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.core.InputKeyEvent getLastKeyEventUp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.core.InputKeyEventReceiver getKeyEventReceiver() {
        return null;
    }
    
    public final void setKeyEventReceiver(@org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.core.InputKeyEventReceiver p0) {
    }
    
    @java.lang.Override()
    public void send(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.InputKeyEvent ev) {
    }
    
    /**
     * Checks if there's currently a key down with given [code].
     *
     * @param code The key code to check for.
     *
     * @return True if the given [code] is currently down, false otherwise.
     */
    public final boolean isPressed(int code) {
        return false;
    }
    
    /**
     * Closes this dispatcher and cancels the local coroutine scope.
     */
    public final void close() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lkeyboard/neon/newboard/ime/core/InputEventDispatcher$PressedKeyInfo;", "", "eventTimeDown", "", "repeatKeyPressJob", "Lkotlinx/coroutines/Job;", "(JLkotlinx/coroutines/Job;)V", "getEventTimeDown", "()J", "getRepeatKeyPressJob", "()Lkotlinx/coroutines/Job;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "aosp_debug"})
    public static final class PressedKeyInfo {
        private final long eventTimeDown = 0L;
        @org.jetbrains.annotations.Nullable()
        private final kotlinx.coroutines.Job repeatKeyPressJob = null;
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.core.InputEventDispatcher.PressedKeyInfo copy(long eventTimeDown, @org.jetbrains.annotations.Nullable()
        kotlinx.coroutines.Job repeatKeyPressJob) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public PressedKeyInfo(long eventTimeDown, @org.jetbrains.annotations.Nullable()
        kotlinx.coroutines.Job repeatKeyPressJob) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getEventTimeDown() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlinx.coroutines.Job component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlinx.coroutines.Job getRepeatKeyPressJob() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\'\u0010\r\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lkeyboard/neon/newboard/ime/core/InputEventDispatcher$Companion;", "", "()V", "DEFAULT_CHANNEL_CAPACITY", "", "new", "Lkeyboard/neon/newboard/ime/core/InputEventDispatcher;", "channelCapacity", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "repeatableKeyCodes", "", "removeAndReturn", "T", "Landroid/util/SparseArray;", "key", "(Landroid/util/SparseArray;I)Ljava/lang/Object;", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final <T extends java.lang.Object>T removeAndReturn(android.util.SparseArray<T> $this$removeAndReturn, int key) {
            return null;
        }
    }
}