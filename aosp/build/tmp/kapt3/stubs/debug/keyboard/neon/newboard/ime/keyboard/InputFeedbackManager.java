package keyboard.neon.newboard.ime.keyboard;

import java.lang.System;

/**
 * Input feedback manager responsible to process and perform audio and haptic
 * feedback for user interactions based on the system and floris preferences.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/InputFeedbackManager;", "", "ims", "Landroid/inputmethodservice/InputMethodService;", "(Landroid/inputmethodservice/InputMethodService;)V", "audioManager", "Landroid/media/AudioManager;", "contentResolver", "Landroid/content/ContentResolver;", "kotlin.jvm.PlatformType", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "getPrefs", "()Lkeyboard/neon/newboard/ime/core/Preferences;", "vibrator", "Landroid/os/Vibrator;", "gestureMovingSwipe", "", "data", "Lkeyboard/neon/newboard/ime/keyboard/KeyData;", "gestureSwipe", "keyLongPress", "keyPress", "keyRepeatedAction", "performAudioFeedback", "factor", "", "performHapticFeedback", "systemPref", "", "id", "", "Companion", "aosp_debug"})
public final class InputFeedbackManager {
    private final android.inputmethodservice.InputMethodService ims = null;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.keyboard.InputFeedbackManager.Companion Companion = null;
    private final android.media.AudioManager audioManager = null;
    private final android.os.Vibrator vibrator = null;
    private final android.content.ContentResolver contentResolver = null;
    
    private InputFeedbackManager(android.inputmethodservice.InputMethodService ims) {
        super();
    }
    
    private final keyboard.neon.newboard.ime.core.Preferences getPrefs() {
        return null;
    }
    
    public final void keyPress(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data) {
    }
    
    public final void keyLongPress(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data) {
    }
    
    public final void keyRepeatedAction(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data) {
    }
    
    public final void gestureSwipe(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data) {
    }
    
    public final void gestureMovingSwipe(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.KeyData data) {
    }
    
    private final boolean systemPref(java.lang.String id) {
        return false;
    }
    
    private final void performAudioFeedback(keyboard.neon.newboard.ime.keyboard.KeyData data, double factor) {
    }
    
    private final void performHapticFeedback(keyboard.neon.newboard.ime.keyboard.KeyData data, double factor) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/InputFeedbackManager$Companion;", "", "()V", "new", "Lkeyboard/neon/newboard/ime/keyboard/InputFeedbackManager;", "ims", "Landroid/inputmethodservice/InputMethodService;", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}