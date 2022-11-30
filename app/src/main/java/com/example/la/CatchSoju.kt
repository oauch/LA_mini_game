package com.example.la

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import java.util.*
import kotlin.collections.ArrayList

class CatchSoju : AppCompatActivity() {

    var score = 0
    var imageArray = ArrayList<ImageView>()
    var handler : Handler = Handler()
    var runnable : Runnable = Runnable {  }

    lateinit var one : ImageView
    lateinit var two : ImageView
    lateinit var three : ImageView
    lateinit var four : ImageView
    lateinit var five : ImageView
    lateinit var six : ImageView
    lateinit var seven : ImageView
    lateinit var eight : ImageView
    lateinit var nine : ImageView

    lateinit var timeText : TextView
    lateinit var scoreText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catch)

        timeText = findViewById(R.id.timeText)
        scoreText = findViewById(R.id.timeText)

        one = findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)

        score = 5

        imageArray = arrayListOf(one, two, three, four, five, six, seven, eight, nine)

        hideImages()

        object : CountDownTimer(10000, 1000) {
            override fun onFinish() {
                timeText.text = "Time over"
                handler.removeCallbacks(runnable)
                for (image in imageArray)
                    image.visibility = View.INVISIBLE
            }
            override fun onTick(p0: Long) {
                timeText.text = "Time: " + p0 / 1000
            }
        }.start()
    }

    fun hideImages() {

        runnable = object : Runnable {
            override fun run() {

                for (image in imageArray) {
                    image.visibility = View.INVISIBLE
                }

                val random = Random()
                val index = random.nextInt(8 - 0)
                imageArray[index].visibility = View.VISIBLE

                handler.postDelayed(runnable, 500)

            }
        }
        handler.post(runnable)
    }

    fun increaseScore(view: View) {
        score--

        scoreText.text = "벌주: " + score + "잔"
    }
}

