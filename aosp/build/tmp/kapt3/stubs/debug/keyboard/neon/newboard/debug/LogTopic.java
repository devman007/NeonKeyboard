package keyboard.neon.newboard.debug;

import java.lang.System;

/**
 * This object holds all custom log topics for the [Flog] utility.
 *
 * _Contributors:_ if you add a new feature which is relatively large, you can
 * add a new topic here, just make sure it is a 2^n value and does not
 * exceed the maximum value of [FlogTopic].
 */
@kotlin.Suppress(names = {"MemberVisibilityCanBePrivate", "Unused"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001d\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001d\u0010\b\u001a\u00060\u0004j\u0002`\u0005X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001d\u0010\t\u001a\u00060\u0004j\u0002`\u0005X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001d\u0010\n\u001a\u00060\u0004j\u0002`\u0005X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001d\u0010\u000b\u001a\u00060\u0004j\u0002`\u0005X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001d\u0010\f\u001a\u00060\u0004j\u0002`\u0005X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001d\u0010\r\u001a\u00060\u0004j\u0002`\u0005X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001d\u0010\u000e\u001a\u00060\u0004j\u0002`\u0005X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001d\u0010\u000f\u001a\u00060\u0004j\u0002`\u0005X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001d\u0010\u0010\u001a\u00060\u0004j\u0002`\u0005X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001d\u0010\u0011\u001a\u00060\u0004j\u0002`\u0005X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001d\u0010\u0012\u001a\u00060\u0004j\u0002`\u0005X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001d\u0010\u0013\u001a\u00060\u0004j\u0002`\u0005X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001d\u0010\u0014\u001a\u00060\u0004j\u0002`\u0005X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001d\u0010\u0015\u001a\u00060\u0004j\u0002`\u0005X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001d\u0010\u0016\u001a\u00060\u0004j\u0002`\u0005X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u0017"}, d2 = {"Lkeyboard/neon/newboard/debug/LogTopic;", "", "()V", "ALL", "Lkotlin/UInt;", "Lkeyboard/neon/newboard/debug/FlogTopic;", "I", "ASSET_MANAGER", "CLIPBOARD", "CRASH_UTILITY", "EDITOR_INSTANCE", "GESTURES", "GLIDE", "IMS_EVENTS", "KEY_EVENTS", "LAYOUT_MANAGER", "NONE", "OTHER", "SMARTBAR", "SPELL_EVENTS", "SUBTYPE_MANAGER", "TEXT_KEYBOARD_VIEW", "THEME_MANAGER", "aosp_debug"})
public final class LogTopic {
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.debug.LogTopic INSTANCE = null;
    public static final int NONE = 0;
    public static final int OTHER = -2147483648;
    public static final int ALL = -1;
    public static final int IMS_EVENTS = 1;
    public static final int KEY_EVENTS = 2;
    public static final int SUBTYPE_MANAGER = 4;
    public static final int LAYOUT_MANAGER = 8;
    public static final int TEXT_KEYBOARD_VIEW = 16;
    public static final int GESTURES = 32;
    public static final int SMARTBAR = 64;
    public static final int THEME_MANAGER = 128;
    public static final int ASSET_MANAGER = 256;
    public static final int GLIDE = 512;
    public static final int CLIPBOARD = 1024;
    public static final int CRASH_UTILITY = 2048;
    public static final int SPELL_EVENTS = 4096;
    public static final int EDITOR_INSTANCE = 8192;
    
    private LogTopic() {
        super();
    }
}