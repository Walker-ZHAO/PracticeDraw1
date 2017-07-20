package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Practice2DrawCircleView : View {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawCircle() 方法画圆
        //        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        val paint = Paint()
        paint.isAntiAlias = true
        canvas.drawCircle(300f, 150f, 150f, paint)
        paint.color = Color.BLUE
        canvas.drawCircle(300f, 550f, 150f, paint)
        paint.color = Color.BLACK
        paint.style = Paint.Style.STROKE
        canvas.drawCircle(800f, 150f, 150f, paint)
        paint.strokeWidth = 20f
        canvas.drawCircle(800f, 550f, 150f, paint)
    }
}
