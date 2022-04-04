package keyboard.neon.newboard.crashutility;

import java.lang.System;

/**
 * Abstract class which holds several static methods used for handling unexpected errors.
 *
 * Parts of this class (especially the install() function and the uncaughtException() handler) have
 * been inspired by the great CustomActivityOnCrash library:
 * https://github.com/Ereza/CustomActivityOnCrash (licensed under Apache 2.0)
 * https://github.com/Ereza/CustomActivityOnCrash/blob/master/library/src/main/java/cat/ereza/customactivityoncrash/CustomActivityOnCrash.java
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lkeyboard/neon/newboard/crashutility/CrashUtility;", "", "()V", "Companion", "Stacktrace", "UncaughtExceptionHandler", "aosp_debug"})
public abstract class CrashUtility {
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.crashutility.CrashUtility.Companion Companion = null;
    private static final java.lang.String SHARED_PREFS_FILE = "crash_utility";
    private static final java.lang.String SHARED_PREFS_LAST_CRASH_TIMESTAMP = "last_crash_timestamp";
    private static final java.lang.String NOTIFICATION_CHANNEL_ID = "com.neon.keyboard.fancyfonts.fancy.keyboard.crashutility";
    private static final long NOTIFICATION_ID = 4222419200L;
    private static final java.lang.String UNHANDLED_STACKTRACE_FILE_EXT = "stacktrace";
    private static java.lang.ref.WeakReference<android.app.Activity> lastActivityCreated;
    private static java.lang.Throwable stagedException;
    
    private CrashUtility() {
        super();
    }
    
    /**
     * A simple stacktrace data class capable of holding a [name] and the [details] of a stacktrace.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lkeyboard/neon/newboard/crashutility/CrashUtility$Stacktrace;", "", "name", "", "details", "(Ljava/lang/String;Ljava/lang/String;)V", "getDetails", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "aosp_debug"})
    public static final class Stacktrace {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String details = null;
        
        /**
         * A simple stacktrace data class capable of holding a [name] and the [details] of a stacktrace.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.crashutility.CrashUtility.Stacktrace copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String details) {
            return null;
        }
        
        /**
         * A simple stacktrace data class capable of holding a [name] and the [details] of a stacktrace.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A simple stacktrace data class capable of holding a [name] and the [details] of a stacktrace.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A simple stacktrace data class capable of holding a [name] and the [details] of a stacktrace.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Stacktrace(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String details) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDetails() {
            return null;
        }
    }
    
    /**
     * Custom UncaughtExceptionHandler, which writes the captured stacktrace of the crash to the
     * internal storage, pushes a crash notification and kills the current process.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lkeyboard/neon/newboard/crashutility/CrashUtility$UncaughtExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "application", "Ljava/lang/ref/WeakReference;", "Landroid/app/Application;", "oldHandler", "path", "", "(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;Ljava/lang/String;)V", "uncaughtException", "", "thread", "Ljava/lang/Thread;", "throwable", "", "aosp_debug"})
    public static final class UncaughtExceptionHandler implements java.lang.Thread.UncaughtExceptionHandler {
        private final java.lang.ref.WeakReference<android.app.Application> application = null;
        private final java.lang.ref.WeakReference<java.lang.Thread.UncaughtExceptionHandler> oldHandler = null;
        private final java.lang.String path = null;
        
        public UncaughtExceptionHandler(@org.jetbrains.annotations.NotNull()
        java.lang.ref.WeakReference<android.app.Application> application, @org.jetbrains.annotations.NotNull()
        java.lang.ref.WeakReference<java.lang.Thread.UncaughtExceptionHandler> oldHandler, @org.jetbrains.annotations.NotNull()
        java.lang.String path) {
            super();
        }
        
        @java.lang.Override()
        public void uncaughtException(@org.jetbrains.annotations.Nullable()
        java.lang.Thread thread, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable throwable) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0012\u0010\u001e\u001a\u00020\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010\u001f\u001a\u00020\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J*\u0010 \u001a\u00020\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0002J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0016H\u0002J\u001a\u0010\'\u001a\u00020\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010(\u001a\u00020\u0006H\u0003J\u0010\u0010)\u001a\u00020\u001a2\b\u0010*\u001a\u0004\u0018\u00010\u000eJ\u0018\u0010+\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lkeyboard/neon/newboard/crashutility/CrashUtility$Companion;", "", "()V", "NOTIFICATION_CHANNEL_ID", "", "NOTIFICATION_ID", "", "SHARED_PREFS_FILE", "SHARED_PREFS_LAST_CRASH_TIMESTAMP", "UNHANDLED_STACKTRACE_FILE_EXT", "lastActivityCreated", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "stagedException", "", "getLastCrashTimestamp", "context", "Landroid/content/Context;", "getUnhandledStacktraces", "", "Lkeyboard/neon/newboard/crashutility/CrashUtility$Stacktrace;", "getUstDir", "Ljava/io/File;", "getUstFile", "timestamp", "handleStagedButUnhandledExceptions", "", "hasUnhandledStacktraceFiles", "", "install", "pushCrashMultipleNotification", "pushCrashOnceNotification", "pushNotification", "id", "", "title", "body", "readFile", "file", "setLastCrashTimestamp", "value", "stageException", "e", "writeToFile", "text", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Installs the CrashUtility crash handler for the given package [context]. Also registers
         * a notification channel for devices with Android 8.0+.
         *
         * @param context The current package context. If null is supplied, this function does
         * nothing.
         * @return True if the installation was successful, false otherwise.
         */
        public final boolean install(@org.jetbrains.annotations.Nullable()
        android.content.Context context) {
            return false;
        }
        
        public final void stageException(@org.jetbrains.annotations.Nullable()
        java.lang.Throwable e) {
        }
        
        @kotlin.Suppress(names = {"NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS"})
        public final void handleStagedButUnhandledExceptions() {
        }
        
        /**
         * Reads and returns all unhandled stacktrace files.
         *
         * @param context The current package context. If null is supplied, this function returns
         * an empty string.
         * @return All unhandled stacktrace files or an empty list.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<keyboard.neon.newboard.crashutility.CrashUtility.Stacktrace> getUnhandledStacktraces(@org.jetbrains.annotations.Nullable()
        android.content.Context context) {
            return null;
        }
        
        public final boolean hasUnhandledStacktraceFiles(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        /**
         * Gets the last crash timestamp from the shared preferences.
         *
         * @param context The current package context. If null is supplied, this function returns
         * the default value for the timestamp (0).
         * @return The last time crash timestamp or 0.
         */
        private final long getLastCrashTimestamp(android.content.Context context) {
            return 0L;
        }
        
        /**
         * Sets the last crash timestamp in the shared preferences.
         *
         * @param context The current package context. If null is supplied, this function does
         * nothing.
         * @param value The timestamp of the current crash.
         */
        @android.annotation.SuppressLint(value = {"ApplySharedPref"})
        private final void setLastCrashTimestamp(android.content.Context context, long value) {
        }
        
        /**
         * Gets a reference to the current unhandled stacktrace directory.
         *
         * @param context The current package context.
         * @return The File object for the directory.
         */
        private final java.io.File getUstDir(android.content.Context context) {
            return null;
        }
        
        /**
         * Gets a reference to the stacktrace file for given [timestamp].
         *
         * @param context The current package context.
         * @param timestamp The timestamp of the stacktrace file to get.
         * @return The File object for the stacktrace file.
         */
        private final java.io.File getUstFile(android.content.Context context, long timestamp) {
            return null;
        }
        
        /**
         * Push a notification which opens [CrashDialogActivity] with given parameters.
         *
         * @param context The current package context. If null is supplied, this function does
         * nothing.
         * @param id The ID of the notification.
         * @param title The title of the notification.
         * @param body The body of the notification.
         */
        private final void pushNotification(android.content.Context context, int id, java.lang.String title, java.lang.String body) {
        }
        
        /**
         * Push a notification configured for a single crash.
         *
         * @param context The current package context. If null is supplied, this function does
         * nothing.
         */
        private final void pushCrashOnceNotification(android.content.Context context) {
        }
        
        /**
         * Push a notification configured for multiple crashes.
         *
         * @param context The current package context. If null is supplied, this function does
         * nothing.
         */
        private final void pushCrashMultipleNotification(android.content.Context context) {
        }
        
        /**
         * Reads a given [file] and returns its content.
         *
         * @param file The file object.
         * @return The contents of the file or an empty string, if the file does not exist.
         */
        private final java.lang.String readFile(java.io.File file) {
            return null;
        }
        
        /**
         * Writes given [text] to given [file]. If the file already exists, its current content
         * will be overwritten.
         *
         * @param file The file object.
         * @param text The text to write to the file.
         * @return The contents of the file or an empty string, if the file does not exist.
         */
        private final void writeToFile(java.io.File file, java.lang.String text) {
        }
    }
}