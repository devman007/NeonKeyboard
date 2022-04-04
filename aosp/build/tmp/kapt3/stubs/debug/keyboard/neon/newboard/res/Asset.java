package keyboard.neon.newboard.res;

import java.lang.System;

/**
 * Interface for an Asset to use within FlorisBoard. An asset is everything from a dictionary to a
 * keyboard layout to a extended popup mapping, etc. Assets are very important for the splitting
 * FlorisBoard's resources into assets.
 */
@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\f"}, d2 = {"Lkeyboard/neon/newboard/res/Asset;", "", "authors", "", "", "getAuthors", "()Ljava/util/List;", "label", "getLabel", "()Ljava/lang/String;", "name", "getName", "aosp_debug"})
public abstract interface Asset {
    
    /**
     * The name of the Asset, must be unique throughout all Assets. Is used to internally identify
     * and sort the Asset. This name is non-translatable and thus is a static string.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    /**
     * The display name of the Asset. This is the label which will be shown to the user in the
     * Settings UI. Currently also a static string.
     * TODO: make this string localize-able
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLabel();
    
    /**
     * A list of authors who actively worked on the content of this Asset. Any content of string is
     * valid, but the best practice is to use the GitHub username.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getAuthors();
}