package keyboard.neon.newboard.ime.nlp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\b\b\u0087@\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00029:B\u0018\b\u0002\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0007\u0010\bJ%\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0002j\u0002`\u00132\n\u0010\u0014\u001a\u00060\u000ej\u0002`\u0015\u00a2\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u00020\n2\n\u0010\u001d\u001a\u00060\u0002j\u0002`\u0013H\u0096\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\n2\u0010\u0010!\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00130\u0001H\u0016\u00a2\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\b%\u0010\u001bJ\u0013\u0010&\u001a\u00020\n2\b\u0010\'\u001a\u0004\u0018\u00010(H\u00d6\u0003J\u001c\u0010)\u001a\u00060\u0002j\u0002`\u00132\u0006\u0010*\u001a\u00020\u000eH\u0086\u0002\u00a2\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00132\u0006\u0010*\u001a\u00020\u000e\u00a2\u0006\u0004\b.\u0010,J\t\u0010/\u001a\u00020\u000eH\u00d6\u0001J\u000f\u00100\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b1\u0010\fJ\u001a\u00102\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u001303H\u0096\u0002\u00a2\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u00060\u0005j\u0002`\u0006H\u0016\u00a2\u0006\u0004\b7\u0010\bJ\t\u00108\u001a\u00020\u0002H\u00d6\u0001R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0004\u0092\u0001\u00060\u0005j\u0002`\u0006\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006;"}, d2 = {"Lkeyboard/neon/newboard/ime/nlp/SuggestionList;", "", "", "Lkeyboard/neon/newboard/common/NativeInstanceWrapper;", "_nativePtr", "", "Lkeyboard/neon/newboard/common/NativePtr;", "constructor-impl", "(J)J", "isPrimaryTokenAutoInsert", "", "isPrimaryTokenAutoInsert-impl", "(J)Z", "size", "", "getSize-impl", "(J)I", "add", "word", "Lkeyboard/neon/newboard/ime/nlp/Word;", "freq", "Lkeyboard/neon/newboard/ime/nlp/Freq;", "add-impl", "(JLjava/lang/String;I)Z", "clear", "", "clear-impl", "(J)V", "contains", "element", "contains-impl", "(JLjava/lang/String;)Z", "containsAll", "elements", "containsAll-impl", "(JLjava/util/Collection;)Z", "dispose", "dispose-impl", "equals", "other", "", "get", "index", "get-impl", "(JI)Ljava/lang/String;", "getOrNull", "getOrNull-impl", "hashCode", "isEmpty", "isEmpty-impl", "iterator", "", "iterator-impl", "(J)Ljava/util/Iterator;", "nativePtr", "nativePtr-impl", "toString", "Companion", "SuggestionListIterator", "aosp_debug"})
@kotlin.jvm.JvmInline()
public final class SuggestionList implements java.util.Collection<java.lang.String>, keyboard.neon.newboard.common.NativeInstanceWrapper, kotlin.jvm.internal.markers.KMappedMarker {
    private final long _nativePtr = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.nlp.SuggestionList.Companion Companion = null;
    
    @java.lang.Override()
    public boolean equals(java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
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
    public final boolean contains(java.lang.Object element) {
        return false;
    }
    
    @java.lang.Override()
    public boolean contains(@org.jetbrains.annotations.NotNull()
    java.lang.String element) {
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
    public java.util.Iterator<java.lang.String> iterator() {
        return null;
    }
    
    @java.lang.Override()
    public long nativePtr() {
        return 0L;
    }
    
    @java.lang.Override()
    public void dispose() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0012\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u000fH\u0096\u0002J\r\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0096\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u0011"}, d2 = {"Lkeyboard/neon/newboard/ime/nlp/SuggestionList$SuggestionListIterator;", "", "", "Lkeyboard/neon/newboard/ime/nlp/Word;", "suggestionList", "Lkeyboard/neon/newboard/ime/nlp/SuggestionList;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "J", "hasNext", "", "next", "aosp_debug"})
    public static final class SuggestionListIterator implements java.util.Iterator<java.lang.String>, kotlin.jvm.internal.markers.KMappedMarker {
        private final long suggestionList = 0L;
        private int index = 0;
        
        private SuggestionListIterator(long suggestionList) {
            super();
        }
        
        public final int getIndex() {
            return 0;
        }
        
        public final void setIndex(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String next() {
            return null;
        }
        
        @java.lang.Override()
        public boolean hasNext() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\n\u0010\b\u001a\u00060\tj\u0002`\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0086 J\u0015\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0086 J!\u0010\u0010\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\n\u0010\u0011\u001a\u00060\tj\u0002`\nH\u0086 J\u0015\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0086 J\u0015\u0010\u0013\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0086 J%\u0010\u0014\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0015\u001a\u00020\fH\u0086 J\u0015\u0010\u0016\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0017\u001a\u00020\fH\u0086 J\u001d\u0010\u0018\u001a\u00020\u000f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0019\u001a\u00020\u0004H\u0086 J\u0015\u0010\u001a\u001a\u00020\f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0086 J\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\f\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u001f"}, d2 = {"Lkeyboard/neon/newboard/ime/nlp/SuggestionList$Companion;", "", "()V", "nativeAdd", "", "nativePtr", "", "Lkeyboard/neon/newboard/common/NativePtr;", "word", "", "Lkeyboard/neon/newboard/ime/nlp/Word;", "freq", "", "Lkeyboard/neon/newboard/ime/nlp/Freq;", "nativeClear", "", "nativeContains", "element", "nativeDispose", "nativeGetIsPrimaryTokenAutoInsert", "nativeGetOrNull", "index", "nativeInitialize", "maxSize", "nativeSetIsPrimaryTokenAutoInsert", "v", "nativeSize", "new", "Lkeyboard/neon/newboard/ime/nlp/SuggestionList;", "new-ag6568I", "(I)J", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final native long nativeInitialize(int maxSize) {
            return 0L;
        }
        
        public final native void nativeDispose(long nativePtr) {
        }
        
        public final native boolean nativeAdd(long nativePtr, @org.jetbrains.annotations.NotNull()
        java.lang.String word, int freq) {
            return false;
        }
        
        public final native void nativeClear(long nativePtr) {
        }
        
        public final native boolean nativeContains(long nativePtr, @org.jetbrains.annotations.NotNull()
        java.lang.String element) {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final native java.lang.String nativeGetOrNull(long nativePtr, int index) {
            return null;
        }
        
        public final native boolean nativeGetIsPrimaryTokenAutoInsert(long nativePtr) {
            return false;
        }
        
        public final native void nativeSetIsPrimaryTokenAutoInsert(long nativePtr, boolean v) {
        }
        
        public final native int nativeSize(long nativePtr) {
            return 0;
        }
    }
}