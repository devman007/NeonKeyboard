package keyboard.neon.newboard.ime.text.layout

import keyboard.neon.newboard.ime.keyboard.AbstractKeyData
import keyboard.neon.newboard.res.Asset
import keyboard.neon.newboard.ime.text.key.*
import keyboard.neon.newboard.ime.text.keyboard.TextKeyData
import kotlinx.serialization.Serializable

@Serializable
data class Layout(
    val type: LayoutType,
    override val name: String,
    override val label: String,
    override val authors: List<String>,
    val direction: String,
    val modifier: String? = null,
    val arrangement: List<List<AbstractKeyData>> = listOf()
) : Asset {
    companion object {
        val PRE_GENERATED_LOADING_KEYBOARD = Layout(
            type = LayoutType.CHARACTERS,
            name = "__loading_keyboard__",
            label = "__loading_keyboard__",
            authors = listOf(),
            direction = "ltr",
            arrangement = listOf(
                listOf(
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0)
                ),
                listOf(
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0)
                ),
                listOf(
                    TextKeyData(code = KeyCode.SHIFT, type = KeyType.MODIFIER, label = "shift"),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = KeyCode.DELETE, type = KeyType.ENTER_EDITING, label = "delete")
                ),
                listOf(
                    TextKeyData(code = KeyCode.VIEW_SYMBOLS, type = KeyType.SYSTEM_GUI, label = "view_symbols"),
                    TextKeyData(code = 0),
                    TextKeyData(code = 0),
                    TextKeyData(code = KeyCode.SPACE, label = "space"),
                    TextKeyData(code = 0),
                    TextKeyData(code = KeyCode.ENTER, type = KeyType.ENTER_EDITING, label = "enter")
                )
            )
        )
    }
}

@Serializable
data class LayoutMetaOnly(
    val type: LayoutType,
    override val name: String,
    override val label: String,
    override val authors: List<String>,
    val direction: String,
    val modifier: String? = null
) : Asset
