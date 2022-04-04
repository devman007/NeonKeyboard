package keyboard.neon.newboard.ime.text.gestures;

import java.lang.System;

/**
 * Wrapper class which holds all enums, interfaces and classes for detecting a swipe gesture.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b&\u0018\u0000 \u00032\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\t"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture;", "", "()V", "Companion", "Detector", "Direction", "Event", "Listener", "Type", "aosp_debug"})
public abstract class SwipeGesture {
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.text.gestures.SwipeGesture.Companion Companion = null;
    
    public SwipeGesture() {
        super();
    }
    
    /**
     * Class which detects swipes based on given [MotionEvent]s. Only supports single-finger swipes
     * and ignores additional pointers provided, if any.
     *
     * @property listener The listener to report detected swipes to.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0017H\u0002J\u0018\u0010%\u001a\u00020&2\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0017H\u0002J\u0016\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,J\u0016\u0010-\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,J\u000e\u0010.\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u001e\u0010/\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u00100\u001a\u00020\u000fJ\u0016\u00101\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,J\b\u00102\u001a\u00020(H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001a@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Detector;", "", "context", "Landroid/content/Context;", "listener", "Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Listener;", "(Landroid/content/Context;Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Listener;)V", "value", "Lkeyboard/neon/newboard/ime/text/gestures/DistanceThreshold;", "distanceThreshold", "getDistanceThreshold", "()Lkeyboard/neon/newboard/ime/text/gestures/DistanceThreshold;", "setDistanceThreshold", "(Lkeyboard/neon/newboard/ime/text/gestures/DistanceThreshold;)V", "isEnabled", "", "()Z", "setEnabled", "(Z)V", "pointerMap", "Lkeyboard/neon/newboard/common/PointerMap;", "Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Detector$GesturePointer;", "thresholdSpeed", "", "thresholdWidth", "unitWidth", "Lkeyboard/neon/newboard/ime/text/gestures/VelocityThreshold;", "velocityThreshold", "getVelocityThreshold", "()Lkeyboard/neon/newboard/ime/text/gestures/VelocityThreshold;", "setVelocityThreshold", "(Lkeyboard/neon/newboard/ime/text/gestures/VelocityThreshold;)V", "velocityTracker", "Landroid/view/VelocityTracker;", "angle", "diffX", "diffY", "detectDirection", "Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Direction;", "onTouchCancel", "", "event", "Landroid/view/MotionEvent;", "pointer", "Lkeyboard/neon/newboard/common/Pointer;", "onTouchDown", "onTouchEvent", "onTouchMove", "alwaysTriggerOnMove", "onTouchUp", "resetState", "GesturePointer", "aosp_debug"})
    public static final class Detector {
        private final android.content.Context context = null;
        private final keyboard.neon.newboard.ime.text.gestures.SwipeGesture.Listener listener = null;
        private boolean isEnabled = true;
        private keyboard.neon.newboard.common.PointerMap<keyboard.neon.newboard.ime.text.gestures.SwipeGesture.Detector.GesturePointer> pointerMap;
        private double thresholdSpeed;
        private double thresholdWidth;
        private double unitWidth;
        private final android.view.VelocityTracker velocityTracker = null;
        @org.jetbrains.annotations.NotNull()
        private keyboard.neon.newboard.ime.text.gestures.DistanceThreshold distanceThreshold = keyboard.neon.newboard.ime.text.gestures.DistanceThreshold.NORMAL;
        @org.jetbrains.annotations.NotNull()
        private keyboard.neon.newboard.ime.text.gestures.VelocityThreshold velocityThreshold = keyboard.neon.newboard.ime.text.gestures.VelocityThreshold.NORMAL;
        
        public Detector(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.SwipeGesture.Listener listener) {
            super();
        }
        
        public final boolean isEnabled() {
            return false;
        }
        
        public final void setEnabled(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.DistanceThreshold getDistanceThreshold() {
            return null;
        }
        
        public final void setDistanceThreshold(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.DistanceThreshold value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.VelocityThreshold getVelocityThreshold() {
            return null;
        }
        
        public final void setVelocityThreshold(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.VelocityThreshold value) {
        }
        
        /**
         * Method which evaluates if a given [event] is a gesture.
         *
         * @param event The MotionEvent which should be checked for a gesture.
         * @param alwaysTriggerOnMove Set to true if the moving detection algorithm should always
         * trigger, regardless of the distance from the previous event. Defaults to false.
         * @return True if the given [event] is a gesture, false otherwise.
         */
        public final void onTouchEvent(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event) {
        }
        
        public final void onTouchDown(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.common.Pointer pointer) {
        }
        
        public final boolean onTouchMove(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.common.Pointer pointer, boolean alwaysTriggerOnMove) {
            return false;
        }
        
        public final boolean onTouchUp(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.common.Pointer pointer) {
            return false;
        }
        
        public final void onTouchCancel(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.common.Pointer pointer) {
        }
        
        /**
         * Calculates the angle based on the given x any y lengths. The returned angle is in degree
         * and goes clockwise, beginning with 0° at +x, 90° at +y, 180° at -y and 270° at -y.
         *
         * Coordinate system (based on the Android display coordinate system):
         *   -y
         * -x 00 +x
         *   +y
         */
        private final double angle(double diffX, double diffY) {
            return 0.0;
        }
        
        /**
         * Detects the direction of a finger swipe by two given events.
         */
        private final keyboard.neon.newboard.ime.text.gestures.SwipeGesture.Direction detectDirection(double diffX, double diffY) {
            return null;
        }
        
        /**
         * Resets the state.
         */
        private final void resetState() {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011\u00a8\u0006\u001d"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Detector$GesturePointer;", "Lkeyboard/neon/newboard/common/Pointer;", "()V", "absUnitCountX", "", "getAbsUnitCountX", "()I", "setAbsUnitCountX", "(I)V", "absUnitCountY", "getAbsUnitCountY", "setAbsUnitCountY", "firstX", "", "getFirstX", "()F", "setFirstX", "(F)V", "firstY", "getFirstY", "setFirstY", "lastX", "getLastX", "setLastX", "lastY", "getLastY", "setLastY", "reset", "", "aosp_debug"})
        public static final class GesturePointer extends keyboard.neon.newboard.common.Pointer {
            private float firstX = 0.0F;
            private float firstY = 0.0F;
            private float lastX = 0.0F;
            private float lastY = 0.0F;
            private int absUnitCountX = 0;
            private int absUnitCountY = 0;
            
            public GesturePointer() {
                super();
            }
            
            public final float getFirstX() {
                return 0.0F;
            }
            
            public final void setFirstX(float p0) {
            }
            
            public final float getFirstY() {
                return 0.0F;
            }
            
            public final void setFirstY(float p0) {
            }
            
            public final float getLastX() {
                return 0.0F;
            }
            
            public final void setLastX(float p0) {
            }
            
            public final float getLastY() {
                return 0.0F;
            }
            
            public final void setLastY(float p0) {
            }
            
            public final int getAbsUnitCountX() {
                return 0;
            }
            
            public final void setAbsUnitCountX(int p0) {
            }
            
            public final int getAbsUnitCountY() {
                return 0;
            }
            
            public final void setAbsUnitCountY(int p0) {
            }
            
            @java.lang.Override()
            public void reset() {
            }
        }
    }
    
    /**
     * An interface which provides an abstract callback function, which will be called for any
     * detected swipe event.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Listener;", "", "onSwipe", "", "event", "Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Event;", "aosp_debug"})
    public static abstract interface Listener {
        
        public abstract boolean onSwipe(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.SwipeGesture.Event event);
    }
    
    /**
     * Data class which describes a single gesture event.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0007H\u00d6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006%"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Event;", "", "direction", "Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Direction;", "type", "Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Type;", "pointerId", "", "absUnitCountX", "absUnitCountY", "relUnitCountX", "relUnitCountY", "(Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Direction;Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Type;IIIII)V", "getAbsUnitCountX", "()I", "getAbsUnitCountY", "getDirection", "()Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Direction;", "getPointerId", "getRelUnitCountX", "getRelUnitCountY", "getType", "()Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "aosp_debug"})
    public static final class Event {
        
        /**
         * The direction of the swipe.
         */
        @org.jetbrains.annotations.NotNull()
        private final keyboard.neon.newboard.ime.text.gestures.SwipeGesture.Direction direction = null;
        
        /**
         * The type of the swipe.
         */
        @org.jetbrains.annotations.NotNull()
        private final keyboard.neon.newboard.ime.text.gestures.SwipeGesture.Type type = null;
        
        /**
         * The pointer ID of this event, corresponds to the value reported by the original MotionEvent.
         */
        private final int pointerId = 0;
        
        /**
         * The unit count on the x-axis, measured from the first event (ACTION_DOWN).
         */
        private final int absUnitCountX = 0;
        
        /**
         * The unit count on the y-axis, measured from the first event (ACTION_DOWN).
         */
        private final int absUnitCountY = 0;
        
        /**
         * The unit count on the x-axis, measured from the last event (ACTION_MOVE).
         */
        private final int relUnitCountX = 0;
        
        /**
         * The unit count on the y-axis, measured from the last event (ACTION_MOVE).
         */
        private final int relUnitCountY = 0;
        
        /**
         * Data class which describes a single gesture event.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.SwipeGesture.Event copy(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.SwipeGesture.Direction direction, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.SwipeGesture.Type type, int pointerId, int absUnitCountX, int absUnitCountY, int relUnitCountX, int relUnitCountY) {
            return null;
        }
        
        /**
         * Data class which describes a single gesture event.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Data class which describes a single gesture event.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Data class which describes a single gesture event.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Event(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.SwipeGesture.Direction direction, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.SwipeGesture.Type type, int pointerId, int absUnitCountX, int absUnitCountY, int relUnitCountX, int relUnitCountY) {
            super();
        }
        
        /**
         * The direction of the swipe.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.SwipeGesture.Direction component1() {
            return null;
        }
        
        /**
         * The direction of the swipe.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.SwipeGesture.Direction getDirection() {
            return null;
        }
        
        /**
         * The type of the swipe.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.SwipeGesture.Type component2() {
            return null;
        }
        
        /**
         * The type of the swipe.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.SwipeGesture.Type getType() {
            return null;
        }
        
        /**
         * The pointer ID of this event, corresponds to the value reported by the original MotionEvent.
         */
        public final int component3() {
            return 0;
        }
        
        /**
         * The pointer ID of this event, corresponds to the value reported by the original MotionEvent.
         */
        public final int getPointerId() {
            return 0;
        }
        
        /**
         * The unit count on the x-axis, measured from the first event (ACTION_DOWN).
         */
        public final int component4() {
            return 0;
        }
        
        /**
         * The unit count on the x-axis, measured from the first event (ACTION_DOWN).
         */
        public final int getAbsUnitCountX() {
            return 0;
        }
        
        /**
         * The unit count on the y-axis, measured from the first event (ACTION_DOWN).
         */
        public final int component5() {
            return 0;
        }
        
        /**
         * The unit count on the y-axis, measured from the first event (ACTION_DOWN).
         */
        public final int getAbsUnitCountY() {
            return 0;
        }
        
        /**
         * The unit count on the x-axis, measured from the last event (ACTION_MOVE).
         */
        public final int component6() {
            return 0;
        }
        
        /**
         * The unit count on the x-axis, measured from the last event (ACTION_MOVE).
         */
        public final int getRelUnitCountX() {
            return 0;
        }
        
        /**
         * The unit count on the y-axis, measured from the last event (ACTION_MOVE).
         */
        public final int component7() {
            return 0;
        }
        
        /**
         * The unit count on the y-axis, measured from the last event (ACTION_MOVE).
         */
        public final int getRelUnitCountY() {
            return 0;
        }
    }
    
    /**
     * ENum which defines the direction of the detected swipe.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Direction;", "", "(Ljava/lang/String;I)V", "UP_LEFT", "UP", "UP_RIGHT", "RIGHT", "DOWN_RIGHT", "DOWN", "DOWN_LEFT", "LEFT", "aosp_debug"})
    public static enum Direction {
        /*public static final*/ UP_LEFT /* = new UP_LEFT() */,
        /*public static final*/ UP /* = new UP() */,
        /*public static final*/ UP_RIGHT /* = new UP_RIGHT() */,
        /*public static final*/ RIGHT /* = new RIGHT() */,
        /*public static final*/ DOWN_RIGHT /* = new DOWN_RIGHT() */,
        /*public static final*/ DOWN /* = new DOWN() */,
        /*public static final*/ DOWN_LEFT /* = new DOWN_LEFT() */,
        /*public static final*/ LEFT /* = new LEFT() */;
        
        Direction() {
        }
    }
    
    /**
     * Enum which defines the type of the gesture.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Type;", "", "(Ljava/lang/String;I)V", "TOUCH_UP", "TOUCH_MOVE", "aosp_debug"})
    public static enum Type {
        /*public static final*/ TOUCH_UP /* = new TOUCH_UP() */,
        /*public static final*/ TOUCH_MOVE /* = new TOUCH_MOVE() */;
        
        Type() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/SwipeGesture$Companion;", "", "()V", "numericValue", "", "context", "Landroid/content/Context;", "of", "Lkeyboard/neon/newboard/ime/text/gestures/DistanceThreshold;", "Lkeyboard/neon/newboard/ime/text/gestures/VelocityThreshold;", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Returns a numeric value for a given [DistanceThreshold], based on the values defined in
         * the resources dimens.xml file.
         */
        public final double numericValue(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.DistanceThreshold of) {
            return 0.0;
        }
        
        /**
         * Returns a numeric value for a given [VelocityThreshold], based on the values defined in
         * the resources dimens.xml file.
         */
        public final double numericValue(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.VelocityThreshold of) {
            return 0.0;
        }
    }
}