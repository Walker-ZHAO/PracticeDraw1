package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class Practice11PieChartView : View {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        val paint = Paint()
        val path = Path()
        paint.isAntiAlias = true
        paint.color = Color.parseColor("#F44336")
        canvas.drawArc(RectF(245f, 95f, 645f, 495f), -185f, 135f, true, paint)
        paint.color = Color.parseColor("#FFC107")
        canvas.drawArc(RectF(255f,110f, 655f, 515f), -50f, 45f, true, paint)
        paint.color = Color.parseColor("#9C27B0")
        canvas.drawArc(RectF(255f,110f, 655f, 515f), 0f, 10f, true, paint)
        paint.color = Color.parseColor("#9E9E9E")
        canvas.drawArc(RectF(255f,110f, 655f, 515f), 15f, 15f, true, paint)
        paint.color = Color.parseColor("#009688")
        canvas.drawArc(RectF(255f,110f, 655f, 515f), 35f, 50f, true, paint)
        paint.color = Color.parseColor("#2196F3")
        canvas.drawArc(RectF(255f,110f, 655f, 515f), 90f, 85f, true, paint)



    }
}
