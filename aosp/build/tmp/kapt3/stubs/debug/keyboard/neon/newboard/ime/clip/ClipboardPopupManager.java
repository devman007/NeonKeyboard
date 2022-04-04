package keyboard.neon.newboard.ime.clip;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u0006\u0010\u0013\u001a\u00020\u0011J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/ClipboardPopupManager;", "", "keyboardView", "Lkeyboard/neon/newboard/ime/clip/ClipboardHistoryView;", "popupLayerView", "Lkeyboard/neon/newboard/ime/popup/PopupLayerView;", "clipboardHistoryItem", "Lkeyboard/neon/newboard/ime/clip/ClipboardHistoryItemView;", "(Lkeyboard/neon/newboard/ime/clip/ClipboardHistoryView;Lkeyboard/neon/newboard/ime/popup/PopupLayerView;Lkeyboard/neon/newboard/ime/clip/ClipboardHistoryItemView;)V", "height", "", "popupView", "Lkeyboard/neon/newboard/ime/clip/ClipboardPopupView;", "width", "xOffset", "yOffset", "calc", "", "view", "hide", "pinButtonListener", "show", "aosp_debug"})
public final class ClipboardPopupManager {
    private final keyboard.neon.newboard.ime.clip.ClipboardHistoryView keyboardView = null;
    private final keyboard.neon.newboard.ime.popup.PopupLayerView popupLayerView = null;
    private final keyboard.neon.newboard.ime.clip.ClipboardHistoryItemView clipboardHistoryItem = null;
    private final keyboard.neon.newboard.ime.clip.ClipboardPopupView popupView = null;
    private int width = 0;
    private int height = 0;
    private int xOffset = 0;
    private int yOffset = 0;
    
    public ClipboardPopupManager(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.clip.ClipboardHistoryView keyboardView, @org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.popup.PopupLayerView popupLayerView, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.clip.ClipboardHistoryItemView clipboardHistoryItem) {
        super();
    }
    
    private final void pinButtonListener() {
    }
    
    /**
     * Show a popup.
     */
    public final void show(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.clip.ClipboardHistoryItemView view) {
    }
    
    /**
     * Calculate sizes of popup.
     */
    private final void calc(keyboard.neon.newboard.ime.clip.ClipboardHistoryItemView view) {
    }
    
    /**
     * Hides a popup.
     */
    public final void hide() {
    }
}