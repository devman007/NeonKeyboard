package keyboard.neon.newboard.ime.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 ;2\u00020\u0001:\u0001;B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\'\u001a\u00020\u0007H\u0002J\b\u0010(\u001a\u0004\u0018\u00010\u0007J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0007J\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010!\u001a\u00020\"J\u0010\u0010.\u001a\u0004\u0018\u00010\u00072\u0006\u0010/\u001a\u000200J\u0010\u00101\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u0003H\u0002J\u000e\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0007J\u000e\u00106\u001a\u0002042\u0006\u00107\u001a\u00020\u0007J\b\u00108\u001a\u0004\u0018\u00010\u0007J\b\u00109\u001a\u0004\u0018\u00010\u0007J\b\u0010:\u001a\u000204H\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006<"}, d2 = {"Lkeyboard/neon/newboard/ime/core/SubtypeManager;", "Lkotlinx/coroutines/CoroutineScope;", "packageName", "", "(Ljava/lang/String;)V", "_subtypes", "Ljava/util/ArrayList;", "Lkeyboard/neon/newboard/ime/core/Subtype;", "Lkotlin/collections/ArrayList;", "assetManager", "Lkeyboard/neon/newboard/res/AssetManager;", "getAssetManager", "()Lkeyboard/neon/newboard/res/AssetManager;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "imeConfig", "Lkeyboard/neon/newboard/ime/core/FlorisBoard$ImeConfig;", "getImeConfig", "()Lkeyboard/neon/newboard/ime/core/FlorisBoard$ImeConfig;", "setImeConfig", "(Lkeyboard/neon/newboard/ime/core/FlorisBoard$ImeConfig;)V", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "getPrefs", "()Lkeyboard/neon/newboard/ime/core/Preferences;", "subtypes", "", "getSubtypes", "()Ljava/util/List;", "addSubtype", "", "locale", "Lkeyboard/neon/newboard/common/FlorisLocale;", "composerName", "currencySetName", "layoutMap", "Lkeyboard/neon/newboard/ime/core/SubtypeLayoutMap;", "subtypeToAdd", "getActiveSubtype", "getCurrencySet", "Lkeyboard/neon/newboard/ime/text/key/CurrencySet;", "subtypeToSearch", "getDefaultSubtypeForLocale", "Lkeyboard/neon/newboard/ime/core/DefaultSubtype;", "getSubtypeById", "id", "", "loadImeConfig", "path", "modifySubtypeWithSameId", "", "subtypeToModify", "removeSubtype", "subtypeToRemove", "switchToNextSubtype", "switchToPrevSubtype", "syncSubtypeListToPrefs", "Companion", "aosp_debug"})
public final class SubtypeManager implements kotlinx.coroutines.CoroutineScope {
    private final java.lang.String packageName = null;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.core.SubtypeManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IME_CONFIG_FILE_PATH = "ime/config.json";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUBTYPE_LIST_STR_DELIMITER = ";";
    private static keyboard.neon.newboard.ime.core.SubtypeManager instance;
    @org.jetbrains.annotations.NotNull()
    private keyboard.neon.newboard.ime.core.FlorisBoard.ImeConfig imeConfig;
    private final java.util.ArrayList<keyboard.neon.newboard.ime.core.Subtype> _subtypes = null;
    
    public SubtypeManager(@org.jetbrains.annotations.NotNull()
    java.lang.String packageName) {
        super();
    }
    
    private final keyboard.neon.newboard.res.AssetManager getAssetManager() {
        return null;
    }
    
    private final keyboard.neon.newboard.ime.core.Preferences getPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.FlorisBoard.ImeConfig getImeConfig() {
        return null;
    }
    
    public final void setImeConfig(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.FlorisBoard.ImeConfig p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<keyboard.neon.newboard.ime.core.Subtype> getSubtypes() {
        return null;
    }
    
    private final void syncSubtypeListToPrefs() {
    }
    
    /**
     * Loads the [FlorisBoard.ImeConfig] from ime/config.json.
     *
     * @param path The path to to IME config file.
     * @return The [FlorisBoard.ImeConfig] or a default config.
     */
    private final keyboard.neon.newboard.ime.core.FlorisBoard.ImeConfig loadImeConfig(java.lang.String path) {
        return null;
    }
    
    /**
     * Adds a given [subtypeToAdd] to the subtype list, if it does not exist.
     *
     * @param subtypeToAdd The subtype which should be added.
     * @return True if the subtype was added, false otherwise. A return value of false indicates
     * that the subtype already exists.
     */
    private final boolean addSubtype(keyboard.neon.newboard.ime.core.Subtype subtypeToAdd) {
        return false;
    }
    
    /**
     * Creates a [Subtype] from the given [locale] and [layoutMap] and adds it to the subtype
     * list, if it does not exist.
     *
     * @param locale The locale of the subtype to be added.
     * @param composerName The composer name of the subtype to be added.
     * @param currencySetName The currency set name of the subtype to be added.
     * @param layoutMap The layout map of the subtype to be added.
     * @return True if the subtype was added, false otherwise. A return value of false indicates
     * that the subtype already exists.
     */
    public final boolean addSubtype(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.common.FlorisLocale locale, @org.jetbrains.annotations.NotNull()
    java.lang.String composerName, @org.jetbrains.annotations.NotNull()
    java.lang.String currencySetName, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.SubtypeLayoutMap layoutMap) {
        return false;
    }
    
    /**
     * Gets the currency set from the given subtype and returns it. Falls back to a default one if the subtype does not
     * exist.
     *
     * @return The currency set or a fallback.
     */
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.text.key.CurrencySet getCurrencySet(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype subtypeToSearch) {
        return null;
    }
    
    /**
     * Gets the active subtype and returns it. If the activeSubtypeId points to a non-existent
     * subtype, this method tries to determine a new active subtype.
     *
     * @return The active subtype or null, if the subtype list is empty or no new active subtype
     * could be determined.
     */
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.core.Subtype getActiveSubtype() {
        return null;
    }
    
    /**
     * Gets a subtype by the given [id].
     *
     * @param id The id of the subtype you want to get.
     * @return The subtype or null, if no matching subtype could be found.
     */
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.core.Subtype getSubtypeById(int id) {
        return null;
    }
    
    /**
     * Gets the default system subtype for a given [locale].
     *
     * @param locale The locale of the default system subtype to get.
     * @return The default system locale or null, if no matching default system subtype could be
     * found.
     */
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.core.DefaultSubtype getDefaultSubtypeForLocale(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.common.FlorisLocale locale) {
        return null;
    }
    
    /**
     * Modifies an existing subtype with the newly provided details. In order to determine which
     * subtype should be updated, the id must be the same.
     *
     * @param subtypeToModify The subtype with the new details but same id.
     */
    public final void modifySubtypeWithSameId(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype subtypeToModify) {
    }
    
    /**
     * Removes a given [subtypeToRemove]. Nothing happens if the given [subtypeToRemove] does not
     * exist.
     *
     * @param subtypeToRemove The subtype which should be removed.
     */
    public final void removeSubtype(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype subtypeToRemove) {
    }
    
    /**
     * Switch to the previous subtype in the subtype list if possible.
     *
     * @return The new active subtype or null if the determination process failed.
     */
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.core.Subtype switchToPrevSubtype() {
        return null;
    }
    
    /**
     * Switch to the next subtype in the subtype list if possible.
     *
     * @return The new active subtype or null if the determination process failed.
     */
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.core.Subtype switchToNextSubtype() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lkeyboard/neon/newboard/ime/core/SubtypeManager$Companion;", "", "()V", "IME_CONFIG_FILE_PATH", "", "SUBTYPE_LIST_STR_DELIMITER", "instance", "Lkeyboard/neon/newboard/ime/core/SubtypeManager;", "default", "defaultOrNull", "init", "context", "Landroid/content/Context;", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.core.SubtypeManager init(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final keyboard.neon.newboard.ime.core.SubtypeManager defaultOrNull() {
            return null;
        }
    }
}