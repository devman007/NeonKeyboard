package keyboard.neon.newboard.ime.clip.provider;

import java.lang.System;

@androidx.room.TypeConverters(value = {keyboard.neon.newboard.ime.clip.provider.Converters.class})
@androidx.room.Database(entities = {keyboard.neon.newboard.ime.clip.provider.ClipboardItem.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/provider/PinnedItemsDatabase;", "Landroidx/room/RoomDatabase;", "()V", "clipboardItemDao", "Lkeyboard/neon/newboard/ime/clip/provider/PinnedClipboardItemDao;", "Companion", "aosp_debug"})
public abstract class PinnedItemsDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.clip.provider.PinnedItemsDatabase.Companion Companion = null;
    private static keyboard.neon.newboard.ime.clip.provider.PinnedItemsDatabase instance;
    
    public PinnedItemsDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract keyboard.neon.newboard.ime.clip.provider.PinnedClipboardItemDao clipboardItemDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/provider/PinnedItemsDatabase$Companion;", "", "()V", "instance", "Lkeyboard/neon/newboard/ime/clip/provider/PinnedItemsDatabase;", "getInstance", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.clip.provider.PinnedItemsDatabase getInstance() {
            return null;
        }
    }
}