package keyboard.neon.newboard.ime.text.smartbar;

import java.lang.System;

/**
 * A candidate view allowing for easy of suggestions. Additionally it also features an integrated clipboard suggestion
 * support, which works together with the normal suggestions provided by the NLP algorithm.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00c6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002:\u0002WXB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u00109\u001a\u00020:H\u0016J\u0018\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nH\u0002J\b\u0010>\u001a\u00020:H\u0014J\u0010\u0010?\u001a\u00020:2\u0006\u0010@\u001a\u00020\nH\u0002J\b\u0010A\u001a\u00020:H\u0014J\u0012\u0010B\u001a\u00020:2\b\u0010C\u001a\u0004\u0018\u00010DH\u0014J\u0010\u0010E\u001a\u00020:2\u0006\u0010F\u001a\u00020GH\u0016J\u0012\u0010H\u001a\u00020)2\b\u0010I\u001a\u0004\u0018\u00010JH\u0017J\b\u0010K\u001a\u00020:H\u0002J\u0010\u0010L\u001a\u00020:2\b\u0010M\u001a\u0004\u0018\u00010%J\u001b\u0010N\u001a\u00020:2\b\u0010O\u001a\u0004\u0018\u00010P\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0002\bQJ\u000e\u0010R\u001a\u00020:2\u0006\u0010S\u001a\u00020\u0017J\u0016\u0010T\u001a\u00020:2\u0006\u0010U\u001a\u00020\u001f2\u0006\u0010V\u001a\u00020\nR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u0013j\b\u0012\u0004\u0012\u00020\u001c`\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006Y"}, d2 = {"Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView;", "Landroid/view/View;", "Lkeyboard/neon/newboard/ime/theme/ThemeManager$OnThemeUpdatedListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backgroundPaint", "Landroid/graphics/Paint;", "candidateBackground", "Lkeyboard/neon/newboard/ime/theme/ThemeValue;", "candidateForeground", "candidateMarginH", "candidates", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "clipboardItem", "Lkeyboard/neon/newboard/ime/clip/provider/ClipboardItem;", "clipboardItemTime", "", "clipboardItemTimeout", "computedCandidates", "Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$ComputedCandidate;", "computedCandidatesWidthPx", "displayMode", "Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$DisplayMode;", "dividerBackground", "dividerPaint", "dividerWidth", "eventListener", "Ljava/lang/ref/WeakReference;", "Lkeyboard/neon/newboard/ime/text/smartbar/SmartbarView$EventListener;", "florisClipboardManager", "Lkeyboard/neon/newboard/ime/clip/FlorisClipboardManager;", "hasScrollingTriggered", "", "initX", "", "lastX", "pasteDrawable", "Landroid/graphics/drawable/Drawable;", "scroller", "Landroid/widget/OverScroller;", "scrollingThreshold", "selectedIndex", "textPaint", "Landroid/text/TextPaint;", "themeManager", "Lkeyboard/neon/newboard/ime/theme/ThemeManager;", "velocityTracker", "Landroid/view/VelocityTracker;", "computeScroll", "", "determineSelectedIndex", "relX", "relY", "onAttachedToWindow", "onCandidateClick", "index", "onDetachedFromWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onThemeUpdated", "theme", "Lkeyboard/neon/newboard/ime/theme/Theme;", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "recomputeCandidates", "setEventListener", "listener", "updateCandidates", "newCandidates", "Lkeyboard/neon/newboard/ime/nlp/SuggestionList;", "updateCandidates-ASgh8Mc", "updateClipboardItem", "newClipboardCandidate", "updateDisplaySettings", "newDisplayMode", "newClipboardContentTimeout", "ComputedCandidate", "DisplayMode", "aosp_debug"})
public final class CandidateView extends android.view.View implements keyboard.neon.newboard.ime.theme.ThemeManager.OnThemeUpdatedListener {
    private keyboard.neon.newboard.ime.theme.ThemeManager themeManager;
    private keyboard.neon.newboard.ime.clip.FlorisClipboardManager florisClipboardManager;
    private java.lang.ref.WeakReference<keyboard.neon.newboard.ime.text.smartbar.SmartbarView.EventListener> eventListener;
    private keyboard.neon.newboard.ime.text.smartbar.CandidateView.DisplayMode displayMode = keyboard.neon.newboard.ime.text.smartbar.CandidateView.DisplayMode.DYNAMIC_SCROLLABLE;
    private final java.util.ArrayList<java.lang.String> candidates = null;
    private keyboard.neon.newboard.ime.clip.provider.ClipboardItem clipboardItem;
    private long clipboardItemTime = 0L;
    private int clipboardItemTimeout = 60000;
    private java.util.ArrayList<keyboard.neon.newboard.ime.text.smartbar.CandidateView.ComputedCandidate> computedCandidates;
    private int computedCandidatesWidthPx = 0;
    private int selectedIndex = -1;
    private android.graphics.Paint backgroundPaint;
    private keyboard.neon.newboard.ime.theme.ThemeValue candidateBackground;
    private keyboard.neon.newboard.ime.theme.ThemeValue candidateForeground;
    private final int candidateMarginH = 0;
    private keyboard.neon.newboard.ime.theme.ThemeValue dividerBackground;
    private android.graphics.Paint dividerPaint;
    private int dividerWidth;
    private final android.graphics.drawable.Drawable pasteDrawable = null;
    private float lastX = 0.0F;
    private float initX = 0.0F;
    private boolean hasScrollingTriggered = false;
    private float scrollingThreshold;
    private final android.widget.OverScroller scroller = null;
    private final android.text.TextPaint textPaint = null;
    private android.view.VelocityTracker velocityTracker;
    
    public CandidateView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public CandidateView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CandidateView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    public final void updateClipboardItem(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.clip.provider.ClipboardItem newClipboardCandidate) {
    }
    
    public final void setEventListener(@org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.text.smartbar.SmartbarView.EventListener listener) {
    }
    
    public final void updateDisplaySettings(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.text.smartbar.CandidateView.DisplayMode newDisplayMode, int newClipboardContentTimeout) {
    }
    
    private final void recomputeCandidates() {
    }
    
    @java.lang.Override()
    public void computeScroll() {
    }
    
    private final int determineSelectedIndex(int relX, int relY) {
        return 0;
    }
    
    private final void onCandidateClick(int index) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public void onThemeUpdated(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.theme.Theme theme) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    /**
     * Data class describing a computed candidate item.
     *
     * @property geometry The geometry of the computed candidate, used to position and size the item correctly when
     * being drawn on a canvas.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$ComputedCandidate;", "", "geometry", "Landroid/graphics/Rect;", "(Landroid/graphics/Rect;)V", "getGeometry", "()Landroid/graphics/Rect;", "Clip", "Empty", "Word", "Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$ComputedCandidate$Word;", "Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$ComputedCandidate$Empty;", "Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$ComputedCandidate$Clip;", "aosp_debug"})
    static abstract class ComputedCandidate {
        @org.jetbrains.annotations.NotNull()
        private final android.graphics.Rect geometry = null;
        
        private ComputedCandidate(android.graphics.Rect geometry) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Rect getGeometry() {
            return null;
        }
        
        /**
         * Computed word candidate, used for suggestions provided by the NLP algorithm.
         *
         * @property word The word this computed candidate item represents. Used in the callback to provide which word
         * should be filled out.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$ComputedCandidate$Word;", "Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$ComputedCandidate;", "word", "", "geometry", "Landroid/graphics/Rect;", "(Ljava/lang/String;Landroid/graphics/Rect;)V", "getWord", "()Ljava/lang/String;", "toString", "aosp_debug"})
        public static final class Word extends keyboard.neon.newboard.ime.text.smartbar.CandidateView.ComputedCandidate {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String word = null;
            
            public Word(@org.jetbrains.annotations.NotNull()
            java.lang.String word, @org.jetbrains.annotations.NotNull()
            android.graphics.Rect geometry) {
                super(null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getWord() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
        }
        
        /**
         * Computed word candidate, used for filling space when [DisplayMode.CLASSIC] is active. Does not hold any data
         * and also does nothing when clicked on.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$ComputedCandidate$Empty;", "Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$ComputedCandidate;", "geometry", "Landroid/graphics/Rect;", "(Landroid/graphics/Rect;)V", "toString", "", "aosp_debug"})
        public static final class Empty extends keyboard.neon.newboard.ime.text.smartbar.CandidateView.ComputedCandidate {
            
            public Empty(@org.jetbrains.annotations.NotNull()
            android.graphics.Rect geometry) {
                super(null);
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
        }
        
        /**
         * Computed word candidate, used for clipboard paste suggestions.
         *
         * @property clipboardItem The clipboard item this computed candidate item represents. Used in the callback to
         * provide which item should be pasted.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$ComputedCandidate$Clip;", "Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$ComputedCandidate;", "clipboardItem", "Lkeyboard/neon/newboard/ime/clip/provider/ClipboardItem;", "geometry", "Landroid/graphics/Rect;", "(Lkeyboard/neon/newboard/ime/clip/provider/ClipboardItem;Landroid/graphics/Rect;)V", "getClipboardItem", "()Lkeyboard/neon/newboard/ime/clip/provider/ClipboardItem;", "toString", "", "aosp_debug"})
        public static final class Clip extends keyboard.neon.newboard.ime.text.smartbar.CandidateView.ComputedCandidate {
            @org.jetbrains.annotations.NotNull()
            private final keyboard.neon.newboard.ime.clip.provider.ClipboardItem clipboardItem = null;
            
            public Clip(@org.jetbrains.annotations.NotNull()
            keyboard.neon.newboard.ime.clip.provider.ClipboardItem clipboardItem, @org.jetbrains.annotations.NotNull()
            android.graphics.Rect geometry) {
                super(null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.clip.provider.ClipboardItem getClipboardItem() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
        }
    }
    
    /**
     * Enum class defining the display mode for the candidate view.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\t"}, d2 = {"Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$DisplayMode;", "", "(Ljava/lang/String;I)V", "toString", "", "CLASSIC", "DYNAMIC", "DYNAMIC_SCROLLABLE", "Companion", "aosp_debug"})
    public static enum DisplayMode {
        /*public static final*/ CLASSIC /* = new CLASSIC() */,
        /*public static final*/ DYNAMIC /* = new DYNAMIC() */,
        /*public static final*/ DYNAMIC_SCROLLABLE /* = new DYNAMIC_SCROLLABLE() */;
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.text.smartbar.CandidateView.DisplayMode.Companion Companion = null;
        
        DisplayMode() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$DisplayMode$Companion;", "", "()V", "fromString", "Lkeyboard/neon/newboard/ime/text/smartbar/CandidateView$DisplayMode;", "string", "", "aosp_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final keyboard.neon.newboard.ime.text.smartbar.CandidateView.DisplayMode fromString(@org.jetbrains.annotations.NotNull()
            java.lang.String string) {
                return null;
            }
        }
    }
}