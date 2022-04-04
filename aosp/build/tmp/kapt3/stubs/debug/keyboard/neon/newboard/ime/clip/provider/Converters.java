package keyboard.neon.newboard.ime.clip.provider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0007\u00a2\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0010H\u0007J\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u000bH\u0007\u00a8\u0006\u0014"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/provider/Converters;", "", "()V", "intToItemType", "Lkeyboard/neon/newboard/ime/clip/provider/ItemType;", "value", "", "(Ljava/lang/Integer;)Lkeyboard/neon/newboard/ime/clip/provider/ItemType;", "itemTypeToInt", "(Lkeyboard/neon/newboard/ime/clip/provider/ItemType;)Ljava/lang/Integer;", "mimeTypesToString", "", "mimeTypes", "", "([Ljava/lang/String;)Ljava/lang/String;", "stringFromUri", "Landroid/net/Uri;", "stringToMimeTypes", "(Ljava/lang/String;)[Ljava/lang/String;", "uriFromString", "aosp_debug"})
public final class Converters {
    
    public Converters() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final android.net.Uri uriFromString(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String stringFromUri(@org.jetbrains.annotations.Nullable()
    android.net.Uri value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.Integer itemTypeToInt(@org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.clip.provider.ItemType value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final keyboard.neon.newboard.ime.clip.provider.ItemType intToItemType(@org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
        return null;
    }
    
    /**
     * Only works because the string array is a mimetype.
     * DOES NOT USE A GENERALIZED FORMAT.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String mimeTypesToString(@org.jetbrains.annotations.NotNull()
    java.lang.String[] mimeTypes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String[] stringToMimeTypes(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
}