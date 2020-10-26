package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.R.string.hello

class MainActivity : AppCompatActivity() {

    private  lateinit var  diceImage : ImageView
    private  lateinit var  diceImage2 : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage= findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)

        val rollButton: Button = findViewById(R.id.roll_buton)
//        val countUpButton: Button = findViewById(R.id.count_up_buton)


        rollButton.setOnClickListener{rollDice()}
//        countUpButton.setOnClickListener{countUp()}

    }


    private fun rollDice(){
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage() : Int {

        val randomInt = (1..6).random()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        return drawableResource

    }

//    private fun countUp(){
//        val resultText: TextView = findViewById(R.id.result_text)
//
//       var hasil =  resultText.text.toString()
//
//        if (hasil == getString(R.string.hello)){
//                resultText.text = "1"
//        }else{
//            var numberNow = hasil.toInt()
//            if (numberNow < 6) {
//                numberNow+=1
//                resultText.text = numberNow.toString()
//            }
//        }
//
//
//
//    }
}

