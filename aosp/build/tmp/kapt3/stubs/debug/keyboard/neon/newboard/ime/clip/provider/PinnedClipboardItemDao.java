package keyboard.neon.newboard.ime.clip.provider;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\n"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/provider/PinnedClipboardItemDao;", "", "delete", "", "item", "Lkeyboard/neon/newboard/ime/clip/provider/ClipboardItem;", "getAll", "", "insert", "", "aosp_debug"})
public abstract interface PinnedClipboardItemDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM pins")
    public abstract java.util.List<keyboard.neon.newboard.ime.clip.provider.ClipboardItem> getAll();
    
    @androidx.room.Insert()
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.clip.provider.ClipboardItem item);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.clip.provider.ClipboardItem item);
}