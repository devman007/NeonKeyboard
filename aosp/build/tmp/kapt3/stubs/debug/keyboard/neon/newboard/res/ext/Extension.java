package keyboard.neon.newboard.res.ext;

import java.lang.System;

/**
 * An extension container holding a parsed config, a working directory file
 * object as well as a reference to the original flex file.
 *
 * @property config The parsed config of this extension.
 * @property workingDir The working directory, used as a cache and as a staging
 * area for modifications to extension files.
 * @property flexFile Optional, defines where the original flex file is stored.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0013\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lkeyboard/neon/newboard/res/ext/Extension;", "C", "Lkeyboard/neon/newboard/res/ext/ExtensionConfig;", "Ljava/io/Closeable;", "config", "workingDir", "Ljava/io/File;", "flexFile", "(Lkeyboard/neon/newboard/res/ext/ExtensionConfig;Ljava/io/File;Ljava/io/File;)V", "getConfig", "()Lkeyboard/neon/newboard/res/ext/ExtensionConfig;", "Lkeyboard/neon/newboard/res/ext/ExtensionConfig;", "getFlexFile", "()Ljava/io/File;", "getWorkingDir", "close", "", "aosp_debug"})
public class Extension<C extends keyboard.neon.newboard.res.ext.ExtensionConfig> implements java.io.Closeable {
    @org.jetbrains.annotations.NotNull()
    private final C config = null;
    @org.jetbrains.annotations.NotNull()
    private final java.io.File workingDir = null;
    @org.jetbrains.annotations.Nullable()
    private final java.io.File flexFile = null;
    
    public Extension(@org.jetbrains.annotations.NotNull()
    C config, @org.jetbrains.annotations.NotNull()
    java.io.File workingDir, @org.jetbrains.annotations.Nullable()
    java.io.File flexFile) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final C getConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getWorkingDir() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getFlexFile() {
        return null;
    }
    
    /**
     * Closes the extension and deletes the temporary files. After invoking this
     * method, this object and its cache files must never be touched again.
     */
    @java.lang.Override()
    public void close() {
    }
}