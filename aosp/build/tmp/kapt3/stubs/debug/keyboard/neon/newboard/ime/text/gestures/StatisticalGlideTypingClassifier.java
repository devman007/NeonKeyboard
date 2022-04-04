package keyboard.neon.newboard.ime.text.gestures;

import java.lang.System;

/**
 * Classifies gestures by comparing them with an "ideal gesture".
 *
 * Check out Étienne Desticourt's excellent write up at https://github.com/AnySoftKeyboard/AnySoftKeyboard/pull/1870
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 =2\u00020\u0001:\u0003=>?B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J \u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0006\u0010(\u001a\u00020%H\u0002J\u0018\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0002J\u0018\u0010,\u001a\u00020%2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0002J\b\u0010-\u001a\u00020!H\u0016J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0018H\u0016J\u0010\u00101\u001a\u00020!2\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020!2\u0006\u00105\u001a\u00020\u0018H\u0002J\u001e\u00106\u001a\u00020!2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u00108\u001a\u00020\u0004H\u0016J4\u00109\u001a\u00020!2\"\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060:j\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0006`;2\u0006\u00108\u001a\u00020\u0004H\u0016J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010/\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R,\u0010\u000f\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/StatisticalGlideTypingClassifier;", "Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingClassifier;", "()V", "currentSubtype", "Lkeyboard/neon/newboard/ime/core/Subtype;", "distanceThresholdSquared", "", "gesture", "Lkeyboard/neon/newboard/ime/text/gestures/StatisticalGlideTypingClassifier$Gesture;", "keys", "Ljava/util/ArrayList;", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKey;", "keysByCharacter", "Landroid/util/SparseArray;", "layoutSubtype", "lruSuggestionCache", "Landroidx/collection/LruCache;", "Lkotlin/Pair;", "", "", "pruner", "Lkeyboard/neon/newboard/ime/text/gestures/StatisticalGlideTypingClassifier$Pruner;", "prunerCache", "ready", "", "getReady", "()Z", "wordDataSubtype", "wordFrequencies", "", "words", "", "addGesturePoint", "", "position", "Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Detector$Position;", "calcGaussianProbability", "", "value", "mean", "standardDeviation", "calcLocationDistance", "gesture1", "gesture2", "calcShapeDistance", "clear", "getSuggestions", "maxSuggestionCount", "gestureCompleted", "initGestureFromPointerData", "pointerData", "Lkeyboard/neon/newboard/ime/text/gestures/GlideTypingGesture$Detector$PointerData;", "initializePruner", "invalidateCache", "setLayout", "keyViews", "subtype", "setWordData", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "unCachedGetSuggestions", "Companion", "Gesture", "Pruner", "aosp_debug"})
public final class StatisticalGlideTypingClassifier implements keyboard.neon.newboard.ime.text.gestures.GlideTypingClassifier {
    private final keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Gesture gesture = null;
    private android.util.SparseArray<keyboard.neon.newboard.ime.text.keyboard.TextKey> keysByCharacter;
    private java.util.Set<java.lang.String> words;
    private java.util.Map<java.lang.String, java.lang.Integer> wordFrequencies;
    private java.util.ArrayList<keyboard.neon.newboard.ime.text.keyboard.TextKey> keys;
    private keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Pruner pruner;
    private keyboard.neon.newboard.ime.core.Subtype wordDataSubtype;
    private keyboard.neon.newboard.ime.core.Subtype layoutSubtype;
    private keyboard.neon.newboard.ime.core.Subtype currentSubtype;
    
    /**
     * The minimum distance between points to be added to a gesture.
     */
    private int distanceThresholdSquared = 0;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Companion Companion = null;
    
    /**
     * Describes the allowed length variance in a gesture. If a gesture is too long or too short, it is immediately
     * discarded to save cycles.
     */
    private static final double PRUNING_LENGTH_THRESHOLD = 8.42;
    
    /**
     * describes the number of points to sample a gesture at, i.e the resolution.
     */
    private static final int SAMPLING_POINTS = 200;
    
    /**
     * Standard deviation of the distribution of distances between the shapes of two gestures
     * representing the same word. It's expressed for normalized gestures and is therefore
     * independent of the keyboard or key size.
     */
    private static final float SHAPE_STD = 22.08F;
    
    /**
     * Standard deviation of the distribution of distances between the locations of two gestures
     * representing the same word. It's expressed as a factor of key radius as it's applied to
     * un-normalized gestures and is therefore dependent on the size of the keys/keyboard.
     */
    private static final float LOCATION_STD = 0.5109F;
    
    /**
     * This is a very small cache that caches suggestions, so that they aren't recalculated e.g when releasing
     * a pointer when the suggestions were already calculated. Avoids a lot of micro pauses.
     */
    private static final int SUGGESTION_CACHE_SIZE = 5;
    
    /**
     * For multiple subtypes, the pruner is cached.
     */
    private static final int PRUNER_CACHE_SIZE = 5;
    private final androidx.collection.LruCache<keyboard.neon.newboard.ime.core.Subtype, keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Pruner> prunerCache = null;
    private final androidx.collection.LruCache<kotlin.Pair<keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Gesture, java.lang.Integer>, java.util.List<java.lang.String>> lruSuggestionCache = null;
    
    public StatisticalGlideTypingClassifier() {
        super();
    }
    
    public final boolean getReady() {
        return false;
    }
    
    @java.lang.Override()
    public void addGesturePoint(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.Position position) {
    }
    
    @java.lang.Override()
    public void setLayout(@org.jetbrains.annotations.NotNull()
    java.util.List<keyboard.neon.newboard.ime.text.keyboard.TextKey> keyViews, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype subtype) {
    }
    
    @java.lang.Override()
    public void setWordData(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Integer> words, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.core.Subtype subtype) {
    }
    
    /**
     * Exists because Pruner requires both word data and layout are initialized,
     * however we don't know what order they're initialized in.
     */
    private final void initializePruner(boolean invalidateCache) {
    }
    
    @java.lang.Override()
    public void initGestureFromPointerData(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.gestures.GlideTypingGesture.Detector.PointerData pointerData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getSuggestions(int maxSuggestionCount, boolean gestureCompleted) {
        return null;
    }
    
    private final java.util.List<java.lang.String> unCachedGetSuggestions(int maxSuggestionCount) {
        return null;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    private final float calcLocationDistance(keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Gesture gesture1, keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Gesture gesture2) {
        return 0.0F;
    }
    
    private final float calcGaussianProbability(float value, float mean, float standardDeviation) {
        return 0.0F;
    }
    
    private final float calcShapeDistance(keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Gesture gesture1, keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Gesture gesture2) {
        return 0.0F;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0019\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bJ>\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0019\u001a\u00020\u00172\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001dR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\u0010\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00140\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/StatisticalGlideTypingClassifier$Pruner;", "", "lengthThreshold", "", "words", "", "", "keysByCharacter", "Landroid/util/SparseArray;", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKey;", "(DLjava/util/Set;Landroid/util/SparseArray;)V", "cachedIdealLength", "Ljava/util/concurrent/ConcurrentHashMap;", "", "getCachedIdealLength", "()Ljava/util/concurrent/ConcurrentHashMap;", "wordTree", "Ljava/util/HashMap;", "Lkotlin/Pair;", "", "Ljava/util/ArrayList;", "word", "idealGesture", "Lkeyboard/neon/newboard/ime/text/gestures/StatisticalGlideTypingClassifier$Gesture;", "pruneByExtremities", "userGesture", "keys", "", "pruneByLength", "", "Companion", "aosp_debug"})
    public static final class Pruner {
        
        /**
         * The length difference between a user gesture and a word gesture above which a word will
         * be pruned.
         */
        private final double lengthThreshold = 0.0;
        
        /**
         * A tree that provides fast access to words based on their first and last letter.
         */
        private final java.util.HashMap<kotlin.Pair<java.lang.Integer, java.lang.Integer>, java.util.ArrayList<java.lang.String>> wordTree = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Float> cachedIdealLength = null;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Pruner.Companion Companion = null;
        
        public Pruner(double lengthThreshold, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> words, @org.jetbrains.annotations.NotNull()
        android.util.SparseArray<keyboard.neon.newboard.ime.text.keyboard.TextKey> keysByCharacter) {
            super();
        }
        
        /**
         * Finds the words whose start and end letter are closest to the start and end points of the
         * user gesture.
         *
         * @param userGesture The current user gesture.
         * @param keys The keys on the keyboard.
         * @return A list of likely words.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> pruneByExtremities(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Gesture userGesture, @org.jetbrains.annotations.NotNull()
        java.lang.Iterable<keyboard.neon.newboard.ime.text.keyboard.TextKey> keys) {
            return null;
        }
        
        /**
         * Finds the words whose ideal gesture length is within a certain threshold of the user
         * gesture's length.
         *
         * @param userGesture The current user gesture.
         * @param words A list of words to consider.
         * @return A list of words that remained after pruning the input list by length.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> pruneByLength(@org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Gesture userGesture, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> words, @org.jetbrains.annotations.NotNull()
        android.util.SparseArray<keyboard.neon.newboard.ime.text.keyboard.TextKey> keysByCharacter, @org.jetbrains.annotations.NotNull()
        java.util.List<keyboard.neon.newboard.ime.text.keyboard.TextKey> keys) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Float> getCachedIdealLength() {
            return null;
        }
        
        private final float getCachedIdealLength(java.lang.String word, keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Gesture idealGesture) {
            return 0.0F;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0002J,\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0002\u00a8\u0006\u0012"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/StatisticalGlideTypingClassifier$Pruner$Companion;", "", "()V", "findNClosestKeys", "", "", "x", "", "y", "n", "keys", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKey;", "getFirstKeyLastKey", "Lkotlin/Pair;", "word", "", "keysByCharacter", "Landroid/util/SparseArray;", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            private final kotlin.Pair<java.lang.Integer, java.lang.Integer> getFirstKeyLastKey(java.lang.String word, android.util.SparseArray<keyboard.neon.newboard.ime.text.keyboard.TextKey> keysByCharacter) {
                return null;
            }
            
            /**
             * Finds a chosen number of keys closest to a given point on the keyboard.
             *
             * @param x X coordinate of the point.
             * @param y Y coordinate of the point.
             * @param n The number of keys to return.
             * @param keys The keys of the keyboard.
             * @return A list of the n closest keys.
             */
            private final java.lang.Iterable<java.lang.Integer> findNClosestKeys(float x, float y, int n, java.lang.Iterable<keyboard.neon.newboard.ime.text.keyboard.TextKey> keys) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\u0000J\u0013\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0006\u0010\u0015\u001a\u00020\u000fJ\u0006\u0010\u0016\u001a\u00020\u000fJ\u0006\u0010\u0017\u001a\u00020\u000fJ\u0006\u0010\u0018\u001a\u00020\u000fJ\u0006\u0010\u0019\u001a\u00020\u000fJ\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0007J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\u0006\u0010\u001e\u001a\u00020\u0000J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0007R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/StatisticalGlideTypingClassifier$Gesture;", "", "()V", "xs", "", "ys", "size", "", "([F[FI)V", "isEmpty", "", "()Z", "addPoint", "", "x", "", "y", "clear", "clone", "equals", "other", "getFirstX", "getFirstY", "getLastX", "getLastY", "getLength", "getX", "i", "getY", "hashCode", "normalizeByBoxSide", "resample", "numPoints", "Companion", "aosp_debug"})
    public static final class Gesture {
        private final float[] xs = null;
        private final float[] ys = null;
        private int size;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Gesture.Companion Companion = null;
        private static final int MAX_SIZE = 300;
        
        public Gesture(@org.jetbrains.annotations.NotNull()
        float[] xs, @org.jetbrains.annotations.NotNull()
        float[] ys, int size) {
            super();
        }
        
        public final boolean isEmpty() {
            return false;
        }
        
        public Gesture() {
            super();
        }
        
        public final void addPoint(float x, float y) {
        }
        
        /**
         * Resamples the gesture into a new gesture with the chosen number of points by oversampling
         * it.
         *
         * @param numPoints The number of points that the new gesture will have. Must be superior to
         * the number of points in the current gesture.
         * @return An oversampled copy of the gesture.
         */
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Gesture resample(int numPoints) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Gesture normalizeByBoxSide() {
            return null;
        }
        
        public final float getFirstX() {
            return 0.0F;
        }
        
        public final float getFirstY() {
            return 0.0F;
        }
        
        public final float getLastX() {
            return 0.0F;
        }
        
        public final float getLastY() {
            return 0.0F;
        }
        
        public final float getLength() {
            return 0.0F;
        }
        
        public final void clear() {
        }
        
        public final float getX(int i) {
            return 0.0F;
        }
        
        public final float getY(int i) {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Gesture clone() {
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
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/StatisticalGlideTypingClassifier$Gesture$Companion;", "", "()V", "MAX_SIZE", "", "distance", "", "x1", "y1", "x2", "y2", "generateIdealGestures", "", "Lkeyboard/neon/newboard/ime/text/gestures/StatisticalGlideTypingClassifier$Gesture;", "word", "", "keysByCharacter", "Landroid/util/SparseArray;", "Lkeyboard/neon/newboard/ime/text/keyboard/TextKey;", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<keyboard.neon.newboard.ime.text.gestures.StatisticalGlideTypingClassifier.Gesture> generateIdealGestures(@org.jetbrains.annotations.NotNull()
            java.lang.String word, @org.jetbrains.annotations.NotNull()
            android.util.SparseArray<keyboard.neon.newboard.ime.text.keyboard.TextKey> keysByCharacter) {
                return null;
            }
            
            public final float distance(float x1, float y1, float x2, float y2) {
                return 0.0F;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lkeyboard/neon/newboard/ime/text/gestures/StatisticalGlideTypingClassifier$Companion;", "", "()V", "LOCATION_STD", "", "PRUNER_CACHE_SIZE", "", "PRUNING_LENGTH_THRESHOLD", "", "SAMPLING_POINTS", "SHAPE_STD", "SUGGESTION_CACHE_SIZE", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}