package keyboard.neon.newboard.ime.text.key;

import java.lang.System;

/**
 * Enum for declaring the type of the key.
 * List of possible key types:
 * [Wikipedia](https://en.wikipedia.org/wiki/Keyboard_layout#Key_types)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u0010"}, d2 = {"Lkeyboard/neon/newboard/ime/text/key/KeyType;", "", "(Ljava/lang/String;I)V", "toString", "", "CHARACTER", "ENTER_EDITING", "FUNCTION", "LOCK", "MODIFIER", "NAVIGATION", "SYSTEM_GUI", "NUMERIC", "PLACEHOLDER", "UNSPECIFIED", "Companion", "aosp_debug"})
@kotlinx.serialization.Serializable(with = keyboard.neon.newboard.ime.text.key.KeyTypeSerializer.class)
public enum KeyType {
    /*public static final*/ CHARACTER /* = new CHARACTER() */,
    /*public static final*/ ENTER_EDITING /* = new ENTER_EDITING() */,
    /*public static final*/ FUNCTION /* = new FUNCTION() */,
    /*public static final*/ LOCK /* = new LOCK() */,
    /*public static final*/ MODIFIER /* = new MODIFIER() */,
    /*public static final*/ NAVIGATION /* = new NAVIGATION() */,
    /*public static final*/ SYSTEM_GUI /* = new SYSTEM_GUI() */,
    /*public static final*/ NUMERIC /* = new NUMERIC() */,
    /*public static final*/ PLACEHOLDER /* = new PLACEHOLDER() */,
    /*public static final*/ UNSPECIFIED /* = new UNSPECIFIED() */;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.text.key.KeyType.Companion Companion = null;
    
    KeyType() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lkeyboard/neon/newboard/ime/text/key/KeyType$Companion;", "", "()V", "fromString", "Lkeyboard/neon/newboard/ime/text/key/KeyType;", "string", "", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.key.KeyType fromString(@org.jetbrains.annotations.NotNull()
        java.lang.String string) {
            return null;
        }
    }
}