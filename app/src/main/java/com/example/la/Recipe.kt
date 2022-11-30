package com.example.la

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ViewFlipper

class Recipe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        var btn_1: Button
        var btn_2: Button
        var viewflipper: ViewFlipper

        btn_1 = findViewById(R.id.btn_1)
        btn_2 = findViewById(R.id.btn_2)
        viewflipper = findViewById(R.id.viewflipper)

        btn_1.setOnClickListener {
            viewflipper.showPrevious()
        }

        btn_2.setOnClickListener {
            viewflipper.showNext()
        }

    }
}