package keyboard.neon.newboard.res;

import java.lang.System;

/**
 * A universal resource reference, capable to point to destinations within
 * FlorisBoard's APK assets, cache and internal storage, external resources
 * provided to FlorisBoard via content URIs, as well as hyperlinks.
 * [android.net.Uri] is used as the underlying implementation for storing the
 * reference and also handles parsing of raw string URIs.
 *
 * The reference is immutable. If a change is required, consider constructing
 * a new reference with the provided builder methods.
 *
 * @property uri The underlying URI, which can be used for external references
 * to pass along to the system.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u0000 82\u00020\u0001:\u00018B\u0014\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 \u00a2\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\u001e\u0010\'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b,\u0010\tJ\u00cf\u0001\u0010-\u001a\u00020.2#\b\u0002\u0010/\u001a\u001d\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b1\u0012\b\b(\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020.002#\b\u0002\u00103\u001a\u001d\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b1\u0012\b\b(\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020.002#\b\u0002\u00104\u001a\u001d\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b1\u0012\b\b(\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020.002#\b\u0002\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b1\u0012\b\b(\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020.00\u00f8\u0001\u0000\u0082\u0002(\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0004 \u0000\u00a2\u0006\u0004\b6\u00107R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u0011\u0010\u001a\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u0088\u0001\u0002\u00f8\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u00069"}, d2 = {"Lkeyboard/neon/newboard/res/FlorisRef;", "", "uri", "Landroid/net/Uri;", "constructor-impl", "(Landroid/net/Uri;)Landroid/net/Uri;", "authority", "", "getAuthority-impl", "(Landroid/net/Uri;)Ljava/lang/String;", "isAssets", "", "isAssets-impl", "(Landroid/net/Uri;)Z", "isCache", "isCache-impl", "isExternal", "isExternal-impl", "isInternal", "isInternal-impl", "isInvalid", "isInvalid-impl", "isValid", "isValid-impl", "relativePath", "getRelativePath-impl", "scheme", "getScheme-impl", "getUri", "()Landroid/net/Uri;", "absolutePath", "context", "Landroid/content/Context;", "absolutePath-impl", "(Landroid/net/Uri;Landroid/content/Context;)Ljava/lang/String;", "equals", "other", "hashCode", "", "subRef", "name", "subRef-kl-APLg", "(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;", "toString", "toString-impl", "whenSchemeIs", "", "assets", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "ref", "cache", "internal", "external", "whenSchemeIs-impl", "(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "aosp_debug"})
@kotlin.jvm.JvmInline()
public final class FlorisRef {
    @org.jetbrains.annotations.NotNull()
    private final android.net.Uri uri = null;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.res.FlorisRef.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SCHEME_FLORIS = "florisboard";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTHORITY_ASSETS = "assets";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTHORITY_CACHE = "cache";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTHORITY_INTERNAL = "internal";
    
    /**
     * A universal resource reference, capable to point to destinations within
     * FlorisBoard's APK assets, cache and internal storage, external resources
     * provided to FlorisBoard via content URIs, as well as hyperlinks.
     * [android.net.Uri] is used as the underlying implementation for storing the
     * reference and also handles parsing of raw string URIs.
     *
     * The reference is immutable. If a change is required, consider constructing
     * a new reference with the provided builder methods.
     *
     * @property uri The underlying URI, which can be used for external references
     * to pass along to the system.
     */
    @java.lang.Override()
    public boolean equals(java.lang.Object other) {
        return false;
    }
    
    /**
     * A universal resource reference, capable to point to destinations within
     * FlorisBoard's APK assets, cache and internal storage, external resources
     * provided to FlorisBoard via content URIs, as well as hyperlinks.
     * [android.net.Uri] is used as the underlying implementation for storing the
     * reference and also handles parsing of raw string URIs.
     *
     * The reference is immutable. If a change is required, consider constructing
     * a new reference with the provided builder methods.
     *
     * @property uri The underlying URI, which can be used for external references
     * to pass along to the system.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getUri() {
        return null;
    }
    
    /**
     * Returns the encoded string representation of this URI.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0010J\u001e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0010J&\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u001d\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0000X\u0081T\u00a2\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0016\u0010\n\u001a\u00020\u00048\u0000X\u0081T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u001e"}, d2 = {"Lkeyboard/neon/newboard/res/FlorisRef$Companion;", "", "()V", "AUTHORITY_ASSETS", "", "getAUTHORITY_ASSETS$aosp_debug$annotations", "AUTHORITY_CACHE", "getAUTHORITY_CACHE$aosp_debug$annotations", "AUTHORITY_INTERNAL", "getAUTHORITY_INTERNAL$aosp_debug$annotations", "SCHEME_FLORIS", "getSCHEME_FLORIS$aosp_debug$annotations", "assets", "Lkeyboard/neon/newboard/res/FlorisRef;", "path", "assets-kl-APLg", "(Ljava/lang/String;)Landroid/net/Uri;", "cache", "cache-kl-APLg", "from", "uri", "Landroid/net/Uri;", "from-kl-APLg", "(Landroid/net/Uri;)Landroid/net/Uri;", "str", "scheme", "from-otEsfJU", "(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "internal", "internal-kl-APLg", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
        @java.lang.Deprecated()
        public static void getSCHEME_FLORIS$aosp_debug$annotations() {
        }
        
        @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
        @java.lang.Deprecated()
        public static void getAUTHORITY_ASSETS$aosp_debug$annotations() {
        }
        
        @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
        @java.lang.Deprecated()
        public static void getAUTHORITY_CACHE$aosp_debug$annotations() {
        }
        
        @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
        @java.lang.Deprecated()
        public static void getAUTHORITY_INTERNAL$aosp_debug$annotations() {
        }
    }
}