package com.example.calculatorice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var display: TextView
    lateinit var edit_first: EditText
    lateinit var edit_second: EditText
    lateinit var add: Button
    lateinit var subtract: Button
    lateinit var multiply: Button
    lateinit var divide: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display = findViewById(R.id.display_result)
        edit_first = findViewById(R.id.edit_first)
        edit_second = findViewById(R.id.edit_second)
        add = findViewById(R.id.add)
        subtract = findViewById(R.id.subtract)
        multiply = findViewById(R.id.multiply)
        divide = findViewById(R.id.divide)





        add.setOnClickListener {

            val res1 = edit_first.text.toString().toInt()
            val res2 = edit_second.text.toString().toInt()
            addition(res1, res2)

        }
        subtract.setOnClickListener {

            val res1 = edit_first.text.toString().toInt()
            val res2 = edit_second.text.toString().toInt()
            subtraction(res1, res2)

        }
        divide.setOnClickListener {

            val res1 = edit_first.text.toString().toInt()
            val res2 = edit_second.text.toString().toInt()
            division(res1, res2)

        }
        multiply.setOnClickListener {

            val res1 = edit_first.text.toString().toInt()
            val res2 = edit_second.text.toString().toInt()
            multiplication(res1, res2)

        }
    }

    private fun addition(res1: Int , res2: Int){
        val result = res1 + res2
        display.text = result.toString()
    }
    private fun subtraction(res1: Int , res2: Int){
        val result = res1 - res2
        display.text = result.toString()
    }
    private fun multiplication(res1: Int , res2: Int){
        val result = res1 * res2
        display.text = result.toString()
    }
    private fun division(res1: Int , res2: Int){
        val result = res1 / res2
        display.text = result.toString()
    }
}