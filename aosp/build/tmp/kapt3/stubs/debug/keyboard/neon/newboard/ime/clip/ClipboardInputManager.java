package keyboard.neon.newboard.ime.clip;

import java.lang.System;

/**
 * Handles the clipboard view and allows for communication between UI and logic.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\"\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u00192\u0006\u0010 \u001a\u00020\u0011\u00a2\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u0004\u0018\u00010\u00192\u0006\u0010#\u001a\u00020\u0011\u00a2\u0006\u0002\u0010!J\u001d\u0010$\u001a\u0004\u0018\u00010\u00192\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\'J\u001d\u0010(\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\'J\u0015\u0010*\u001a\u0004\u0018\u00010\u00192\u0006\u0010#\u001a\u00020\u0011\u00a2\u0006\u0002\u0010!J\u001a\u0010+\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\b\u0010/\u001a\u00020\u0019H\u0016J\u0010\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u000202H\u0017R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u0007X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/ClipboardInputManager;", "Lkotlinx/coroutines/CoroutineScope;", "Lkeyboard/neon/newboard/ime/core/FlorisBoard$EventListener;", "()V", "adapter", "Lkeyboard/neon/newboard/ime/clip/ClipboardHistoryItemAdapter;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "florisboard", "Lkeyboard/neon/newboard/ime/core/FlorisBoard;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "clearClipboardWithAnimation", "", "start", "", "size", "getClipboardHistoryView", "Lkeyboard/neon/newboard/ime/clip/ClipboardHistoryView;", "getPositionOfView", "view", "Landroid/view/View;", "initClipboard", "", "dataSet", "Lkotlin/collections/ArrayDeque;", "Lkeyboard/neon/newboard/ime/clip/FlorisClipboardManager$TimedClipData;", "pins", "Lkeyboard/neon/newboard/ime/clip/provider/ClipboardItem;", "notifyItemChanged", "i", "(I)Lkotlin/Unit;", "notifyItemInserted", "position", "notifyItemMoved", "from", "to", "(II)Lkotlin/Unit;", "notifyItemRangeRemoved", "numberOfItems", "notifyItemRemoved", "onButtonPressEvent", "", "event", "Landroid/view/MotionEvent;", "onDestroy", "onInitializeInputUi", "uiBinding", "Lkeyboard/neon/newboard/databinding/FlorisboardBinding;", "Companion", "aosp_debug"})
public final class ClipboardInputManager implements kotlinx.coroutines.CoroutineScope, keyboard.neon.newboard.ime.core.FlorisBoard.EventListener {
    private final keyboard.neon.newboard.ime.core.FlorisBoard florisboard = null;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private keyboard.neon.newboard.ime.clip.ClipboardHistoryItemAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.clip.ClipboardInputManager.Companion Companion = null;
    private static keyboard.neon.newboard.ime.clip.ClipboardInputManager instance;
    
    private ClipboardInputManager() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public void onInitializeInputUi(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.databinding.FlorisboardBinding uiBinding) {
    }
    
    /**
     * Clean-up of resources and stopping all coroutines.
     */
    @java.lang.Override()
    public void onDestroy() {
    }
    
    /**
     * Returns a reference to the [ClipboardHistoryView]
     */
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.clip.ClipboardHistoryView getClipboardHistoryView() {
        return null;
    }
    
    /**
     * Returns the adapter position of the view, i.e the position that the item is displayed at (including pins and
     * history items).
     *
     * @param view The ClipboardHistoryItemView whose position is to be determined.
     * @return The adapter position of the view
     */
    public final int getPositionOfView(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return 0;
    }
    
    /**
     * Notify adapter that an item was inserted.
     *
     * @param position The position the item was inserted at
     */
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit notifyItemInserted(int position) {
        return null;
    }
    
    /**
     * Notify adapter that an item was removed
     * @param position The position the item was removed from
     */
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit notifyItemRemoved(int position) {
        return null;
    }
    
    /**
     * Notify adapter that an item range was removed.
     * @param start The index the range starts at (inclusive)
     * @param numberOfItems The number of items removed
     */
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit notifyItemRangeRemoved(int start, int numberOfItems) {
        return null;
    }
    
    /**
     * Notify adapter that an item was moved
     * @param from The original position
     * @param to The final position
     */
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit notifyItemMoved(int from, int to) {
        return null;
    }
    
    /**
     * Notify adapter that an item was changed.
     *
     * @param i The position of the item
     */
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit notifyItemChanged(int i) {
        return null;
    }
    
    /**
     * Handles clicks on the back to keyboard button.
     */
    private final boolean onButtonPressEvent(android.view.View view, android.view.MotionEvent event) {
        return false;
    }
    
    /**
     * [recyclerView] will be linked to [dataSet] and [pins] when initialized.
     *
     * @param dataSet the data set to link to
     * @param pins The pins to link to
     */
    public final void initClipboard(@org.jetbrains.annotations.NotNull()
    kotlin.collections.ArrayDeque<keyboard.neon.newboard.ime.clip.FlorisClipboardManager.TimedClipData> dataSet, @org.jetbrains.annotations.NotNull()
    kotlin.collections.ArrayDeque<keyboard.neon.newboard.ime.clip.provider.ClipboardItem> pins) {
    }
    
    /**
     * Plays an animation of all items moving off the the clipboard from the top.
     *
     * @param start The index to start at (to ignore pins)
     * @param size The size of the clipboard
     * @return The time in millis till the last animation will complete.
     */
    public final long clearClipboardWithAnimation(int start, int size) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    public void onApplyThemeAttributes() {
    }
    
    public void onCreate() {
    }
    
    public void onFinishInputView(boolean finishingInput) {
    }
    
    public void onPrimaryClipChanged() {
    }
    
    public void onStartInputView(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.EditorInstance instance, boolean restarting) {
    }
    
    public void onSubtypeChanged(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype newSubtype, boolean doRefreshLayouts) {
    }
    
    public void onUpdateSelection() {
    }
    
    public void onWindowHidden() {
    }
    
    public void onWindowShown() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lkeyboard/neon/newboard/ime/clip/ClipboardInputManager$Companion;", "", "()V", "instance", "Lkeyboard/neon/newboard/ime/clip/ClipboardInputManager;", "getInstance", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Synchronized()
        public final synchronized keyboard.neon.newboard.ime.clip.ClipboardInputManager getInstance() {
            return null;
        }
    }
}