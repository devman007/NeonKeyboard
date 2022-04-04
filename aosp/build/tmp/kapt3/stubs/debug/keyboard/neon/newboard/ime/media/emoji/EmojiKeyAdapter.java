package keyboard.neon.newboard.ime.media.emoji;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B3\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "dataSet", "", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiKey;", "emojiKeyboardView", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyboardView;", "emojiClick", "Lkotlin/Function1;", "Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyData;", "", "(Ljava/util/List;Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyboardView;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "EmojiKeyViewHolder", "aosp_debug"})
public final class EmojiKeyAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final java.util.List<keyboard.neon.newboard.ime.media.emoji.EmojiKey> dataSet = null;
    private final keyboard.neon.newboard.ime.media.emoji.EmojiKeyboardView emojiKeyboardView = null;
    private final kotlin.jvm.functions.Function1<keyboard.neon.newboard.ime.media.emoji.EmojiKeyData, kotlin.Unit> emojiClick = null;
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.media.emoji.EmojiKeyAdapter.Companion Companion = null;
    private static final int PLACEHOLDER_EMOJI_COUNT = 24;
    
    public EmojiKeyAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<keyboard.neon.newboard.ime.media.emoji.EmojiKey> dataSet, @org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.media.emoji.EmojiKeyboardView emojiKeyboardView, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super keyboard.neon.newboard.ime.media.emoji.EmojiKeyData, kotlin.Unit> emojiClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyAdapter$EmojiKeyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "aosp_debug"})
    public static final class EmojiKeyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public EmojiKeyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lkeyboard/neon/newboard/ime/media/emoji/EmojiKeyAdapter$Companion;", "", "()V", "PLACEHOLDER_EMOJI_COUNT", "", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}