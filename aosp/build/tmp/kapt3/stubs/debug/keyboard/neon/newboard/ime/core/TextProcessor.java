package keyboard.neon.newboard.ime.core;

import java.lang.System;

@kotlin.Suppress(names = {"RegExpRedundantEscape"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lkeyboard/neon/newboard/ime/core/TextProcessor;", "", "()V", "LATIN_BASIC_WORD_REGEX", "Lkotlin/text/Regex;", "detectWords", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "text", "", "locale", "Lkeyboard/neon/newboard/common/FlorisLocale;", "start", "", "end", "isWord", "", "wordRegexFor", "aosp_debug"})
public final class TextProcessor {
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.core.TextProcessor INSTANCE = null;
    private static final kotlin.text.Regex LATIN_BASIC_WORD_REGEX = null;
    
    private TextProcessor() {
        super();
    }
    
    private final kotlin.text.Regex wordRegexFor(keyboard.neon.newboard.common.FlorisLocale locale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.sequences.Sequence<kotlin.ranges.IntRange> detectWords(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.common.FlorisLocale locale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.sequences.Sequence<kotlin.ranges.IntRange> detectWords(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int start, int end, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.common.FlorisLocale locale) {
        return null;
    }
    
    public final boolean isWord(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.common.FlorisLocale locale) {
        return false;
    }
}