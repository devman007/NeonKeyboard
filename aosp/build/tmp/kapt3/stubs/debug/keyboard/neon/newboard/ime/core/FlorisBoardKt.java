package keyboard.neon.newboard.ime.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"florisboardInstance", "Lkeyboard/neon/newboard/ime/core/FlorisBoard;", "aosp_debug"})
public final class FlorisBoardKt {
    
    /**
     * Variable which holds the current [FlorisBoard] instance. To get this instance from another
     * package, see [FlorisBoard.getInstance].
     * TODO: The end goal is to have no static field for service/manager class anymore. This will take a long time to
     * rework the codebase but it should be doable.
     */
    private static keyboard.neon.newboard.ime.core.FlorisBoard florisboardInstance;
}