package keyboard.neon.newboard.res.ext;

import java.lang.System;

/**
 * Interface for an `extension.json` file, which serves as a configuration of an extension
 * package for FlorisBoard (`.flex` archive files).
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0013\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0012\u0010\u000e\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0012\u0010\u0010\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0012\u0010\u0012\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0012\u0010\u0014\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lkeyboard/neon/newboard/res/ext/ExtensionConfig;", "", "authors", "", "", "getAuthors", "()Ljava/util/List;", "description", "getDescription", "()Ljava/lang/String;", "id", "getId", "license", "getLicense", "licenseFile", "getLicenseFile", "readmeFile", "getReadmeFile", "title", "getTitle", "version", "getVersion", "Companion", "aosp_debug"})
public abstract interface ExtensionConfig {
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.res.ext.ExtensionConfig.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_FILE_EXTENSION = "flex";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_NAME = "extension.json";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_ID = "com.example.fontkeyboardui.imported.%s.%s";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CUSTOM_LICENSE_IDENTIFIER = "@custom";
    
    /**
     * The unique identifier of this extension, adhering to
     * [Java™ package name standards](https://docs.oracle.com/javase/tutorial/java/package/namingpkgs.html).
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getId();
    
    /**
     * The version of this extension.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getVersion();
    
    /**
     * The title label of the extension. This title will be shown to the user in the Settings UI.
     *
     * Recommended limit: 50 characters
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getTitle();
    
    /**
     * The short description of this extension, will be shown as a summary text in the package list, as
     * well as the first paragraph of the expanded description.
     *
     * Recommended limit: 80 characters
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getDescription();
    
    /**
     * A list of authors who actively worked on the content of this extension. Any content of string is
     * valid, but the best practice is to use the GitHub username.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getAuthors();
    
    /**
     * A valid license identifier, according to the [SPDX license list](https://spdx.org/licenses/).
     * Use `@custom` if you use a license that is not listed in the above list.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLicense();
    
    /**
     * Additional optional license text file. Use a relative path to your license file.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLicenseFile();
    
    /**
     * The long description or readme file of this extension, will be shown in the expanded description.
     * Use a relative path to the readme file.
     *
     * Recommended limit: 4000 characters
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getReadmeFile();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lkeyboard/neon/newboard/res/ext/ExtensionConfig$Companion;", "", "()V", "CUSTOM_LICENSE_IDENTIFIER", "", "DEFAULT_FILE_EXTENSION", "DEFAULT_ID", "DEFAULT_NAME", "createIdForImport", "groupName", "extensionName", "aosp_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DEFAULT_FILE_EXTENSION = "flex";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DEFAULT_NAME = "extension.json";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DEFAULT_ID = "com.example.fontkeyboardui.imported.%s.%s";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CUSTOM_LICENSE_IDENTIFIER = "@custom";
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String createIdForImport(@org.jetbrains.annotations.NotNull()
        java.lang.String groupName, @org.jetbrains.annotations.NotNull()
        java.lang.String extensionName) {
            return null;
        }
    }
}