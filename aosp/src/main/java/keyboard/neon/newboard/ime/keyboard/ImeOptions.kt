
@file:Suppress("MemberVisibilityCanBePrivate")

package keyboard.neon.newboard.ime.keyboard

import android.os.Build
import android.view.inputmethod.EditorInfo

/**
 * Class which holds the same information as an [EditorInfo.imeOptions] int but more accessible and
 * readable.
 */
@JvmInline
value class ImeOptions(val state: KeyboardState) {
    companion object {
        const val M_IME_OPTIONS: ULong =                0x0F_FFu
        const val O_IME_OPTIONS: Int =                  32

        const val M_ENTER_ACTION: ULong =               0x0Fu
        const val O_ENTER_ACTION: Int =                 32

        const val F_FORCE_ASCII: ULong =                0x00_00_00_10_00_00_00_00u
        const val F_NAVIGATE_NEXT: ULong =              0x00_00_00_20_00_00_00_00u
        const val F_NAVIGATE_PREVIOUS: ULong =          0x00_00_00_40_00_00_00_00u
        const val F_NO_ACCESSORY_ACTION: ULong =        0x00_00_00_80_00_00_00_00u
        const val F_NO_ENTER_ACTION: ULong =            0x00_00_01_00_00_00_00_00u
        const val F_NO_EXTRACT_UI: ULong =              0x00_00_02_00_00_00_00_00u
        const val F_NO_FULLSCREEN: ULong =              0x00_00_04_00_00_00_00_00u
        const val F_NO_PERSONALIZED_LEARNING: ULong =   0x00_00_08_00_00_00_00_00u
    }

    var enterAction: EnterAction
        get() = EnterAction.fromInt(state.getRegion(M_ENTER_ACTION, O_ENTER_ACTION))
        private set(v) = state.setRegion(M_ENTER_ACTION, O_ENTER_ACTION, v.toInt())

    var flagForceAscii: Boolean
        get() = state.getFlag(F_FORCE_ASCII)
        private set(v) = state.setFlag(F_FORCE_ASCII, v)
    var flagNavigateNext: Boolean
        get() = state.getFlag(F_NAVIGATE_NEXT)
        private set(v) = state.setFlag(F_NAVIGATE_NEXT, v)
    var flagNavigatePrevious: Boolean
        get() = state.getFlag(F_NAVIGATE_PREVIOUS)
        private set(v) = state.setFlag(F_NAVIGATE_PREVIOUS, v)
    var flagNoAccessoryAction: Boolean
        get() = state.getFlag(F_NO_ACCESSORY_ACTION)
        private set(v) = state.setFlag(F_NO_ACCESSORY_ACTION, v)
    var flagNoEnterAction: Boolean
        get() = state.getFlag(F_NO_ENTER_ACTION)
        private set(v) = state.setFlag(F_NO_ENTER_ACTION, v)
    var flagNoExtractUi: Boolean
        get() = state.getFlag(F_NO_EXTRACT_UI)
        private set(v) = state.setFlag(F_NO_EXTRACT_UI, v)
    var flagNoFullscreen: Boolean
        get() = state.getFlag(F_NO_FULLSCREEN)
        private set(v) = state.setFlag(F_NO_FULLSCREEN, v)
    var flagNoPersonalizedLearning: Boolean
        get() = state.getFlag(F_NO_PERSONALIZED_LEARNING)
        private set(v) = state.setFlag(F_NO_PERSONALIZED_LEARNING, v)

    fun update(editorInfo: EditorInfo) {
        val imeOptionsRaw = editorInfo.imeOptions
        state.setRegion(M_IME_OPTIONS, O_IME_OPTIONS, 0) // reset imeOptions region
        enterAction = EnterAction.fromInt(imeOptionsRaw and EditorInfo.IME_MASK_ACTION)
        flagForceAscii = imeOptionsRaw and EditorInfo.IME_FLAG_FORCE_ASCII != 0
        flagNavigateNext = imeOptionsRaw and EditorInfo.IME_FLAG_NAVIGATE_NEXT != 0
        flagNavigatePrevious = imeOptionsRaw and EditorInfo.IME_FLAG_NAVIGATE_PREVIOUS != 0
        flagNoAccessoryAction = imeOptionsRaw and EditorInfo.IME_FLAG_NO_ACCESSORY_ACTION != 0
        flagNoEnterAction = imeOptionsRaw and EditorInfo.IME_FLAG_NO_ENTER_ACTION != 0
        flagNoExtractUi = imeOptionsRaw and EditorInfo.IME_FLAG_NO_EXTRACT_UI != 0
        flagNoFullscreen = imeOptionsRaw and EditorInfo.IME_FLAG_NO_FULLSCREEN != 0
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            flagNoPersonalizedLearning = imeOptionsRaw and EditorInfo.IME_FLAG_NO_PERSONALIZED_LEARNING != 0
        }
    }

    enum class EnterAction(val value: Int) {
        UNSPECIFIED(EditorInfo.IME_ACTION_UNSPECIFIED),
        DONE(EditorInfo.IME_ACTION_DONE),
        GO(EditorInfo.IME_ACTION_GO),
        NEXT(EditorInfo.IME_ACTION_NEXT),
        NONE(EditorInfo.IME_ACTION_NONE),
        PREVIOUS(EditorInfo.IME_ACTION_PREVIOUS),
        SEARCH(EditorInfo.IME_ACTION_SEARCH),
        SEND(EditorInfo.IME_ACTION_SEND);

        companion object {
            fun fromInt(int: Int) = values().firstOrNull { it.value == int } ?: NONE
        }

        fun toInt() = value
    }
}
