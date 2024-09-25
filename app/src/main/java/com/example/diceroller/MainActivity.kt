package com.example.diceroller

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)

        val rollButton: Button = findViewById(R.id.rollButton)
        val diceImage: ImageView = findViewById(R.id.diceImage)

        rollButton.setOnClickListener {
            rollDice(diceImage)
        }
    }

    private fun rollDice(diceImage: ImageView) {
        val randomRoll = Random.nextInt(6) + 1
        val drawableResource = when (randomRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}
