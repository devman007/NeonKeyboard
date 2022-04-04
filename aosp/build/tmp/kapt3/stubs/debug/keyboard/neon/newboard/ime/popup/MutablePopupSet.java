package keyboard.neon.newboard.ime.popup;

import java.lang.System;

@kotlin.Suppress(names = {"UNCHECKED_CAST"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0093\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0006j\b\u0012\u0004\u0012\u00028\u0000`\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u0000\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0006j\b\u0012\u0004\u0012\u00028\u0000`\u0007\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0006j\b\u0012\u0004\u0012\u00028\u0000`\u0007\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\r\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u001f\u001a\u00020\u000eH\u0002J\u001c\u0010!\u001a\u00020\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010#\u001a\u00020$J6\u0010%\u001a\u00020\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010#\u001a\u00020$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\'2\b\b\u0002\u0010(\u001a\u00020)H\u0002J\u001c\u0010*\u001a\u00020\u001d2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010#\u001a\u00020$J\u001c\u0010,\u001a\u00020\u001d2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010#\u001a\u00020$R \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0006j\b\u0012\u0004\u0012\u00028\u0000`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0006j\b\u0012\u0004\u0012\u00028\u0000`\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0006j\b\u0012\u0004\u0012\u00028\u0000`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lkeyboard/neon/newboard/ime/popup/MutablePopupSet;", "T", "Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "Lkeyboard/neon/newboard/ime/popup/PopupSet;", "main", "relevant", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "symbolHint", "numberHint", "symbolPopups", "numberPopups", "configCache", "", "Lkeyboard/neon/newboard/ime/text/key/KeyHintConfiguration;", "Lkeyboard/neon/newboard/ime/popup/PopupKeys;", "(Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;Ljava/util/ArrayList;Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Map;)V", "getMain", "()Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "setMain", "(Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;)V", "Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "getNumberHint", "setNumberHint", "getRelevant", "()Ljava/util/ArrayList;", "getSymbolHint", "setSymbolHint", "clear", "", "getPopupKeys", "keyHintConfiguration", "initPopupList", "merge", "other", "evaluator", "Lkeyboard/neon/newboard/ime/keyboard/ComputingEvaluator;", "mergeInternal", "targetList", "", "useMain", "", "mergeNumberHint", "hintPopups", "mergeSymbolHint", "aosp_debug"})
public final class MutablePopupSet<T extends keyboard.neon.newboard.ime.keyboard.AbstractKeyData> extends keyboard.neon.newboard.ime.popup.PopupSet<T> {
    @org.jetbrains.annotations.Nullable()
    private T main;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<T> relevant = null;
    @org.jetbrains.annotations.Nullable()
    private T symbolHint;
    @org.jetbrains.annotations.Nullable()
    private T numberHint;
    private final java.util.ArrayList<T> symbolPopups = null;
    private final java.util.ArrayList<T> numberPopups = null;
    private final java.util.Map<keyboard.neon.newboard.ime.text.key.KeyHintConfiguration, keyboard.neon.newboard.ime.popup.PopupKeys<T>> configCache = null;
    
    public MutablePopupSet() {
        super(0, null, null, null);
    }
    
    public MutablePopupSet(@org.jetbrains.annotations.Nullable()
    T main, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> relevant, @org.jetbrains.annotations.Nullable()
    T symbolHint, @org.jetbrains.annotations.Nullable()
    T numberHint, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> symbolPopups, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> numberPopups, @org.jetbrains.annotations.NotNull()
    java.util.Map<keyboard.neon.newboard.ime.text.key.KeyHintConfiguration, keyboard.neon.newboard.ime.popup.PopupKeys<T>> configCache) {
        super(0, null, null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public T getMain() {
        return null;
    }
    
    public void setMain(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<T> getRelevant() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getSymbolHint() {
        return null;
    }
    
    public final void setSymbolHint(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getNumberHint() {
        return null;
    }
    
    public final void setNumberHint(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    public final void clear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public keyboard.neon.newboard.ime.popup.PopupKeys<T> getPopupKeys(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.key.KeyHintConfiguration keyHintConfiguration) {
        return null;
    }
    
    private final keyboard.neon.newboard.ime.popup.PopupKeys<T> initPopupList(keyboard.neon.newboard.ime.text.key.KeyHintConfiguration keyHintConfiguration) {
        return null;
    }
    
    public final void merge(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.popup.PopupSet<keyboard.neon.newboard.ime.keyboard.AbstractKeyData> other, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.ComputingEvaluator evaluator) {
    }
    
    public final void mergeSymbolHint(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.popup.PopupSet<keyboard.neon.newboard.ime.keyboard.AbstractKeyData> hintPopups, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.ComputingEvaluator evaluator) {
    }
    
    public final void mergeNumberHint(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.popup.PopupSet<keyboard.neon.newboard.ime.keyboard.AbstractKeyData> hintPopups, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.ComputingEvaluator evaluator) {
    }
    
    private final void mergeInternal(keyboard.neon.newboard.ime.popup.PopupSet<keyboard.neon.newboard.ime.keyboard.AbstractKeyData> other, keyboard.neon.newboard.ime.keyboard.ComputingEvaluator evaluator, java.util.List<T> targetList, boolean useMain) {
    }
}