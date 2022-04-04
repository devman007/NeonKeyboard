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

package keyboard.neon.newboard.ime.text.keyboard

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Typeface
import android.graphics.drawable.PaintDrawable
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import keyboard.neon.newboard.common.ViewUtils

class TextKeyView : View {
    private val parentKeyboardView get() = parent as? TextKeyboardView

    var key: TextKey? = null
    var strokeRadius =
        6f  //// value set from textKeyboardView that is keyCornerRadius . Used for setting the stroke radius when drawing on canvas

    var shouldShowBorder = true
    val bgDrawable = PaintDrawable().apply {
        setCornerRadius(ViewUtils.dp2px(6.0f))

//        paint.apply {
//            isAntiAlias = true
//            strokeWidth = 2f
//            style = Paint.Style.STROKE
//            xfermode = PorterDuffXfermode(PorterDuff.Mode.CLEAR)
//        }

    }
    val labelPaint: Paint = Paint().apply {
        style = Paint.Style.FILL
        isAntiAlias = true
        isFakeBoldText = false
        textAlign = Paint.Align.CENTER
        typeface = Typeface.MONOSPACE

    }
    val hintedLabelPaint: Paint = Paint().apply {
        isAntiAlias = true
        isFakeBoldText = false
        textAlign = Paint.Align.CENTER
//        typeface = Typeface.DEFAULT_BOLD
    }


    val borderPaint = Paint().apply {
        isAntiAlias = true
        strokeWidth = ViewUtils.dp2px(1.7f)
        strokeJoin = Paint.Join.ROUND
        style = Paint.Style.STROKE
//        xfermode = PorterDuffXfermode(PorterDuff.Mode.CLEAR)
    }

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        background = bgDrawable
        setWillNotDraw(false)

//        setLayerType(View.LAYER_TYPE_HARDWARE, null)

    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return false
    }

    override fun onHoverEvent(event: MotionEvent?): Boolean {
        return false
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        return // This view does not measure itself
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val key = key ?: return
        canvas ?: return
        canvas.save()
        canvas.translate(-x, -y)
        parentKeyboardView?.onDrawComputedKey(canvas, key, this)
        canvas.restore()
    }
}
