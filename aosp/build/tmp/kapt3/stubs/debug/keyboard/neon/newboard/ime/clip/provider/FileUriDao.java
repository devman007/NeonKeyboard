package keyboard.neon.newboard.ime.clip.provider;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\'J!\u0010\u000b\u001a\u00020\u00032\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\r\"\u00020\bH\'\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0011"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/provider/FileUriDao;", "", "delete", "", "id", "", "getAll", "", "Lkeyboard/neon/newboard/ime/clip/provider/FileUri;", "getById", "uid", "insert", "fileUris", "", "([Lkeyboard/neon/newboard/ime/clip/provider/FileUri;)V", "numberWithId", "", "aosp_debug"})
public abstract interface FileUriDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM file_uris WHERE _id == (:uid)")
    public abstract keyboard.neon.newboard.ime.clip.provider.FileUri getById(long uid);
    
    @androidx.room.Query(value = "DELETE FROM file_uris WHERE _id == (:id)")
    public abstract void delete(long id);
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.clip.provider.FileUri... fileUris);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM file_uris WHERE _id == (:id)")
    public abstract int numberWithId(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM file_uris")
    public abstract java.util.List<keyboard.neon.newboard.ime.clip.provider.FileUri> getAll();
}