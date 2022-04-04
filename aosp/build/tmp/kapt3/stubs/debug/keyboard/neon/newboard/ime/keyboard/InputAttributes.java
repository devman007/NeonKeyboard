package keyboard.neon.newboard.ime.keyboard;

import java.lang.System;

/**
 * Class which holds the same information as an [EditorInfo.inputType] int but more accessible and
 * readable.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087@\u0018\u0000 @2\u00020\u0001:\u0004?@ABB\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0013\u00103\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u000206H\u00d6\u0001J\t\u00107\u001a\u000208H\u00d6\u0001J\u0015\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<\u00a2\u0006\u0004\b=\u0010>R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R$\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R$\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R$\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R$\u0010\"\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R$\u0010(\u001a\u00020\'2\u0006\u0010\u0006\u001a\u00020\'8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010.\u001a\u00020-2\u0006\u0010\u0006\u001a\u00020-8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102\u0088\u0001\u0002\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006C"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/InputAttributes;", "", "state", "Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "constructor-impl", "(Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;)Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "v", "Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$CapsMode;", "capsMode", "getCapsMode-impl", "(Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;)Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$CapsMode;", "setCapsMode-impl", "(Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$CapsMode;)V", "", "flagNumberDecimal", "getFlagNumberDecimal-impl", "(Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;)Z", "setFlagNumberDecimal-impl", "(Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;Z)V", "flagNumberSigned", "getFlagNumberSigned-impl", "setFlagNumberSigned-impl", "flagTextAutoComplete", "getFlagTextAutoComplete-impl", "setFlagTextAutoComplete-impl", "flagTextAutoCorrect", "getFlagTextAutoCorrect-impl", "setFlagTextAutoCorrect-impl", "flagTextImeMultiLine", "getFlagTextImeMultiLine-impl", "setFlagTextImeMultiLine-impl", "flagTextMultiLine", "getFlagTextMultiLine-impl", "setFlagTextMultiLine-impl", "flagTextNoSuggestions", "getFlagTextNoSuggestions-impl", "setFlagTextNoSuggestions-impl", "getState", "()Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$Type;", "type", "getType-impl", "(Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;)Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$Type;", "setType-impl", "(Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$Type;)V", "Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$Variation;", "variation", "getVariation-impl", "(Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;)Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$Variation;", "setVariation-impl", "(Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$Variation;)V", "equals", "other", "hashCode", "", "toString", "", "update", "", "editorInfo", "Landroid/view/inputmethod/EditorInfo;", "update-impl", "(Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;Landroid/view/inputmethod/EditorInfo;)V", "CapsMode", "Companion", "Type", "Variation", "aosp_debug"})
@kotlin.jvm.JvmInline()
public final class InputAttributes {
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.keyboard.KeyboardState state = null;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.keyboard.InputAttributes.Companion Companion = null;
    public static final long M_INPUT_ATTRIBUTES = 1048575L;
    public static final int O_INPUT_ATTRIBUTES = 44;
    public static final long M_TYPE = 7L;
    public static final int O_TYPE = 44;
    public static final long M_VARIATION = 31L;
    public static final int O_VARIATION = 47;
    public static final long M_CAPS_MODE = 3L;
    public static final int O_CAPS_MODE = 52;
    public static final long F_NUMBER_DECIMAL = 18014398509481984L;
    public static final long F_NUMBER_SIGNED = 36028797018963968L;
    public static final long F_TEXT_AUTO_COMPLETE = 72057594037927936L;
    public static final long F_TEXT_AUTO_CORRECT = 144115188075855872L;
    public static final long F_TEXT_IME_MULTILINE = 288230376151711744L;
    public static final long F_TEXT_MULTILINE = 576460752303423488L;
    public static final long F_TEXT_NO_SUGGESTIONS = 1152921504606846976L;
    
    /**
     * Class which holds the same information as an [EditorInfo.inputType] int but more accessible and
     * readable.
     */
    @java.lang.Override()
    public boolean equals(java.lang.Object other) {
        return false;
    }
    
    /**
     * Class which holds the same information as an [EditorInfo.inputType] int but more accessible and
     * readable.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Class which holds the same information as an [EditorInfo.inputType] int but more accessible and
     * readable.
     */
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.keyboard.KeyboardState getState() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\u000e"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$Type;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "toInt", "NULL", "DATETIME", "NUMBER", "PHONE", "TEXT", "Companion", "aosp_debug"})
    public static enum Type {
        /*public static final*/ NULL /* = new NULL(0) */,
        /*public static final*/ DATETIME /* = new DATETIME(0) */,
        /*public static final*/ NUMBER /* = new NUMBER(0) */,
        /*public static final*/ PHONE /* = new PHONE(0) */,
        /*public static final*/ TEXT /* = new TEXT(0) */;
        private final int value = 0;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.keyboard.InputAttributes.Type.Companion Companion = null;
        
        Type(int value) {
        }
        
        public final int getValue() {
            return 0;
        }
        
        public final int toInt() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$Type$Companion;", "", "()V", "fromInt", "Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$Type;", "int", "", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.keyboard.InputAttributes.Type fromInt(int p0_52215) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0001\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018\u00a8\u0006\u001a"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$Variation;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "toInt", "NORMAL", "DATE", "EMAIL_ADDRESS", "EMAIL_SUBJECT", "FILTER", "LONG_MESSAGE", "PASSWORD", "PERSON_NAME", "PHONETIC", "POSTAL_ADDRESS", "SHORT_MESSAGE", "TIME", "URI", "VISIBLE_PASSWORD", "WEB_EDIT_TEXT", "WEB_EMAIL_ADDRESS", "WEB_PASSWORD", "Companion", "aosp_debug"})
    public static enum Variation {
        /*public static final*/ NORMAL /* = new NORMAL(0) */,
        /*public static final*/ DATE /* = new DATE(0) */,
        /*public static final*/ EMAIL_ADDRESS /* = new EMAIL_ADDRESS(0) */,
        /*public static final*/ EMAIL_SUBJECT /* = new EMAIL_SUBJECT(0) */,
        /*public static final*/ FILTER /* = new FILTER(0) */,
        /*public static final*/ LONG_MESSAGE /* = new LONG_MESSAGE(0) */,
        /*public static final*/ PASSWORD /* = new PASSWORD(0) */,
        /*public static final*/ PERSON_NAME /* = new PERSON_NAME(0) */,
        /*public static final*/ PHONETIC /* = new PHONETIC(0) */,
        /*public static final*/ POSTAL_ADDRESS /* = new POSTAL_ADDRESS(0) */,
        /*public static final*/ SHORT_MESSAGE /* = new SHORT_MESSAGE(0) */,
        /*public static final*/ TIME /* = new TIME(0) */,
        /*public static final*/ URI /* = new URI(0) */,
        /*public static final*/ VISIBLE_PASSWORD /* = new VISIBLE_PASSWORD(0) */,
        /*public static final*/ WEB_EDIT_TEXT /* = new WEB_EDIT_TEXT(0) */,
        /*public static final*/ WEB_EMAIL_ADDRESS /* = new WEB_EMAIL_ADDRESS(0) */,
        /*public static final*/ WEB_PASSWORD /* = new WEB_PASSWORD(0) */;
        private final int value = 0;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.keyboard.InputAttributes.Variation.Companion Companion = null;
        
        Variation(int value) {
        }
        
        public final int getValue() {
            return 0;
        }
        
        public final int toInt() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$Variation$Companion;", "", "()V", "fromInt", "Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$Variation;", "int", "", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.keyboard.InputAttributes.Variation fromInt(int p0_52215) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\u000e"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$CapsMode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "toFlags", "toInt", "NONE", "ALL", "SENTENCES", "WORDS", "Companion", "aosp_debug"})
    public static enum CapsMode {
        /*public static final*/ NONE /* = new NONE(0) */,
        /*public static final*/ ALL /* = new ALL(0) */,
        /*public static final*/ SENTENCES /* = new SENTENCES(0) */,
        /*public static final*/ WORDS /* = new WORDS(0) */;
        private final int value = 0;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.keyboard.InputAttributes.CapsMode.Companion Companion = null;
        
        CapsMode(int value) {
        }
        
        public final int getValue() {
            return 0;
        }
        
        public final int toFlags() {
            return 0;
        }
        
        public final int toInt() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006\u00a8\u0006\t"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$CapsMode$Companion;", "", "()V", "fromFlags", "Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$CapsMode;", "flags", "", "fromInt", "int", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.keyboard.InputAttributes.CapsMode fromFlags(int flags) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.keyboard.InputAttributes.CapsMode fromInt(int p0_52215) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\b\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\t\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\n\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000b\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\f\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\r\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000e\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000f\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0010\u001a\u00020\u0011X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0086T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u0015"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/InputAttributes$Companion;", "", "()V", "F_NUMBER_DECIMAL", "Lkotlin/ULong;", "J", "F_NUMBER_SIGNED", "F_TEXT_AUTO_COMPLETE", "F_TEXT_AUTO_CORRECT", "F_TEXT_IME_MULTILINE", "F_TEXT_MULTILINE", "F_TEXT_NO_SUGGESTIONS", "M_CAPS_MODE", "M_INPUT_ATTRIBUTES", "M_TYPE", "M_VARIATION", "O_CAPS_MODE", "", "O_INPUT_ATTRIBUTES", "O_TYPE", "O_VARIATION", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}