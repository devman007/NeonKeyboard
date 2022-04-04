package keyboard.neon.newboard.ime.media.emoji;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001aH\u0002\u001a,\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0014j\u0002`\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"(\u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u0014j\u0004\u0018\u0001`\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000*.\u0010!\"\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00142\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0014\u00a8\u0006\""}, d2 = {"BALD", "", "CODE_POINT_REGEX", "Lkotlin/text/Regex;", "CURLY_HAIR", "DARK_SKIN_TONE", "EOF_IDENTIFIER", "FULLY_QUALIFIED", "GROUP_IDENTIFIER", "LIGHT_SKIN_TONE", "MEDIUM_DARK_SKIN_TONE", "MEDIUM_LIGHT_SKIN_TONE", "MEDIUM_SKIN_TONE", "MINIMALLY_QUALIFIED", "NAME_JUNK_SPLIT_REGEX", "RED_HAIR", "SUBGROUP_IDENTIFIER", "UNQUALIFIED", "WHITE_HAIR", "cachedEmojiLayoutMap", "Ljava/util/EnumMap;", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiCategory;", "", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyData;", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiLayoutDataMap;", "listStringToListInt", "", "", "list", "parseRawEmojiSpecsFile", "context", "Landroid/content/Context;", "path", "EmojiLayoutDataMap", "aosp_debug"})
public final class EmojiLayoutDataKt {
    private static final java.lang.String GROUP_IDENTIFIER = "# group: ";
    private static final java.lang.String SUBGROUP_IDENTIFIER = "# subgroup: ";
    private static final java.lang.String EOF_IDENTIFIER = "#EOF";
    private static final java.lang.String FULLY_QUALIFIED = "fully-qualified";
    private static final java.lang.String MINIMALLY_QUALIFIED = "minimally-qualified";
    private static final java.lang.String UNQUALIFIED = "unqualified";
    private static final java.lang.String LIGHT_SKIN_TONE = "1F3FB";
    private static final java.lang.String MEDIUM_LIGHT_SKIN_TONE = "1F3FC";
    private static final java.lang.String MEDIUM_SKIN_TONE = "1F3FD";
    private static final java.lang.String MEDIUM_DARK_SKIN_TONE = "1F3FE";
    private static final java.lang.String DARK_SKIN_TONE = "1F3FF";
    private static final java.lang.String RED_HAIR = "1F9B0";
    private static final java.lang.String CURLY_HAIR = "1F9B1";
    private static final java.lang.String WHITE_HAIR = "1F9B2";
    private static final java.lang.String BALD = "1F9B3";
    private static final kotlin.text.Regex NAME_JUNK_SPLIT_REGEX = null;
    private static final kotlin.text.Regex CODE_POINT_REGEX = null;
    private static java.util.EnumMap<keyboard.neon.newboard.ime.media.emoji.EmojiCategory, java.util.List<keyboard.neon.newboard.ime.media.emoji.EmojiKeyData>> cachedEmojiLayoutMap;
    
    /**
     * Converts a mutable list of Strings (which represent a number) to a list of Ints.
     *
     * @param list The input list.
     * @return The converted output list.
     */
    private static final java.util.List<java.lang.Integer> listStringToListInt(java.util.List<java.lang.String> list) {
        return null;
    }
    
    /**
     * Reads the emoji list at the given [path] and returns an parsed [EmojiLayoutDataMap]. If the
     * given file path does not exist, an empty [EmojiLayoutDataMap] is returned.
     *
     * TODO: Fix potential bug where the base version of a emoji is missing and therefore the emoji
     *      before has like 25 popups...
     *
     * @param context The initiating view's context.
     * @param path The path to the asset file.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.util.EnumMap<keyboard.neon.newboard.ime.media.emoji.EmojiCategory, java.util.List<keyboard.neon.newboard.ime.media.emoji.EmojiKeyData>> parseRawEmojiSpecsFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
}