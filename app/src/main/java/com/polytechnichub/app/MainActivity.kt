package com.polytechnichub.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)

        textView.text = "Welcome to Polytechnic Hub"
        textView.textSize = 24f
        textView.setTextColor(Color.WHITE)
        textView.gravity = Gravity.CENTER
        textView.setBackgroundColor(Color.rgb(10, 15, 28))

        setContentView(textView)
    }
}
