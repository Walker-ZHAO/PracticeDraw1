package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class Practice10HistogramView : View {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        val paint = Paint()
        val path = Path()
        paint.isAntiAlias = true
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 3f
        paint.color = Color.WHITE
        path.moveTo(50f, 20f)
        path.rLineTo(0f, 500f)
        path.rLineTo(1000f, 0f)
        canvas.drawPath(path, paint)

        paint.textSize = 20f
        paint.strokeWidth = 2f
        canvas.drawText("Froyo", 100f, 550f, paint)
        canvas.drawText("GB", 230f, 550f, paint)
        canvas.drawText("ICS", 360f, 550f, paint)
        canvas.drawText("JB", 490f, 550f, paint)
        canvas.drawText("KitKat", 620f, 550f, paint)
        canvas.drawText("L", 750f, 550f, paint)
        canvas.drawText("M", 880f, 550f, paint)
        paint.textSize = 40f
        paint.strokeWidth = 3f
        canvas.drawText("直方图", 470f, 650f, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        path.reset()
        path.addRect(RectF(80f,515f,170f,520f), Path.Direction.CW)
        path.addRect(RectF(210f,500f,300f,520f), Path.Direction.CW)
        path.addRect(RectF(340f,500f,410f,520f), Path.Direction.CW)
        path.addRect(RectF(470f,300f,560f,520f), Path.Direction.CW)
        path.addRect(RectF(600f,150f,690f,520f), Path.Direction.CW)
        path.addRect(RectF(730f,50f,810f,520f), Path.Direction.CW)
        path.addRect(RectF(870f,350f,960f,520f), Path.Direction.CW)
        canvas.drawPath(path, paint)
    }
}
