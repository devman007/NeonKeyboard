package keyboard.neon.newboard.ime.keyboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0013"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/ComputingEvaluator;", "", "evaluateCaps", "", "data", "Lkeyboard/neon/newboard/ime/keyboard/KeyData;", "evaluateCharHalfWidth", "evaluateEnabled", "evaluateKanaKata", "evaluateKanaSmall", "evaluateVisible", "getActiveSubtype", "Lkeyboard/neon/newboard/ime/core/Subtype;", "getKeyVariation", "Lkeyboard/neon/newboard/ime/text/key/KeyVariation;", "getKeyboard", "Lkeyboard/neon/newboard/ime/keyboard/Keyboard;", "getSlotData", "isSlot", "aosp_debug"})
public abstract interface ComputingEvaluator {
    
    public abstract boolean evaluateCaps();
    
    public abstract boolean evaluateCaps(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data);
    
    public abstract boolean evaluateCharHalfWidth();
    
    public abstract boolean evaluateKanaKata();
    
    public abstract boolean evaluateKanaSmall();
    
    public abstract boolean evaluateEnabled(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data);
    
    public abstract boolean evaluateVisible(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract keyboard.neon.newboard.ime.core.Subtype getActiveSubtype();
    
    @org.jetbrains.annotations.NotNull()
    public abstract keyboard.neon.newboard.ime.text.key.KeyVariation getKeyVariation();
    
    @org.jetbrains.annotations.NotNull()
    public abstract keyboard.neon.newboard.ime.keyboard.Keyboard getKeyboard();
    
    public abstract boolean isSlot(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data);
    
    @org.jetbrains.annotations.Nullable()
    public abstract keyboard.neon.newboard.ime.keyboard.KeyData getSlotData(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        public static boolean evaluateCharHalfWidth(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.keyboard.ComputingEvaluator $this) {
            return false;
        }
        
        public static boolean evaluateKanaKata(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.keyboard.ComputingEvaluator $this) {
            return false;
        }
        
        public static boolean evaluateKanaSmall(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.keyboard.ComputingEvaluator $this) {
            return false;
        }
    }
}