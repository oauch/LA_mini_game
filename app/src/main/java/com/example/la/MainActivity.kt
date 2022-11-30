package com.example.la

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE

        lateinit var btn_sub1 : Button
        lateinit var btn_sub2 : Button
        lateinit var btn_sub3 : Button
        lateinit var btn_sub4 : Button
        lateinit var btn_sub5 : Button
        lateinit var btn_sub6 : Button
        lateinit var btn_sub7 : Button
        lateinit var btn_sub8 : Button
        var num = 0


        btn_sub1 = findViewById(R.id.btn_sub1)
        btn_sub2 = findViewById(R.id.btn_sub2)
        btn_sub3 = findViewById(R.id.btn_sub3)
        btn_sub4 = findViewById(R.id.btn_sub4)
        btn_sub5 = findViewById(R.id.btn_sub5)
        btn_sub6 = findViewById(R.id.btn_sub6)
        btn_sub7 = findViewById(R.id.btn_sub7)
        btn_sub8 = findViewById(R.id.btn_sub8)



        btn_sub1.setOnClickListener {
            val intent = Intent(this, Apart::class.java)
            intent.putExtra("msg", num)
            startActivity(intent)
        }

        btn_sub2.setOnClickListener {
            val intent = Intent(this, Ibbal::class.java)
            startActivity(intent)
        }

        btn_sub3.setOnClickListener {
            val intent = Intent(this, GuessNum::class.java)
            startActivity(intent)
        }

        btn_sub4.setOnClickListener {
            val intent = Intent(this, Jaum::class.java)
            startActivity(intent)
        }

        btn_sub5.setOnClickListener {
            val intent = Intent(this, Recipe::class.java)
            startActivity(intent)
        }

        btn_sub6.setOnClickListener {
            val intent = Intent(this, Mackcha::class.java)
            startActivity(intent)
        }

        btn_sub7.setOnClickListener {
            val intent = Intent(this, Hack::class.java)
            startActivity(intent)
        }

        btn_sub8.setOnClickListener {
            val intent = Intent(this, CatchSoju::class.java)
            startActivity(intent)
        }
    }
}