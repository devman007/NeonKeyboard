package keyboard.neon.newboard.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000e\u0010\u000b\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lkeyboard/neon/newboard/common/PointerIterator;", "P", "Lkeyboard/neon/newboard/common/Pointer;", "", "pointerMap", "Lkeyboard/neon/newboard/common/PointerMap;", "(Lkeyboard/neon/newboard/common/PointerMap;)V", "index", "", "hasNext", "", "next", "()Lkeyboard/neon/newboard/common/Pointer;", "aosp_debug"})
public final class PointerIterator<P extends keyboard.neon.newboard.common.Pointer> implements java.util.Iterator<P>, kotlin.jvm.internal.markers.KMappedMarker {
    private final keyboard.neon.newboard.common.PointerMap<P> pointerMap = null;
    private int index = 0;
    
    public PointerIterator(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.common.PointerMap<P> pointerMap) {
        super();
    }
    
    @java.lang.Override()
    public boolean hasNext() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public P next() {
        return null;
    }
}