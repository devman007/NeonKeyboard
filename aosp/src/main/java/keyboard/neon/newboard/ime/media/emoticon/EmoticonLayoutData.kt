
package keyboard.neon.newboard.ime.media.emoticon

import keyboard.neon.newboard.res.AssetManager
import keyboard.neon.newboard.res.FlorisRef
import kotlinx.serialization.Serializable

typealias EmoticonLayoutDataArrangement = List<List<EmoticonKeyData>>

@Serializable
data class EmoticonLayoutData(
    var type: String,
    var name: String,
    var direction: String,
    var arrangement: EmoticonLayoutDataArrangement = listOf()
) {
    companion object {
        fun fromJsonFile(path: String): EmoticonLayoutData? {
            return AssetManager.defaultOrNull()
                ?.loadJsonAsset<EmoticonLayoutData>(FlorisRef.assets(path))
                ?.getOrNull()
        }
    }
}
