package keyboard.neon.newboard.ime.keyboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0014"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/DefaultComputingEvaluator;", "Lkeyboard/neon/newboard/ime/keyboard/ComputingEvaluator;", "()V", "evaluateCaps", "", "data", "Lkeyboard/neon/newboard/ime/keyboard/KeyData;", "evaluateCharHalfWidth", "evaluateEnabled", "evaluateKanaKata", "evaluateKanaSmall", "evaluateVisible", "getActiveSubtype", "Lkeyboard/neon/newboard/ime/core/Subtype;", "getKeyVariation", "Lkeyboard/neon/newboard/ime/text/key/KeyVariation;", "getKeyboard", "Lkeyboard/neon/newboard/ime/keyboard/Keyboard;", "getSlotData", "isSlot", "aosp_debug"})
public final class DefaultComputingEvaluator implements keyboard.neon.newboard.ime.keyboard.ComputingEvaluator {
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.keyboard.DefaultComputingEvaluator INSTANCE = null;
    
    private DefaultComputingEvaluator() {
        super();
    }
    
    @java.lang.Override()
    public boolean evaluateCaps() {
        return false;
    }
    
    @java.lang.Override()
    public boolean evaluateCaps(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data) {
        return false;
    }
    
    @java.lang.Override()
    public boolean evaluateCharHalfWidth() {
        return false;
    }
    
    @java.lang.Override()
    public boolean evaluateKanaKata() {
        return false;
    }
    
    @java.lang.Override()
    public boolean evaluateKanaSmall() {
        return false;
    }
    
    @java.lang.Override()
    public boolean evaluateEnabled(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data) {
        return false;
    }
    
    @java.lang.Override()
    public boolean evaluateVisible(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public keyboard.neon.newboard.ime.core.Subtype getActiveSubtype() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public keyboard.neon.newboard.ime.text.key.KeyVariation getKeyVariation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public keyboard.neon.newboard.ime.keyboard.Keyboard getKeyboard() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isSlot(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public keyboard.neon.newboard.ime.keyboard.KeyData getSlotData(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data) {
        return null;
    }
}