package keyboard.neon.newboard.ime.core;

import java.lang.System;

/**
 * Core class responsible to link together both the text and media input managers as well as
 * managing the one-handed UI.
 *
 * All inline suggestion code has been added based on this demo autofill IME provided by Android directly:
 * https://cs.android.com/android/platform/superproject/+/master:development/samples/AutofillKeyboard/src/com/example/android/autofillkeyboard/AutofillImeService.java
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00c4\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 \u00cf\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\b\u00cf\u0001\u00d0\u0001\u00d1\u0001\u00d2\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010v\u001a\u00020#2\u0006\u0010w\u001a\u00020*J\u0006\u0010x\u001a\u00020yJ\b\u0010z\u001a\u00020yH\u0003J\u0006\u0010{\u001a\u00020yJ\u0006\u0010|\u001a\u00020yJ\u000e\u0010}\u001a\u00020y2\u0006\u0010~\u001a\u00020\u007fJ\n\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0016J\u0007\u0010\u0082\u0001\u001a\u00020yJ\u0007\u0010\u0083\u0001\u001a\u00020#J\u0007\u0010\u0084\u0001\u001a\u00020yJ\t\u0010\u0085\u0001\u001a\u00020yH\u0016J\u0015\u0010\u0086\u0001\u001a\u00020y2\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001H\u0016J\u0013\u0010\u0089\u0001\u001a\u00020y2\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0016J\t\u0010\u008c\u0001\u001a\u00020yH\u0016J\f\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0016J\f\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0017J\u0016\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u00012\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0017J\f\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0017J\t\u0010\u0095\u0001\u001a\u00020yH\u0016J\t\u0010\u0096\u0001\u001a\u00020#H\u0016J\t\u0010\u0097\u0001\u001a\u00020yH\u0016J\u0012\u0010\u0098\u0001\u001a\u00020y2\u0007\u0010\u0099\u0001\u001a\u00020#H\u0016J\u0013\u0010\u009a\u0001\u001a\u00020#2\b\u0010\u009b\u0001\u001a\u00030\u009c\u0001H\u0017J\t\u0010\u009d\u0001\u001a\u00020yH\u0016J\u001e\u0010\u009e\u0001\u001a\u00020y2\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u00a0\u00012\u0007\u0010\u00a1\u0001\u001a\u00020#H\u0016J\u001e\u0010\u00a2\u0001\u001a\u00020y2\n\u0010\u00a3\u0001\u001a\u0005\u0018\u00010\u00a0\u00012\u0007\u0010\u00a1\u0001\u001a\u00020#H\u0016J\u001b\u0010\u00a4\u0001\u001a\u00020y2\u0007\u0010\u00a5\u0001\u001a\u00020\u00132\u0007\u0010\u00a6\u0001\u001a\u00020#H\u0002J\u0013\u0010\u00a7\u0001\u001a\u00020y2\b\u0010\u00a8\u0001\u001a\u00030\u00a9\u0001H\u0016J\t\u0010\u00aa\u0001\u001a\u00020yH\u0016J\u001e\u0010\u00ab\u0001\u001a\u00020y2\u0007\u0010\u00ac\u0001\u001a\u00020%2\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u00ae\u0001H\u0016J\u0015\u0010\u00af\u0001\u001a\u00020y2\n\u0010\u00b0\u0001\u001a\u0005\u0018\u00010\u00a0\u0001H\u0016J\u0015\u0010\u00b1\u0001\u001a\u00020y2\n\u0010\u00b0\u0001\u001a\u0005\u0018\u00010\u00a0\u0001H\u0016J?\u0010\u00b2\u0001\u001a\u00020y2\u0007\u0010\u00b3\u0001\u001a\u00020%2\u0007\u0010\u00b4\u0001\u001a\u00020%2\u0007\u0010\u00b5\u0001\u001a\u00020%2\u0007\u0010\u00b6\u0001\u001a\u00020%2\u0007\u0010\u00b7\u0001\u001a\u00020%2\u0007\u0010\u00b8\u0001\u001a\u00020%H\u0016J\t\u0010\u00b9\u0001\u001a\u00020yH\u0016J\t\u0010\u00ba\u0001\u001a\u00020yH\u0016J\u0013\u0010\u00bb\u0001\u001a\u00020y2\b\u0010\u009b\u0001\u001a\u00030\u009c\u0001H\u0003J\u000f\u0010\u00bc\u0001\u001a\u00020#2\u0006\u0010w\u001a\u00020*J\u001b\u0010\u00bd\u0001\u001a\u00020y2\u0007\u0010\u00be\u0001\u001a\u00020%2\t\b\u0002\u0010\u00bf\u0001\u001a\u00020#J\u0007\u0010\u00c0\u0001\u001a\u00020#J\u0011\u0010\u00c1\u0001\u001a\u00020y2\b\u0010\u00c2\u0001\u001a\u00030\u00c3\u0001J\u0007\u0010\u00c4\u0001\u001a\u00020yJ\u0007\u0010\u00c5\u0001\u001a\u00020yJ\t\u0010\u00c6\u0001\u001a\u00020yH\u0002J\t\u0010\u00c7\u0001\u001a\u00020yH\u0002J\u0010\u0010\u00c8\u0001\u001a\u00020y2\u0007\u0010\u00c9\u0001\u001a\u00020#J\t\u0010\u00ca\u0001\u001a\u00020yH\u0016J\u0007\u0010\u00cb\u0001\u001a\u00020yJ\t\u0010\u00cc\u0001\u001a\u00020yH\u0002J\u0014\u0010\u00cd\u0001\u001a\u00020y2\t\b\u0001\u0010\u00ce\u0001\u001a\u00020%H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f8F\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u000e\u00104\u001a\u000205X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020=X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u000e\u0010B\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010E\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u000e\u0010I\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010J\u001a\u00020KX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0010\u0010P\u001a\u0004\u0018\u00010QX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010T\u001a\u0004\u0018\u00010S2\b\u0010R\u001a\u0004\u0018\u00010S@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020X8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bY\u0010ZR\u000e\u0010[\u001a\u00020\\X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020^X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010_\u001a\u00020`8F\u00a2\u0006\u0006\u001a\u0004\ba\u0010bR\u001a\u0010c\u001a\u00020dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0011\u0010i\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\bj\u0010kR\u000e\u0010l\u001a\u00020mX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010o\u001a\u0004\u0018\u00010n2\b\u0010R\u001a\u0004\u0018\u00010n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0014\u0010r\u001a\u00020s8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bt\u0010u\u00a8\u0006\u00d3\u0001"}, d2 = {"Lkeyboard/neon/newboard/ime/core/FlorisBoard;", "Landroid/inputmethodservice/InputMethodService;", "Landroidx/lifecycle/LifecycleOwner;", "Lkeyboard/neon/newboard/ime/clip/FlorisClipboardManager$OnPrimaryClipChangedListener;", "Lkeyboard/neon/newboard/ime/theme/ThemeManager$OnThemeUpdatedListener;", "()V", "_themeContext", "Landroid/content/Context;", "activeEditorInstance", "Lkeyboard/neon/newboard/ime/core/EditorInstance;", "getActiveEditorInstance", "()Lkeyboard/neon/newboard/ime/core/EditorInstance;", "setActiveEditorInstance", "(Lkeyboard/neon/newboard/ime/core/EditorInstance;)V", "activeState", "Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "getActiveState", "()Lkeyboard/neon/newboard/ime/keyboard/KeyboardState;", "activeSubtype", "Lkeyboard/neon/newboard/ime/core/Subtype;", "getActiveSubtype", "()Lkeyboard/neon/newboard/ime/core/Subtype;", "setActiveSubtype", "(Lkeyboard/neon/newboard/ime/core/Subtype;)V", "clipInputManager", "Lkeyboard/neon/newboard/ime/clip/ClipboardInputManager;", "getClipInputManager", "()Lkeyboard/neon/newboard/ime/clip/ClipboardInputManager;", "setClipInputManager", "(Lkeyboard/neon/newboard/ime/clip/ClipboardInputManager;)V", "composer", "Lkeyboard/neon/newboard/ime/text/composing/Composer;", "getComposer", "()Lkeyboard/neon/newboard/ime/text/composing/Composer;", "currentThemeIsNight", "", "currentThemeResId", "", "devtoolsOverlaySyncJob", "Lkotlinx/coroutines/Job;", "eventListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkeyboard/neon/newboard/ime/core/FlorisBoard$EventListener;", "extractEditLayout", "Ljava/lang/ref/WeakReference;", "Landroid/view/ViewGroup;", "florisClipboardManager", "Lkeyboard/neon/newboard/ime/clip/FlorisClipboardManager;", "getFlorisClipboardManager", "()Lkeyboard/neon/newboard/ime/clip/FlorisClipboardManager;", "setFlorisClipboardManager", "(Lkeyboard/neon/newboard/ime/clip/FlorisClipboardManager;)V", "handler", "Landroid/os/Handler;", "imeManager", "Landroid/view/inputmethod/InputMethodManager;", "getImeManager", "()Landroid/view/inputmethod/InputMethodManager;", "setImeManager", "(Landroid/view/inputmethod/InputMethodManager;)V", "inputFeedbackManager", "Lkeyboard/neon/newboard/ime/keyboard/InputFeedbackManager;", "getInputFeedbackManager", "()Lkeyboard/neon/newboard/ime/keyboard/InputFeedbackManager;", "setInputFeedbackManager", "(Lkeyboard/neon/newboard/ime/keyboard/InputFeedbackManager;)V", "internalBatchNestingLevel", "internalSelectionCache", "", "isClipboardContextMenuShown", "()Z", "setClipboardContextMenuShown", "(Z)V", "isWindowShown", "mediaInputManager", "Lkeyboard/neon/newboard/ime/media/MediaInputManager;", "getMediaInputManager", "()Lkeyboard/neon/newboard/ime/media/MediaInputManager;", "setMediaInputManager", "(Lkeyboard/neon/newboard/ime/media/MediaInputManager;)V", "pendingResponse", "Ljava/lang/Runnable;", "<set-?>", "Lkeyboard/neon/newboard/ime/popup/PopupLayerView;", "popupLayerView", "getPopupLayerView", "()Lkeyboard/neon/newboard/ime/popup/PopupLayerView;", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "getPrefs", "()Lkeyboard/neon/newboard/ime/core/Preferences;", "responseState", "Lkeyboard/neon/newboard/ime/core/FlorisBoard$ResponseState;", "serviceLifecycleDispatcher", "Landroidx/lifecycle/ServiceLifecycleDispatcher;", "subtypeManager", "Lkeyboard/neon/newboard/ime/core/SubtypeManager;", "getSubtypeManager", "()Lkeyboard/neon/newboard/ime/core/SubtypeManager;", "textInputManager", "Lkeyboard/neon/newboard/ime/text/TextInputManager;", "getTextInputManager", "()Lkeyboard/neon/newboard/ime/text/TextInputManager;", "setTextInputManager", "(Lkeyboard/neon/newboard/ime/text/TextInputManager;)V", "themeContext", "getThemeContext", "()Landroid/content/Context;", "themeManager", "Lkeyboard/neon/newboard/ime/theme/ThemeManager;", "Lkeyboard/neon/newboard/databinding/FlorisboardBinding;", "uiBinding", "getUiBinding", "()Lkeyboard/neon/newboard/databinding/FlorisboardBinding;", "uiScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "getUiScope", "()Landroidx/lifecycle/LifecycleCoroutineScope;", "addEventListener", "listener", "beginInternalBatchEdit", "", "cancelPendingResponse", "dispatchCurrentStateToInputUi", "endInternalBatchEdit", "executeSwipeAction", "swipeAction", "Lkeyboard/neon/newboard/ime/text/gestures/SwipeAction;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "initWindow", "isInternetConnected", "launchSettings", "onBindInput", "onComputeInsets", "outInsets", "Landroid/inputmethodservice/InputMethodService$Insets;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "onCreateCandidatesView", "Landroid/view/View;", "onCreateExtractTextView", "onCreateInlineSuggestionsRequest", "Landroid/view/inputmethod/InlineSuggestionsRequest;", "uiExtras", "Landroid/os/Bundle;", "onCreateInputView", "onDestroy", "onEvaluateFullscreenMode", "onFinishInput", "onFinishInputView", "finishingInput", "onInlineSuggestionsResponse", "response", "Landroid/view/inputmethod/InlineSuggestionsResponse;", "onPrimaryClipChanged", "onStartInput", "attribute", "Landroid/view/inputmethod/EditorInfo;", "restarting", "onStartInputView", "info", "onSubtypeChanged", "newSubtype", "doRefreshLayouts", "onThemeUpdated", "theme", "Lkeyboard/neon/newboard/ime/theme/Theme;", "onUnbindInput", "onUpdateExtractedText", "token", "text", "Landroid/view/inputmethod/ExtractedText;", "onUpdateExtractingViews", "ei", "onUpdateExtractingVisibility", "onUpdateSelection", "oldSelStart", "oldSelEnd", "newSelStart", "newSelEnd", "candidatesStart", "candidatesEnd", "onWindowHidden", "onWindowShown", "postPendingResponse", "removeEventListener", "setActiveInput", "type", "forceSwitchToCharacters", "shouldShowLanguageSwitch", "showBanner", "bannerLayout", "Landroid/widget/FrameLayout;", "switchToNextKeyboard", "switchToNextSubtype", "switchToPrevKeyboard", "switchToPrevSubtype", "toggleOneHandedMode", "isRight", "updateFullscreenMode", "updateOneHandedPanelVisibility", "updateSoftInputWindowLayoutParameters", "updateThemeContext", "themeId", "Companion", "EventListener", "ImeConfig", "ResponseState", "aosp_debug"})
public class FlorisBoard extends android.inputmethodservice.InputMethodService implements androidx.lifecycle.LifecycleOwner, keyboard.neon.newboard.ime.clip.FlorisClipboardManager.OnPrimaryClipChangedListener, keyboard.neon.newboard.ime.theme.ThemeManager.OnThemeUpdatedListener {
    private final androidx.lifecycle.ServiceLifecycleDispatcher serviceLifecycleDispatcher = null;
    private kotlinx.coroutines.Job devtoolsOverlaySyncJob;
    
    /**
     * The theme context for the UI. Must only be used for inflating/creating Views for the keyboard UI, else the IME
     * service class should be used directly.
     */
    private android.content.Context _themeContext;
    @org.jetbrains.annotations.NotNull()
    private final keyboard.neon.newboard.ime.keyboard.KeyboardState activeState = null;
    @org.jetbrains.annotations.Nullable()
    private keyboard.neon.newboard.databinding.FlorisboardBinding uiBinding;
    private java.lang.ref.WeakReference<android.view.ViewGroup> extractEditLayout;
    @org.jetbrains.annotations.Nullable()
    private keyboard.neon.newboard.ime.popup.PopupLayerView popupLayerView;
    private java.util.concurrent.CopyOnWriteArrayList<keyboard.neon.newboard.ime.core.FlorisBoard.EventListener> eventListeners;
    @org.jetbrains.annotations.Nullable()
    private android.view.inputmethod.InputMethodManager imeManager;
    public keyboard.neon.newboard.ime.keyboard.InputFeedbackManager inputFeedbackManager;
    @org.jetbrains.annotations.Nullable()
    private keyboard.neon.newboard.ime.clip.FlorisClipboardManager florisClipboardManager;
    private final keyboard.neon.newboard.ime.theme.ThemeManager themeManager = null;
    private int internalBatchNestingLevel = 0;
    private final java.lang.Object internalSelectionCache = null;
    public keyboard.neon.newboard.ime.core.EditorInstance activeEditorInstance;
    public keyboard.neon.newboard.ime.core.Subtype activeSubtype;
    private boolean currentThemeIsNight = false;
    private int currentThemeResId = 0;
    private boolean isWindowShown = false;
    private keyboard.neon.newboard.ime.core.FlorisBoard.ResponseState responseState = keyboard.neon.newboard.ime.core.FlorisBoard.ResponseState.RESET;
    private java.lang.Runnable pendingResponse;
    private final android.os.Handler handler = null;
    public keyboard.neon.newboard.ime.text.TextInputManager textInputManager;
    public keyboard.neon.newboard.ime.media.MediaInputManager mediaInputManager;
    public keyboard.neon.newboard.ime.clip.ClipboardInputManager clipInputManager;
    private boolean isClipboardContextMenuShown = false;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.core.FlorisBoard.Companion Companion = null;
    
    public FlorisBoard() {
        super();
    }
    
    private final androidx.lifecycle.LifecycleCoroutineScope getUiScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getThemeContext() {
        return null;
    }
    
    private final keyboard.neon.newboard.ime.core.Preferences getPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.keyboard.KeyboardState getActiveState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.databinding.FlorisboardBinding getUiBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.popup.PopupLayerView getPopupLayerView() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.inputmethod.InputMethodManager getImeManager() {
        return null;
    }
    
    public final void setImeManager(@org.jetbrains.annotations.Nullable()
    android.view.inputmethod.InputMethodManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.keyboard.InputFeedbackManager getInputFeedbackManager() {
        return null;
    }
    
    public final void setInputFeedbackManager(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.InputFeedbackManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.clip.FlorisClipboardManager getFlorisClipboardManager() {
        return null;
    }
    
    public final void setFlorisClipboardManager(@org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.clip.FlorisClipboardManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.EditorInstance getActiveEditorInstance() {
        return null;
    }
    
    public final void setActiveEditorInstance(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.EditorInstance p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.SubtypeManager getSubtypeManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.text.composing.Composer getComposer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.core.Subtype getActiveSubtype() {
        return null;
    }
    
    public final void setActiveSubtype(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.text.TextInputManager getTextInputManager() {
        return null;
    }
    
    public final void setTextInputManager(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.TextInputManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.media.MediaInputManager getMediaInputManager() {
        return null;
    }
    
    public final void setMediaInputManager(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.media.MediaInputManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.clip.ClipboardInputManager getClipInputManager() {
        return null;
    }
    
    public final void setClipInputManager(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.clip.ClipboardInputManager p0) {
    }
    
    public final boolean isClipboardContextMenuShown() {
        return false;
    }
    
    public final void setClipboardContextMenuShown(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.Lifecycle getLifecycle() {
        return null;
    }
    
    private final void updateThemeContext(@androidx.annotation.StyleRes()
    int themeId) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"InflateParams"})
    @java.lang.Override()
    public android.view.View onCreateInputView() {
        return null;
    }
    
    public final void initWindow() {
    }
    
    /**
     * Disable the default candidates view.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateCandidatesView() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"InflateParams"})
    @java.lang.Override()
    public android.view.View onCreateExtractTextView() {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public boolean onEvaluateFullscreenMode() {
        return false;
    }
    
    @java.lang.Override()
    public void updateFullscreenMode() {
    }
    
    @java.lang.Override()
    public void onUpdateExtractedText(int token, @org.jetbrains.annotations.Nullable()
    android.view.inputmethod.ExtractedText text) {
    }
    
    @java.lang.Override()
    public void onUpdateExtractingViews(@org.jetbrains.annotations.Nullable()
    android.view.inputmethod.EditorInfo ei) {
    }
    
    @java.lang.Override()
    public void onUpdateExtractingVisibility(@org.jetbrains.annotations.Nullable()
    android.view.inputmethod.EditorInfo ei) {
    }
    
    @java.lang.Override()
    public void onBindInput() {
    }
    
    @java.lang.Override()
    public void onStartInput(@org.jetbrains.annotations.Nullable()
    android.view.inputmethod.EditorInfo attribute, boolean restarting) {
    }
    
    @java.lang.Override()
    public void onStartInputView(@org.jetbrains.annotations.Nullable()
    android.view.inputmethod.EditorInfo info, boolean restarting) {
    }
    
    @java.lang.Override()
    public void onFinishInputView(boolean finishingInput) {
    }
    
    @java.lang.Override()
    public void onFinishInput() {
    }
    
    @java.lang.Override()
    public void onUnbindInput() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    @java.lang.Override()
    public android.view.inputmethod.InlineSuggestionsRequest onCreateInlineSuggestionsRequest(@org.jetbrains.annotations.NotNull()
    android.os.Bundle uiExtras) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    @java.lang.Override()
    public boolean onInlineSuggestionsResponse(@org.jetbrains.annotations.NotNull()
    android.view.inputmethod.InlineSuggestionsResponse response) {
        return false;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    private final void cancelPendingResponse() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    private final void postPendingResponse(android.view.inputmethod.InlineSuggestionsResponse response) {
    }
    
    public final void dispatchCurrentStateToInputUi() {
    }
    
    @java.lang.Override()
    public void onWindowShown() {
    }
    
    @java.lang.Override()
    public void onWindowHidden() {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    /**
     * Begins a FlorisBoard internal batch edit. This enables the application to continue sending selection updates
     * (some apps need to to this else they absolutely refuse to give visual feedback on cursor movement etc.). The
     * selection update is then caught if [internalBatchNestingLevel] is greater than 0, thus not delegating the
     * update to the editor instance. This is needed because else the UI stutters when too many updates arrive in a
     * row.
     */
    public final void beginInternalBatchEdit() {
    }
    
    /**
     * Ends an internal batch edit, if [internalBatchNestingLevel] is <= 1 and calls [onUpdateSelection] with the
     * corresponding reported selection values. This call is not caught and the editor instance and other classes are
     * able to update the UI. Resets the internal selection cache and is ready for the next batch edit.
     */
    public final void endInternalBatchEdit() {
    }
    
    @java.lang.Override()
    public void onUpdateSelection(int oldSelStart, int oldSelEnd, int newSelStart, int newSelEnd, int candidatesStart, int candidatesEnd) {
    }
    
    @java.lang.Override()
    public void onThemeUpdated(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.theme.Theme theme) {
    }
    
    @java.lang.Override()
    public void onComputeInsets(@org.jetbrains.annotations.Nullable()
    android.inputmethodservice.InputMethodService.Insets outInsets) {
    }
    
    /**
     * Updates the layout params of the window and input view.
     */
    private final void updateSoftInputWindowLayoutParameters() {
    }
    
    /**
     * Executes a given [SwipeAction]. Ignores any [SwipeAction] but the ones relevant for this
     * class.
     */
    public final void executeSwipeAction(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.gestures.SwipeAction swipeAction) {
    }
    
    /**
     * Hides the IME and launches [SetupActivity].
     */
    public final void launchSettings() {
    }
    
    /**
     * @return If the language switch should be shown.
     */
    public final boolean shouldShowLanguageSwitch() {
        return false;
    }
    
    private final void switchToPrevKeyboard() {
    }
    
    public final void switchToNextKeyboard() {
    }
    
    private final void switchToPrevSubtype() {
    }
    
    public final void switchToNextSubtype() {
    }
    
    private final void onSubtypeChanged(keyboard.neon.newboard.ime.core.Subtype newSubtype, boolean doRefreshLayouts) {
    }
    
    public final void setActiveInput(int type, boolean forceSwitchToCharacters) {
    }
    
    public final void toggleOneHandedMode(boolean isRight) {
    }
    
    public final void updateOneHandedPanelVisibility() {
    }
    
    @java.lang.Override()
    public void onPrimaryClipChanged() {
    }
    
    /**
     * Adds a given [listener] to the list which will receive FlorisBoard events.
     *
     * @param listener The listener object which receives the events.
     * @return True if the listener has been added successfully, false otherwise.
     */
    public final boolean addEventListener(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.FlorisBoard.EventListener listener) {
        return false;
    }
    
    /**
     * Removes a given [listener] from the list which will receive FlorisBoard events.
     *
     * TODO: implement this function with a proper iterator
     *
     * @param listener The same listener object which was used in [addEventListener].
     * @return True if the listener has been removed successfully, false otherwise. A false return
     * value may also indicate that the [listener] was not added previously.
     */
    public final boolean removeEventListener(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.FlorisBoard.EventListener listener) {
        return false;
    }
    
    public final boolean isInternetConnected() {
        return false;
    }
    
    public final void showBanner(@org.jetbrains.annotations.NotNull()
    android.widget.FrameLayout bannerLayout) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016\u00a8\u0006\u0018"}, d2 = {"Lkeyboard/neon/newboard/ime/core/FlorisBoard$EventListener;", "", "onApplyThemeAttributes", "", "onCreate", "onDestroy", "onFinishInputView", "finishingInput", "", "onInitializeInputUi", "uiBinding", "Lkeyboard/neon/newboard/databinding/FlorisboardBinding;", "onPrimaryClipChanged", "onStartInputView", "instance", "Lkeyboard/neon/newboard/ime/core/EditorInstance;", "restarting", "onSubtypeChanged", "newSubtype", "Lkeyboard/neon/newboard/ime/core/Subtype;", "doRefreshLayouts", "onUpdateSelection", "onWindowHidden", "onWindowShown", "aosp_debug"})
    public static abstract interface EventListener {
        
        public abstract void onCreate();
        
        public abstract void onInitializeInputUi(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.databinding.FlorisboardBinding uiBinding);
        
        public abstract void onDestroy();
        
        public abstract void onStartInputView(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.EditorInstance instance, boolean restarting);
        
        public abstract void onFinishInputView(boolean finishingInput);
        
        public abstract void onWindowShown();
        
        public abstract void onWindowHidden();
        
        public abstract void onUpdateSelection();
        
        public abstract void onApplyThemeAttributes();
        
        public abstract void onPrimaryClipChanged();
        
        public abstract void onSubtypeChanged(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.Subtype newSubtype, boolean doRefreshLayouts);
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class DefaultImpls {
            
            public static void onCreate(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.core.FlorisBoard.EventListener $this) {
            }
            
            public static void onInitializeInputUi(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.core.FlorisBoard.EventListener $this, @org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.databinding.FlorisboardBinding uiBinding) {
            }
            
            public static void onDestroy(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.core.FlorisBoard.EventListener $this) {
            }
            
            public static void onStartInputView(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.core.FlorisBoard.EventListener $this, @org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.core.EditorInstance instance, boolean restarting) {
            }
            
            public static void onFinishInputView(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.core.FlorisBoard.EventListener $this, boolean finishingInput) {
            }
            
            public static void onWindowShown(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.core.FlorisBoard.EventListener $this) {
            }
            
            public static void onWindowHidden(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.core.FlorisBoard.EventListener $this) {
            }
            
            public static void onUpdateSelection(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.core.FlorisBoard.EventListener $this) {
            }
            
            public static void onApplyThemeAttributes(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.core.FlorisBoard.EventListener $this) {
            }
            
            public static void onPrimaryClipChanged(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.core.FlorisBoard.EventListener $this) {
            }
            
            public static void onSubtypeChanged(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.core.FlorisBoard.EventListener $this, @org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.core.Subtype newSubtype, boolean doRefreshLayouts) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lkeyboard/neon/newboard/ime/core/FlorisBoard$ResponseState;", "", "(Ljava/lang/String;I)V", "RESET", "RECEIVE_RESPONSE", "START_INPUT", "aosp_debug"})
    static enum ResponseState {
        /*public static final*/ RESET /* = new RESET() */,
        /*public static final*/ RECEIVE_RESPONSE /* = new RECEIVE_RESPONSE() */,
        /*public static final*/ START_INPUT /* = new START_INPUT() */;
        
        ResponseState() {
        }
    }
    
    /**
     * Data class which holds the base information for this IME. Matches the structure of
     * ime/config.json so it can be parsed. Used by [SubtypeManager] and by the prefs.
     * NOTE: this class and its corresponding json file is subject to change in future versions.
     * @property packageName The package name of this IME.
     * @property currencySets The predefined currency sets for this IME, available for selection
     * in the Settings UI.
     * @property defaultSubtypes A list of predefined default subtypes. This subtypes are used to
     * define which locales are supported and which layout is preferred for that locale.
     * @property currencySetNames Helper list for Settings Subtype Spinner elements.
     * @property currencySetLabels Helper list for Settings Subtype Spinner elements.
     * @property defaultSubtypesLanguageCodes Helper list for Settings Subtype Spinner elements.
     * @property defaultSubtypesLanguageNames Helper list for Settings Subtype Spinner elements.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002KLB[\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fB=\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u00a2\u0006\u0002\u0010\u0010J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u00c6\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u00c6\u0003JC\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u00c6\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010B\u001a\u00020\u0003H\u00d6\u0001J\t\u0010C\u001a\u00020\u0005H\u00d6\u0001J!\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u00002\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u00c7\u0001R(\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00128\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u001aR*\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR*\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b(\u0010\u0014\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u0014\u001a\u0004\b,\u0010\u001aR\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u0014\u001a\u0004\b.\u0010\u001aR*\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b0\u0010\u0014\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR*\u00103\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b4\u0010\u0014\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001cR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u0014\u001a\u0004\b8\u00109\u00a8\u0006M"}, d2 = {"Lkeyboard/neon/newboard/ime/core/FlorisBoard$ImeConfig;", "", "seen1", "", "packageName", "", "composers", "", "Lkeyboard/neon/newboard/ime/text/composing/Composer;", "currencySets", "Lkeyboard/neon/newboard/ime/text/key/CurrencySet;", "defaultSubtypes", "Lkeyboard/neon/newboard/ime/core/DefaultSubtype;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "composerFromName", "", "getComposerFromName$annotations", "()V", "getComposerFromName", "()Ljava/util/Map;", "composerLabels", "getComposerLabels$annotations", "getComposerLabels", "()Ljava/util/List;", "setComposerLabels", "(Ljava/util/List;)V", "composerNames", "getComposerNames$annotations", "getComposerNames", "setComposerNames", "getComposers$annotations", "getComposers", "currencySetLabels", "getCurrencySetLabels$annotations", "getCurrencySetLabels", "setCurrencySetLabels", "currencySetNames", "getCurrencySetNames$annotations", "getCurrencySetNames", "setCurrencySetNames", "getCurrencySets$annotations", "getCurrencySets", "getDefaultSubtypes$annotations", "getDefaultSubtypes", "defaultSubtypesLanguageCodes", "getDefaultSubtypesLanguageCodes$annotations", "getDefaultSubtypesLanguageCodes", "setDefaultSubtypesLanguageCodes", "defaultSubtypesLanguageNames", "getDefaultSubtypesLanguageNames$annotations", "getDefaultSubtypesLanguageNames", "setDefaultSubtypesLanguageNames", "getPackageName$annotations", "getPackageName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "aosp_debug"})
    @kotlinx.serialization.Serializable()
    public static final class ImeConfig {
        
        /**
         * Data class which holds the base information for this IME. Matches the structure of
         * ime/config.json so it can be parsed. Used by [SubtypeManager] and by the prefs.
         * NOTE: this class and its corresponding json file is subject to change in future versions.
         * @property packageName The package name of this IME.
         * @property currencySets The predefined currency sets for this IME, available for selection
         * in the Settings UI.
         * @property defaultSubtypes A list of predefined default subtypes. This subtypes are used to
         * define which locales are supported and which layout is preferred for that locale.
         * @property currencySetNames Helper list for Settings Subtype Spinner elements.
         * @property currencySetLabels Helper list for Settings Subtype Spinner elements.
         * @property defaultSubtypesLanguageCodes Helper list for Settings Subtype Spinner elements.
         * @property defaultSubtypesLanguageNames Helper list for Settings Subtype Spinner elements.
         */
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.core.FlorisBoard.ImeConfig.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String packageName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<keyboard.neon.newboard.ime.text.composing.Composer> composers = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<keyboard.neon.newboard.ime.text.key.CurrencySet> currencySets = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<keyboard.neon.newboard.ime.core.DefaultSubtype> defaultSubtypes = null;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<java.lang.String> currencySetNames;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<java.lang.String> currencySetLabels;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<java.lang.String> composerNames;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<java.lang.String> composerLabels;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<java.lang.String, keyboard.neon.newboard.ime.text.composing.Composer> composerFromName = null;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<java.lang.String> defaultSubtypesLanguageCodes;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<java.lang.String> defaultSubtypesLanguageNames;
        
        /**
         * Data class which holds the base information for this IME. Matches the structure of
         * ime/config.json so it can be parsed. Used by [SubtypeManager] and by the prefs.
         * NOTE: this class and its corresponding json file is subject to change in future versions.
         * @property packageName The package name of this IME.
         * @property currencySets The predefined currency sets for this IME, available for selection
         * in the Settings UI.
         * @property defaultSubtypes A list of predefined default subtypes. This subtypes are used to
         * define which locales are supported and which layout is preferred for that locale.
         * @property currencySetNames Helper list for Settings Subtype Spinner elements.
         * @property currencySetLabels Helper list for Settings Subtype Spinner elements.
         * @property defaultSubtypesLanguageCodes Helper list for Settings Subtype Spinner elements.
         * @property defaultSubtypesLanguageNames Helper list for Settings Subtype Spinner elements.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.core.FlorisBoard.ImeConfig copy(@org.jetbrains.annotations.NotNull()
        java.lang.String packageName, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends keyboard.neon.newboard.ime.text.composing.Composer> composers, @org.jetbrains.annotations.NotNull()
        java.util.List<keyboard.neon.newboard.ime.text.key.CurrencySet> currencySets, @org.jetbrains.annotations.NotNull()
        java.util.List<keyboard.neon.newboard.ime.core.DefaultSubtype> defaultSubtypes) {
            return null;
        }
        
        /**
         * Data class which holds the base information for this IME. Matches the structure of
         * ime/config.json so it can be parsed. Used by [SubtypeManager] and by the prefs.
         * NOTE: this class and its corresponding json file is subject to change in future versions.
         * @property packageName The package name of this IME.
         * @property currencySets The predefined currency sets for this IME, available for selection
         * in the Settings UI.
         * @property defaultSubtypes A list of predefined default subtypes. This subtypes are used to
         * define which locales are supported and which layout is preferred for that locale.
         * @property currencySetNames Helper list for Settings Subtype Spinner elements.
         * @property currencySetLabels Helper list for Settings Subtype Spinner elements.
         * @property defaultSubtypesLanguageCodes Helper list for Settings Subtype Spinner elements.
         * @property defaultSubtypesLanguageNames Helper list for Settings Subtype Spinner elements.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Data class which holds the base information for this IME. Matches the structure of
         * ime/config.json so it can be parsed. Used by [SubtypeManager] and by the prefs.
         * NOTE: this class and its corresponding json file is subject to change in future versions.
         * @property packageName The package name of this IME.
         * @property currencySets The predefined currency sets for this IME, available for selection
         * in the Settings UI.
         * @property defaultSubtypes A list of predefined default subtypes. This subtypes are used to
         * define which locales are supported and which layout is preferred for that locale.
         * @property currencySetNames Helper list for Settings Subtype Spinner elements.
         * @property currencySetLabels Helper list for Settings Subtype Spinner elements.
         * @property defaultSubtypesLanguageCodes Helper list for Settings Subtype Spinner elements.
         * @property defaultSubtypesLanguageNames Helper list for Settings Subtype Spinner elements.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Data class which holds the base information for this IME. Matches the structure of
         * ime/config.json so it can be parsed. Used by [SubtypeManager] and by the prefs.
         * NOTE: this class and its corresponding json file is subject to change in future versions.
         * @property packageName The package name of this IME.
         * @property currencySets The predefined currency sets for this IME, available for selection
         * in the Settings UI.
         * @property defaultSubtypes A list of predefined default subtypes. This subtypes are used to
         * define which locales are supported and which layout is preferred for that locale.
         * @property currencySetNames Helper list for Settings Subtype Spinner elements.
         * @property currencySetLabels Helper list for Settings Subtype Spinner elements.
         * @property defaultSubtypesLanguageCodes Helper list for Settings Subtype Spinner elements.
         * @property defaultSubtypesLanguageNames Helper list for Settings Subtype Spinner elements.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        /**
         * Data class which holds the base information for this IME. Matches the structure of
         * ime/config.json so it can be parsed. Used by [SubtypeManager] and by the prefs.
         * NOTE: this class and its corresponding json file is subject to change in future versions.
         * @property packageName The package name of this IME.
         * @property currencySets The predefined currency sets for this IME, available for selection
         * in the Settings UI.
         * @property defaultSubtypes A list of predefined default subtypes. This subtypes are used to
         * define which locales are supported and which layout is preferred for that locale.
         * @property currencySetNames Helper list for Settings Subtype Spinner elements.
         * @property currencySetLabels Helper list for Settings Subtype Spinner elements.
         * @property defaultSubtypesLanguageCodes Helper list for Settings Subtype Spinner elements.
         * @property defaultSubtypesLanguageNames Helper list for Settings Subtype Spinner elements.
         */
        @kotlin.jvm.JvmStatic()
        public static final void write$Self(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.core.FlorisBoard.ImeConfig self, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public ImeConfig(@org.jetbrains.annotations.NotNull()
        java.lang.String packageName, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends keyboard.neon.newboard.ime.text.composing.Composer> composers, @org.jetbrains.annotations.NotNull()
        java.util.List<keyboard.neon.newboard.ime.text.key.CurrencySet> currencySets, @org.jetbrains.annotations.NotNull()
        java.util.List<keyboard.neon.newboard.ime.core.DefaultSubtype> defaultSubtypes) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPackageName() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "package")
        @java.lang.Deprecated()
        public static void getPackageName$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<keyboard.neon.newboard.ime.text.composing.Composer> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<keyboard.neon.newboard.ime.text.composing.Composer> getComposers() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "composers")
        @java.lang.Deprecated()
        public static void getComposers$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<keyboard.neon.newboard.ime.text.key.CurrencySet> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<keyboard.neon.newboard.ime.text.key.CurrencySet> getCurrencySets() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "currencySets")
        @java.lang.Deprecated()
        public static void getCurrencySets$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<keyboard.neon.newboard.ime.core.DefaultSubtype> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<keyboard.neon.newboard.ime.core.DefaultSubtype> getDefaultSubtypes() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "defaultSubtypes")
        @java.lang.Deprecated()
        public static void getDefaultSubtypes$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getCurrencySetNames() {
            return null;
        }
        
        @kotlinx.serialization.Transient()
        @java.lang.Deprecated()
        public static void getCurrencySetNames$annotations() {
        }
        
        public final void setCurrencySetNames(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getCurrencySetLabels() {
            return null;
        }
        
        @kotlinx.serialization.Transient()
        @java.lang.Deprecated()
        public static void getCurrencySetLabels$annotations() {
        }
        
        public final void setCurrencySetLabels(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getComposerNames() {
            return null;
        }
        
        @kotlinx.serialization.Transient()
        @java.lang.Deprecated()
        public static void getComposerNames$annotations() {
        }
        
        public final void setComposerNames(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getComposerLabels() {
            return null;
        }
        
        @kotlinx.serialization.Transient()
        @java.lang.Deprecated()
        public static void getComposerLabels$annotations() {
        }
        
        public final void setComposerLabels(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, keyboard.neon.newboard.ime.text.composing.Composer> getComposerFromName() {
            return null;
        }
        
        @kotlinx.serialization.Transient()
        @java.lang.Deprecated()
        public static void getComposerFromName$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getDefaultSubtypesLanguageCodes() {
            return null;
        }
        
        @kotlinx.serialization.Transient()
        @java.lang.Deprecated()
        public static void getDefaultSubtypesLanguageCodes$annotations() {
        }
        
        public final void setDefaultSubtypesLanguageCodes(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getDefaultSubtypesLanguageNames() {
            return null;
        }
        
        @kotlinx.serialization.Transient()
        @java.lang.Deprecated()
        public static void getDefaultSubtypesLanguageNames$annotations() {
        }
        
        public final void setDefaultSubtypesLanguageNames(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> p0) {
        }
        
        /**
         * Data class which holds the base information for this IME. Matches the structure of
         * ime/config.json so it can be parsed. Used by [SubtypeManager] and by the prefs.
         * NOTE: this class and its corresponding json file is subject to change in future versions.
         * @property packageName The package name of this IME.
         * @property currencySets The predefined currency sets for this IME, available for selection
         * in the Settings UI.
         * @property defaultSubtypes A list of predefined default subtypes. This subtypes are used to
         * define which locales are supported and which layout is preferred for that locale.
         * @property currencySetNames Helper list for Settings Subtype Spinner elements.
         * @property currencySetLabels Helper list for Settings Subtype Spinner elements.
         * @property defaultSubtypesLanguageCodes Helper list for Settings Subtype Spinner elements.
         * @property defaultSubtypesLanguageNames Helper list for Settings Subtype Spinner elements.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lkeyboard/neon/newboard/ime/core/FlorisBoard$ImeConfig$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkeyboard/neon/newboard/ime/core/FlorisBoard$ImeConfig;", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            /**
             * Data class which holds the base information for this IME. Matches the structure of
             * ime/config.json so it can be parsed. Used by [SubtypeManager] and by the prefs.
             * NOTE: this class and its corresponding json file is subject to change in future versions.
             * @property packageName The package name of this IME.
             * @property currencySets The predefined currency sets for this IME, available for selection
             * in the Settings UI.
             * @property defaultSubtypes A list of predefined default subtypes. This subtypes are used to
             * define which locales are supported and which layout is preferred for that locale.
             * @property currencySetNames Helper list for Settings Subtype Spinner elements.
             * @property currencySetLabels Helper list for Settings Subtype Spinner elements.
             * @property defaultSubtypesLanguageCodes Helper list for Settings Subtype Spinner elements.
             * @property defaultSubtypesLanguageNames Helper list for Settings Subtype Spinner elements.
             */
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.serialization.KSerializer<keyboard.neon.newboard.ime.core.FlorisBoard.ImeConfig> serializer() {
                return null;
            }
        }
        
        /**
         * Data class which holds the base information for this IME. Matches the structure of
         * ime/config.json so it can be parsed. Used by [SubtypeManager] and by the prefs.
         * NOTE: this class and its corresponding json file is subject to change in future versions.
         * @property packageName The package name of this IME.
         * @property currencySets The predefined currency sets for this IME, available for selection
         * in the Settings UI.
         * @property defaultSubtypes A list of predefined default subtypes. This subtypes are used to
         * define which locales are supported and which layout is preferred for that locale.
         * @property currencySetNames Helper list for Settings Subtype Spinner elements.
         * @property currencySetLabels Helper list for Settings Subtype Spinner elements.
         * @property defaultSubtypesLanguageCodes Helper list for Settings Subtype Spinner elements.
         * @property defaultSubtypesLanguageNames Helper list for Settings Subtype Spinner elements.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"keyboard/neon/newboard/ime/core/FlorisBoard.ImeConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lkeyboard/neon/newboard/ime/core/FlorisBoard$ImeConfig;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "aosp_debug"})
        @java.lang.Deprecated()
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<keyboard.neon.newboard.ime.core.FlorisBoard.ImeConfig> {
            
            /**
             * Data class which holds the base information for this IME. Matches the structure of
             * ime/config.json so it can be parsed. Used by [SubtypeManager] and by the prefs.
             * NOTE: this class and its corresponding json file is subject to change in future versions.
             * @property packageName The package name of this IME.
             * @property currencySets The predefined currency sets for this IME, available for selection
             * in the Settings UI.
             * @property defaultSubtypes A list of predefined default subtypes. This subtypes are used to
             * define which locales are supported and which layout is preferred for that locale.
             * @property currencySetNames Helper list for Settings Subtype Spinner elements.
             * @property currencySetLabels Helper list for Settings Subtype Spinner elements.
             * @property defaultSubtypesLanguageCodes Helper list for Settings Subtype Spinner elements.
             * @property defaultSubtypesLanguageNames Helper list for Settings Subtype Spinner elements.
             */
            @org.jetbrains.annotations.NotNull()
            public static final keyboard.neon.newboard.ime.core.FlorisBoard.ImeConfig.$serializer INSTANCE = null;
            
            private $serializer() {
                super();
            }
            
            /**
             * Data class which holds the base information for this IME. Matches the structure of
             * ime/config.json so it can be parsed. Used by [SubtypeManager] and by the prefs.
             * NOTE: this class and its corresponding json file is subject to change in future versions.
             * @property packageName The package name of this IME.
             * @property currencySets The predefined currency sets for this IME, available for selection
             * in the Settings UI.
             * @property defaultSubtypes A list of predefined default subtypes. This subtypes are used to
             * define which locales are supported and which layout is preferred for that locale.
             * @property currencySetNames Helper list for Settings Subtype Spinner elements.
             * @property currencySetLabels Helper list for Settings Subtype Spinner elements.
             * @property defaultSubtypesLanguageCodes Helper list for Settings Subtype Spinner elements.
             * @property defaultSubtypesLanguageNames Helper list for Settings Subtype Spinner elements.
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public kotlinx.serialization.KSerializer<?>[] childSerializers() {
                return null;
            }
            
            /**
             * Data class which holds the base information for this IME. Matches the structure of
             * ime/config.json so it can be parsed. Used by [SubtypeManager] and by the prefs.
             * NOTE: this class and its corresponding json file is subject to change in future versions.
             * @property packageName The package name of this IME.
             * @property currencySets The predefined currency sets for this IME, available for selection
             * in the Settings UI.
             * @property defaultSubtypes A list of predefined default subtypes. This subtypes are used to
             * define which locales are supported and which layout is preferred for that locale.
             * @property currencySetNames Helper list for Settings Subtype Spinner elements.
             * @property currencySetLabels Helper list for Settings Subtype Spinner elements.
             * @property defaultSubtypesLanguageCodes Helper list for Settings Subtype Spinner elements.
             * @property defaultSubtypesLanguageNames Helper list for Settings Subtype Spinner elements.
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public keyboard.neon.newboard.ime.core.FlorisBoard.ImeConfig deserialize(@org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.Decoder decoder) {
                return null;
            }
            
            /**
             * Data class which holds the base information for this IME. Matches the structure of
             * ime/config.json so it can be parsed. Used by [SubtypeManager] and by the prefs.
             * NOTE: this class and its corresponding json file is subject to change in future versions.
             * @property packageName The package name of this IME.
             * @property currencySets The predefined currency sets for this IME, available for selection
             * in the Settings UI.
             * @property defaultSubtypes A list of predefined default subtypes. This subtypes are used to
             * define which locales are supported and which layout is preferred for that locale.
             * @property currencySetNames Helper list for Settings Subtype Spinner elements.
             * @property currencySetLabels Helper list for Settings Subtype Spinner elements.
             * @property defaultSubtypesLanguageCodes Helper list for Settings Subtype Spinner elements.
             * @property defaultSubtypesLanguageNames Helper list for Settings Subtype Spinner elements.
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return null;
            }
            
            /**
             * Data class which holds the base information for this IME. Matches the structure of
             * ime/config.json so it can be parsed. Used by [SubtypeManager] and by the prefs.
             * NOTE: this class and its corresponding json file is subject to change in future versions.
             * @property packageName The package name of this IME.
             * @property currencySets The predefined currency sets for this IME, available for selection
             * in the Settings UI.
             * @property defaultSubtypes A list of predefined default subtypes. This subtypes are used to
             * define which locales are supported and which layout is preferred for that locale.
             * @property currencySetNames Helper list for Settings Subtype Spinner elements.
             * @property currencySetLabels Helper list for Settings Subtype Spinner elements.
             * @property defaultSubtypesLanguageCodes Helper list for Settings Subtype Spinner elements.
             * @property defaultSubtypesLanguageNames Helper list for Settings Subtype Spinner elements.
             */
            @java.lang.Override()
            public void serialize(@org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.core.FlorisBoard.ImeConfig value) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u0004\u0018\u00010\b\u00a8\u0006\n"}, d2 = {"Lkeyboard/neon/newboard/ime/core/FlorisBoard$Companion;", "", "()V", "getDayNightBaseThemeId", "", "isNightTheme", "", "getInstance", "Lkeyboard/neon/newboard/ime/core/FlorisBoard;", "getInstanceOrNull", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Synchronized()
        public final synchronized keyboard.neon.newboard.ime.core.FlorisBoard getInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.Synchronized()
        public final synchronized keyboard.neon.newboard.ime.core.FlorisBoard getInstanceOrNull() {
            return null;
        }
        
        public final int getDayNightBaseThemeId(boolean isNightTheme) {
            return 0;
        }
    }
}