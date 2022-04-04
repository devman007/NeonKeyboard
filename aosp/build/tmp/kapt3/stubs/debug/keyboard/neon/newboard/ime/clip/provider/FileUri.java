package keyboard.neon.newboard.ime.clip.provider;

import java.lang.System;

@androidx.room.Entity(tableName = "file_uris")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ(\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/provider/FileUri;", "", "fileName", "", "mimeTypes", "", "", "(J[Ljava/lang/String;)V", "getFileName", "()J", "getMimeTypes", "()[Ljava/lang/String;", "[Ljava/lang/String;", "component1", "component2", "copy", "(J[Ljava/lang/String;)Lkeyboard/neon/newboard/ime/clip/provider/FileUri;", "equals", "", "other", "hashCode", "", "toString", "aosp_debug"})
public final class FileUri {
    @androidx.room.ColumnInfo(name = "_id", index = true)
    @androidx.room.PrimaryKey()
    private final long fileName = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] mimeTypes = null;
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.clip.provider.FileUri copy(long fileName, @org.jetbrains.annotations.NotNull()
    java.lang.String[] mimeTypes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public FileUri(long fileName, @org.jetbrains.annotations.NotNull()
    java.lang.String[] mimeTypes) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getFileName() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getMimeTypes() {
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
}