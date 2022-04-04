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

@file:Suppress("NOTHING_TO_INLINE")

package keyboard.neon.newboard.common

import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

inline fun <R> stringBuilder(builder: StringBuilder.() -> R): String {
    contract {
        callsInPlace(builder, InvocationKind.EXACTLY_ONCE)
    }
    val sb = StringBuilder()
    builder(sb)
    return sb.toString()
}

inline fun String.lowercase(locale: FlorisLocale): String = this.lowercase(locale.base)

inline fun String.uppercase(locale: FlorisLocale): String = this.uppercase(locale.base)
