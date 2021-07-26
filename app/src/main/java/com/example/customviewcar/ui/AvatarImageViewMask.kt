package com.example.customviewcar.ui

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import android.widget.ImageView

class AvatarImageViewMask @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : androidx.appcompat.widget.AppCompatImageView(context, attrs, defStyleAttr) {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.e("AvatarImageViewMask", "onAttachedToWindow: ")
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        Log.e("AvatarImageViewMask", "onMeasure: ")
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        Log.e("AvatarImageViewMask", "onLayout: ")
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        Log.e("AvatarImageViewMask", "onDraw: ")
    }
}