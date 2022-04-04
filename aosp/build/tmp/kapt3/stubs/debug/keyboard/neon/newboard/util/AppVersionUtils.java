package keyboard.neon.newboard.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000e"}, d2 = {"Lkeyboard/neon/newboard/util/AppVersionUtils;", "", "()V", "getRawVersionName", "", "context", "Landroid/content/Context;", "shouldShowChangelog", "", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "updateVersionLastChangelog", "", "updateVersionOnInstallAndLastUse", "aosp_debug"})
public final class AppVersionUtils {
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.util.AppVersionUtils INSTANCE = null;
    
    private AppVersionUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRawVersionName(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final boolean shouldShowChangelog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Preferences prefs) {
        return false;
    }
    
    public final void updateVersionOnInstallAndLastUse(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Preferences prefs) {
    }
    
    public final void updateVersionLastChangelog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Preferences prefs) {
    }
}