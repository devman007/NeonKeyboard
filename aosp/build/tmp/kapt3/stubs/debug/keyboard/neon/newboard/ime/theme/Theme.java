package keyboard.neon.newboard.ime.theme;

import java.lang.System;

/**
 * Data class which holds a parsed theme json file. Used for loading a theme preset in Settings.
 * Note: this implementation is generic and allows for any group/attr names. FlorisBoard itself
 *      expects certain groups and attrs to be able to color the controls accordingly. See
 *      'ime/theme/floris_day.json' for a good example of which attributes FlorisBoard needs!
 *
 * @property isNightTheme If this theme is meant for display at day (false) or night (true). This
 * property is used to auto-assign this theme to either the day or night theme list in Settings,
 * which is used when the user wants to auto-set his theme based on the current time.
 * @property attributes Map which holds the raw attributes of this theme. Attributes are always
 * grouped together. This ensures a better structure and easier storage. The group- as well as the
 * attr-name must only consist of lowercase or uppercase Latin letters (a-z and/or A-Z).
 * Attribute values can be of different format:
 * 1. A color
 *    Either #RRGGBB or #AARRGGBB (case-insensitive) -> e.g. #A034FF23
 * 2. A static word
 *    - transparent
 *    - true
 *    - false
 * 3. A reference to another attribute within the SAME theme, as follows:
 *    @group/attrName -> e.g. @window/textColor
 *    Note that referencing attributes has its limitations:
 *    a. Recursive references will cause an infinite loop and FlorisBoard will then not react.
 * 4. If the value is of any other format, it is treated as an Other value with a raw string.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 02\u00020\u0001:\u0004./01By\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\n\u0012 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000e0\u000e\u00a2\u0006\u0002\u0010\u0013Jj\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\n2 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000e0\u000eJ(\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005H\u0016J(\u0010%\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010\u000f2\u0006\u0010!\u001a\u00020\"H\u0002J!\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u00c7\u0001R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R2\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000e0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001cR\u0011\u0010\f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015\u00a8\u00062\u0080\u00e5\b\u0004\u0080\u00e5\b\u0006\u0080\u00e5\b\u0007\u0080\u00e5\b\t\u0080\u00e5\b\u000b\u0080\u00e5\b\f\u0080\u00e5\b\r"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/Theme;", "Lkeyboard/neon/newboard/res/Asset;", "seen1", "", "name", "", "label", "authors", "", "isNeon", "", "animationName", "isNightTheme", "attributes", "", "Lkeyboard/neon/newboard/ime/theme/ThemeValue;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;ZLjava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;ZLjava/util/Map;)V", "getAnimationName", "()Ljava/lang/String;", "getAttributes", "()Ljava/util/Map;", "setAttributes", "(Ljava/util/Map;)V", "getAuthors", "()Ljava/util/List;", "()Z", "getLabel", "getName", "copy", "getAttr", "ref", "Lkeyboard/neon/newboard/ime/theme/ThemeValue$Reference;", "s1", "s2", "getAttrInternal", "getAttrOrNull", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Attr", "Companion", "ValidationField", "aosp_debug"})
@kotlinx.serialization.Serializable()
public class Theme implements keyboard.neon.newboard.res.Asset {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String label = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> authors = null;
    private final boolean isNeon = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String animationName = null;
    private final boolean isNightTheme = false;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends keyboard.neon.newboard.ime.theme.ThemeValue>> attributes;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.theme.Theme.Companion Companion = null;
    private static final kotlin.text.Regex VALIDATION_REGEX_THEME_LABEL = null;
    private static final kotlin.text.Regex VALIDATION_REGEX_GROUP_NAME = null;
    private static final kotlin.text.Regex VALIDATION_REGEX_ATTR_NAME = null;
    
    /**
     * A static base theme for fallback when a theme is absolutely needed but no theme can be
     * loaded from the AssetManager, etc.
     */
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.theme.Theme BASE_THEME = null;
    
    /**
     * Data class which holds a parsed theme json file. Used for loading a theme preset in Settings.
     * Note: this implementation is generic and allows for any group/attr names. FlorisBoard itself
     *      expects certain groups and attrs to be able to color the controls accordingly. See
     *      'ime/theme/floris_day.json' for a good example of which attributes FlorisBoard needs!
     *
     * @property isNightTheme If this theme is meant for display at day (false) or night (true). This
     * property is used to auto-assign this theme to either the day or night theme list in Settings,
     * which is used when the user wants to auto-set his theme based on the current time.
     * @property attributes Map which holds the raw attributes of this theme. Attributes are always
     * grouped together. This ensures a better structure and easier storage. The group- as well as the
     * attr-name must only consist of lowercase or uppercase Latin letters (a-z and/or A-Z).
     * Attribute values can be of different format:
     * 1. A color
     *    Either #RRGGBB or #AARRGGBB (case-insensitive) -> e.g. #A034FF23
     * 2. A static word
     *    - transparent
     *    - true
     *    - false
     * 3. A reference to another attribute within the SAME theme, as follows:
     *    @group/attrName -> e.g. @window/textColor
     *    Note that referencing attributes has its limitations:
     *    a. Recursive references will cause an infinite loop and FlorisBoard will then not react.
     * 4. If the value is of any other format, it is treated as an Other value with a raw string.
     */
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.theme.Theme self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public Theme(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> authors, boolean isNeon, @org.jetbrains.annotations.NotNull()
    java.lang.String animationName, boolean isNightTheme, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends keyboard.neon.newboard.ime.theme.ThemeValue>> attributes) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getAuthors() {
        return null;
    }
    
    public final boolean isNeon() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAnimationName() {
        return null;
    }
    
    public final boolean isNightTheme() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, keyboard.neon.newboard.ime.theme.ThemeValue>> getAttributes() {
        return null;
    }
    
    public final void setAttributes(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends keyboard.neon.newboard.ime.theme.ThemeValue>> p0) {
    }
    
    /**
     * Copies this theme to a new one while giving the option to modify some properties. For the
     * argument info see [Theme].
     *
     * @return The copied theme.
     */
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.theme.Theme copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> authors, boolean isNeon, @org.jetbrains.annotations.NotNull()
    java.lang.String animationName, boolean isNightTheme, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends keyboard.neon.newboard.ime.theme.ThemeValue>> attributes) {
        return null;
    }
    
    /**
     * Gets an attribute from this theme. Allows to specify "specifics" ([s1] and [s2]).
     *
     * @param ref The `group/attrName` pair which is a reference to the attribute which should be
     * resolved.
     * @param s1 "Specific 1": This only properly works for the `key` group and can be filled with
     * the label of a key. If the specific has no matches, a default resolve without the specific
     * will be made.
     * @param s2 "Specific 2": Allows for the values `caps` and `capslock`. This is useful top have
     * specific themes for a key (or all keys) when caps/caps lock is activated. If the specific
     * has no matches, a default resolve without the specific will be made.
     * @return The theme value for specified [ref]. If no value can be found within this theme, the
     * default value of type [ThemeValue.SolidColor] with a transparent color set will be returned.
     */
    @org.jetbrains.annotations.NotNull()
    public keyboard.neon.newboard.ime.theme.ThemeValue getAttr(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.theme.ThemeValue.Reference ref, @org.jetbrains.annotations.Nullable()
    java.lang.String s1, @org.jetbrains.annotations.Nullable()
    java.lang.String s2) {
        return null;
    }
    
    /**
     * Internal processing of the [getAttr] method. See [getAttr] for detailed info about the
     * method's input arguments.
     */
    private final keyboard.neon.newboard.ime.theme.ThemeValue getAttrInternal(keyboard.neon.newboard.ime.theme.ThemeValue.Reference ref, java.lang.String s1, java.lang.String s2) {
        return null;
    }
    
    /**
     * Internal processing of the [getAttr] method. See [getAttr] for detailed info about the
     * method's input arguments.
     */
    private final keyboard.neon.newboard.ime.theme.ThemeValue getAttrOrNull(keyboard.neon.newboard.ime.theme.ThemeValue.Reference ref) {
        return null;
    }
    
    /**
     * Detailed list of all attributes FlorisBoard needs to properly display a theme. Is used
     * within the project to fetch an attribute from the current theme.
     * Note: Suppressing some warnings as Kotlin cannot properly identify if an attribute is only
     *      used via [ThemeValue.Reference] or directly.
     */
    @kotlin.Suppress(names = {"unused"})
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/Theme$Attr;", "", "()V", "Companion", "aosp_debug"})
    public static abstract class Attr {
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.theme.Theme.Attr.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference WINDOW_COLOR_PRIMARY = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference WINDOW_COLOR_PRIMARY_DARK = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference WINDOW_COLOR_ACCENT = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference WINDOW_NAVIGATION_BAR_COLOR = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference WINDOW_NAVIGATION_BAR_LIGHT = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference WINDOW_SEMI_TRANSPARENT_COLOR = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference WINDOW_TEXT_COLOR = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference TAB_SELECTED_TEXT_COLOR = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference TAB_UNSELECTED_TEXT_COLOR = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference KEYBOARD_BACKGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference KEYBOARD_BG_DRAWABLE = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference KEY_BACKGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference KEY_BACKGROUND_PRESSED = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference KEY_FOREGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference KEY_FOREGROUND_PRESSED = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference KEY_SHOW_BORDER = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference KEY_ELEVATION = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference KEY_CORNER_RADIUS = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference KEY_STROKE_COLOR = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference MEDIA_FOREGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference MEDIA_FOREGROUND_ALT = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference ONE_HANDED_BACKGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference ONE_HANDED_FOREGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference POPUP_BACKGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference POPUP_BACKGROUND_ACTIVE = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference POPUP_FOREGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference PRIVATE_MODE_BACKGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference PRIVATE_MODE_FOREGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference SMARTBAR_BACKGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference SMARTBAR_FOREGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference SMARTBAR_FOREGROUND_ALT = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference SMARTBAR_BUTTON_BACKGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference SMARTBAR_BUTTON_FOREGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference EXTRACT_EDIT_LAYOUT_BACKGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference EXTRACT_EDIT_LAYOUT_FOREGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference EXTRACT_EDIT_LAYOUT_FOREGROUND_ALT = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference EXTRACT_ACTION_BUTTON_BACKGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference EXTRACT_ACTION_BUTTON_FOREGROUND = null;
        @org.jetbrains.annotations.NotNull()
        private static final keyboard.neon.newboard.ime.theme.ThemeValue.Reference GLIDE_TRAIL_COLOR = null;
        
        public Attr() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bO\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0011\u0010!\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0011\u0010#\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0011\u0010%\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006R\u0011\u0010\'\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0006R\u0011\u0010)\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0006R\u0011\u0010+\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0006R\u0011\u0010-\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0006R\u0011\u0010/\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0006R\u0011\u00101\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0006R\u0011\u00103\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0006R\u0011\u00105\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0006R\u0011\u00107\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0006R\u0011\u00109\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0006R\u0011\u0010;\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0006R\u0011\u0010=\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0006R\u0011\u0010?\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0006R\u0011\u0010A\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0006R\u0011\u0010C\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0006R\u0011\u0010E\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0006R\u0011\u0010G\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0006R\u0011\u0010I\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u0006R\u0011\u0010K\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010\u0006R\u0011\u0010M\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010\u0006R\u0011\u0010O\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010\u0006R\u0011\u0010Q\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0006\u00a8\u0006S"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/Theme$Attr$Companion;", "", "()V", "EXTRACT_ACTION_BUTTON_BACKGROUND", "Lkeyboard/neon/newboard/ime/theme/ThemeValue$Reference;", "getEXTRACT_ACTION_BUTTON_BACKGROUND", "()Lkeyboard/neon/newboard/ime/theme/ThemeValue$Reference;", "EXTRACT_ACTION_BUTTON_FOREGROUND", "getEXTRACT_ACTION_BUTTON_FOREGROUND", "EXTRACT_EDIT_LAYOUT_BACKGROUND", "getEXTRACT_EDIT_LAYOUT_BACKGROUND", "EXTRACT_EDIT_LAYOUT_FOREGROUND", "getEXTRACT_EDIT_LAYOUT_FOREGROUND", "EXTRACT_EDIT_LAYOUT_FOREGROUND_ALT", "getEXTRACT_EDIT_LAYOUT_FOREGROUND_ALT", "GLIDE_TRAIL_COLOR", "getGLIDE_TRAIL_COLOR", "KEYBOARD_BACKGROUND", "getKEYBOARD_BACKGROUND", "KEYBOARD_BG_DRAWABLE", "getKEYBOARD_BG_DRAWABLE", "KEY_BACKGROUND", "getKEY_BACKGROUND", "KEY_BACKGROUND_PRESSED", "getKEY_BACKGROUND_PRESSED", "KEY_CORNER_RADIUS", "getKEY_CORNER_RADIUS", "KEY_ELEVATION", "getKEY_ELEVATION", "KEY_FOREGROUND", "getKEY_FOREGROUND", "KEY_FOREGROUND_PRESSED", "getKEY_FOREGROUND_PRESSED", "KEY_SHOW_BORDER", "getKEY_SHOW_BORDER", "KEY_STROKE_COLOR", "getKEY_STROKE_COLOR", "MEDIA_FOREGROUND", "getMEDIA_FOREGROUND", "MEDIA_FOREGROUND_ALT", "getMEDIA_FOREGROUND_ALT", "ONE_HANDED_BACKGROUND", "getONE_HANDED_BACKGROUND", "ONE_HANDED_FOREGROUND", "getONE_HANDED_FOREGROUND", "POPUP_BACKGROUND", "getPOPUP_BACKGROUND", "POPUP_BACKGROUND_ACTIVE", "getPOPUP_BACKGROUND_ACTIVE", "POPUP_FOREGROUND", "getPOPUP_FOREGROUND", "PRIVATE_MODE_BACKGROUND", "getPRIVATE_MODE_BACKGROUND", "PRIVATE_MODE_FOREGROUND", "getPRIVATE_MODE_FOREGROUND", "SMARTBAR_BACKGROUND", "getSMARTBAR_BACKGROUND", "SMARTBAR_BUTTON_BACKGROUND", "getSMARTBAR_BUTTON_BACKGROUND", "SMARTBAR_BUTTON_FOREGROUND", "getSMARTBAR_BUTTON_FOREGROUND", "SMARTBAR_FOREGROUND", "getSMARTBAR_FOREGROUND", "SMARTBAR_FOREGROUND_ALT", "getSMARTBAR_FOREGROUND_ALT", "TAB_SELECTED_TEXT_COLOR", "getTAB_SELECTED_TEXT_COLOR", "TAB_UNSELECTED_TEXT_COLOR", "getTAB_UNSELECTED_TEXT_COLOR", "WINDOW_COLOR_ACCENT", "getWINDOW_COLOR_ACCENT", "WINDOW_COLOR_PRIMARY", "getWINDOW_COLOR_PRIMARY", "WINDOW_COLOR_PRIMARY_DARK", "getWINDOW_COLOR_PRIMARY_DARK", "WINDOW_NAVIGATION_BAR_COLOR", "getWINDOW_NAVIGATION_BAR_COLOR", "WINDOW_NAVIGATION_BAR_LIGHT", "getWINDOW_NAVIGATION_BAR_LIGHT", "WINDOW_SEMI_TRANSPARENT_COLOR", "getWINDOW_SEMI_TRANSPARENT_COLOR", "WINDOW_TEXT_COLOR", "getWINDOW_TEXT_COLOR", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getWINDOW_COLOR_PRIMARY() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getWINDOW_COLOR_PRIMARY_DARK() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getWINDOW_COLOR_ACCENT() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getWINDOW_NAVIGATION_BAR_COLOR() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getWINDOW_NAVIGATION_BAR_LIGHT() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getWINDOW_SEMI_TRANSPARENT_COLOR() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getWINDOW_TEXT_COLOR() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getTAB_SELECTED_TEXT_COLOR() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getTAB_UNSELECTED_TEXT_COLOR() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getKEYBOARD_BACKGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getKEYBOARD_BG_DRAWABLE() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getKEY_BACKGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getKEY_BACKGROUND_PRESSED() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getKEY_FOREGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getKEY_FOREGROUND_PRESSED() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getKEY_SHOW_BORDER() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getKEY_ELEVATION() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getKEY_CORNER_RADIUS() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getKEY_STROKE_COLOR() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getMEDIA_FOREGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getMEDIA_FOREGROUND_ALT() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getONE_HANDED_BACKGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getONE_HANDED_FOREGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getPOPUP_BACKGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getPOPUP_BACKGROUND_ACTIVE() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getPOPUP_FOREGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getPRIVATE_MODE_BACKGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getPRIVATE_MODE_FOREGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getSMARTBAR_BACKGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getSMARTBAR_FOREGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getSMARTBAR_FOREGROUND_ALT() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getSMARTBAR_BUTTON_BACKGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getSMARTBAR_BUTTON_FOREGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getEXTRACT_EDIT_LAYOUT_BACKGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getEXTRACT_EDIT_LAYOUT_FOREGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getEXTRACT_EDIT_LAYOUT_FOREGROUND_ALT() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getEXTRACT_ACTION_BUTTON_BACKGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getEXTRACT_ACTION_BUTTON_FOREGROUND() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.theme.ThemeValue.Reference getGLIDE_TRAIL_COLOR() {
                return null;
            }
        }
    }
    
    /**
     * Enum class for all validation fields [validateField] accepts.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lkeyboard/neon/newboard/ime/theme/Theme$ValidationField;", "", "(Ljava/lang/String;I)V", "THEME_LABEL", "GROUP_NAME", "ATTR_NAME", "aosp_debug"})
    public static enum ValidationField {
        /*public static final*/ THEME_LABEL /* = new THEME_LABEL() */,
        /*public static final*/ GROUP_NAME /* = new GROUP_NAME() */,
        /*public static final*/ ATTR_NAME /* = new ATTR_NAME() */;
        
        ValidationField() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0004J\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rJ\u0016\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\rJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u00c6\u0001J\u0016\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lkeyboard/neon/newboard/ime/theme/Theme$Companion;", "", "()V", "BASE_THEME", "Lkeyboard/neon/newboard/ime/theme/Theme;", "getBASE_THEME", "()Lkeyboard/neon/newboard/ime/theme/Theme;", "VALIDATION_REGEX_ATTR_NAME", "Lkotlin/text/Regex;", "VALIDATION_REGEX_GROUP_NAME", "VALIDATION_REGEX_THEME_LABEL", "baseTheme", "name", "", "label", "authors", "", "isNightTheme", "", "empty", "getUiAttrNameString", "context", "Landroid/content/Context;", "attrName", "getUiGroupNameString", "groupName", "serializer", "Lkotlinx/serialization/KSerializer;", "validateField", "field", "Lkeyboard/neon/newboard/ime/theme/Theme$ValidationField;", "value", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<keyboard.neon.newboard.ime.theme.Theme> serializer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.theme.Theme getBASE_THEME() {
            return null;
        }
        
        /**
         * Gets the Ui string for a given [attrName]. Used in the theme editor to properly display
         * attributes for non-advanced users.
         *
         * @param context The current activity context, used for retrieving the Ui string.
         * @param attrName The attribute name, which is used to determine which Ui string should be
         * fetched.
         * @return The Ui string representation, which is localized and can be shown to the user.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUiAttrNameString(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String attrName) {
            return null;
        }
        
        /**
         * Gets the Ui string for a given [groupName]. Used in the theme editor to properly display
         * group names for non-advanced users.
         *
         * @param context The current activity context, used for retrieving the Ui string.
         * @param groupName The group name, which is used to determine which Ui string should be
         * fetched.
         * @return The Ui string representation, which is localized and can be shown to the user.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUiGroupNameString(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String groupName) {
            return null;
        }
        
        /**
         * Generate a base theme with the given meta data. For the argument info see [Theme].
         *
         * @return A generated base theme which has its colors set according to [isNightTheme].
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.theme.Theme baseTheme(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String label, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> authors, boolean isNightTheme) {
            return null;
        }
        
        /**
         * Generates an empty theme and returns it.
         *
         * @return The generated empty theme.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.theme.Theme empty() {
            return null;
        }
        
        /**
         * Validates a given [value] if it meets the [field] requirements. Useful for validation of
         * input in the Settings.
         *
         * @param field Which type of field's requirements the [value] should match.
         * @param value The value the user inputted.
         * @return True if the value meets the requirements, false otherwise.
         */
        public final boolean validateField(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.theme.Theme.ValidationField field, @org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return false;
        }
    }
    
    /**
     * Data class which holds a parsed theme json file. Used for loading a theme preset in Settings.
     * Note: this implementation is generic and allows for any group/attr names. FlorisBoard itself
     *      expects certain groups and attrs to be able to color the controls accordingly. See
     *      'ime/theme/floris_day.json' for a good example of which attributes FlorisBoard needs!
     *
     * @property isNightTheme If this theme is meant for display at day (false) or night (true). This
     * property is used to auto-assign this theme to either the day or night theme list in Settings,
     * which is used when the user wants to auto-set his theme based on the current time.
     * @property attributes Map which holds the raw attributes of this theme. Attributes are always
     * grouped together. This ensures a better structure and easier storage. The group- as well as the
     * attr-name must only consist of lowercase or uppercase Latin letters (a-z and/or A-Z).
     * Attribute values can be of different format:
     * 1. A color
     *    Either #RRGGBB or #AARRGGBB (case-insensitive) -> e.g. #A034FF23
     * 2. A static word
     *    - transparent
     *    - true
     *    - false
     * 3. A reference to another attribute within the SAME theme, as follows:
     *    @group/attrName -> e.g. @window/textColor
     *    Note that referencing attributes has its limitations:
     *    a. Recursive references will cause an infinite loop and FlorisBoard will then not react.
     * 4. If the value is of any other format, it is treated as an Other value with a raw string.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"keyboard/neon/newboard/ime/theme/Theme.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lkeyboard/neon/newboard/ime/theme/Theme;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "aosp_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<keyboard.neon.newboard.ime.theme.Theme> {
        
        /**
         * Data class which holds a parsed theme json file. Used for loading a theme preset in Settings.
         * Note: this implementation is generic and allows for any group/attr names. FlorisBoard itself
         *      expects certain groups and attrs to be able to color the controls accordingly. See
         *      'ime/theme/floris_day.json' for a good example of which attributes FlorisBoard needs!
         *
         * @property isNightTheme If this theme is meant for display at day (false) or night (true). This
         * property is used to auto-assign this theme to either the day or night theme list in Settings,
         * which is used when the user wants to auto-set his theme based on the current time.
         * @property attributes Map which holds the raw attributes of this theme. Attributes are always
         * grouped together. This ensures a better structure and easier storage. The group- as well as the
         * attr-name must only consist of lowercase or uppercase Latin letters (a-z and/or A-Z).
         * Attribute values can be of different format:
         * 1. A color
         *    Either #RRGGBB or #AARRGGBB (case-insensitive) -> e.g. #A034FF23
         * 2. A static word
         *    - transparent
         *    - true
         *    - false
         * 3. A reference to another attribute within the SAME theme, as follows:
         *    @group/attrName -> e.g. @window/textColor
         *    Note that referencing attributes has its limitations:
         *    a. Recursive references will cause an infinite loop and FlorisBoard will then not react.
         * 4. If the value is of any other format, it is treated as an Other value with a raw string.
         */
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.theme.Theme.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        /**
         * Data class which holds a parsed theme json file. Used for loading a theme preset in Settings.
         * Note: this implementation is generic and allows for any group/attr names. FlorisBoard itself
         *      expects certain groups and attrs to be able to color the controls accordingly. See
         *      'ime/theme/floris_day.json' for a good example of which attributes FlorisBoard needs!
         *
         * @property isNightTheme If this theme is meant for display at day (false) or night (true). This
         * property is used to auto-assign this theme to either the day or night theme list in Settings,
         * which is used when the user wants to auto-set his theme based on the current time.
         * @property attributes Map which holds the raw attributes of this theme. Attributes are always
         * grouped together. This ensures a better structure and easier storage. The group- as well as the
         * attr-name must only consist of lowercase or uppercase Latin letters (a-z and/or A-Z).
         * Attribute values can be of different format:
         * 1. A color
         *    Either #RRGGBB or #AARRGGBB (case-insensitive) -> e.g. #A034FF23
         * 2. A static word
         *    - transparent
         *    - true
         *    - false
         * 3. A reference to another attribute within the SAME theme, as follows:
         *    @group/attrName -> e.g. @window/textColor
         *    Note that referencing attributes has its limitations:
         *    a. Recursive references will cause an infinite loop and FlorisBoard will then not react.
         * 4. If the value is of any other format, it is treated as an Other value with a raw string.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        /**
         * Data class which holds a parsed theme json file. Used for loading a theme preset in Settings.
         * Note: this implementation is generic and allows for any group/attr names. FlorisBoard itself
         *      expects certain groups and attrs to be able to color the controls accordingly. See
         *      'ime/theme/floris_day.json' for a good example of which attributes FlorisBoard needs!
         *
         * @property isNightTheme If this theme is meant for display at day (false) or night (true). This
         * property is used to auto-assign this theme to either the day or night theme list in Settings,
         * which is used when the user wants to auto-set his theme based on the current time.
         * @property attributes Map which holds the raw attributes of this theme. Attributes are always
         * grouped together. This ensures a better structure and easier storage. The group- as well as the
         * attr-name must only consist of lowercase or uppercase Latin letters (a-z and/or A-Z).
         * Attribute values can be of different format:
         * 1. A color
         *    Either #RRGGBB or #AARRGGBB (case-insensitive) -> e.g. #A034FF23
         * 2. A static word
         *    - transparent
         *    - true
         *    - false
         * 3. A reference to another attribute within the SAME theme, as follows:
         *    @group/attrName -> e.g. @window/textColor
         *    Note that referencing attributes has its limitations:
         *    a. Recursive references will cause an infinite loop and FlorisBoard will then not react.
         * 4. If the value is of any other format, it is treated as an Other value with a raw string.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public keyboard.neon.newboard.ime.theme.Theme deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        /**
         * Data class which holds a parsed theme json file. Used for loading a theme preset in Settings.
         * Note: this implementation is generic and allows for any group/attr names. FlorisBoard itself
         *      expects certain groups and attrs to be able to color the controls accordingly. See
         *      'ime/theme/floris_day.json' for a good example of which attributes FlorisBoard needs!
         *
         * @property isNightTheme If this theme is meant for display at day (false) or night (true). This
         * property is used to auto-assign this theme to either the day or night theme list in Settings,
         * which is used when the user wants to auto-set his theme based on the current time.
         * @property attributes Map which holds the raw attributes of this theme. Attributes are always
         * grouped together. This ensures a better structure and easier storage. The group- as well as the
         * attr-name must only consist of lowercase or uppercase Latin letters (a-z and/or A-Z).
         * Attribute values can be of different format:
         * 1. A color
         *    Either #RRGGBB or #AARRGGBB (case-insensitive) -> e.g. #A034FF23
         * 2. A static word
         *    - transparent
         *    - true
         *    - false
         * 3. A reference to another attribute within the SAME theme, as follows:
         *    @group/attrName -> e.g. @window/textColor
         *    Note that referencing attributes has its limitations:
         *    a. Recursive references will cause an infinite loop and FlorisBoard will then not react.
         * 4. If the value is of any other format, it is treated as an Other value with a raw string.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        /**
         * Data class which holds a parsed theme json file. Used for loading a theme preset in Settings.
         * Note: this implementation is generic and allows for any group/attr names. FlorisBoard itself
         *      expects certain groups and attrs to be able to color the controls accordingly. See
         *      'ime/theme/floris_day.json' for a good example of which attributes FlorisBoard needs!
         *
         * @property isNightTheme If this theme is meant for display at day (false) or night (true). This
         * property is used to auto-assign this theme to either the day or night theme list in Settings,
         * which is used when the user wants to auto-set his theme based on the current time.
         * @property attributes Map which holds the raw attributes of this theme. Attributes are always
         * grouped together. This ensures a better structure and easier storage. The group- as well as the
         * attr-name must only consist of lowercase or uppercase Latin letters (a-z and/or A-Z).
         * Attribute values can be of different format:
         * 1. A color
         *    Either #RRGGBB or #AARRGGBB (case-insensitive) -> e.g. #A034FF23
         * 2. A static word
         *    - transparent
         *    - true
         *    - false
         * 3. A reference to another attribute within the SAME theme, as follows:
         *    @group/attrName -> e.g. @window/textColor
         *    Note that referencing attributes has its limitations:
         *    a. Recursive references will cause an infinite loop and FlorisBoard will then not react.
         * 4. If the value is of any other format, it is treated as an Other value with a raw string.
         */
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.theme.Theme value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}