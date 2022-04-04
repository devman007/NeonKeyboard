package keyboard.neon.newboard.ime.text.gestures;

import java.lang.System;

/**
 * Inherit this to be able to handle gesture typing. Takes in raw pointer data, and
 * spits out what it thinks the gesture is.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u001e\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u0014\u001a\u00020\u0015H&J4\u0010\u0016\u001a\u00020\u00032\"\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u0018j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b`\u00192\u0006\u0010\u0014\u001a\u00020\u0015H&\u00a8\u0006\u001a"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingClassifier;", "", "addGesturePoint", "", "position", "Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Detector$Position;", "clear", "getSuggestions", "", "", "maxSuggestionCount", "", "gestureCompleted", "", "initGestureFromPointerData", "pointerData", "Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Detector$PointerData;", "setLayout", "keyViews", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKey;", "subtype", "Lkeyboard/neon/newboard/ime/core/Subtype;", "setWordData", "words", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "aosp_debug"})
public abstract interface GlideTypingClassifier {
    
    /**
     * Called to notify gesture classifier that it can add a new point to the gesture.
     * @param position The position to add
     */
    public abstract void addGesturePoint(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.Position position);
    
    /**
     * Change the layout of the gesture classifier.
     */
    public abstract void setLayout(@org.jetbrains.annotations.NotNull()
    java.util.List<keyboard.neon.newboard.ime.text.keyboard.TextKey> keyViews, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype subtype);
    
    /**
     * Change the word data of the gesture classifier.
     */
    public abstract void setWordData(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Integer> words, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype subtype);
    
    /**
     * Process a completed gesture and find its location.
     */
    public abstract void initGestureFromPointerData(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.PointerData pointerData);
    
    /**
     * Generate suggestions to show to the user.
     *
     * @param maxSuggestionCount The maximum number of suggestions that are accepted.
     * @param gestureCompleted Whether the gesture is finished. (e.g to use a different algorithm for in progress words)
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getSuggestions(int maxSuggestionCount, boolean gestureCompleted);
    
    public abstract void clear();
}