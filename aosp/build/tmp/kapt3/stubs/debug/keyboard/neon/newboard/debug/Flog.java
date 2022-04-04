package keyboard.neon.newboard.debug;

import java.lang.System;

/**
 * Main helper object for FlorisBoard logging (=Flog). Manages the enabled
 * state and the active topics. Provides relevant helper functions for the
 * flog methods to properly work.
 *
 * This helper object uses some parts of the Timber library to assist in
 * logging. In particular:
 * - [createTag] (converted to Kotlin, renamed from "createStackElementTag",
 *    removed manual tagging).
 * - [getStacktraceElement] (converted to Kotlin, renamed from "getTag",
 *    method now returns stack trace element).
 * - [log] (only the [OUTPUT_CONSOLE] part, converted to Kotlin).
 * Timber is licensed under the Apache 2.0 license, see the repo here:
 * https://github.com/JakeWharton/timber
 */
@kotlin.Suppress(names = {"MemberVisibilityCanBePrivate"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J)\u0010 \u001a\u00020!2\n\u0010\"\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010#\u001a\u00020$H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b%\u0010&J+\u0010\'\u001a\u00020\u001f2\n\u0010(\u001a\u00060\u0006j\u0002`\u00152\n\u0010\"\u001a\u00060\u0006j\u0002`\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020-2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010.\u001a\u00020$2\u0006\u0010,\u001a\u00020-H\u0002J)\u0010/\u001a\u00020!2\n\u0010\"\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010#\u001a\u00020$H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b0\u0010&J\b\u00101\u001a\u00020-H\u0002JG\u00102\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\n\u0010\u001d\u001a\u00060\u0006j\u0002`\u00152\n\u0010\u001b\u001a\u00060\u0006j\u0002`\u00072\n\u0010\u001c\u001a\u00060\u0006j\u0002`\u0012\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b3\u00104J\'\u00105\u001a\u00020!2\n\u0010\"\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010#\u001a\u00020$\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b6\u0010&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\bR\u001d\u0010\t\u001a\u00060\u0006j\u0002`\u0007X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\bR\u001d\u0010\n\u001a\u00060\u0006j\u0002`\u0007X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\bR\u001d\u0010\u000b\u001a\u00060\u0006j\u0002`\u0007X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\bR\u001d\u0010\f\u001a\u00060\u0006j\u0002`\u0007X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\bR\u001d\u0010\r\u001a\u00060\u0006j\u0002`\u0007X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\bR\u001d\u0010\u000e\u001a\u00060\u0006j\u0002`\u0007X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u00060\u0006j\u0002`\u0012X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\bR\u001d\u0010\u0013\u001a\u00060\u0006j\u0002`\u0012X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\bR\u001d\u0010\u0014\u001a\u00060\u0006j\u0002`\u0015X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\bR\u001d\u0010\u0016\u001a\u00060\u0006j\u0002`\u0015X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\bR\u001d\u0010\u0017\u001a\u00060\u0006j\u0002`\u0015X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u00060\u0006j\u0002`\u0007X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\bR\u001d\u0010\u001c\u001a\u00060\u0006j\u0002`\u0012X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\bR\u001d\u0010\u001d\u001a\u00060\u0006j\u0002`\u0015X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u00067"}, d2 = {"Lkeyboard/neon/newboard/debug/Flog;", "", "()V", "CALL_STACK_INDEX", "", "LEVEL_ALL", "Lkotlin/UInt;", "Lkeyboard/neon/newboard/debug/FlogLevel;", "I", "LEVEL_DEBUG", "LEVEL_ERROR", "LEVEL_INFO", "LEVEL_NONE", "LEVEL_WARNING", "LEVEL_WTF", "MAX_LOG_LENGTH", "MAX_TAG_LENGTH", "OUTPUT_CONSOLE", "Lkeyboard/neon/newboard/debug/FlogOutput;", "OUTPUT_FILE", "TOPIC_ALL", "Lkeyboard/neon/newboard/debug/FlogTopic;", "TOPIC_NONE", "TOPIC_OTHER", "applicationContext", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "flogLevels", "flogOutputs", "flogTopics", "isFloggingEnabled", "", "androidLog", "", "level", "msg", "", "androidLog-qim9Vi0", "(ILjava/lang/String;)V", "checkShouldFlog", "topic", "checkShouldFlog-feOb9K0", "(II)Z", "createMessage", "element", "Ljava/lang/StackTraceElement;", "createTag", "fileLog", "fileLog-qim9Vi0", "getStacktraceElement", "install", "install-Z3u013Y", "(Landroid/content/Context;ZIII)V", "log", "log-qim9Vi0", "aosp_debug"})
public final class Flog {
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.debug.Flog INSTANCE = null;
    public static final int TOPIC_NONE = 0;
    public static final int TOPIC_OTHER = -2147483648;
    public static final int TOPIC_ALL = -1;
    public static final int LEVEL_NONE = 0;
    public static final int LEVEL_ERROR = 1;
    public static final int LEVEL_WARNING = 2;
    public static final int LEVEL_INFO = 4;
    public static final int LEVEL_DEBUG = 8;
    public static final int LEVEL_WTF = 16;
    public static final int LEVEL_ALL = -1;
    public static final int OUTPUT_CONSOLE = 1;
    public static final int OUTPUT_FILE = 2;
    
    /**
     * The relevant call stack element is always on the 4th position, thus 4-1=3.
     */
    private static final int CALL_STACK_INDEX = 3;
    
    /**
     * The maximum log length limit.
     */
    private static final int MAX_LOG_LENGTH = 4000;
    
    /**
     * The maximum tag length limit.
     */
    private static final int MAX_TAG_LENGTH = 23;
    private static java.lang.ref.WeakReference<android.content.Context> applicationContext;
    private static boolean isFloggingEnabled = false;
    private static int flogTopics = 0;
    private static int flogLevels = 0;
    private static int flogOutputs = 1;
    
    private Flog() {
        super();
    }
    
    /**
     * Extract the tag which should be used for the message from the `element`.
     */
    private final java.lang.String createTag(java.lang.StackTraceElement element) {
        return null;
    }
    
    private final java.lang.String createMessage(java.lang.StackTraceElement element, java.lang.String msg) {
        return null;
    }
    
    private final java.lang.StackTraceElement getStacktraceElement() {
        return null;
    }
}