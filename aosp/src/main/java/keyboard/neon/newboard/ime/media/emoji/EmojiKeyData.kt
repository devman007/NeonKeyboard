/*
 * Copyright (C) 2021 Patrick Goldinger
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package keyboard.neon.newboard.ime.media.emoji

import androidx.annotation.Keep
import keyboard.neon.newboard.ime.keyboard.AbstractKeyData
import keyboard.neon.newboard.ime.keyboard.ComputingEvaluator
import keyboard.neon.newboard.ime.keyboard.KeyData
import keyboard.neon.newboard.ime.popup.PopupSet
import keyboard.neon.newboard.ime.text.key.KeyCode
import keyboard.neon.newboard.ime.text.key.KeyType
import keyboard.neon.newboard.ime.text.keyboard.TextKeyData
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

/**
 * Data class for a single emoji (with possible emoji variants in [popup]). The JSON class identifier for this selector
 * is `emoji_key`.
 *
 * @property codePoints The code points of the emoji.
 * @property asString The name of the emoji.
 * @property popup List of possible variants of the emoji.
 */
@Keep
@Serializable
@SerialName("emoji_key")
class EmojiKeyData(
    val codePoints: List<Int>,
    override val label: String = "",
    val popupList: MutableList<EmojiKeyData> = mutableListOf()
) : KeyData {
    @Transient override val type: KeyType = KeyType.CHARACTER
    @Transient override val code: Int = KeyCode.UNSPECIFIED
    @Transient override val groupId: Int = KeyData.GROUP_DEFAULT
    @Transient override val popup: PopupSet<AbstractKeyData> = PopupSet()

    override fun compute(evaluator: ComputingEvaluator): TextKeyData? {
        return null
    }

    private var string: String? = null

    override fun asString(isForDisplay: Boolean): String {
        if (string == null) {
            string = StringBuilder().run {
                for (codePoint in codePoints) {
                    append(Character.toChars(codePoint))
                }
                toString()
            }
        }
        return string!!
    }

    companion object {
        val EMPTY = EmojiKeyData(listOf())
    }

    override fun toString(): String {
        return "${EmojiKeyData::class.simpleName}"// { code=$code label=\"$label\" }"
    }
}
