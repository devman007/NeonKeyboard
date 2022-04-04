package keyboard.neon.newboard.ime.text.keyboard;

import java.lang.System;

/**
 * Helper class for caching computed text keyboards. Done to reduce the CPU strain and to reuse already allocated
 * objects. The cache stores the deferred results of the keyboard, meaning that it can contain keyboards which haven't
 * even finished computing. When getting a keyboard, the caller must always await the result thus. Additionally several
 * clear methods are provided to clear the cache either partially or completely.
 *
 * @param ioDispatcher The dispatcher for the IO channel. Defaults to [Dispatchers.IO].
 */
@kotlin.Suppress(names = {"MemberVisibilityCanBePrivate"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0007J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010JO\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0000\u00a2\u0006\u0002\u0010\u0017J$\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tR&\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lkeyboard/neon/newboard/ime/text/keyboard/TextKeyboardCache;", "", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "cache", "Ljava/util/EnumMap;", "Lkeyboard/neon/newboard/ime/text/keyboard/KeyboardMode;", "Landroidx/collection/SparseArrayCompat;", "Lkotlinx/coroutines/Deferred;", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKeyboard;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "clear", "", "subtype", "Lkeyboard/neon/newboard/ime/core/Subtype;", "mode", "getAsync", "getOrElseAsync", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkeyboard/neon/newboard/ime/text/keyboard/KeyboardMode;Lkeyboard/neon/newboard/ime/core/Subtype;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Deferred;", "set", "keyboard", "aosp_debug"})
public final class TextKeyboardCache {
    private final java.util.EnumMap<keyboard.neon.newboard.ime.text.keyboard.KeyboardMode, androidx.collection.SparseArrayCompat<kotlinx.coroutines.Deferred<keyboard.neon.newboard.ime.text.keyboard.TextKeyboard>>> cache = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    public TextKeyboardCache() {
        super();
    }
    
    public TextKeyboardCache(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
    
    /**
     * Clears all computed keyboards for all modes and all subtypes from this cache.
     */
    public final void clear() {
    }
    
    /**
     * Clears all computed keyboards associated with given [mode].
     *
     * @param mode The keyboard mode for which the computed keyboards should be cleared from the cache.
     */
    public final void clear(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.keyboard.KeyboardMode mode) {
    }
    
    /**
     * Clears all computed keyboards associated with given [subtype].
     *
     * @param subtype The subtype for which the computed keyboards should be cleared from the cache.
     */
    public final void clear(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype subtype) {
    }
    
    /**
     * Clears all computed keyboards associated with given [mode] _and_ [subtype].
     *
     * @param mode The keyboard mode for which the computed keyboards should be cleared from the cache.*
     * @param subtype The subtype for which the computed keyboards should be cleared from the cache.
     */
    public final void clear(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.keyboard.KeyboardMode mode, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype subtype) {
    }
    
    /**
     * Performs a get operation on the cache to retrieve the computed keyboard for given [mode] _and_ [subtype].
     *
     * @param mode The mode of the computed keyboard to get.
     * @param subtype The subtype of the computed keyboard to get.
     *
     * @return The deferred computed keyboard or null if the cache does not have an entry associated with the given
     * params.
     */
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.Deferred<keyboard.neon.newboard.ime.text.keyboard.TextKeyboard> getAsync(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.keyboard.KeyboardMode mode, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype subtype) {
        return null;
    }
    
    /**
     * Performs a get operation on the cache to retrieve the computed keyboard for given [mode] _and_ [subtype]. If no
     * entry for the given params can be found, [block] will be called and the deferred result of this block will
     * instantly be put into the cache and returned.
     *
     * @param mode The mode of the computed keyboard to get.
     * @param subtype The subtype of the computed keyboard to get.
     * @param block The lambda expression which is invoked to provide a fallback computed keyboard.
     *
     * @return The deferred computed keyboard either from the cache or from [block].
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Deferred<keyboard.neon.newboard.ime.text.keyboard.TextKeyboard> getOrElseAsync(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.keyboard.KeyboardMode mode, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype subtype, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super keyboard.neon.newboard.ime.text.keyboard.TextKeyboard>, ? extends java.lang.Object> block) {
        return null;
    }
    
    /**
     * Performs a set operation on the cache and assigns [keyboard] to the given params [mode] and [subtype].
     *
     * @param mode The mode of the computed keyboard to set.
     * @param subtype The subtype of the computed keyboard to set.
     * @param keyboard The deferred computed keyboard to set for the given params.
     */
    public final void set(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.keyboard.KeyboardMode mode, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype subtype, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Deferred<keyboard.neon.newboard.ime.text.keyboard.TextKeyboard> keyboard) {
    }
}