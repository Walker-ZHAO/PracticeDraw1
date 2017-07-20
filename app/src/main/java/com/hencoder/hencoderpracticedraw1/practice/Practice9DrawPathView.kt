package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class Practice9DrawPathView : View {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawPath() 方法画心形
        val paint = Paint()
        val path = Path()
        path.addArc(RectF(300f, 300f, 500f, 500f), -220f, 220f)
        path.arcTo(RectF(500f, 300f, 700f, 500f), -180f, 220f, false)
        path.lineTo(500f, 600f)
        canvas.drawPath(path, paint)
    }
}
