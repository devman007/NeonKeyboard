package keyboard.neon.newboard.ime.text.keyboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004Jt\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2,\u0010\u001d\u001a(\u0012\u0004\u0012\u00020\u001f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!0\u001e\u0018\u00010\u001ej\u0004\u0018\u0001`\"2,\u0010#\u001a(\u0012\u0004\u0012\u00020\u001f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!0\u001e\u0018\u00010\u001ej\u0004\u0018\u0001`\"H\u0002J\u000e\u0010$\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cJX\u0010%\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u001c2<\u0010\'\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030!\u00a2\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\u001c\u00a2\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00180(H\u0002J\"\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001800H\u0086\b\u00f8\u0001\u0000R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\t\"\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u00061"}, d2 = {"Lkeyboard/neon/newboard/ime/text/keyboard/TextKey;", "Lkeyboard/neon/newboard/ime/keyboard/Key;", "data", "Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "(Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;)V", "<set-?>", "Lkeyboard/neon/newboard/ime/keyboard/KeyData;", "computedData", "getComputedData", "()Lkeyboard/neon/newboard/ime/keyboard/KeyData;", "computedNumberHint", "getComputedNumberHint", "setComputedNumberHint", "(Lkeyboard/neon/newboard/ime/keyboard/KeyData;)V", "computedPopups", "Lkeyboard/neon/newboard/ime/popup/MutablePopupSet;", "getComputedPopups", "()Lkeyboard/neon/newboard/ime/popup/MutablePopupSet;", "computedSymbolHint", "getComputedSymbolHint", "setComputedSymbolHint", "getData", "()Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "addComputedHints", "", "keyCode", "", "evaluator", "Lkeyboard/neon/newboard/ime/keyboard/ComputingEvaluator;", "extendedPopups", "", "Lkeyboard/neon/newboard/ime/text/key/KeyVariation;", "", "Lkeyboard/neon/newboard/ime/popup/PopupSet;", "Lkeyboard/neon/newboard/ime/popup/PopupMapping;", "extendedPopupsDefault", "compute", "mergePopups", "keyData", "merge", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "popups", "setPressed", "state", "", "blockIfChanged", "Lkotlin/Function0;", "aosp_debug"})
public final class TextKey extends keyboard.neon.newboard.ime.keyboard.Key {
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.keyboard.AbstractKeyData data = null;
    @org.jetbrains.annotations.NotNull()
    private keyboard.neon.newboard.ime.keyboard.KeyData computedData;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.popup.MutablePopupSet<keyboard.neon.newboard.ime.keyboard.KeyData> computedPopups = null;
    @org.jetbrains.annotations.Nullable()
    private keyboard.neon.newboard.ime.keyboard.KeyData computedSymbolHint;
    @org.jetbrains.annotations.Nullable()
    private keyboard.neon.newboard.ime.keyboard.KeyData computedNumberHint;
    
    public TextKey(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.AbstractKeyData data) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public keyboard.neon.newboard.ime.keyboard.AbstractKeyData getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.keyboard.KeyData getComputedData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.popup.MutablePopupSet<keyboard.neon.newboard.ime.keyboard.KeyData> getComputedPopups() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.keyboard.KeyData getComputedSymbolHint() {
        return null;
    }
    
    public final void setComputedSymbolHint(@org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.keyboard.KeyData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.keyboard.KeyData getComputedNumberHint() {
        return null;
    }
    
    public final void setComputedNumberHint(@org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.keyboard.KeyData p0) {
    }
    
    public final void compute(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.ComputingEvaluator evaluator) {
    }
    
    public final void setPressed(boolean state, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> blockIfChanged) {
    }
    
    private final void addComputedHints(int keyCode, keyboard.neon.newboard.ime.keyboard.ComputingEvaluator evaluator, java.util.Map<keyboard.neon.newboard.ime.text.key.KeyVariation, ? extends java.util.Map<java.lang.String, ? extends keyboard.neon.newboard.ime.popup.PopupSet<keyboard.neon.newboard.ime.keyboard.AbstractKeyData>>> extendedPopups, java.util.Map<keyboard.neon.newboard.ime.text.key.KeyVariation, ? extends java.util.Map<java.lang.String, ? extends keyboard.neon.newboard.ime.popup.PopupSet<keyboard.neon.newboard.ime.keyboard.AbstractKeyData>>> extendedPopupsDefault) {
    }
    
    private final void mergePopups(keyboard.neon.newboard.ime.keyboard.KeyData keyData, keyboard.neon.newboard.ime.keyboard.ComputingEvaluator evaluator, kotlin.jvm.functions.Function2<? super keyboard.neon.newboard.ime.popup.PopupSet<keyboard.neon.newboard.ime.keyboard.AbstractKeyData>, ? super keyboard.neon.newboard.ime.keyboard.ComputingEvaluator, kotlin.Unit> merge) {
    }
}