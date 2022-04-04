package keyboard.neon.newboard.ime.keyboard;

import java.lang.System;

/**
 * Class which holds the same information as an [EditorInfo.imeOptions] int but more accessible and
 * readable.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087@\u0018\u0000 62\u00020\u0001:\u000267B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020-H\u00d6\u0001J\t\u0010.\u001a\u00020/H\u00d6\u0001J\u0015\u00100\u001a\u0002012\u0006\u00102\u001a\u000203\u00a2\u0006\u0004\b4\u00105R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R$\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R$\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R$\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R$\u0010\"\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R$\u0010%\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b&\u0010\u0010\"\u0004\b\'\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)\u0088\u0001\u0002\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00068"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/ImeOptions;", "", "state", "Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "constructor-impl", "(Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;)Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "v", "Lkeyboard/neon/newboard/ime/keyboard/ImeOptions$EnterAction;", "enterAction", "getEnterAction-impl", "(Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;)Lkeyboard/neon/newboard/ime/keyboard/ImeOptions$EnterAction;", "setEnterAction-impl", "(Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;Lkeyboard/neon/newboard/ime/keyboard/ImeOptions$EnterAction;)V", "", "flagForceAscii", "getFlagForceAscii-impl", "(Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;)Z", "setFlagForceAscii-impl", "(Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;Z)V", "flagNavigateNext", "getFlagNavigateNext-impl", "setFlagNavigateNext-impl", "flagNavigatePrevious", "getFlagNavigatePrevious-impl", "setFlagNavigatePrevious-impl", "flagNoAccessoryAction", "getFlagNoAccessoryAction-impl", "setFlagNoAccessoryAction-impl", "flagNoEnterAction", "getFlagNoEnterAction-impl", "setFlagNoEnterAction-impl", "flagNoExtractUi", "getFlagNoExtractUi-impl", "setFlagNoExtractUi-impl", "flagNoFullscreen", "getFlagNoFullscreen-impl", "setFlagNoFullscreen-impl", "flagNoPersonalizedLearning", "getFlagNoPersonalizedLearning-impl", "setFlagNoPersonalizedLearning-impl", "getState", "()Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "equals", "other", "hashCode", "", "toString", "", "update", "", "editorInfo", "Landroid/view/inputmethod/EditorInfo;", "update-impl", "(Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;Landroid/view/inputmethod/EditorInfo;)V", "Companion", "EnterAction", "aosp_debug"})
@kotlin.jvm.JvmInline()
public final class ImeOptions {
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.keyboard.KeyboardState state = null;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.keyboard.ImeOptions.Companion Companion = null;
    public static final long M_IME_OPTIONS = 4095L;
    public static final int O_IME_OPTIONS = 32;
    public static final long M_ENTER_ACTION = 15L;
    public static final int O_ENTER_ACTION = 32;
    public static final long F_FORCE_ASCII = 68719476736L;
    public static final long F_NAVIGATE_NEXT = 137438953472L;
    public static final long F_NAVIGATE_PREVIOUS = 274877906944L;
    public static final long F_NO_ACCESSORY_ACTION = 549755813888L;
    public static final long F_NO_ENTER_ACTION = 1099511627776L;
    public static final long F_NO_EXTRACT_UI = 2199023255552L;
    public static final long F_NO_FULLSCREEN = 4398046511104L;
    public static final long F_NO_PERSONALIZED_LEARNING = 8796093022208L;
    
    /**
     * Class which holds the same information as an [EditorInfo.imeOptions] int but more accessible and
     * readable.
     */
    @java.lang.Override()
    public boolean equals(java.lang.Object other) {
        return false;
    }
    
    /**
     * Class which holds the same information as an [EditorInfo.imeOptions] int but more accessible and
     * readable.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Class which holds the same information as an [EditorInfo.imeOptions] int but more accessible and
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0011"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/ImeOptions$EnterAction;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "toInt", "UNSPECIFIED", "DONE", "GO", "NEXT", "NONE", "PREVIOUS", "SEARCH", "SEND", "Companion", "aosp_debug"})
    public static enum EnterAction {
        /*public static final*/ UNSPECIFIED /* = new UNSPECIFIED(0) */,
        /*public static final*/ DONE /* = new DONE(0) */,
        /*public static final*/ GO /* = new GO(0) */,
        /*public static final*/ NEXT /* = new NEXT(0) */,
        /*public static final*/ NONE /* = new NONE(0) */,
        /*public static final*/ PREVIOUS /* = new PREVIOUS(0) */,
        /*public static final*/ SEARCH /* = new SEARCH(0) */,
        /*public static final*/ SEND /* = new SEND(0) */;
        private final int value = 0;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.keyboard.ImeOptions.EnterAction.Companion Companion = null;
        
        EnterAction(int value) {
        }
        
        public final int getValue() {
            return 0;
        }
        
        public final int toInt() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/ImeOptions$EnterAction$Companion;", "", "()V", "fromInt", "Lkeyboard/neon/newboard/ime/keyboard/ImeOptions$EnterAction;", "int", "", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.keyboard.ImeOptions.EnterAction fromInt(int p0_52215) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\b\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\t\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\n\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000b\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\f\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\r\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000e\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u0012"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/ImeOptions$Companion;", "", "()V", "F_FORCE_ASCII", "Lkotlin/ULong;", "J", "F_NAVIGATE_NEXT", "F_NAVIGATE_PREVIOUS", "F_NO_ACCESSORY_ACTION", "F_NO_ENTER_ACTION", "F_NO_EXTRACT_UI", "F_NO_FULLSCREEN", "F_NO_PERSONALIZED_LEARNING", "M_ENTER_ACTION", "M_IME_OPTIONS", "O_ENTER_ACTION", "", "O_IME_OPTIONS", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}