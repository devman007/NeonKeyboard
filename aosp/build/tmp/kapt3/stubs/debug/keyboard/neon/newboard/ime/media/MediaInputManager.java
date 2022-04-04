package keyboard.neon.newboard.ime.media;

import java.lang.System;

/**
 * MediaInputManager is responsible for managing everything which is related to media input. All of
 * the following count as media input: emojis, emoticons, kaomoji.
 *
 * All of the UI for the different media tabs are kept under the same container element and
 * are separated from text-related UI.
 *
 * All events defined in [FlorisBoard.EventListener] will be passed through to this class by the
 * core.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0002,-B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0017J\u000e\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020 2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lkeyboard/neon/newboard/ime/media/MediaInputManager;", "Lkotlinx/coroutines/CoroutineScope;", "Lkeyboard/neon/newboard/ime/core/FlorisBoard$EventListener;", "()V", "activeEditorInstance", "Lkeyboard/neon/newboard/ime/core/EditorInstance;", "getActiveEditorInstance", "()Lkeyboard/neon/newboard/ime/core/EditorInstance;", "activeTab", "Lkeyboard/neon/newboard/ime/media/MediaInputManager$Tab;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "florisboard", "Lkeyboard/neon/newboard/ime/core/FlorisBoard;", "mediaViewFlipper", "Landroid/widget/ViewFlipper;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "tabViews", "Ljava/util/EnumMap;", "Landroid/widget/LinearLayout;", "createTabViewFor", "tab", "onBottomButtonEvent", "", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "onDestroy", "", "onInitializeInputUi", "uiBinding", "Lkeyboard/neon/newboard/databinding/FlorisboardBinding;", "sendEmojiKeyPress", "emojiKeyData", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyData;", "sendEmoticonKeyPress", "emoticonKeyData", "Lkeyboard/neon/newboard/ime/media/emoticon/EmoticonKeyData;", "setActiveTab", "newActiveTab", "Companion", "Tab", "aosp_debug"})
public final class MediaInputManager implements kotlinx.coroutines.CoroutineScope, keyboard.neon.newboard.ime.core.FlorisBoard.EventListener {
    private final keyboard.neon.newboard.ime.core.FlorisBoard florisboard = null;
    private keyboard.neon.newboard.ime.media.MediaInputManager.Tab activeTab;
    private android.widget.ViewFlipper mediaViewFlipper;
    private com.google.android.material.tabs.TabLayout tabLayout;
    private final java.util.EnumMap<keyboard.neon.newboard.ime.media.MediaInputManager.Tab, android.widget.LinearLayout> tabViews = null;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.media.MediaInputManager.Companion Companion = null;
    private static keyboard.neon.newboard.ime.media.MediaInputManager instance;
    
    private MediaInputManager() {
        super();
    }
    
    private final keyboard.neon.newboard.ime.core.EditorInstance getActiveEditorInstance() {
        return null;
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
     * Handles clicks on the bottom buttons.
     */
    private final boolean onBottomButtonEvent(android.view.View view, android.view.MotionEvent event) {
        return false;
    }
    
    /**
     * Creates and returns a tab view for the given [tab].
     */
    private final android.widget.LinearLayout createTabViewFor(keyboard.neon.newboard.ime.media.MediaInputManager.Tab tab) {
        return null;
    }
    
    /**
     * Sets the actively shown tab.
     */
    public final void setActiveTab(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.media.MediaInputManager.Tab newActiveTab) {
    }
    
    /**
     * Sends a given [emojiKeyData] to the current input editor.
     */
    public final void sendEmojiKeyPress(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.media.emoji.EmojiKeyData emojiKeyData) {
    }
    
    /**
     * Sends a given [emoticonKeyData] to the current input editor.
     */
    public final void sendEmoticonKeyPress(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.media.emoticon.EmoticonKeyData emoticonKeyData) {
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
    
    /**
     * Enum which defines the tabs for the media context.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lkeyboard/neon/newboard/ime/media/MediaInputManager$Tab;", "", "(Ljava/lang/String;I)V", "EMOJI", "EMOTICON", "aosp_debug"})
    public static enum Tab {
        /*public static final*/ EMOJI /* = new EMOJI() */,
        /*public static final*/ EMOTICON /* = new EMOTICON() */;
        
        Tab() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lkeyboard/neon/newboard/ime/media/MediaInputManager$Companion;", "", "()V", "instance", "Lkeyboard/neon/newboard/ime/media/MediaInputManager;", "getInstance", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Synchronized()
        public final synchronized keyboard.neon.newboard.ime.media.MediaInputManager getInstance() {
            return null;
        }
    }
}