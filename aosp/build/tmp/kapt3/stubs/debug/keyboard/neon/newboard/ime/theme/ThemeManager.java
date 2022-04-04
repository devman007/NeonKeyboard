package keyboard.neon.newboard.ime.theme;

import java.lang.System;

/**
 * Core class which manages the keyboard theme. Note, that this does not affect the UI theme of the
 * Settings Activities.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 P2\u00020\u0001:\u0003PQRB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\bH\u0007J!\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00101\u001a\u00020\u0011\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020\u0011H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\b5\u00106J)\u00107\u001a\u0004\u0018\u0001082\u0006\u0010,\u001a\u00020\u00032\u0006\u00109\u001a\u00020:2\b\b\u0001\u0010;\u001a\u000208H\u0002\u00a2\u0006\u0002\u0010<J\b\u0010=\u001a\u000200H\u0002J$\u0010>\u001a\b\u0012\u0004\u0012\u00020\b0/2\u0006\u0010?\u001a\u00020@\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\bA\u00103J!\u0010>\u001a\b\u0012\u0004\u0012\u00020\b0/2\u0006\u00101\u001a\u00020\u0011\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bB\u00103J\u0006\u0010C\u001a\u000200J\u000e\u0010D\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020\u000eJ\u000e\u0010F\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020\u000eJ\u000e\u0010G\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020\u000eJ\u0006\u0010H\u001a\u000200J\u000e\u0010I\u001a\u0002002\u0006\u0010J\u001a\u00020KJ,\u0010L\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010?\u001a\u00020@2\u0006\u0010-\u001a\u00020\b\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\bM\u0010NJ)\u0010L\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00101\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bO\u0010NR\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R)\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001a@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u001e\u0010$\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020#@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001e\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020#0(j\b\u0012\u0004\u0012\u00020#`)X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006S"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/ThemeManager;", "", "applicationContext", "Landroid/content/Context;", "assetManager", "Lkeyboard/neon/newboard/res/AssetManager;", "(Landroid/content/Context;Lkeyboard/neon/newboard/res/AssetManager;)V", "<set-?>", "Lkeyboard/neon/newboard/ime/theme/Theme;", "activeTheme", "getActiveTheme", "()Lkeyboard/neon/newboard/ime/theme/Theme;", "callbackReceivers", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkeyboard/neon/newboard/ime/theme/ThemeManager$OnThemeUpdatedListener;", "indexedDayThemeRefs", "", "Lkeyboard/neon/newboard/res/FlorisRef;", "Lkeyboard/neon/newboard/ime/theme/ThemeMetaOnly;", "getIndexedDayThemeRefs", "()Ljava/util/Map;", "setIndexedDayThemeRefs", "(Ljava/util/Map;)V", "indexedNightThemeRefs", "getIndexedNightThemeRefs", "setIndexedNightThemeRefs", "", "isAdaptiveThemeEnabled", "()Z", "packageManager", "Landroid/content/pm/PackageManager;", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "getPrefs", "()Lkeyboard/neon/newboard/ime/core/Preferences;", "Lkeyboard/neon/newboard/ime/theme/ThemeManager$RemoteColors;", "remote", "getRemote", "()Lkeyboard/neon/newboard/ime/theme/ThemeManager$RemoteColors;", "remoteCache", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "createInlineSuggestionUiStyleBundle", "Landroid/os/Bundle;", "context", "theme", "deleteTheme", "Lkotlin/Result;", "", "ref", "deleteTheme-wkV_Pqg", "(Landroid/net/Uri;)Ljava/lang/Object;", "evaluateActiveThemeRef", "evaluateActiveThemeRef-NahhXEE", "()Landroid/net/Uri;", "getColorFromThemeAttribute", "", "typedValue", "Landroid/util/TypedValue;", "attr", "(Landroid/content/Context;Landroid/util/TypedValue;I)Ljava/lang/Integer;", "indexThemeRefs", "loadTheme", "uri", "Landroid/net/Uri;", "loadTheme-IoAF18A", "loadTheme-wkV_Pqg", "notifyCallbackReceivers", "registerOnThemeUpdatedListener", "onThemeUpdatedListener", "requestThemeUpdate", "unregisterOnThemeUpdatedListener", "update", "updateRemoteColorValues", "remotePackageName", "", "writeTheme", "writeTheme-gIAlu-s", "(Landroid/net/Uri;Lkeyboard/neon/newboard/ime/theme/Theme;)Ljava/lang/Object;", "writeTheme-AkCoMqs", "Companion", "OnThemeUpdatedListener", "RemoteColors", "aosp_debug"})
public final class ThemeManager {
    private final android.content.Context applicationContext = null;
    private final keyboard.neon.newboard.res.AssetManager assetManager = null;
    private final java.util.concurrent.CopyOnWriteArrayList<keyboard.neon.newboard.ime.theme.ThemeManager.OnThemeUpdatedListener> callbackReceivers = null;
    private final android.content.pm.PackageManager packageManager = null;
    @org.jetbrains.annotations.NotNull()
    private keyboard.neon.newboard.ime.theme.Theme activeTheme;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<keyboard.neon.newboard.res.FlorisRef, keyboard.neon.newboard.ime.theme.ThemeMetaOnly> indexedDayThemeRefs;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<keyboard.neon.newboard.res.FlorisRef, keyboard.neon.newboard.ime.theme.ThemeMetaOnly> indexedNightThemeRefs;
    private boolean isAdaptiveThemeEnabled = false;
    @org.jetbrains.annotations.NotNull()
    private keyboard.neon.newboard.ime.theme.ThemeManager.RemoteColors remote;
    private final java.util.ArrayList<keyboard.neon.newboard.ime.theme.ThemeManager.RemoteColors> remoteCache = null;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.theme.ThemeManager.Companion Companion = null;
    
    /**
     * The static relative path where a theme is located, regardless of the asset source.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String THEME_PATH_REL = "ime/theme";
    
    /**
     * Maximum size in bytes a theme file may have when loaded.
     */
    public static final int THEME_MAX_SIZE = 512000;
    private static keyboard.neon.newboard.ime.theme.ThemeManager defaultInstance;
    
    private ThemeManager(android.content.Context applicationContext, keyboard.neon.newboard.res.AssetManager assetManager) {
        super();
    }
    
    private final keyboard.neon.newboard.ime.core.Preferences getPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.theme.Theme getActiveTheme() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<keyboard.neon.newboard.res.FlorisRef, keyboard.neon.newboard.ime.theme.ThemeMetaOnly> getIndexedDayThemeRefs() {
        return null;
    }
    
    public final void setIndexedDayThemeRefs(@org.jetbrains.annotations.NotNull()
    java.util.Map<keyboard.neon.newboard.res.FlorisRef, keyboard.neon.newboard.ime.theme.ThemeMetaOnly> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<keyboard.neon.newboard.res.FlorisRef, keyboard.neon.newboard.ime.theme.ThemeMetaOnly> getIndexedNightThemeRefs() {
        return null;
    }
    
    public final void setIndexedNightThemeRefs(@org.jetbrains.annotations.NotNull()
    java.util.Map<keyboard.neon.newboard.res.FlorisRef, keyboard.neon.newboard.ime.theme.ThemeMetaOnly> p0) {
    }
    
    public final boolean isAdaptiveThemeEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.theme.ThemeManager.RemoteColors getRemote() {
        return null;
    }
    
    /**
     * Updates the current theme ref and loads the corresponding theme, as well as notifies all
     * callback receivers about the new theme.
     */
    public final void update() {
    }
    
    /**
     * Gets the primary and ark variants of the app with given [remotePackageName].
     * Based AnySoftKeyboard's way of getting remote colors:
     * https://github.com/AnySoftKeyboard/AnySoftKeyboard/blob/master/ime/overlay/src/main/java/com/anysoftkeyboard/overlay/OverlyDataCreatorForAndroid.java
     *
     * @param remotePackageName The package name from which the colors should be extracted.
     */
    public final void updateRemoteColorValues(@org.jetbrains.annotations.NotNull()
    java.lang.String remotePackageName) {
    }
    
    private final java.lang.Integer getColorFromThemeAttribute(android.content.Context context, android.util.TypedValue typedValue, @androidx.annotation.AttrRes()
    int attr) {
        return null;
    }
    
    /**
     * Sends a theme update to the given [onThemeUpdatedListener], regardless if it is currently
     * registered or not.
     */
    public final boolean requestThemeUpdate(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.theme.ThemeManager.OnThemeUpdatedListener onThemeUpdatedListener) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean registerOnThemeUpdatedListener(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.theme.ThemeManager.OnThemeUpdatedListener onThemeUpdatedListener) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean unregisterOnThemeUpdatedListener(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.theme.ThemeManager.OnThemeUpdatedListener onThemeUpdatedListener) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void notifyCallbackReceivers() {
    }
    
    private final void indexThemeRefs() {
    }
    
    /**
     * Creates a new inline suggestion UI bundle based on the attributes of the given [theme].
     *
     * @param context The context of the parent view/controller.
     * @param theme The theme from which the color attributes should be fetched. Defaults to [activeTheme].
     *
     * @return A bundle containing all necessary attributes for the inline suggestion views to properly display.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    public final android.os.Bundle createInlineSuggestionUiStyleBundle(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.theme.Theme theme) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/ThemeManager$RemoteColors;", "", "packageName", "", "colorPrimary", "Lkeyboard/neon/newboard/ime/theme/ThemeValue$SolidColor;", "colorPrimaryVariant", "colorSecondary", "(Ljava/lang/String;Lkeyboard/neon/newboard/ime/theme/ThemeValue$SolidColor;Lkeyboard/neon/newboard/ime/theme/ThemeValue$SolidColor;Lkeyboard/neon/newboard/ime/theme/ThemeValue$SolidColor;)V", "getColorPrimary", "()Lkeyboard/neon/newboard/ime/theme/ThemeValue$SolidColor;", "getColorPrimaryVariant", "getColorSecondary", "getPackageName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "aosp_debug"})
    public static final class RemoteColors {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String packageName = null;
        @org.jetbrains.annotations.Nullable()
        private final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor colorPrimary = null;
        @org.jetbrains.annotations.Nullable()
        private final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor colorPrimaryVariant = null;
        @org.jetbrains.annotations.Nullable()
        private final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor colorSecondary = null;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.theme.ThemeManager.RemoteColors.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeManager.RemoteColors DEFAULT = null;
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.theme.ThemeManager.RemoteColors copy(@org.jetbrains.annotations.NotNull()
        java.lang.String packageName, @org.jetbrains.annotations.Nullable()
        keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor colorPrimary, @org.jetbrains.annotations.Nullable()
        keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor colorPrimaryVariant, @org.jetbrains.annotations.Nullable()
        keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor colorSecondary) {
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
        
        public RemoteColors(@org.jetbrains.annotations.NotNull()
        java.lang.String packageName, @org.jetbrains.annotations.Nullable()
        keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor colorPrimary, @org.jetbrains.annotations.Nullable()
        keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor colorPrimaryVariant, @org.jetbrains.annotations.Nullable()
        keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor colorSecondary) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPackageName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor getColorPrimary() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor getColorPrimaryVariant() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final keyboard.neon.newboard.ime.theme.ThemeValue.SolidColor getColorSecondary() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/ThemeManager$RemoteColors$Companion;", "", "()V", "DEFAULT", "Lkeyboard/neon/newboard/ime/theme/ThemeManager$RemoteColors;", "getDEFAULT", "()Lkeyboard/neon/newboard/ime/theme/ThemeManager$RemoteColors;", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeManager.RemoteColors getDEFAULT() {
                return null;
            }
        }
    }
    
    /**
     * Functional interface which should be implemented by event listeners to be able to receive
     * theme updates.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/ThemeManager$OnThemeUpdatedListener;", "", "onThemeUpdated", "", "theme", "Lkeyboard/neon/newboard/ime/theme/Theme;", "aosp_debug"})
    public static abstract interface OnThemeUpdatedListener {
        
        public abstract void onThemeUpdated(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.theme.Theme theme);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\bJ\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/ThemeManager$Companion;", "", "()V", "THEME_MAX_SIZE", "", "THEME_PATH_REL", "", "defaultInstance", "Lkeyboard/neon/newboard/ime/theme/ThemeManager;", "default", "defaultOrNull", "init", "applicationContext", "Landroid/content/Context;", "assetManager", "Lkeyboard/neon/newboard/res/AssetManager;", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.theme.ThemeManager init(@org.jetbrains.annotations.NotNull()
        android.content.Context applicationContext, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.res.AssetManager assetManager) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final keyboard.neon.newboard.ime.theme.ThemeManager defaultOrNull() {
            return null;
        }
    }
}