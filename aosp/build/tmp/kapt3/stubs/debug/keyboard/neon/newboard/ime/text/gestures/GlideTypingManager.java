package keyboard.neon.newboard.ime.text.gestures;

import java.lang.System;

/**
 * Handles the [GlideTypingClassifier]. Basically responsible for linking [GlideTypingGesture.Detector]
 * with [GlideTypingClassifier].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"J,\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00150(H\u0002R\u0012\u0010\u0004\u001a\u00020\u0005X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingManager;", "Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Listener;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "glideTypingClassifier", "Lkeyboard/neon/newboard/ime/text/gestures/StatisticalGlideTypingClassifier;", "lastTime", "", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "getPrefs", "()Lkeyboard/neon/newboard/ime/core/Preferences;", "wordDataCache", "Ljava/util/HashMap;", "", "", "onGlideAddPoint", "", "point", "Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Detector$Position;", "onGlideCancelled", "onGlideComplete", "data", "Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Detector$PointerData;", "setLayout", "keys", "", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKey;", "setWordData", "subtype", "Lkeyboard/neon/newboard/ime/core/Subtype;", "updateSuggestionsAsync", "maxSuggestionsToShow", "commit", "", "callback", "Lkotlin/Function1;", "Companion", "aosp_debug"})
public final class GlideTypingManager implements keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Listener, kotlinx.coroutines.CoroutineScope {
    private keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier glideTypingClassifier;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.text.gestures.GlideTypingManager.Companion Companion = null;
    private static final int MAX_SUGGESTION_COUNT = 8;
    private static keyboard.neon.newboard.ime.text.gestures.GlideTypingManager glideTypingManager;
    private long lastTime;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> wordDataCache = null;
    
    public GlideTypingManager() {
        super();
    }
    
    private final keyboard.neon.newboard.ime.core.Preferences getPrefs() {
        return null;
    }
    
    @java.lang.Override()
    public void onGlideComplete(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.PointerData data) {
    }
    
    @java.lang.Override()
    public void onGlideCancelled() {
    }
    
    @java.lang.Override()
    public void onGlideAddPoint(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.Position point) {
    }
    
    /**
     * Change the layout of the internal gesture classifier
     */
    public final void setLayout(@org.jetbrains.annotations.NotNull()
    java.util.List<keyboard.neon.newboard.ime.text.keyboard.TextKey> keys) {
    }
    
    /**
     * Set the word data for the internal gesture classifier
     */
    public final void setWordData(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype subtype) {
    }
    
    /**
     * Asks gesture classifier for suggestions and then passes that on to the smartbar.
     * Also commits the most confident suggestion if [commit] is set. All happens on an async executor.
     * NB: only fetches [MAX_SUGGESTION_COUNT] suggestions.
     *
     * @param callback Called when this function completes. Takes a boolean, which indicates if suggestions
     * were successfully set.
     */
    private final void updateSuggestionsAsync(int maxSuggestionsToShow, boolean commit, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingManager$Companion;", "", "()V", "MAX_SUGGESTION_COUNT", "", "glideTypingManager", "Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingManager;", "getInstance", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.GlideTypingManager getInstance() {
            return null;
        }
    }
}