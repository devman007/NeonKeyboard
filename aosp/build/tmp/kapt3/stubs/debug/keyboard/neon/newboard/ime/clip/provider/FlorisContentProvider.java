package keyboard.neon.newboard.ime.clip.provider;

import java.lang.System;

/**
 * Allows apps to access images on the clipboard.
 *
 * This is sometimes called by the UI thread, so all functions are non blocking.
 * Database accesses are performed async.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0002J1\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0010\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\nH\u0016\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0015\u001a\u00020\u0016J\u001a\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u000bH\u0016JO\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u000f\u001a\u00020\u00102\u0010\u0010!\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0010\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\n2\b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0002\u0010#J;\u0010$\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0010\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\nH\u0016\u00a2\u0006\u0002\u0010%R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R6\u0010\u0007\u001a*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bj\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n`\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/provider/FlorisContentProvider;", "Landroid/content/ContentProvider;", "()V", "fileUriDao", "Lkeyboard/neon/newboard/ime/clip/provider/FileUriDao;", "ioScope", "Lkotlinx/coroutines/CoroutineScope;", "mimeTypes", "Ljava/util/HashMap;", "", "", "", "Lkotlin/collections/HashMap;", "delete", "", "uri", "Landroid/net/Uri;", "selection", "selectionArgs", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "initIfNotAlready", "", "insert", "values", "Landroid/content/ContentValues;", "onCreate", "", "openFile", "Landroid/os/ParcelFileDescriptor;", "mode", "query", "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion", "aosp_debug"})
public final class FlorisContentProvider extends android.content.ContentProvider {
    private keyboard.neon.newboard.ime.clip.provider.FileUriDao fileUriDao;
    private final java.util.HashMap<java.lang.Long, java.lang.String[]> mimeTypes = null;
    private final kotlinx.coroutines.CoroutineScope ioScope = null;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.clip.provider.FlorisContentProvider.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTHORITY = "com.neon.keyboard.fancyfonts.fancy.keyboard.provider.clip";
    @org.jetbrains.annotations.NotNull()
    private static final android.net.Uri CONTENT_URI = null;
    @org.jetbrains.annotations.NotNull()
    private static final android.net.Uri CLIPS_URI = null;
    private static keyboard.neon.newboard.ime.clip.provider.FlorisContentProvider instance;
    private static final int CLIPS_TABLE = 1;
    private static final int CLIP_ITEM = 0;
    @org.jetbrains.annotations.NotNull()
    private static final android.content.UriMatcher matcher = null;
    
    public FlorisContentProvider() {
        super();
    }
    
    @java.lang.Override()
    public boolean onCreate() {
        return false;
    }
    
    public final void initIfNotAlready() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.database.Cursor query(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    java.lang.String[] projection, @org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionArgs, @org.jetbrains.annotations.Nullable()
    java.lang.String sortOrder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getType(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.os.ParcelFileDescriptor openFile(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    java.lang.String mode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.net.Uri insert(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    android.content.ContentValues values) {
        return null;
    }
    
    @java.lang.Override()
    public int delete(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionArgs) {
        return 0;
    }
    
    @java.lang.Override()
    public int update(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    android.content.ContentValues values, @org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionArgs) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/provider/FlorisContentProvider$Companion;", "", "()V", "AUTHORITY", "", "CLIPS_TABLE", "", "CLIPS_URI", "Landroid/net/Uri;", "getCLIPS_URI", "()Landroid/net/Uri;", "CLIP_ITEM", "CONTENT_URI", "getCONTENT_URI", "instance", "Lkeyboard/neon/newboard/ime/clip/provider/FlorisContentProvider;", "matcher", "Landroid/content/UriMatcher;", "getMatcher", "()Landroid/content/UriMatcher;", "getInstance", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.net.Uri getCONTENT_URI() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.net.Uri getCLIPS_URI() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.clip.provider.FlorisContentProvider getInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.UriMatcher getMatcher() {
            return null;
        }
    }
}