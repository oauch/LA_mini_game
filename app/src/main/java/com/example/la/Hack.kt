package com.example.la

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.la.R
import java.util.Random


class Hack : AppCompatActivity() {
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
    lateinit var startbutton : Button
    lateinit var retry : Button
    lateinit var end : Button
    lateinit var background : LinearLayout


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hack)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        imagebutton1 = findViewById(R.id.imagebutton1)
        imagebutton2 = findViewById(R.id.imagebutton2)
        imagebutton3 = findViewById(R.id.imagebutton3)
        imagebutton4 = findViewById(R.id.imagebutton4)
        imagebutton5 = findViewById(R.id.imagebutton5)
        imagebutton6 = findViewById(R.id.imagebutton6)
        imagebutton7 = findViewById(R.id.imagebutton7)
        imagebutton8 = findViewById(R.id.imagebutton8)
        imagebutton9 = findViewById(R.id.imagebutton9)
        imagebutton10 = findViewById(R.id.imagebutton10)
        imagebutton11 = findViewById(R.id.imagebutton11)
        imagebutton12 = findViewById(R.id.imagebutton12)
        imagebutton13 = findViewById(R.id.imagebutton13)
        imagebutton14 = findViewById(R.id.imagebutton14)
        imagebutton15 = findViewById(R.id.imagebutton15)
        imagebutton16 = findViewById(R.id.imagebutton16)
        imagebutton17 = findViewById(R.id.imagebutton17)
        imagebutton18 = findViewById(R.id.imagebutton18)
        imagebutton19 = findViewById(R.id.imagebutton19)
        imagebutton20 = findViewById(R.id.imagebutton20)
        startbutton = findViewById(R.id.startbutton)
        retry = findViewById(R.id.retrybutton)
        end = findViewById(R.id.endbutton)
        background = findViewById(R.id.background)




        var i = 0
        val random = Random()
        var num = random.nextInt(20)

        fun onCreate() {
            TODO("Not yet implemented")
        }

        fun On_Click_Button(i : Int){
            if ((num+1) == i){
                num = random.nextInt(20)
                retry.setVisibility(View.VISIBLE)
                end.setVisibility(View.VISIBLE)

                background.setBackgroundResource(R.drawable.out)

                retry.setOnClickListener {
;
                    retry.setVisibility(View.INVISIBLE)
                    end.setVisibility(View.INVISIBLE)

                    imagebutton1.setBackgroundResource(R.drawable.back)
                    imagebutton2.setBackgroundResource(R.drawable.back)
                    imagebutton3.setBackgroundResource(R.drawable.back)
                    imagebutton4.setBackgroundResource(R.drawable.back)
                    imagebutton5.setBackgroundResource(R.drawable.back)
                    imagebutton6.setBackgroundResource(R.drawable.back)
                    imagebutton7.setBackgroundResource(R.drawable.back)
                    imagebutton8.setBackgroundResource(R.drawable.back)
                    imagebutton9.setBackgroundResource(R.drawable.back)
                    imagebutton10.setBackgroundResource(R.drawable.back)
                    imagebutton11.setBackgroundResource(R.drawable.back)
                    imagebutton12.setBackgroundResource(R.drawable.back)
                    imagebutton13.setBackgroundResource(R.drawable.back)
                    imagebutton14.setBackgroundResource(R.drawable.back)
                    imagebutton15.setBackgroundResource(R.drawable.back)
                    imagebutton16.setBackgroundResource(R.drawable.back)
                    imagebutton17.setBackgroundResource(R.drawable.back)
                    imagebutton18.setBackgroundResource(R.drawable.back)
                    imagebutton19.setBackgroundResource(R.drawable.back)
                    imagebutton20.setBackgroundResource(R.drawable.back)
                    background.setBackgroundResource(R.drawable.wiat)


                }
                end.setOnClickListener {
                    System.exit(0)
                }
            }
        }

        imagebutton1.setOnClickListener {
            On_Click_Button(1)
            imagebutton1.setBackgroundResource(R.drawable.lfb)
        }
        imagebutton2.setOnClickListener {
            On_Click_Button(2)
            imagebutton2.setBackgroundResource(R.drawable.lfy)
        }
        imagebutton3.setOnClickListener {
            On_Click_Button(3)
            imagebutton3.setBackgroundResource(R.drawable.cb)
        }
        imagebutton4.setOnClickListener {
            On_Click_Button(4)
            imagebutton4.setBackgroundResource(R.drawable.ry)
        }
        imagebutton5.setOnClickListener {
            On_Click_Button(5)
            imagebutton5.setBackgroundResource(R.drawable.rb)
        }
        imagebutton6.setOnClickListener {
            On_Click_Button(6)
            imagebutton6.setBackgroundResource(R.drawable.lfb)
        }
        imagebutton7.setOnClickListener {
            On_Click_Button(7)
            imagebutton7.setBackgroundResource(R.drawable.lfy)

        }
        imagebutton8.setOnClickListener {
            On_Click_Button(8)
            imagebutton8.setBackgroundResource(R.drawable.cb)
        }
        imagebutton9.setOnClickListener {
            On_Click_Button(9)
            imagebutton9.setBackgroundResource(R.drawable.ry)
        }
        imagebutton10.setOnClickListener {
            On_Click_Button(10)
            imagebutton10.setBackgroundResource(R.drawable.rb)
        }
        imagebutton11.setOnClickListener {
            On_Click_Button(11)
            imagebutton11.setBackgroundResource(R.drawable.lfb)
        }
        imagebutton12.setOnClickListener {
            On_Click_Button(12)
            imagebutton12.setBackgroundResource(R.drawable.lfy)
        }
        imagebutton13.setOnClickListener {
            On_Click_Button(13)
            imagebutton13.setBackgroundResource(R.drawable.cb)
        }
        imagebutton14.setOnClickListener {
            On_Click_Button(14)
            imagebutton14.setBackgroundResource(R.drawable.ry)
        }
        imagebutton15.setOnClickListener {
            On_Click_Button(15)
            imagebutton15.setBackgroundResource(R.drawable.rb)
        }
        imagebutton16.setOnClickListener {
            On_Click_Button(16)
            imagebutton16.setBackgroundResource(R.drawable.lfb)
        }
        imagebutton17.setOnClickListener {
            On_Click_Button(17)
            imagebutton17.setBackgroundResource(R.drawable.lfy)

        }
        imagebutton18.setOnClickListener {
            On_Click_Button(18)
            imagebutton18.setBackgroundResource(R.drawable.cb)
        }
        imagebutton19.setOnClickListener {
            On_Click_Button(19)
            imagebutton19.setBackgroundResource(R.drawable.ry)
        }
        imagebutton20.setOnClickListener {
            On_Click_Button(20)
            imagebutton20.setBackgroundResource(R.drawable.rb)
        }

    }


}