package keyboard.neon.newboard.ime.popup;

import java.lang.System;

/**
 * A fully configured collection of popup keys. It contains a list of keys to be prioritized
 * during rendering (ordered by relevance descending) by showing those keys close to the
 * popup spawning point.
 *
 * The keys contain a separate [hint] key to ease rendering the hint label, but the hint, if
 * present, also occurs in the [prioritized] list.
 *
 * The popup keys can be accessed like an array with the addition that negative indexes defined
 * within this companion object are allowed (as long as the corresponding [prioritized] list
 * contains the corresponding amount of keys.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0002\u0018\u0000 \u001f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u001fB+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u0016\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u000fH\u0086\u0002\u00a2\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0019\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u001aJ\b\u0010\u001c\u001a\u00020\u0013H\u0016J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096\u0002R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006 "}, d2 = {"Lkeyboard/neon/newboard/ime/popup/PopupKeys;", "T", "", "hint", "prioritized", "", "other", "(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V", "getHint", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getOther", "()Ljava/util/List;", "getPrioritized", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "get", "index", "(I)Ljava/lang/Object;", "getOrNull", "isEmpty", "iterator", "", "Companion", "aosp_debug"})
public final class PopupKeys<T extends java.lang.Object> implements java.util.Collection<T>, kotlin.jvm.internal.markers.KMappedMarker {
    @org.jetbrains.annotations.Nullable()
    private final T hint = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<T> prioritized = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<T> other = null;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.popup.PopupKeys.Companion Companion = null;
    public static final int FIRST_PRIORITIZED = -1;
    public static final int SECOND_PRIORITIZED = -2;
    public static final int THIRD_PRIORITIZED = -3;
    
    public PopupKeys(@org.jetbrains.annotations.Nullable()
    T hint, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> prioritized, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> other) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getHint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getPrioritized() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getOther() {
        return null;
    }
    
    @java.lang.Override()
    public int getSize() {
        return 0;
    }
    
    @java.lang.Override()
    public final int size() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean contains(java.lang.Object element) {
        return false;
    }
    
    @java.lang.Override()
    public boolean containsAll(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends java.lang.Object> elements) {
        return false;
    }
    
    @java.lang.Override()
    public boolean isEmpty() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Iterator<T> iterator() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getOrNull(int index) {
        return null;
    }
    
    public final T get(int index) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lkeyboard/neon/newboard/ime/popup/PopupKeys$Companion;", "", "()V", "FIRST_PRIORITIZED", "", "SECOND_PRIORITIZED", "THIRD_PRIORITIZED", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}