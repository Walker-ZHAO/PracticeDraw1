package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class Practice8DrawArcView : View {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        val paint = Paint()
        canvas.drawArc(RectF(300f, 300f, 700f, 500f), -110f, 100f, true, paint)
        canvas.drawArc(RectF(300f, 300f, 700f, 500f), 20f, 150f, false, paint)
        paint.style = Paint.Style.STROKE
        canvas.drawArc(RectF(300f, 300f, 700f, 500f), 180f, 60f, false, paint)
    }
}
