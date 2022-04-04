package keyboard.neon.newboard.ime.theme;

import java.lang.System;

/**
 * Theme overlay class which, if enabled, changes some requested attributes in a Theme and returns
 * the corresponding adaptive color. The adaptive colors itself are determined by the ThemeManager
 * and this overlay class only uses them if the feature is enabled in the prefs.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0005J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/AdaptiveThemeOverlay;", "Lkeyboard/neon/newboard/ime/theme/Theme;", "themeManager", "Lkeyboard/neon/newboard/ime/theme/ThemeManager;", "theme", "(Lkeyboard/neon/newboard/ime/theme/ThemeManager;Lkeyboard/neon/newboard/ime/theme/Theme;)V", "getAttr", "Lkeyboard/neon/newboard/ime/theme/ThemeValue;", "ref", "Lkeyboard/neon/newboard/ime/theme/ThemeValue$Reference;", "s1", "", "s2", "aosp_debug"})
public final class AdaptiveThemeOverlay extends keyboard.neon.newboard.ime.theme.Theme {
    private final keyboard.neon.newboard.ime.theme.ThemeManager themeManager = null;
    
    public AdaptiveThemeOverlay(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.theme.ThemeManager themeManager, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.theme.Theme theme) {
        super(0, null, null, null, false, null, false, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public keyboard.neon.newboard.ime.theme.ThemeValue getAttr(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.theme.ThemeValue.Reference ref, @org.jetbrains.annotations.Nullable()
    java.lang.String s1, @org.jetbrains.annotations.Nullable()
    java.lang.String s2) {
        return null;
    }
}