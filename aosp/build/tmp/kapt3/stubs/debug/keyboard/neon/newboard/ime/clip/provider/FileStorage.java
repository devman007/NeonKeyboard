package keyboard.neon.newboard.ime.clip.provider;

import java.lang.System;

/**
 * Backend helper object which is used by [FlorisContentProvider] to serve content.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0012"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/provider/FileStorage;", "", "()V", "BUF_SIZE", "", "offset", "cloneURI", "Lkotlin/Result;", "", "uri", "Landroid/net/Uri;", "cloneURI-IoAF18A", "(Landroid/net/Uri;)Ljava/lang/Object;", "deleteById", "", "id", "getAddress", "", "aosp_debug"})
public final class FileStorage {
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.clip.provider.FileStorage INSTANCE = null;
    private static final int BUF_SIZE = 8192;
    private static int offset = 0;
    
    private FileStorage() {
        super();
    }
    
    /**
     * Deletes the file corresponding to an id.
     */
    public final void deleteById(long id) {
    }
    
    /**
     * Get the file address of an id.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress(long id) {
        return null;
    }
}