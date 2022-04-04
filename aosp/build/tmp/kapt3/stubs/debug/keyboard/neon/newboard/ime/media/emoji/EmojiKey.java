package keyboard.neon.newboard.ime.media.emoji;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lkeyboard/neon/newboard/ime/media/emoji/EmojiKey;", "Lkeyboard/neon/newboard/ime/keyboard/Key;", "data", "Lkeyboard/neon/newboard/ime/keyboard/KeyData;", "(Lkeyboard/neon/newboard/ime/keyboard/KeyData;)V", "<set-?>", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyData;", "computedData", "getComputedData", "()Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyData;", "Lkeyboard/neon/newboard/ime/popup/PopupSet;", "computedPopups", "getComputedPopups", "()Lkeyboard/neon/newboard/ime/popup/PopupSet;", "getData", "()Lkeyboard/neon/newboard/ime/keyboard/KeyData;", "dummyCompute", "", "Companion", "aosp_debug"})
public final class EmojiKey extends keyboard.neon.newboard.ime.keyboard.Key {
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.keyboard.KeyData data = null;
    @org.jetbrains.annotations.NotNull()
    private keyboard.neon.newboard.ime.media.emoji.EmojiKeyData computedData;
    @org.jetbrains.annotations.NotNull()
    private keyboard.neon.newboard.ime.popup.PopupSet<keyboard.neon.newboard.ime.keyboard.KeyData> computedPopups;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.media.emoji.EmojiKey.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final keyboard.neon.newboard.ime.media.emoji.EmojiKey EMPTY = null;
    
    public EmojiKey(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public keyboard.neon.newboard.ime.keyboard.KeyData getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.media.emoji.EmojiKeyData getComputedData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.popup.PopupSet<keyboard.neon.newboard.ime.keyboard.KeyData> getComputedPopups() {
        return null;
    }
    
    public final void dummyCompute() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lkeyboard/neon/newboard/ime/media/emoji/EmojiKey$Companion;", "", "()V", "EMPTY", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiKey;", "getEMPTY", "()Lkeyboard/neon/newboard/ime/media/emoji/EmojiKey;", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.media.emoji.EmojiKey getEMPTY() {
            return null;
        }
    }
}