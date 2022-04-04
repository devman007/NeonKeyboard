package keyboard.neon.newboard.common;

import java.lang.System;

/**
 * A simple helper object managing touch pointer objects. This class is designed to hold
 * at max [capacity] at once. It tries to reduce the need to recreate objects and to resize
 * arrays by creating a fixed-size list and by reusing pointers. This map supports iterating
 * over all active pointers.
 *
 * @property capacity The capacity of this map, determining the maximum number of pointers this
 * map can hold at once. This value must be greater than or equal to one. Should a smaller capacity
 * be passed, automatically the minimum capacity `1` is assumed.
 * @param init The initializer for each pointer. Note that [Pointer.reset] is called before
 * storing the new object, to ensure that this pointer is not initialized with some pointer data.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u0016J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096\u0002J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0005R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lkeyboard/neon/newboard/common/PointerMap;", "P", "Lkeyboard/neon/newboard/common/Pointer;", "", "capacity", "", "init", "Lkotlin/Function1;", "(ILkotlin/jvm/functions/Function1;)V", "getCapacity", "()I", "pointers", "", "size", "getSize", "add", "id", "index", "(II)Lkeyboard/neon/newboard/common/Pointer;", "clear", "", "findById", "(I)Lkeyboard/neon/newboard/common/Pointer;", "get", "iterator", "", "removeById", "", "aosp_debug"})
public final class PointerMap<P extends keyboard.neon.newboard.common.Pointer> implements java.lang.Iterable<P>, kotlin.jvm.internal.markers.KMappedMarker {
    private final int capacity = 0;
    
    /**
     * The internal list of pointers, is not intended for public access.
     */
    private final java.util.List<P> pointers = null;
    
    public PointerMap(int capacity, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends P> init) {
        super();
    }
    
    public final int getCapacity() {
        return 0;
    }
    
    /**
     * Adds a new pointer with given [id] and [index] and returns it. If this map is already at max
     * capacity, null is returned and the pointer could not be added.
     *
     * @param id The id of the pointer to add.
     * @param index The index of the pointer to add.
     *
     * @return The newly added pointer or null if the map is already full.
     */
    @org.jetbrains.annotations.Nullable()
    public final P add(int id, int index) {
        return null;
    }
    
    /**
     * Clears this map and resets all pointers.
     */
    public final void clear() {
    }
    
    /**
     * Finds a pointer by given [id].
     *
     * @param id The id of the pointer which should be found.
     *
     * @return The pointer with given [id] or null.
     */
    @org.jetbrains.annotations.Nullable()
    public final P findById(int id) {
        return null;
    }
    
    /**
     * Gets a pointer from the internal array based on the internal array index. This method
     * is intended to be used only by the [PointerIterator].
     *
     * @param index
     *
     * @return The pointer for given index or null, excluding unused pointers.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final P get(int index) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Iterator<P> iterator() {
        return null;
    }
    
    /**
     * Removes a pointer with given [id] and returns a boolean result.
     *
     * @param id The id of the pointer to remove. If the id is not existent, noting happens.
     *
     * @return True if a pointer was removed, false otherwise.
     */
    public final boolean removeById(int id) {
        return false;
    }
    
    public final int getSize() {
        return 0;
    }
}