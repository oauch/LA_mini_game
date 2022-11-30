package com.example.la

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class GuessNum : AppCompatActivity() {

    private var randomInteger = Random.nextInt(101)

    private lateinit var buttonEnter : Button
    private lateinit var buttonReset : Button

    private lateinit var textViewNumber : TextView
    private lateinit var editTextInputNum : EditText
    private lateinit var textViewHint : TextView
    private lateinit var textViewTryCount : TextView

    lateinit var Up : ImageView
    lateinit var Down : ImageView
    lateinit var Ok : ImageView

    private var tryCount = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guess_num)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        buttonEnter = findViewById<Button>(R.id.buttonEnter)
        buttonEnter.setOnClickListener { view -> buttonEnterClick() }

        buttonReset = findViewById<Button>(R.id.buttonReset)
        buttonReset.setOnClickListener { view -> buttonResetClick() }

        textViewNumber = findViewById(R.id.textViewNumber)
        textViewHint = findViewById(R.id.textViewHint)
        textViewTryCount = findViewById(R.id.textViewTryCount)
        editTextInputNum = findViewById(R.id.editTextInputNum)

        Up = findViewById(R.id.Up)
        Down = findViewById(R.id.Down)
        Ok = findViewById(R.id.Ok)

        Up.setVisibility(View.INVISIBLE)
        Down.setVisibility(View.INVISIBLE)
        Ok.setVisibility(View.INVISIBLE)

        resetGame()

    }

    private fun buttonEnterClick(){
        checkValue()
    }

    private fun buttonResetClick(){
        randomInteger = Random.nextInt(101)
        tryCount = 0
        Up.setVisibility(View.INVISIBLE)
        Down.setVisibility(View.INVISIBLE)
        Ok.setVisibility(View.INVISIBLE)
        resetGame()
    }

    private fun resetGame(){
        textViewNumber.text = getString(R.string.guess_number, "?")
        textViewHint.text = getString(R.string.hint_first)
        textViewTryCount.text = getString(R.string.try_count, tryCount)
        editTextInputNum.setText(getString(R.string.input_number, ""))
    }

    private fun checkValue(){
        val check = editTextInputNum.text.toString()

        if(check == ""){
            textViewHint.text = getString(R.string.edit_text_hint)
            return
        }
        val getInputNumber: Int = check.toInt()

        if(getInputNumber == randomInteger){
            textViewNumber.text = getString(R.string.guess_number, randomInteger.toString())
            textViewHint.text = getString(R.string.hint_correct)
            Up.setVisibility(View.INVISIBLE)
            Down.setVisibility(View.INVISIBLE)
            Ok.setVisibility(View.VISIBLE)
        }
        else if(getInputNumber > randomInteger){
            textViewHint.text = getString(R.string.hint_smaller)
            Up.setVisibility(View.INVISIBLE)
            Down.setVisibility(View.VISIBLE)
        }
        else if(getInputNumber < randomInteger){
            textViewHint.text = getString(R.string.hint_larger)
            Up.setVisibility(View.VISIBLE)
            Down.setVisibility(View.INVISIBLE)
        }

        tryCount++
        textViewTryCount.text = getString(R.string.try_count, tryCount)

        if(getInputNumber != randomInteger){
            editTextInputNum.setText(getString(R.string.input_number, ""))
        }
    }
}