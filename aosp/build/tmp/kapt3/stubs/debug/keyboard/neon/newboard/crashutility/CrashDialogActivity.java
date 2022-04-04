package keyboard.neon.newboard.crashutility;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lkeyboard/neon/newboard/crashutility/CrashDialogActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lkeyboard/neon/newboard/databinding/CrashDialogBinding;", "errorReport", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "pInfo", "Landroid/content/pm/PackageInfo;", "getPInfo", "()Landroid/content/pm/PackageInfo;", "setPInfo", "(Landroid/content/pm/PackageInfo;)V", "prefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "stacktraces", "", "Lkeyboard/neon/newboard/crashutility/CrashUtility$Stacktrace;", "generateCollapsibleStacktrace", "", "sb", "stacktrace", "getAndroidVersion", "", "getDeviceName", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "aosp_debug"})
public final class CrashDialogActivity extends androidx.appcompat.app.AppCompatActivity {
    private keyboard.neon.newboard.databinding.CrashDialogBinding binding;
    private java.util.List<keyboard.neon.newboard.crashutility.CrashUtility.Stacktrace> stacktraces;
    private java.lang.StringBuilder errorReport;
    private keyboard.neon.newboard.ime.core.Preferences prefs;
    public android.content.pm.PackageInfo pInfo;
    
    public CrashDialogActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.pm.PackageInfo getPInfo() {
        return null;
    }
    
    public final void setPInfo(@org.jetbrains.annotations.NotNull()
    android.content.pm.PackageInfo p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Rules for collapsible markdown on GitHub:
     * https://gist.github.com/pierrejoubert73/902cc94d79424356a8d20be2b382e1ab
     */
    private final void generateCollapsibleStacktrace(java.lang.StringBuilder sb, keyboard.neon.newboard.crashutility.CrashUtility.Stacktrace stacktrace) {
    }
    
    private final java.lang.String getDeviceName() {
        return null;
    }
    
    private final java.lang.String getAndroidVersion() {
        return null;
    }
}