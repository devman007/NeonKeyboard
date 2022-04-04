package keyboard.neon.newboard.ime.core;

import java.lang.System;

/**
 * Helper class for an organized access to the shared preferences.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0013\u0018\u0000 R2\u00020\u0001:\u000fPQRSTUVWXYZ[\\]^B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010E\u001a\u0002HF\"\u0006\b\u0000\u0010F\u0018\u00012\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u0002HFH\u0082\b\u00a2\u0006\u0002\u0010JJ\u0006\u0010K\u001a\u00020LJ&\u0010M\u001a\u00020L\"\u0006\b\u0000\u0010F\u0018\u00012\u0006\u0010G\u001a\u00020H2\u0006\u0010N\u001a\u0002HFH\u0082\b\u00a2\u0006\u0002\u0010OR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 \u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\'\u001a\u00020(\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020,\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u000200\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0011\u00109\u001a\u00020:\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020>\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010A\u001a\u00020B\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010D\u00a8\u0006_"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "advanced", "Lkeyboard/neon/newboard/ime/core/Preferences$Advanced;", "getAdvanced", "()Lkeyboard/neon/newboard/ime/core/Preferences$Advanced;", "applicationContext", "Ljava/lang/ref/WeakReference;", "clipboard", "Lkeyboard/neon/newboard/ime/core/Preferences$Clipboard;", "getClipboard", "()Lkeyboard/neon/newboard/ime/core/Preferences$Clipboard;", "correction", "Lkeyboard/neon/newboard/ime/core/Preferences$Correction;", "getCorrection", "()Lkeyboard/neon/newboard/ime/core/Preferences$Correction;", "devtools", "Lkeyboard/neon/newboard/ime/core/Preferences$Devtools;", "getDevtools", "()Lkeyboard/neon/newboard/ime/core/Preferences$Devtools;", "fonts", "Lkeyboard/neon/newboard/ime/core/Preferences$Fonts;", "getFonts", "()Lkeyboard/neon/newboard/ime/core/Preferences$Fonts;", "gestures", "Lkeyboard/neon/newboard/ime/core/Preferences$Gestures;", "getGestures", "()Lkeyboard/neon/newboard/ime/core/Preferences$Gestures;", "glide", "Lkeyboard/neon/newboard/ime/core/Preferences$Glide;", "getGlide", "()Lkeyboard/neon/newboard/ime/core/Preferences$Glide;", "inputFeedback", "Lkeyboard/neon/newboard/ime/core/Preferences$InputFeedback;", "getInputFeedback", "()Lkeyboard/neon/newboard/ime/core/Preferences$InputFeedback;", "internal", "Lkeyboard/neon/newboard/ime/core/Preferences$Internal;", "getInternal", "()Lkeyboard/neon/newboard/ime/core/Preferences$Internal;", "keyboard", "Lkeyboard/neon/newboard/ime/core/Preferences$Keyboard;", "getKeyboard", "()Lkeyboard/neon/newboard/ime/core/Preferences$Keyboard;", "localization", "Lkeyboard/neon/newboard/ime/core/Preferences$Localization;", "getLocalization", "()Lkeyboard/neon/newboard/ime/core/Preferences$Localization;", "shared", "Landroid/content/SharedPreferences;", "getShared", "()Landroid/content/SharedPreferences;", "setShared", "(Landroid/content/SharedPreferences;)V", "smartbar", "Lkeyboard/neon/newboard/ime/core/Preferences$Smartbar;", "getSmartbar", "()Lkeyboard/neon/newboard/ime/core/Preferences$Smartbar;", "suggestion", "Lkeyboard/neon/newboard/ime/core/Preferences$Suggestion;", "getSuggestion", "()Lkeyboard/neon/newboard/ime/core/Preferences$Suggestion;", "theme", "Lkeyboard/neon/newboard/ime/core/Preferences$Theme;", "getTheme", "()Lkeyboard/neon/newboard/ime/core/Preferences$Theme;", "getPref", "T", "key", "", "default", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "initDefaultPreferences", "", "setPref", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "Advanced", "Clipboard", "Companion", "Correction", "Devtools", "Fonts", "Gestures", "Glide", "InputFeedback", "Internal", "Keyboard", "Localization", "Smartbar", "Suggestion", "Theme", "aosp_debug"})
public final class Preferences {
    @org.jetbrains.annotations.NotNull()
    private android.content.SharedPreferences shared;
    private final java.lang.ref.WeakReference<android.content.Context> applicationContext = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.Preferences.Advanced advanced = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.Preferences.Clipboard clipboard = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.Preferences.Correction correction = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.Preferences.Devtools devtools = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.Preferences.Gestures gestures = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.Preferences.Glide glide = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.Preferences.InputFeedback inputFeedback = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.Preferences.Internal internal = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.Preferences.Keyboard keyboard = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.Preferences.Localization localization = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.Preferences.Smartbar smartbar = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.Preferences.Suggestion suggestion = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.Preferences.Theme theme = null;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.core.Preferences.Fonts fonts = null;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.core.Preferences.Companion Companion = null;
    private static final kotlin.text.Regex OLD_SUBTYPES_REGEX = null;
    private static keyboard.neon.newboard.ime.core.Preferences defaultInstance;
    
    public Preferences(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getShared() {
        return null;
    }
    
    public final void setShared(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.Preferences.Advanced getAdvanced() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.Preferences.Clipboard getClipboard() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.Preferences.Correction getCorrection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.Preferences.Devtools getDevtools() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.Preferences.Gestures getGestures() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.Preferences.Glide getGlide() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.Preferences.InputFeedback getInputFeedback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.Preferences.Internal getInternal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.Preferences.Keyboard getKeyboard() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.Preferences.Localization getLocalization() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.Preferences.Smartbar getSmartbar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.Preferences.Suggestion getSuggestion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.Preferences.Theme getTheme() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.Preferences.Fonts getFonts() {
        return null;
    }
    
    /**
     * Tells the [PreferenceManager] to set the defined preferences to their default values, if
     * they have not been initialized yet.
     */
    public final void initDefaultPreferences() {
    }
    
    /**
     * Wrapper class for font preferences.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Fonts;", "", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "(Lkeyboard/neon/newboard/ime/core/Preferences;)V", "v", "", "fontName", "getFontName", "()Ljava/lang/String;", "setFontName", "(Ljava/lang/String;)V", "Companion", "aosp_debug"})
    public static final class Fonts {
        private final keyboard.neon.newboard.ime.core.Preferences prefs = null;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.core.Preferences.Fonts.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FONT_NAME = "font__name";
        
        public Fonts(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.Preferences prefs) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFontName() {
            return null;
        }
        
        public final void setFontName(@org.jetbrains.annotations.NotNull()
        java.lang.String v) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Fonts$Companion;", "", "()V", "FONT_NAME", "", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Wrapper class for advanced preferences.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068F@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Advanced;", "", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "(Lkeyboard/neon/newboard/ime/core/Preferences;)V", "v", "", "forcePrivateMode", "getForcePrivateMode", "()Z", "setForcePrivateMode", "(Z)V", "<set-?>", "", "settingsTheme", "getSettingsTheme", "()Ljava/lang/String;", "showAppIcon", "getShowAppIcon", "Companion", "aosp_debug"})
    public static final class Advanced {
        private final keyboard.neon.newboard.ime.core.Preferences prefs = null;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.core.Preferences.Advanced.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SETTINGS_THEME = "advanced__settings_theme";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SHOW_APP_ICON = "advanced__show_app_icon";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FORCE_PRIVATE_MODE = "advanced__force_private_mode";
        @org.jetbrains.annotations.NotNull()
        private java.lang.String settingsTheme = "";
        private boolean showAppIcon = false;
        
        public Advanced(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.Preferences prefs) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSettingsTheme() {
            return null;
        }
        
        public final boolean getShowAppIcon() {
            return false;
        }
        
        public final boolean getForcePrivateMode() {
            return false;
        }
        
        public final void setForcePrivateMode(boolean v) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Advanced$Companion;", "", "()V", "FORCE_PRIVATE_MODE", "", "SETTINGS_THEME", "SHOW_APP_ICON", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Wrapper class for correction preferences.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Correction;", "", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "(Lkeyboard/neon/newboard/ime/core/Preferences;)V", "v", "", "autoCapitalization", "getAutoCapitalization", "()Z", "setAutoCapitalization", "(Z)V", "autoSpace", "getAutoSpace", "setAutoSpace", "doubleSpacePeriod", "getDoubleSpacePeriod", "setDoubleSpacePeriod", "rememberCapsLockState", "getRememberCapsLockState", "setRememberCapsLockState", "Companion", "aosp_debug"})
    public static final class Correction {
        private final keyboard.neon.newboard.ime.core.Preferences prefs = null;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.core.Preferences.Correction.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AUTO_CAPITALIZATION = "correction__auto_capitalization";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DOUBLE_SPACE_PERIOD = "correction__double_space_period";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MANAGE_SPELL_CHECKER = "correction__manage_spell_checker";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String REMEMBER_CAPS_LOCK_STATE = "correction__remember_caps_lock_state";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AUTO_SPACE_AFTER_DOT = "correction__auto_space";
        
        public Correction(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.Preferences prefs) {
            super();
        }
        
        public final boolean getAutoSpace() {
            return false;
        }
        
        public final void setAutoSpace(boolean v) {
        }
        
        public final boolean getAutoCapitalization() {
            return false;
        }
        
        public final void setAutoCapitalization(boolean v) {
        }
        
        public final boolean getDoubleSpacePeriod() {
            return false;
        }
        
        public final void setDoubleSpacePeriod(boolean v) {
        }
        
        public final boolean getRememberCapsLockState() {
            return false;
        }
        
        public final void setRememberCapsLockState(boolean v) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Correction$Companion;", "", "()V", "AUTO_CAPITALIZATION", "", "AUTO_SPACE_AFTER_DOT", "DOUBLE_SPACE_PERIOD", "MANAGE_SPELL_CHECKER", "REMEMBER_CAPS_LOCK_STATE", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Wrapper class for devtools preferences.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Devtools;", "", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "(Lkeyboard/neon/newboard/ime/core/Preferences;)V", "v", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "overrideWordSuggestionsMinHeapRestriction", "getOverrideWordSuggestionsMinHeapRestriction", "setOverrideWordSuggestionsMinHeapRestriction", "showHeapMemoryStats", "getShowHeapMemoryStats", "setShowHeapMemoryStats", "Companion", "aosp_debug"})
    public static final class Devtools {
        private final keyboard.neon.newboard.ime.core.Preferences prefs = null;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.core.Preferences.Devtools.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ENABLED = "devtools__enabled";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SHOW_HEAP_MEMORY_STATS = "devtools__show_heap_memory_stats";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String OVERRIDE_WS_MIN_HEAP_RES = "devtools__override_word_suggestions_min_heap_restriction";
        
        public Devtools(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.Preferences prefs) {
            super();
        }
        
        public final boolean getEnabled() {
            return false;
        }
        
        public final void setEnabled(boolean v) {
        }
        
        public final boolean getShowHeapMemoryStats() {
            return false;
        }
        
        public final void setShowHeapMemoryStats(boolean v) {
        }
        
        public final boolean getOverrideWordSuggestionsMinHeapRestriction() {
            return false;
        }
        
        public final void setOverrideWordSuggestionsMinHeapRestriction(boolean v) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Devtools$Companion;", "", "()V", "ENABLED", "", "OVERRIDE_WS_MIN_HEAP_RES", "SHOW_HEAP_MEMORY_STATS", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Wrapper class for gestures preferences.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR$\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR$\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR$\u0010\'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000bR$\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020*8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/\u00a8\u00061"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Gestures;", "", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "(Lkeyboard/neon/newboard/ime/core/Preferences;)V", "v", "Lkeyboard/neon/newboard/ime/text/gestures/SwipeAction;", "deleteKeySwipeLeft", "getDeleteKeySwipeLeft", "()Lkeyboard/neon/newboard/ime/text/gestures/SwipeAction;", "setDeleteKeySwipeLeft", "(Lkeyboard/neon/newboard/ime/text/gestures/SwipeAction;)V", "spaceBarLongPress", "getSpaceBarLongPress", "setSpaceBarLongPress", "spaceBarSwipeLeft", "getSpaceBarSwipeLeft", "setSpaceBarSwipeLeft", "spaceBarSwipeRight", "getSpaceBarSwipeRight", "setSpaceBarSwipeRight", "spaceBarSwipeUp", "getSpaceBarSwipeUp", "setSpaceBarSwipeUp", "Lkeyboard/neon/newboard/ime/text/gestures/DistanceThreshold;", "swipeDistanceThreshold", "getSwipeDistanceThreshold", "()Lkeyboard/neon/newboard/ime/text/gestures/DistanceThreshold;", "setSwipeDistanceThreshold", "(Lkeyboard/neon/newboard/ime/text/gestures/DistanceThreshold;)V", "swipeDown", "getSwipeDown", "setSwipeDown", "swipeLeft", "getSwipeLeft", "setSwipeLeft", "swipeRight", "getSwipeRight", "setSwipeRight", "swipeUp", "getSwipeUp", "setSwipeUp", "Lkeyboard/neon/newboard/ime/text/gestures/VelocityThreshold;", "swipeVelocityThreshold", "getSwipeVelocityThreshold", "()Lkeyboard/neon/newboard/ime/text/gestures/VelocityThreshold;", "setSwipeVelocityThreshold", "(Lkeyboard/neon/newboard/ime/text/gestures/VelocityThreshold;)V", "Companion", "aosp_debug"})
    public static final class Gestures {
        private final keyboard.neon.newboard.ime.core.Preferences prefs = null;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.core.Preferences.Gestures.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SWIPE_UP = "gestures__swipe_up";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SWIPE_DOWN = "gestures__swipe_down";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SWIPE_LEFT = "gestures__swipe_left";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SWIPE_RIGHT = "gestures__swipe_right";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SPACE_BAR_LONG_PRESS = "gestures__space_bar_long_press";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SPACE_BAR_SWIPE_LEFT = "gestures__space_bar_swipe_left";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SPACE_BAR_SWIPE_RIGHT = "gestures__space_bar_swipe_right";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SPACE_BAR_SWIPE_UP = "gestures__space_bar_swipe_up";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DELETE_KEY_SWIPE_LEFT = "gestures__delete_key_swipe_left";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SWIPE_VELOCITY_THRESHOLD = "gestures__swipe_velocity_threshold";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SWIPE_DISTANCE_THRESHOLD = "gestures__swipe_distance_threshold";
        
        public Gestures(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.Preferences prefs) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.SwipeAction getSwipeUp() {
            return null;
        }
        
        public final void setSwipeUp(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.SwipeAction v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.SwipeAction getSwipeDown() {
            return null;
        }
        
        public final void setSwipeDown(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.SwipeAction v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.SwipeAction getSwipeLeft() {
            return null;
        }
        
        public final void setSwipeLeft(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.SwipeAction v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.SwipeAction getSwipeRight() {
            return null;
        }
        
        public final void setSwipeRight(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.SwipeAction v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.SwipeAction getSpaceBarLongPress() {
            return null;
        }
        
        public final void setSpaceBarLongPress(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.SwipeAction v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.SwipeAction getSpaceBarSwipeUp() {
            return null;
        }
        
        public final void setSpaceBarSwipeUp(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.SwipeAction v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.SwipeAction getSpaceBarSwipeLeft() {
            return null;
        }
        
        public final void setSpaceBarSwipeLeft(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.SwipeAction v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.SwipeAction getSpaceBarSwipeRight() {
            return null;
        }
        
        public final void setSpaceBarSwipeRight(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.SwipeAction v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.SwipeAction getDeleteKeySwipeLeft() {
            return null;
        }
        
        public final void setDeleteKeySwipeLeft(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.SwipeAction v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.VelocityThreshold getSwipeVelocityThreshold() {
            return null;
        }
        
        public final void setSwipeVelocityThreshold(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.VelocityThreshold v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.DistanceThreshold getSwipeDistanceThreshold() {
            return null;
        }
        
        public final void setSwipeDistanceThreshold(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.DistanceThreshold v) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Gestures$Companion;", "", "()V", "DELETE_KEY_SWIPE_LEFT", "", "SPACE_BAR_LONG_PRESS", "SPACE_BAR_SWIPE_LEFT", "SPACE_BAR_SWIPE_RIGHT", "SPACE_BAR_SWIPE_UP", "SWIPE_DISTANCE_THRESHOLD", "SWIPE_DOWN", "SWIPE_LEFT", "SWIPE_RIGHT", "SWIPE_UP", "SWIPE_VELOCITY_THRESHOLD", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Wrapper class for glide preferences.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR$\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Glide;", "", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "(Lkeyboard/neon/newboard/ime/core/Preferences;)V", "v", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "", "previewRefreshDelay", "getPreviewRefreshDelay", "()I", "setPreviewRefreshDelay", "(I)V", "showPreview", "getShowPreview", "setShowPreview", "showTrail", "getShowTrail", "setShowTrail", "trailDuration", "getTrailDuration", "setTrailDuration", "Companion", "aosp_debug"})
    public static final class Glide {
        private final keyboard.neon.newboard.ime.core.Preferences prefs = null;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.core.Preferences.Glide.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ENABLED = "glide__enabled";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SHOW_TRAIL = "glide__show_trail";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TRAIL_DURATION = "glide__trail_fade_duration";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SHOW_PREVIEW = "glide__show_preview";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PREVIEW_REFRESH_DELAY = "glide__preview_refresh_delay";
        
        public Glide(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.Preferences prefs) {
            super();
        }
        
        public final boolean getEnabled() {
            return false;
        }
        
        public final void setEnabled(boolean v) {
        }
        
        public final boolean getShowTrail() {
            return false;
        }
        
        public final void setShowTrail(boolean v) {
        }
        
        public final int getTrailDuration() {
            return 0;
        }
        
        public final void setTrailDuration(int v) {
        }
        
        public final boolean getShowPreview() {
            return false;
        }
        
        public final void setShowPreview(boolean v) {
        }
        
        public final int getPreviewRefreshDelay() {
            return 0;
        }
        
        public final void setPreviewRefreshDelay(int v) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Glide$Companion;", "", "()V", "ENABLED", "", "PREVIEW_REFRESH_DELAY", "SHOW_PREVIEW", "SHOW_TRAIL", "TRAIL_DURATION", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Wrapper class for internal preferences. A preference qualifies as an internal pref if the
     * user has no ability to control this preference's value directly (via a UI pref view).
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b%\u0018\u0000 B2\u00020\u0001:\u0001BB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR$\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR$\u0010\'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000bR$\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR$\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR$\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010\u000bR$\u00103\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b4\u0010\t\"\u0004\b5\u0010\u000bR$\u00106\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b7\u0010\t\"\u0004\b8\u0010\u000bR$\u00109\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b:\u0010\t\"\u0004\b;\u0010\u000bR$\u0010<\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b=\u0010!\"\u0004\b>\u0010#R$\u0010?\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b@\u0010!\"\u0004\bA\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$InputFeedback;", "", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "(Lkeyboard/neon/newboard/ime/core/Preferences;)V", "v", "", "audioEnabled", "getAudioEnabled", "()Z", "setAudioEnabled", "(Z)V", "audioFeatGestureMovingSwipe", "getAudioFeatGestureMovingSwipe", "setAudioFeatGestureMovingSwipe", "audioFeatGestureSwipe", "getAudioFeatGestureSwipe", "setAudioFeatGestureSwipe", "audioFeatKeyLongPress", "getAudioFeatKeyLongPress", "setAudioFeatKeyLongPress", "audioFeatKeyPress", "getAudioFeatKeyPress", "setAudioFeatKeyPress", "audioFeatKeyRepeatedAction", "getAudioFeatKeyRepeatedAction", "setAudioFeatKeyRepeatedAction", "audioIgnoreSystemSettings", "getAudioIgnoreSystemSettings", "setAudioIgnoreSystemSettings", "", "audioVolume", "getAudioVolume", "()I", "setAudioVolume", "(I)V", "hapticEnabled", "getHapticEnabled", "setHapticEnabled", "hapticFeatGestureMovingSwipe", "getHapticFeatGestureMovingSwipe", "setHapticFeatGestureMovingSwipe", "hapticFeatGestureSwipe", "getHapticFeatGestureSwipe", "setHapticFeatGestureSwipe", "hapticFeatKeyLongPress", "getHapticFeatKeyLongPress", "setHapticFeatKeyLongPress", "hapticFeatKeyPress", "getHapticFeatKeyPress", "setHapticFeatKeyPress", "hapticFeatKeyRepeatedAction", "getHapticFeatKeyRepeatedAction", "setHapticFeatKeyRepeatedAction", "hapticIgnoreSystemSettings", "getHapticIgnoreSystemSettings", "setHapticIgnoreSystemSettings", "hapticUseVibrator", "getHapticUseVibrator", "setHapticUseVibrator", "hapticVibrationDuration", "getHapticVibrationDuration", "setHapticVibrationDuration", "hapticVibrationStrength", "getHapticVibrationStrength", "setHapticVibrationStrength", "Companion", "aosp_debug"})
    public static final class InputFeedback {
        private final keyboard.neon.newboard.ime.core.Preferences prefs = null;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.core.Preferences.InputFeedback.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AUDIO_ENABLED = "input_feedback__audio_enabled";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AUDIO_IGNORE_SYSTEM_SETTINGS = "input_feedback__audio_ignore_system_settings";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AUDIO_VOLUME = "input_feedback__audio_volume";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AUDIO_FEAT_KEY_PRESS = "input_feedback__audio_feat_key_press";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AUDIO_FEAT_KEY_LONG_PRESS = "input_feedback__audio_feat_key_long_press";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AUDIO_FEAT_KEY_REPEATED_ACTION = "input_feedback__audio_feat_key_repeated_action";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AUDIO_FEAT_GESTURE_SWIPE = "input_feedback__audio_feat_gesture_swipe";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AUDIO_FEAT_GESTURE_MOVING_SWIPE = "input_feedback__audio_feat_gesture_moving_swipe";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String HAPTIC_ENABLED = "input_feedback__haptic_enabled";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String HAPTIC_IGNORE_SYSTEM_SETTINGS = "input_feedback__haptic_ignore_system_settings";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String HAPTIC_USE_VIBRATOR = "input_feedback__haptic_use_vibrator";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String HAPTIC_VIBRATION_DURATION = "input_feedback__haptic_vibration_duration";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String HAPTIC_VIBRATION_STRENGTH = "input_feedback__haptic_vibration_strength";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String HAPTIC_FEAT_KEY_PRESS = "input_feedback__haptic_feat_key_press";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String HAPTIC_FEAT_KEY_LONG_PRESS = "input_feedback__haptic_feat_key_long_press";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String HAPTIC_FEAT_KEY_REPEATED_ACTION = "input_feedback__haptic_feat_key_repeated_action";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String HAPTIC_FEAT_GESTURE_SWIPE = "input_feedback__haptic_feat_gesture_swipe";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String HAPTIC_FEAT_GESTURE_MOVING_SWIPE = "input_feedback__haptic_feat_gesture_moving_swipe";
        
        public InputFeedback(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.Preferences prefs) {
            super();
        }
        
        public final boolean getAudioEnabled() {
            return false;
        }
        
        public final void setAudioEnabled(boolean v) {
        }
        
        public final boolean getAudioIgnoreSystemSettings() {
            return false;
        }
        
        public final void setAudioIgnoreSystemSettings(boolean v) {
        }
        
        public final int getAudioVolume() {
            return 0;
        }
        
        public final void setAudioVolume(int v) {
        }
        
        public final boolean getAudioFeatKeyPress() {
            return false;
        }
        
        public final void setAudioFeatKeyPress(boolean v) {
        }
        
        public final boolean getAudioFeatKeyLongPress() {
            return false;
        }
        
        public final void setAudioFeatKeyLongPress(boolean v) {
        }
        
        public final boolean getAudioFeatKeyRepeatedAction() {
            return false;
        }
        
        public final void setAudioFeatKeyRepeatedAction(boolean v) {
        }
        
        public final boolean getAudioFeatGestureSwipe() {
            return false;
        }
        
        public final void setAudioFeatGestureSwipe(boolean v) {
        }
        
        public final boolean getAudioFeatGestureMovingSwipe() {
            return false;
        }
        
        public final void setAudioFeatGestureMovingSwipe(boolean v) {
        }
        
        public final boolean getHapticEnabled() {
            return false;
        }
        
        public final void setHapticEnabled(boolean v) {
        }
        
        public final boolean getHapticIgnoreSystemSettings() {
            return false;
        }
        
        public final void setHapticIgnoreSystemSettings(boolean v) {
        }
        
        public final boolean getHapticUseVibrator() {
            return false;
        }
        
        public final void setHapticUseVibrator(boolean v) {
        }
        
        public final int getHapticVibrationDuration() {
            return 0;
        }
        
        public final void setHapticVibrationDuration(int v) {
        }
        
        public final int getHapticVibrationStrength() {
            return 0;
        }
        
        public final void setHapticVibrationStrength(int v) {
        }
        
        public final boolean getHapticFeatKeyPress() {
            return false;
        }
        
        public final void setHapticFeatKeyPress(boolean v) {
        }
        
        public final boolean getHapticFeatKeyLongPress() {
            return false;
        }
        
        public final void setHapticFeatKeyLongPress(boolean v) {
        }
        
        public final boolean getHapticFeatKeyRepeatedAction() {
            return false;
        }
        
        public final void setHapticFeatKeyRepeatedAction(boolean v) {
        }
        
        public final boolean getHapticFeatGestureSwipe() {
            return false;
        }
        
        public final void setHapticFeatGestureSwipe(boolean v) {
        }
        
        public final boolean getHapticFeatGestureMovingSwipe() {
            return false;
        }
        
        public final void setHapticFeatGestureMovingSwipe(boolean v) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$InputFeedback$Companion;", "", "()V", "AUDIO_ENABLED", "", "AUDIO_FEAT_GESTURE_MOVING_SWIPE", "AUDIO_FEAT_GESTURE_SWIPE", "AUDIO_FEAT_KEY_LONG_PRESS", "AUDIO_FEAT_KEY_PRESS", "AUDIO_FEAT_KEY_REPEATED_ACTION", "AUDIO_IGNORE_SYSTEM_SETTINGS", "AUDIO_VOLUME", "HAPTIC_ENABLED", "HAPTIC_FEAT_GESTURE_MOVING_SWIPE", "HAPTIC_FEAT_GESTURE_SWIPE", "HAPTIC_FEAT_KEY_LONG_PRESS", "HAPTIC_FEAT_KEY_PRESS", "HAPTIC_FEAT_KEY_REPEATED_ACTION", "HAPTIC_IGNORE_SYSTEM_SETTINGS", "HAPTIC_USE_VIBRATOR", "HAPTIC_VIBRATION_DURATION", "HAPTIC_VIBRATION_STRENGTH", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Wrapper class for internal preferences. A preference qualifies as an internal pref if the
     * user has no ability to control this preference's value directly (via a UI pref view).
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R$\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Internal;", "", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "(Lkeyboard/neon/newboard/ime/core/Preferences;)V", "v", "", "isImeSetUp", "()Z", "setImeSetUp", "(Z)V", "", "versionLastChangelog", "getVersionLastChangelog", "()Ljava/lang/String;", "setVersionLastChangelog", "(Ljava/lang/String;)V", "versionLastUse", "getVersionLastUse", "setVersionLastUse", "versionOnInstall", "getVersionOnInstall", "setVersionOnInstall", "Companion", "aosp_debug"})
    public static final class Internal {
        private final keyboard.neon.newboard.ime.core.Preferences prefs = null;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.core.Preferences.Internal.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_IME_SET_UP = "internal__is_ime_set_up";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VERSION_ON_INSTALL = "internal__version_on_install";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VERSION_LAST_USE = "internal__version_last_use";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VERSION_LAST_CHANGELOG = "internal__version_last_changelog";
        
        public Internal(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.Preferences prefs) {
            super();
        }
        
        public final boolean isImeSetUp() {
            return false;
        }
        
        public final void setImeSetUp(boolean v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getVersionOnInstall() {
            return null;
        }
        
        public final void setVersionOnInstall(@org.jetbrains.annotations.NotNull()
        java.lang.String v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getVersionLastUse() {
            return null;
        }
        
        public final void setVersionLastUse(@org.jetbrains.annotations.NotNull()
        java.lang.String v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getVersionLastChangelog() {
            return null;
        }
        
        public final void setVersionLastChangelog(@org.jetbrains.annotations.NotNull()
        java.lang.String v) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Internal$Companion;", "", "()V", "IS_IME_SET_UP", "", "VERSION_LAST_CHANGELOG", "VERSION_LAST_USE", "VERSION_ON_INSTALL", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Wrapper class for keyboard preferences.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 S2\u00020\u0001:\u0001SB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010Q\u001a\u00020RR \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR$\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u0010R \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00148F@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u0010R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u001b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u001b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R \u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8F@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R \u0010(\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8F@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\'R$\u0010+\u001a\u00020*2\u0006\u0010\f\u001a\u00020*8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R \u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\tR$\u00103\u001a\u0002022\u0006\u0010\f\u001a\u0002028F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u00108\u001a\u0002022\u0006\u0010\f\u001a\u0002028F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b9\u00105\"\u0004\b:\u00107R$\u0010<\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u00148F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b=\u0010\u0017\"\u0004\b>\u0010?R$\u0010@\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bA\u0010\t\"\u0004\bB\u0010\u0010R \u0010C\u001a\u0002022\u0006\u0010\u0005\u001a\u0002028F@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00105R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010E\u001a\u0002022\u0006\u0010\f\u001a\u0002028F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bF\u00105\"\u0004\bG\u00107R$\u0010I\u001a\u00020H2\u0006\u0010\f\u001a\u00020H8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010N\u001a\u0002022\u0006\u0010\f\u001a\u0002028F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bO\u00105\"\u0004\bP\u00107\u00a8\u0006T"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Keyboard;", "", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "(Lkeyboard/neon/newboard/ime/core/Preferences;)V", "<set-?>", "", "bottomOffsetLandscape", "getBottomOffsetLandscape", "()I", "bottomOffsetPortrait", "getBottomOffsetPortrait", "v", "fontSizeMultiplierLandscape", "getFontSizeMultiplierLandscape", "setFontSizeMultiplierLandscape", "(I)V", "fontSizeMultiplierPortrait", "getFontSizeMultiplierPortrait", "setFontSizeMultiplierPortrait", "", "heightFactor", "getHeightFactor", "()Ljava/lang/String;", "heightFactorCustom", "getHeightFactorCustom", "setHeightFactorCustom", "Lkeyboard/neon/newboard/ime/text/key/KeyHintMode;", "hintedNumberRowMode", "getHintedNumberRowMode", "()Lkeyboard/neon/newboard/ime/text/key/KeyHintMode;", "setHintedNumberRowMode", "(Lkeyboard/neon/newboard/ime/text/key/KeyHintMode;)V", "hintedSymbolsMode", "getHintedSymbolsMode", "setHintedSymbolsMode", "", "keySpacingHorizontal", "getKeySpacingHorizontal", "()F", "keySpacingVertical", "getKeySpacingVertical", "Lkeyboard/neon/newboard/ime/landscapeinput/LandscapeInputUiMode;", "landscapeInputUiMode", "getLandscapeInputUiMode", "()Lkeyboard/neon/newboard/ime/landscapeinput/LandscapeInputUiMode;", "setLandscapeInputUiMode", "(Lkeyboard/neon/newboard/ime/landscapeinput/LandscapeInputUiMode;)V", "longPressDelay", "getLongPressDelay", "", "mergeHintPopupsEnabled", "getMergeHintPopupsEnabled", "()Z", "setMergeHintPopupsEnabled", "(Z)V", "numberRow", "getNumberRow", "setNumberRow", "value", "oneHandedMode", "getOneHandedMode", "setOneHandedMode", "(Ljava/lang/String;)V", "oneHandedModeScaleFactor", "getOneHandedModeScaleFactor", "setOneHandedModeScaleFactor", "popupEnabled", "getPopupEnabled", "spaceBarSwitchesToCharacters", "getSpaceBarSwitchesToCharacters", "setSpaceBarSwitchesToCharacters", "Lkeyboard/neon/newboard/ime/text/key/UtilityKeyAction;", "utilityKeyAction", "getUtilityKeyAction", "()Lkeyboard/neon/newboard/ime/text/key/UtilityKeyAction;", "setUtilityKeyAction", "(Lkeyboard/neon/newboard/ime/text/key/UtilityKeyAction;)V", "utilityKeyEnabled", "getUtilityKeyEnabled", "setUtilityKeyEnabled", "keyHintConfiguration", "Lkeyboard/neon/newboard/ime/text/key/KeyHintConfiguration;", "Companion", "aosp_debug"})
    public static final class Keyboard {
        private final keyboard.neon.newboard.ime.core.Preferences prefs = null;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.core.Preferences.Keyboard.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BOTTOM_OFFSET_PORTRAIT = "keyboard__bottom_offset_portrait";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BOTTOM_OFFSET_LANDSCAPE = "keyboard__bottom_offset_landscape";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FONT_SIZE_MULTIPLIER_PORTRAIT = "keyboard__font_size_multiplier_portrait";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FONT_SIZE_MULTIPLIER_LANDSCAPE = "keyboard__font_size_multiplier_landscape";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String HEIGHT_FACTOR = "keyboard__height_factor";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String HEIGHT_FACTOR_CUSTOM = "keyboard__height_factor_custom";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String HINTED_NUMBER_ROW_MODE = "keyboard__hinted_number_row_mode";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String HINTED_SYMBOLS_MODE = "keyboard__hinted_symbols_mode";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEY_SPACING_HORIZONTAL = "keyboard__key_spacing_horizontal";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEY_SPACING_VERTICAL = "keyboard__key_spacing_vertical";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LANDSCAPE_INPUT_UI_MODE = "keyboard__landscape_input_ui_mode";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LONG_PRESS_DELAY = "keyboard__long_press_delay";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MERGE_HINT_POPUPS_ENABLED = "keyboard__merge_hint_popups_enabled";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NUMBER_ROW = "keyboard__number_row";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ONE_HANDED_MODE = "keyboard__one_handed_mode";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ONE_HANDED_MODE_SCALE_FACTOR = "keyboard__one_handed_mode_scale_factor";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String POPUP_ENABLED = "keyboard__popup_enabled";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SPACE_BAR_SWITCHES_TO_CHARACTERS = "keyboard__space_bar_switches_to_characters";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String UTILITY_KEY_ACTION = "keyboard__utility_key_action";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String UTILITY_KEY_ENABLED = "keyboard__utility_key_enabled";
        private int bottomOffsetPortrait = 0;
        private int bottomOffsetLandscape = 0;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String heightFactor = "";
        private float keySpacingHorizontal = 2.0F;
        private float keySpacingVertical = 5.0F;
        private int longPressDelay = 0;
        private boolean popupEnabled = false;
        
        public Keyboard(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.Preferences prefs) {
            super();
        }
        
        public final int getBottomOffsetPortrait() {
            return 0;
        }
        
        public final int getBottomOffsetLandscape() {
            return 0;
        }
        
        public final int getFontSizeMultiplierPortrait() {
            return 0;
        }
        
        public final void setFontSizeMultiplierPortrait(int v) {
        }
        
        public final int getFontSizeMultiplierLandscape() {
            return 0;
        }
        
        public final void setFontSizeMultiplierLandscape(int v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHeightFactor() {
            return null;
        }
        
        public final int getHeightFactorCustom() {
            return 0;
        }
        
        public final void setHeightFactorCustom(int v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.key.KeyHintMode getHintedNumberRowMode() {
            return null;
        }
        
        public final void setHintedNumberRowMode(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.key.KeyHintMode v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.key.KeyHintMode getHintedSymbolsMode() {
            return null;
        }
        
        public final void setHintedSymbolsMode(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.key.KeyHintMode v) {
        }
        
        public final float getKeySpacingHorizontal() {
            return 0.0F;
        }
        
        public final float getKeySpacingVertical() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.landscapeinput.LandscapeInputUiMode getLandscapeInputUiMode() {
            return null;
        }
        
        public final void setLandscapeInputUiMode(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.landscapeinput.LandscapeInputUiMode v) {
        }
        
        public final int getLongPressDelay() {
            return 0;
        }
        
        public final boolean getMergeHintPopupsEnabled() {
            return false;
        }
        
        public final void setMergeHintPopupsEnabled(boolean v) {
        }
        
        public final boolean getNumberRow() {
            return false;
        }
        
        public final void setNumberRow(boolean v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOneHandedMode() {
            return null;
        }
        
        public final void setOneHandedMode(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
        }
        
        public final int getOneHandedModeScaleFactor() {
            return 0;
        }
        
        public final void setOneHandedModeScaleFactor(int v) {
        }
        
        public final boolean getPopupEnabled() {
            return false;
        }
        
        public final boolean getSpaceBarSwitchesToCharacters() {
            return false;
        }
        
        public final void setSpaceBarSwitchesToCharacters(boolean v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.key.UtilityKeyAction getUtilityKeyAction() {
            return null;
        }
        
        public final void setUtilityKeyAction(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.key.UtilityKeyAction v) {
        }
        
        public final boolean getUtilityKeyEnabled() {
            return false;
        }
        
        public final void setUtilityKeyEnabled(boolean v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.key.KeyHintConfiguration keyHintConfiguration() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Keyboard$Companion;", "", "()V", "BOTTOM_OFFSET_LANDSCAPE", "", "BOTTOM_OFFSET_PORTRAIT", "FONT_SIZE_MULTIPLIER_LANDSCAPE", "FONT_SIZE_MULTIPLIER_PORTRAIT", "HEIGHT_FACTOR", "HEIGHT_FACTOR_CUSTOM", "HINTED_NUMBER_ROW_MODE", "HINTED_SYMBOLS_MODE", "KEY_SPACING_HORIZONTAL", "KEY_SPACING_VERTICAL", "LANDSCAPE_INPUT_UI_MODE", "LONG_PRESS_DELAY", "MERGE_HINT_POPUPS_ENABLED", "NUMBER_ROW", "ONE_HANDED_MODE", "ONE_HANDED_MODE_SCALE_FACTOR", "POPUP_ENABLED", "SPACE_BAR_SWITCHES_TO_CHARACTERS", "UTILITY_KEY_ACTION", "UTILITY_KEY_ENABLED", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Wrapper class for localization preferences.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Localization;", "", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "(Lkeyboard/neon/newboard/ime/core/Preferences;)V", "v", "", "activeSubtypeId", "getActiveSubtypeId", "()I", "setActiveSubtypeId", "(I)V", "", "subtypes", "getSubtypes", "()Ljava/lang/String;", "setSubtypes", "(Ljava/lang/String;)V", "Companion", "aosp_debug"})
    public static final class Localization {
        private final keyboard.neon.newboard.ime.core.Preferences prefs = null;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.core.Preferences.Localization.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ACTIVE_SUBTYPE_ID = "localization__active_subtype_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SUBTYPES = "localization__subtypes";
        
        public Localization(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.Preferences prefs) {
            super();
        }
        
        public final int getActiveSubtypeId() {
            return 0;
        }
        
        public final void setActiveSubtypeId(int v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSubtypes() {
            return null;
        }
        
        public final void setSubtypes(@org.jetbrains.annotations.NotNull()
        java.lang.String v) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Localization$Companion;", "", "()V", "ACTIVE_SUBTYPE_ID", "", "SUBTYPES", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Wrapper class for Smartbar preferences.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Smartbar;", "", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "(Lkeyboard/neon/newboard/ime/core/Preferences;)V", "v", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "Companion", "aosp_debug"})
    public static final class Smartbar {
        private final keyboard.neon.newboard.ime.core.Preferences prefs = null;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.core.Preferences.Smartbar.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ENABLED = "smartbar__enabled";
        
        public Smartbar(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.Preferences prefs) {
            super();
        }
        
        public final boolean getEnabled() {
            return false;
        }
        
        public final void setEnabled(boolean v) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Smartbar$Companion;", "", "()V", "ENABLED", "", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Wrapper class for suggestion preferences.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 $2\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000b\u00a8\u0006%"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Suggestion;", "", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "(Lkeyboard/neon/newboard/ime/core/Preferences;)V", "v", "", "api30InlineSuggestionsEnabled", "getApi30InlineSuggestionsEnabled", "()Z", "setApi30InlineSuggestionsEnabled", "(Z)V", "blockPossiblyOffensive", "getBlockPossiblyOffensive", "setBlockPossiblyOffensive", "clipboardContentEnabled", "getClipboardContentEnabled", "setClipboardContentEnabled", "", "clipboardContentTimeout", "getClipboardContentTimeout", "()I", "setClipboardContentTimeout", "(I)V", "Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$DisplayMode;", "displayMode", "getDisplayMode", "()Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$DisplayMode;", "setDisplayMode", "(Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$DisplayMode;)V", "enabled", "getEnabled", "setEnabled", "usePrevWords", "getUsePrevWords", "setUsePrevWords", "Companion", "aosp_debug"})
    public static final class Suggestion {
        private final keyboard.neon.newboard.ime.core.Preferences prefs = null;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.core.Preferences.Suggestion.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API30_INLINE_SUGGESTIONS_ENABLED = "suggestion__api30_inline_suggestions_enabled";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BLOCK_POSSIBLY_OFFENSIVE = "suggestion__block_possibly_offensive";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CLIPBOARD_CONTENT_ENABLED = "suggestion__clipboard_content_enabled";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CLIPBOARD_CONTENT_TIMEOUT = "suggestion__clipboard_content_timeout";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DISPLAY_MODE = "suggestion__display_mode";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ENABLED = "suggestion__enabled";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USE_PREV_WORDS = "suggestion__use_prev_words";
        
        public Suggestion(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.Preferences prefs) {
            super();
        }
        
        public final boolean getApi30InlineSuggestionsEnabled() {
            return false;
        }
        
        public final void setApi30InlineSuggestionsEnabled(boolean v) {
        }
        
        public final boolean getBlockPossiblyOffensive() {
            return false;
        }
        
        public final void setBlockPossiblyOffensive(boolean v) {
        }
        
        public final boolean getClipboardContentEnabled() {
            return false;
        }
        
        public final void setClipboardContentEnabled(boolean v) {
        }
        
        public final int getClipboardContentTimeout() {
            return 0;
        }
        
        public final void setClipboardContentTimeout(int v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.smartbar.CandidateView.DisplayMode getDisplayMode() {
            return null;
        }
        
        public final void setDisplayMode(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.smartbar.CandidateView.DisplayMode v) {
        }
        
        public final boolean getEnabled() {
            return false;
        }
        
        public final void setEnabled(boolean v) {
        }
        
        public final boolean getUsePrevWords() {
            return false;
        }
        
        public final void setUsePrevWords(boolean v) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Suggestion$Companion;", "", "()V", "API30_INLINE_SUGGESTIONS_ENABLED", "", "BLOCK_POSSIBLY_OFFENSIVE", "CLIPBOARD_CONTENT_ENABLED", "CLIPBOARD_CONTENT_TIMEOUT", "DISPLAY_MODE", "ENABLED", "USE_PREV_WORDS", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Wrapper class for theme preferences.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \'2\u00020\u0001:\u0001\'B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR$\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#\u00a8\u0006("}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Theme;", "", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "(Lkeyboard/neon/newboard/ime/core/Preferences;)V", "v", "", "dayThemeAdaptToApp", "getDayThemeAdaptToApp", "()Z", "setDayThemeAdaptToApp", "(Z)V", "", "dayThemeRef", "getDayThemeRef", "()Ljava/lang/String;", "setDayThemeRef", "(Ljava/lang/String;)V", "Lkeyboard/neon/newboard/ime/theme/ThemeMode;", "mode", "getMode", "()Lkeyboard/neon/newboard/ime/theme/ThemeMode;", "setMode", "(Lkeyboard/neon/newboard/ime/theme/ThemeMode;)V", "nightThemeAdaptToApp", "getNightThemeAdaptToApp", "setNightThemeAdaptToApp", "nightThemeRef", "getNightThemeRef", "setNightThemeRef", "", "sunriseTime", "getSunriseTime", "()I", "setSunriseTime", "(I)V", "sunsetTime", "getSunsetTime", "setSunsetTime", "Companion", "aosp_debug"})
    public static final class Theme {
        private final keyboard.neon.newboard.ime.core.Preferences prefs = null;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.core.Preferences.Theme.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MODE = "theme__mode";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DAY_THEME_REF = "theme__day_theme_ref";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DAY_THEME_ADAPT_TO_APP = "theme__day_theme_adapt_to_app";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NIGHT_THEME_REF = "theme__night_theme_ref";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NIGHT_THEME_ADAPT_TO_APP = "theme__night_theme_adapt_to_app";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SUNRISE_TIME = "theme__sunrise_time";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SUNSET_TIME = "theme__sunset_time";
        
        public Theme(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.Preferences prefs) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.theme.ThemeMode getMode() {
            return null;
        }
        
        public final void setMode(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.theme.ThemeMode v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDayThemeRef() {
            return null;
        }
        
        public final void setDayThemeRef(@org.jetbrains.annotations.NotNull()
        java.lang.String v) {
        }
        
        public final boolean getDayThemeAdaptToApp() {
            return false;
        }
        
        public final void setDayThemeAdaptToApp(boolean v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNightThemeRef() {
            return null;
        }
        
        public final void setNightThemeRef(@org.jetbrains.annotations.NotNull()
        java.lang.String v) {
        }
        
        public final boolean getNightThemeAdaptToApp() {
            return false;
        }
        
        public final void setNightThemeAdaptToApp(boolean v) {
        }
        
        public final int getSunriseTime() {
            return 0;
        }
        
        public final void setSunriseTime(int v) {
        }
        
        public final int getSunsetTime() {
            return 0;
        }
        
        public final void setSunsetTime(int v) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Theme$Companion;", "", "()V", "DAY_THEME_ADAPT_TO_APP", "", "DAY_THEME_REF", "MODE", "NIGHT_THEME_ADAPT_TO_APP", "NIGHT_THEME_REF", "SUNRISE_TIME", "SUNSET_TIME", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Wrapper class for clipboard preferences
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u0000 $2\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R$\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R$\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R$\u0010!\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011\u00a8\u0006%"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Clipboard;", "", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "(Lkeyboard/neon/newboard/ime/core/Preferences;)V", "v", "", "cleanUpAfter", "getCleanUpAfter", "()I", "setCleanUpAfter", "(I)V", "", "cleanUpOld", "getCleanUpOld", "()Z", "setCleanUpOld", "(Z)V", "enableHistory", "getEnableHistory", "setEnableHistory", "enableInternal", "getEnableInternal", "setEnableInternal", "limitHistorySize", "getLimitHistorySize", "setLimitHistorySize", "maxHistorySize", "getMaxHistorySize", "setMaxHistorySize", "syncToFloris", "getSyncToFloris", "setSyncToFloris", "syncToSystem", "getSyncToSystem", "setSyncToSystem", "Companion", "aosp_debug"})
    public static final class Clipboard {
        private final keyboard.neon.newboard.ime.core.Preferences prefs = null;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.core.Preferences.Clipboard.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ENABLE_INTERNAL = "clipboard__enable_internal";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SYNC_TO_SYSTEM = "clipboard__sync_to_system";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SYNC_TO_FLORIS = "clipboard__sync_to_floris";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ENABLE_HISTORY = "clipboard__enable_history";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CLEAN_UP_OLD = "clipboard__clean_up_old";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LIMIT_HISTORY_SIZE = "clipboard__limit_history_size";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CLEAN_UP_AFTER = "clipboard__clean_up_after";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MAX_HISTORY_SIZE = "clipboard__max_history_size";
        
        public Clipboard(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.Preferences prefs) {
            super();
        }
        
        public final boolean getEnableInternal() {
            return false;
        }
        
        public final void setEnableInternal(boolean v) {
        }
        
        public final boolean getSyncToSystem() {
            return false;
        }
        
        public final void setSyncToSystem(boolean v) {
        }
        
        public final boolean getSyncToFloris() {
            return false;
        }
        
        public final void setSyncToFloris(boolean v) {
        }
        
        public final boolean getEnableHistory() {
            return false;
        }
        
        public final void setEnableHistory(boolean v) {
        }
        
        public final boolean getCleanUpOld() {
            return false;
        }
        
        public final void setCleanUpOld(boolean v) {
        }
        
        public final boolean getLimitHistorySize() {
            return false;
        }
        
        public final void setLimitHistorySize(boolean v) {
        }
        
        public final int getCleanUpAfter() {
            return 0;
        }
        
        public final void setCleanUpAfter(int v) {
        }
        
        public final int getMaxHistorySize() {
            return 0;
        }
        
        public final void setMaxHistorySize(int v) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Clipboard$Companion;", "", "()V", "CLEAN_UP_AFTER", "", "CLEAN_UP_OLD", "ENABLE_HISTORY", "ENABLE_INTERNAL", "LIMIT_HISTORY_SIZE", "MAX_HISTORY_SIZE", "SYNC_TO_FLORIS", "SYNC_TO_SYSTEM", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lkeyboard/neon/newboard/ime/core/Preferences$Companion;", "", "()V", "OLD_SUBTYPES_REGEX", "Lkotlin/text/Regex;", "defaultInstance", "Lkeyboard/neon/newboard/ime/core/Preferences;", "default", "initDefault", "context", "Landroid/content/Context;", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Synchronized()
        public final synchronized keyboard.neon.newboard.ime.core.Preferences initDefault(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}