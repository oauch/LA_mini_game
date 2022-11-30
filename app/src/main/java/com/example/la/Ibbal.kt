package com.example.la

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.Random
import com.bumptech.glide.Glide;

class Ibbal : AppCompatActivity() {
    lateinit var imagebutton1 : ImageButton
    lateinit var imagebutton2 : ImageButton
    lateinit var imagebutton3 : ImageButton
    lateinit var imagebutton4 : ImageButton
    lateinit var imagebutton5 : ImageButton
    lateinit var imagebutton6 : ImageButton
    lateinit var imagebutton7 : ImageButton
    lateinit var imagebutton8 : ImageButton
    lateinit var imagebutton9 : ImageButton
    lateinit var imagebutton10 : ImageButton
    lateinit var imagebutton11 : ImageButton
    lateinit var imagebutton12 : ImageButton
    lateinit var imagebutton13 : ImageButton
    lateinit var imagebutton14 : ImageButton
    lateinit var imagebutton15 : ImageButton
    lateinit var imagebutton16 : ImageButton
    lateinit var imagebutton17 : ImageButton
    lateinit var imagebutton18 : ImageButton
    lateinit var imagebutton19 : ImageButton
    lateinit var imagebutton20 : ImageButton
    lateinit var button : Button
    lateinit var button2 : Button
    lateinit var end : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ibbal)


        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        imagebutton1 = findViewById(R.id.imageButton1)
        imagebutton2 = findViewById(R.id.imageButton2)
        imagebutton3 = findViewById(R.id.imageButton3)
        imagebutton4 = findViewById(R.id.imageButton4)
        imagebutton5 = findViewById(R.id.imageButton5)
        imagebutton6 = findViewById(R.id.imageButton6)
        imagebutton7 = findViewById(R.id.imageButton7)
        imagebutton8 = findViewById(R.id.imageButton8)
        imagebutton9 = findViewById(R.id.imageButton9)
        imagebutton10 = findViewById(R.id.imageButton10)
        imagebutton11 = findViewById(R.id.imageButton11)
        imagebutton12 = findViewById(R.id.imageButton12)
        imagebutton13 = findViewById(R.id.imageButton13)
        imagebutton14 = findViewById(R.id.imageButton14)
        imagebutton15 = findViewById(R.id.imageButton15)
        imagebutton16 = findViewById(R.id.imageButton16)
        imagebutton17 = findViewById(R.id.imageButton17)
        imagebutton18 = findViewById(R.id.imageButton18)
        imagebutton19 = findViewById(R.id.imageButton19)
        imagebutton20 = findViewById(R.id.imageButton20)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)


        end = findViewById(R.id.end)
        Glide.with(this).load(R.drawable.end).into(end)


        var i = 0
        val random = Random()
        var num = random.nextInt(20)

        fun On_Click_Button(i : Int){
            if ((num+1) == i){
                num = random.nextInt(20)
                button.setVisibility(View.VISIBLE)
                button2.setVisibility(View.VISIBLE)
                end.setVisibility(View.VISIBLE)
                button.setOnClickListener {
                    imagebutton1.setVisibility(View.VISIBLE)
                    imagebutton2.setVisibility(View.VISIBLE)
                    imagebutton3.setVisibility(View.VISIBLE)
                    imagebutton4.setVisibility(View.VISIBLE)
                    imagebutton5.setVisibility(View.VISIBLE)
                    imagebutton6.setVisibility(View.VISIBLE)
                    imagebutton7.setVisibility(View.VISIBLE)
                    imagebutton8.setVisibility(View.VISIBLE)
                    imagebutton9.setVisibility(View.VISIBLE)
                    imagebutton10.setVisibility(View.VISIBLE)
                    imagebutton11.setVisibility(View.VISIBLE)
                    imagebutton12.setVisibility(View.VISIBLE)
                    imagebutton13.setVisibility(View.VISIBLE)
                    imagebutton14.setVisibility(View.VISIBLE)
                    imagebutton15.setVisibility(View.VISIBLE)
                    imagebutton16.setVisibility(View.VISIBLE)
                    imagebutton17.setVisibility(View.VISIBLE)
                    imagebutton18.setVisibility(View.VISIBLE)
                    imagebutton19.setVisibility(View.VISIBLE)
                    imagebutton20.setVisibility(View.VISIBLE)
                    button.setVisibility(View.INVISIBLE)
                    button2.setVisibility(View.INVISIBLE)
                    end.setVisibility(View.INVISIBLE)
                }
                button2.setOnClickListener {
                    System.exit(0)
                }
            }
        }

        imagebutton1.setOnClickListener {
            On_Click_Button(1)
            imagebutton1.setVisibility(View.INVISIBLE)

        }
        imagebutton2.setOnClickListener {
            On_Click_Button(2)
            imagebutton2.setVisibility(View.INVISIBLE)
        }
        imagebutton3.setOnClickListener {
            On_Click_Button(3)
            imagebutton3.setVisibility(View.INVISIBLE)
        }
        imagebutton4.setOnClickListener {
            On_Click_Button(4)
            imagebutton4.setVisibility(View.INVISIBLE)
        }
        imagebutton5.setOnClickListener {
            On_Click_Button(5)
            imagebutton5.setVisibility(View.INVISIBLE)
        }
        imagebutton6.setOnClickListener {
            On_Click_Button(6)
            imagebutton6.setVisibility(View.INVISIBLE)
        }
        imagebutton7.setOnClickListener {
            On_Click_Button(7)
            imagebutton7.setVisibility(View.INVISIBLE)
        }
        imagebutton8.setOnClickListener {
            On_Click_Button(8)
            imagebutton8.setVisibility(View.INVISIBLE)
        }
        imagebutton9.setOnClickListener {
            On_Click_Button(9)
            imagebutton9.setVisibility(View.INVISIBLE)
        }
        imagebutton10.setOnClickListener {
            On_Click_Button(10)
            imagebutton10.setVisibility(View.INVISIBLE)
        }
        imagebutton11.setOnClickListener {
            On_Click_Button(11)
            imagebutton11.setVisibility(View.INVISIBLE)
        }
        imagebutton12.setOnClickListener {
            On_Click_Button(12)
            imagebutton12.setVisibility(View.INVISIBLE)
        }
        imagebutton13.setOnClickListener {
            On_Click_Button(13)
            imagebutton13.setVisibility(View.INVISIBLE)
        }
        imagebutton14.setOnClickListener {
            On_Click_Button(14)
            imagebutton14.setVisibility(View.INVISIBLE)
        }
        imagebutton15.setOnClickListener {
            On_Click_Button(15)
            imagebutton15.setVisibility(View.INVISIBLE)
        }
        imagebutton16.setOnClickListener {
            On_Click_Button(16)
            imagebutton16.setVisibility(View.INVISIBLE)
        }
        imagebutton17.setOnClickListener {
            On_Click_Button(17)
            imagebutton17.setVisibility(View.INVISIBLE)
        }
        imagebutton18.setOnClickListener {
            On_Click_Button(18)
            imagebutton18.setVisibility(View.INVISIBLE)
        }
        imagebutton19.setOnClickListener {
            On_Click_Button(19)
            imagebutton19.setVisibility(View.INVISIBLE)
        }
        imagebutton20.setOnClickListener {
            On_Click_Button(20)
            imagebutton20.setVisibility(View.INVISIBLE)
        }


    }



}