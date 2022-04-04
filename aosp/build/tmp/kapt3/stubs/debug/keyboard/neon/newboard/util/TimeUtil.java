package keyboard.neon.newboard.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t\u00a8\u0006\u0013"}, d2 = {"Lkeyboard/neon/newboard/util/TimeUtil;", "", "()V", "asString", "", "v", "Lkeyboard/neon/newboard/util/TimeUtil$Time;", "currentLocalTime", "decode", "", "encode", "h", "m", "isNightTime", "", "sunrise", "sunset", "current", "Time", "aosp_debug"})
public final class TimeUtil {
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.util.TimeUtil INSTANCE = null;
    
    private TimeUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.util.TimeUtil.Time decode(int v) {
        return null;
    }
    
    public final int encode(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.util.TimeUtil.Time v) {
        return 0;
    }
    
    public final int encode(int h, int m) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String asString(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.util.TimeUtil.Time v) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.util.TimeUtil.Time currentLocalTime() {
        return null;
    }
    
    public final boolean isNightTime(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.util.TimeUtil.Time sunrise, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.util.TimeUtil.Time sunset, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.util.TimeUtil.Time current) {
        return false;
    }
    
    public final boolean isNightTime(int sunrise, int sunset, int current) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lkeyboard/neon/newboard/util/TimeUtil$Time;", "", "hour", "", "minute", "(II)V", "getHour", "()I", "getMinute", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "aosp_debug"})
    public static final class Time {
        private final int hour = 0;
        private final int minute = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.util.TimeUtil.Time copy(int hour, int minute) {
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
        
        public Time(int hour, int minute) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getHour() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getMinute() {
            return 0;
        }
    }
}