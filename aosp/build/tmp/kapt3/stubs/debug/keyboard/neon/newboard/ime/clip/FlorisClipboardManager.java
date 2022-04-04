package keyboard.neon.newboard.ime.clip;

import java.lang.System;

/**
 * [FlorisClipboardManager] manages the clipboard and clipboard history.
 *
 * Also just going to document how all the classes here work.
 *
 * [FlorisClipboardManager] handles storage and retrieval of clipboard items. All manipulation of the
 * clipboard goes through here.
 *
 * [ClipboardInputManager] handles the input view and allows for communication between UI and logic
 *
 * [ClipboardHistoryView] is the view representing the clipboard context. Only does some theme stuff.
 *
 * [ClipboardHistoryItemView] is the view representing an item in the clipboard history (either image or text). Only
 * does UI stuff.
 *
 * [ClipboardHistoryItemAdapter] is the recyclerview adapter that backs the clipboard history.
 *
 * [ClipboardPopupManager] handles the popups for each [ClipboardHistoryItemView] (each item has its own popup manager)
 *
 * [ClipboardPopupView] is the view representing a popup displayed when long pressing on a clipboard history item.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 H2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003HIJB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\fJ\u000e\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\'J\u000e\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020\u0012J\u0010\u0010*\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010\fJ\u0016\u0010,\u001a\u00020#2\u0006\u0010$\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u001fJ\u0006\u0010.\u001a\u00020#J\b\u0010/\u001a\u00020#H\u0016J\u0010\u00100\u001a\u00020#2\u0006\u0010$\u001a\u00020\fH\u0002J\u0006\u00101\u001a\u00020\u001fJ\u000e\u00102\u001a\u00020#2\u0006\u00103\u001a\u000204J\u000e\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u000207J \u00108\u001a\u00020#2\u0006\u00109\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u00020#H\u0016J\u000e\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u000207J\u0010\u0010?\u001a\u0004\u0018\u00010\f2\u0006\u0010@\u001a\u000207J\u000e\u0010A\u001a\u00020\f2\u0006\u0010B\u001a\u000207J\u000e\u0010C\u001a\u00020#2\u0006\u0010B\u001a\u000207J\u000e\u0010D\u001a\u00020#2\u0006\u0010>\u001a\u000207J\u000e\u0010E\u001a\u00020#2\u0006\u0010)\u001a\u00020\u0012J\u000e\u0010F\u001a\u00020#2\u0006\u0010B\u001a\u000207J\u000e\u0010G\u001a\u00020#2\u0006\u0010$\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\f8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006K"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/FlorisClipboardManager;", "Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "cleanUpJob", "Lkotlinx/coroutines/Job;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "current", "Lkeyboard/neon/newboard/ime/clip/provider/ClipboardItem;", "history", "Lkotlin/collections/ArrayDeque;", "Lkeyboard/neon/newboard/ime/clip/FlorisClipboardManager$TimedClipData;", "onPrimaryClipChangedListeners", "Ljava/util/ArrayList;", "Lkeyboard/neon/newboard/ime/clip/FlorisClipboardManager$OnPrimaryClipChangedListener;", "Lkotlin/collections/ArrayList;", "pins", "pinsDao", "Lkeyboard/neon/newboard/ime/clip/provider/PinnedClipboardItemDao;", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "getPrefs", "()Lkeyboard/neon/newboard/ime/core/Preferences;", "primaryClip", "getPrimaryClip", "()Lkeyboard/neon/newboard/ime/clip/provider/ClipboardItem;", "shouldUpdateHistory", "", "systemClipboardManager", "Landroid/content/ClipboardManager;", "addNewClip", "", "newData", "addNewPlaintext", "newText", "", "addPrimaryClipChangedListener", "listener", "canBePasted", "clipItem", "changeCurrent", "closePrevious", "clearHistoryWithAnimation", "close", "createAndAddNewTimedClipData", "hasPrimaryClip", "initialize", "context", "Landroid/content/Context;", "isPinned", "position", "", "moveToTheBeginning", "historyElement", "clipboardInputManager", "Lkeyboard/neon/newboard/ime/clip/ClipboardInputManager;", "onPrimaryClipChanged", "pasteItem", "pos", "peekHistory", "index", "peekHistoryOrPin", "adapterPos", "pinClip", "removeClip", "removePrimaryClipChangedListener", "unpinClip", "updateHistory", "Companion", "OnPrimaryClipChangedListener", "TimedClipData", "aosp_debug"})
public final class FlorisClipboardManager implements android.content.ClipboardManager.OnPrimaryClipChangedListener, java.io.Closeable, kotlinx.coroutines.CoroutineScope {
    private keyboard.neon.newboard.ime.clip.provider.PinnedClipboardItemDao pinsDao;
    private kotlin.collections.ArrayDeque<keyboard.neon.newboard.ime.clip.FlorisClipboardManager.TimedClipData> history;
    private kotlin.collections.ArrayDeque<keyboard.neon.newboard.ime.clip.provider.ClipboardItem> pins;
    private keyboard.neon.newboard.ime.clip.provider.ClipboardItem current;
    private java.util.ArrayList<keyboard.neon.newboard.ime.clip.FlorisClipboardManager.OnPrimaryClipChangedListener> onPrimaryClipChangedListeners;
    private android.content.ClipboardManager systemClipboardManager;
    private kotlinx.coroutines.Job cleanUpJob;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.clip.FlorisClipboardManager.Companion Companion = null;
    private static keyboard.neon.newboard.ime.clip.FlorisClipboardManager instance;
    private static final long INTERVAL = 60000L;
    
    /**
     * Used so that [onPrimaryClipChanged] knows whether it was called by [changeCurrent] (and hence shouldn't update
     * history)
     */
    private boolean shouldUpdateHistory = true;
    
    private FlorisClipboardManager() {
        super();
    }
    
    private final keyboard.neon.newboard.ime.core.Preferences getPrefs() {
        return null;
    }
    
    /**
     * Adds a new item to the clipboard history (if enabled).
     */
    public final void updateHistory(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.clip.provider.ClipboardItem newData) {
    }
    
    /**
     * Moves a ClipboardItem to the beginning of the history by removing the old one and creating a new one
     */
    private final void moveToTheBeginning(keyboard.neon.newboard.ime.clip.FlorisClipboardManager.TimedClipData historyElement, keyboard.neon.newboard.ime.clip.provider.ClipboardItem newData, keyboard.neon.newboard.ime.clip.ClipboardInputManager clipboardInputManager) {
    }
    
    /**
     * Changes current clipboard item. WITHOUT updating the history.
     */
    public final void changeCurrent(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.clip.provider.ClipboardItem newData, boolean closePrevious) {
    }
    
    /**
     * Change the current text on clipboard, update history (if enabled).
     */
    public final void addNewClip(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.clip.provider.ClipboardItem newData) {
    }
    
    /**
     * Wraps some plaintext in a ClipData and calls [addNewClip]
     */
    public final void addNewPlaintext(@org.jetbrains.annotations.NotNull()
    java.lang.String newText) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.clip.provider.ClipboardItem getPrimaryClip() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.clip.provider.ClipboardItem peekHistory(int index) {
        return null;
    }
    
    public final void addPrimaryClipChangedListener(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.clip.FlorisClipboardManager.OnPrimaryClipChangedListener listener) {
    }
    
    public final void removePrimaryClipChangedListener(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.clip.FlorisClipboardManager.OnPrimaryClipChangedListener listener) {
    }
    
    /**
     * Called by system clipboard when the contents are changed
     */
    @java.lang.Override()
    public void onPrimaryClipChanged() {
    }
    
    public final boolean hasPrimaryClip() {
        return false;
    }
    
    /**
     * Cleans up.
     *
     * Sets [instance] to null for GC. Unregisters the system clipboard listener, cancels clipboard clean ups.
     */
    @java.lang.Override()
    public void close() {
    }
    
    /**
     * Initialize the floris clipboard manager. Exists to avoid dependency loop due to reference
     * to [FlorisBoard].
     *
     * Sets up the clipboard cleanup task, links the recycler view in clipInputManager to [history].
     *
     * @param context Required to register as an onPrimaryClipChangedListener of ClipboardManager
     */
    public final void initialize(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Clears the history with an animation.
     */
    public final void clearHistoryWithAnimation() {
    }
    
    public final void pinClip(int adapterPos) {
    }
    
    /**
     * Get the item at a particular [adapterPos] (i.e the position the item is displayed at.)
     */
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.clip.provider.ClipboardItem peekHistoryOrPin(int adapterPos) {
        return null;
    }
    
    public final boolean isPinned(int position) {
        return false;
    }
    
    public final void unpinClip(int adapterPos) {
    }
    
    /**
     * Creates a new TimedClipData and adds it to the history
     */
    private final void createAndAddNewTimedClipData(keyboard.neon.newboard.ime.clip.provider.ClipboardItem newData) {
    }
    
    public final void removeClip(int pos) {
    }
    
    public final void pasteItem(int pos) {
    }
    
    /**
     * Returns true if the editor can accept the clip item, else false.
     */
    public final boolean canBePasted(@org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.clip.provider.ClipboardItem clipItem) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/FlorisClipboardManager$TimedClipData;", "", "data", "Lkeyboard/neon/newboard/ime/clip/provider/ClipboardItem;", "timeUTC", "", "(Lkeyboard/neon/newboard/ime/clip/provider/ClipboardItem;J)V", "getData", "()Lkeyboard/neon/newboard/ime/clip/provider/ClipboardItem;", "getTimeUTC", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "aosp_debug"})
    public static final class TimedClipData {
        @org.jetbrains.annotations.NotNull()
        private final keyboard.neon.newboard.ime.clip.provider.ClipboardItem data = null;
        private final long timeUTC = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.clip.FlorisClipboardManager.TimedClipData copy(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.clip.provider.ClipboardItem data, long timeUTC) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public TimedClipData(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.clip.provider.ClipboardItem data, long timeUTC) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.clip.provider.ClipboardItem component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.clip.provider.ClipboardItem getData() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getTimeUTC() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/FlorisClipboardManager$OnPrimaryClipChangedListener;", "", "onPrimaryClipChanged", "", "aosp_debug"})
    public static abstract interface OnPrimaryClipChangedListener {
        
        public abstract void onPrimaryClipChanged();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\u0006J\b\u0010\r\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/FlorisClipboardManager$Companion;", "", "()V", "INTERVAL", "", "instance", "Lkeyboard/neon/newboard/ime/clip/FlorisClipboardManager;", "compareMimeTypes", "", "concreteType", "", "desiredType", "getInstance", "getInstanceOrNull", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Synchronized()
        public final synchronized keyboard.neon.newboard.ime.clip.FlorisClipboardManager getInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.Synchronized()
        public final synchronized keyboard.neon.newboard.ime.clip.FlorisClipboardManager getInstanceOrNull() {
            return null;
        }
        
        /**
         * Taken from ClipboardDescription.java from the AOSP
         *
         * Helper to compare two MIME types, where one may be a pattern.
         * @param concreteType A fully-specified MIME type.
         * @param desiredType A desired MIME type that may be a pattern such as * / *.
         * @return Returns true if the two MIME types match.
         */
        public final boolean compareMimeTypes(@org.jetbrains.annotations.NotNull()
        java.lang.String concreteType, @org.jetbrains.annotations.NotNull()
        java.lang.String desiredType) {
            return false;
        }
    }
}