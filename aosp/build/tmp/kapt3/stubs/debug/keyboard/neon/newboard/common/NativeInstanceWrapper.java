package keyboard.neon.newboard.common;

import java.lang.System;

/**
 * Generic interface for a native instance object. Defines the basic
 * methods which each native instance wrapper should define and be able
 * to handle to.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lkeyboard/neon/newboard/common/NativeInstanceWrapper;", "", "dispose", "", "nativePtr", "", "Lkeyboard/neon/newboard/common/NativePtr;", "aosp_debug"})
public abstract interface NativeInstanceWrapper {
    
    /**
     * Returns the native pointer of this instance. The returned pointer
     * is only valid if [dispose] has not been previously called.
     *
     * @return The native null pointer for this instance.
     */
    public abstract long nativePtr();
    
    /**
     * Deletes the native object and frees allocated resources. After
     * invoking this method one MUST NOT touch this instance ever again.
     */
    public abstract void dispose();
}