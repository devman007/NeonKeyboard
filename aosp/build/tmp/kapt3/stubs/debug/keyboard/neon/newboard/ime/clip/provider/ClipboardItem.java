package keyboard.neon.newboard.ime.clip.provider;

import java.lang.System;

/**
 * Represents an item on the clipboard.
 *
 * If type == ItemType.IMAGE there must be a uri set
 * if type == ItemType.TEXT there must be a text set
 */
@androidx.room.Entity(tableName = "pins")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001.B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJL\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\u0006\u0010*\u001a\u00020\tJ\u0006\u0010+\u001a\u00020,J\t\u0010-\u001a\u00020\tH\u00d6\u0001R\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006/"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/provider/ClipboardItem;", "Ljava/io/Closeable;", "uid", "", "type", "Lkeyboard/neon/newboard/ime/clip/provider/ItemType;", "uri", "Landroid/net/Uri;", "text", "", "mimeTypes", "", "(Ljava/lang/Long;Lkeyboard/neon/newboard/ime/clip/provider/ItemType;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)V", "getMimeTypes", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getText", "()Ljava/lang/String;", "getType", "()Lkeyboard/neon/newboard/ime/clip/provider/ItemType;", "getUid", "()Ljava/lang/Long;", "setUid", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getUri", "()Landroid/net/Uri;", "close", "", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Lkeyboard/neon/newboard/ime/clip/provider/ItemType;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Lkeyboard/neon/newboard/ime/clip/provider/ClipboardItem;", "equals", "", "other", "", "hashCode", "", "stringRepresentation", "toClipData", "Landroid/content/ClipData;", "toString", "Companion", "aosp_debug"})
public final class ClipboardItem implements java.io.Closeable {
    
    /**
     * Only used for pins
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "_id", index = true)
    @androidx.room.PrimaryKey(autoGenerate = true)
    private java.lang.Long uid;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.clip.provider.ItemType type = null;
    @org.jetbrains.annotations.Nullable()
    private final android.net.Uri uri = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String text = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] mimeTypes = null;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.clip.provider.ClipboardItem.Companion Companion = null;
    
    /**
     * So that every item doesn't have to allocate its own array.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] TEXT_PLAIN = {"text/plain"};
    
    /**
     * Represents an item on the clipboard.
     *
     * If type == ItemType.IMAGE there must be a uri set
     * if type == ItemType.TEXT there must be a text set
     */
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.clip.provider.ClipboardItem copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long uid, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.clip.provider.ItemType type, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String[] mimeTypes) {
        return null;
    }
    
    /**
     * Represents an item on the clipboard.
     *
     * If type == ItemType.IMAGE there must be a uri set
     * if type == ItemType.TEXT there must be a text set
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ClipboardItem(@org.jetbrains.annotations.Nullable()
    java.lang.Long uid, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.clip.provider.ItemType type, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String[] mimeTypes) {
        super();
    }
    
    /**
     * Only used for pins
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    /**
     * Only used for pins
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getUid() {
        return null;
    }
    
    /**
     * Only used for pins
     */
    public final void setUid(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.clip.provider.ItemType component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.clip.provider.ItemType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getUri() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getMimeTypes() {
        return null;
    }
    
    /**
     * Creates a new ClipData which has the same contents as this.
     */
    @org.jetbrains.annotations.NotNull()
    public final android.content.ClipData toClipData() {
        return null;
    }
    
    /**
     * Instructs the content provider to delete this URI. If not an image, is a noop
     */
    @java.lang.Override()
    public void close() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String stringRepresentation() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/provider/ClipboardItem$Companion;", "", "()V", "TEXT_PLAIN", "", "", "getTEXT_PLAIN", "()[Ljava/lang/String;", "[Ljava/lang/String;", "fromClipData", "Lkeyboard/neon/newboard/ime/clip/provider/ClipboardItem;", "data", "Landroid/content/ClipData;", "cloneUri", "", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getTEXT_PLAIN() {
            return null;
        }
        
        /**
         * Returns a new ClipboardItem based on a ClipData
         *
         * @param data The ClipData to clone.
         * @param cloneUri Whether to store the image using [FlorisContentProvider].
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.clip.provider.ClipboardItem fromClipData(@org.jetbrains.annotations.NotNull()
        android.content.ClipData data, boolean cloneUri) {
            return null;
        }
    }
}