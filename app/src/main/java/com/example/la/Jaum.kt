package com.example.la

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.Random
import kotlin.math.roundToInt

class Jaum : AppCompatActivity() {
    lateinit var button : Button
    lateinit var text : TextView
    lateinit var Timer : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jaum)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()


        button = findViewById(R.id.button)
        text = findViewById(R.id.text)
        Timer = findViewById(R.id.Timer)

        val jaum = arrayListOf<String>("ㄱ","ㄴ","ㄷ","ㄹ","ㅁ","ㅂ","ㅅ","ㅇ","ㅈ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ")

        val mCountDown: CountDownTimer = object : CountDownTimer(20250, 500) {
            override fun onTick(millisUntilFinished: Long) {
                //update the UI with the new count
                Timer.setText("${(millisUntilFinished.toFloat() / 1000.0f).roundToInt()}")
            }

            override fun onFinish() {
                //countdown finish
                Timer.setText("꽝ㅋ")
            }
        }

        button.setOnClickListener {
            val random = Random()
            val num = random.nextInt(jaum.size)
            val num1 = random.nextInt(jaum.size)

            mCountDown.start()

            var ran :String = jaum[num]+jaum[num1]
            text.setText(ran)

        }
    }
}