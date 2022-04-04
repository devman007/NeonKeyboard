package keyboard.neon.newboard.ime.text.gestures;

import java.lang.System;

/**
 * Wrapper class which holds all enums, interfaces and classes for detecting a gesture.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture;", "", "()V", "Detector", "Listener", "aosp_debug"})
public final class GlideTypingGesture {
    
    public GlideTypingGesture() {
        super();
    }
    
    /**
     * Class which detects swipes based on given [MotionEvent]s. Only supports single-finger swipes
     * and ignores additional pointers provided, if any.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0003 !\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tJ\b\u0010\u001e\u001a\u00020\u001cH\u0002J\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006#"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Detector;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "keySize", "", "listeners", "Ljava/util/ArrayList;", "Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Listener;", "Lkotlin/collections/ArrayList;", "pointerData", "Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Detector$PointerData;", "pointerId", "", "velocityThreshold", "Lkeyboard/neon/newboard/ime/text/gestures/VelocityThreshold;", "getVelocityThreshold", "()Lkeyboard/neon/newboard/ime/text/gestures/VelocityThreshold;", "setVelocityThreshold", "(Lkeyboard/neon/newboard/ime/text/gestures/VelocityThreshold;)V", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "initialKey", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKey;", "registerListener", "", "listener", "resetState", "unregisterListener", "Companion", "PointerData", "Position", "aosp_debug"})
    public static final class Detector {
        private keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.PointerData pointerData;
        @org.jetbrains.annotations.NotNull()
        private keyboard.neon.newboard.ime.text.gestures.VelocityThreshold velocityThreshold = keyboard.neon.newboard.ime.text.gestures.VelocityThreshold.NORMAL;
        private final double keySize = 0.0;
        private final java.util.ArrayList<keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Listener> listeners = null;
        private int pointerId = -1;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.Companion Companion = null;
        private static final int MAX_DETECT_TIME = 500;
        private static final double VELOCITY_THRESHOLD = 0.65;
        private static final java.lang.Integer[] SWIPE_GESTURE_KEYS = {-5, -1, 32, 12288};
        
        public Detector(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.VelocityThreshold getVelocityThreshold() {
            return null;
        }
        
        public final void setVelocityThreshold(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.VelocityThreshold p0) {
        }
        
        /**
         * Method which evaluates if a given [event] is a gesture.
         * @return whether or not the event was interpreted as part of a gesture.
         */
        public final boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event, @org.jetbrains.annotations.Nullable()
        keyboard.neon.newboard.ime.text.keyboard.TextKey initialKey) {
            return false;
        }
        
        public final void registerListener(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Listener listener) {
        }
        
        public final void unregisterListener(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Listener listener) {
        }
        
        private final void resetState() {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ4\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0007\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Detector$PointerData;", "", "positions", "", "Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Detector$Position;", "startTime", "", "isActuallyGesture", "", "(Ljava/util/List;JLjava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "setActuallyGesture", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPositions", "()Ljava/util/List;", "getStartTime", "()J", "setStartTime", "(J)V", "component1", "component2", "component3", "copy", "(Ljava/util/List;JLjava/lang/Boolean;)Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Detector$PointerData;", "equals", "other", "hashCode", "", "toString", "", "aosp_debug"})
        public static final class PointerData {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.Position> positions = null;
            private long startTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Boolean isActuallyGesture;
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.PointerData copy(@org.jetbrains.annotations.NotNull()
            java.util.List<keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.Position> positions, long startTime, @org.jetbrains.annotations.Nullable()
            java.lang.Boolean isActuallyGesture) {
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
            
            public PointerData(@org.jetbrains.annotations.NotNull()
            java.util.List<keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.Position> positions, long startTime, @org.jetbrains.annotations.Nullable()
            java.lang.Boolean isActuallyGesture) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.Position> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.Position> getPositions() {
                return null;
            }
            
            public final long component2() {
                return 0L;
            }
            
            public final long getStartTime() {
                return 0L;
            }
            
            public final void setStartTime(long p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Boolean component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Boolean isActuallyGesture() {
                return null;
            }
            
            public final void setActuallyGesture(@org.jetbrains.annotations.Nullable()
            java.lang.Boolean p0) {
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0000J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Detector$Position;", "", "x", "", "y", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "dist", "p2", "equals", "", "other", "hashCode", "", "toString", "", "aosp_debug"})
        public static final class Position {
            private final float x = 0.0F;
            private final float y = 0.0F;
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.Position copy(float x, float y) {
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
            
            public Position(float x, float y) {
                super();
            }
            
            public final float component1() {
                return 0.0F;
            }
            
            public final float getX() {
                return 0.0F;
            }
            
            public final float component2() {
                return 0.0F;
            }
            
            public final float getY() {
                return 0.0F;
            }
            
            public final float dist(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.Position p2) {
                return 0.0F;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Detector$Companion;", "", "()V", "MAX_DETECT_TIME", "", "SWIPE_GESTURE_KEYS", "", "[Ljava/lang/Integer;", "VELOCITY_THRESHOLD", "", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Listener;", "", "onGlideAddPoint", "", "point", "Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Detector$Position;", "onGlideCancelled", "onGlideComplete", "data", "Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Detector$PointerData;", "aosp_debug"})
    public static abstract interface Listener {
        
        /**
         * Called when a gesture is complete.
         */
        public abstract void onGlideComplete(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.PointerData data);
        
        /**
         * Called when a point is added to a gesture.
         * Will not be called before a series of events is detected as a gesture.
         */
        public abstract void onGlideAddPoint(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.Position point);
        
        /**
         * Called to cancel a gesture
         */
        public abstract void onGlideCancelled();
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class DefaultImpls {
            
            /**
             * Called when a gesture is complete.
             */
            public static void onGlideComplete(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Listener $this, @org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.PointerData data) {
            }
            
            /**
             * Called when a point is added to a gesture.
             * Will not be called before a series of events is detected as a gesture.
             */
            public static void onGlideAddPoint(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Listener $this, @org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.Position point) {
            }
            
            /**
             * Called to cancel a gesture
             */
            public static void onGlideCancelled(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Listener $this) {
            }
        }
    }
}