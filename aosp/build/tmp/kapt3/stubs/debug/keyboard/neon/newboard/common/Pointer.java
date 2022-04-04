package keyboard.neon.newboard.common;

import java.lang.System;

/**
 * Abstract touch pointer definition.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lkeyboard/neon/newboard/common/Pointer;", "", "()V", "id", "", "getId", "()I", "setId", "(I)V", "index", "getIndex", "setIndex", "isNotUsed", "", "()Z", "isUsed", "reset", "", "Companion", "aosp_debug"})
public abstract class Pointer {
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.common.Pointer.Companion Companion = null;
    public static final int UNUSED_P = -1;
    
    /**
     * The id of this pointer, corresponds to the motion event this pointer originated.
     */
    private int id = -1;
    
    /**
     * The index of this pointer, corresponds to the motion event this pointer originated.
     */
    private int index = -1;
    
    public Pointer() {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final int getIndex() {
        return 0;
    }
    
    public final void setIndex(int p0) {
    }
    
    public final boolean isUsed() {
        return false;
    }
    
    public final boolean isNotUsed() {
        return false;
    }
    
    /**
     * Resets this pointer to be used again.
     */
    public void reset() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lkeyboard/neon/newboard/common/Pointer$Companion;", "", "()V", "UNUSED_P", "", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}