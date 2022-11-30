package com.example.la

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.Math.random
import java.util.*

class Apart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apart)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        lateinit var tv_random : TextView
        lateinit var btn_random : Button

        lateinit var result : IntRange

        tv_random = findViewById(R.id.tv_random)
        btn_random = findViewById(R.id.btn_random)

        if(intent.hasExtra("msg")) {
            result = (1..20)
        }

        btn_random.setOnClickListener {
            tv_random.text = result.random().toString()
        }

    }
}