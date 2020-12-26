package com.andhikapj.praktikumandroidkelas8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumber1 = findViewById<EditText>(R.id.etNumber1)
        val etNumber2 = findViewById<EditText>(R.id.etNumber2)

        val btAdd = findViewById<Button>(R.id.btAdd)
        val btSub = findViewById<Button>(R.id.btSub)
        val btMul = findViewById<Button>(R.id.btMul)
        val btDiv = findViewById<Button>(R.id.btDiv)

        val tvResult = findViewById<TextView>(R.id.tvResult)

        var number1 = 0.0
        var number2 = 0.0


        btAdd.setOnClickListener {
            if (etNumber1.text.toString() == "") {
                number1 = 0.0
            } else {
                number1 = etNumber1.text.toString().toDouble()
            }

            if (etNumber2.text.toString() == "") {
                number2 = 0.0
            } else {
                number2 = etNumber2.text.toString().toDouble()
            }

            val result = number1 + number2

            tvResult.text = result.toString()
        }

        btSub.setOnClickListener {
            if (etNumber1.text.toString() == "") {
                number1 = 0.0
            } else {
                number1 = etNumber1.text.toString().toDouble()
            }

            if (etNumber2.text.toString() == "") {
                number2 = 0.0
            } else {
                number2 = etNumber2.text.toString().toDouble()
            }

            val result = number1 - number2

            tvResult.text = result.toString()
        }

        btMul.setOnClickListener {
            if (etNumber1.text.toString() == "") {
                number1 = 0.0
            } else {
                number1 = etNumber1.text.toString().toDouble()
            }

            if (etNumber2.text.toString() == "") {
                number2 = 0.0
            } else {
                number2 = etNumber2.text.toString().toDouble()
            }

            val result = number1 * number2

            tvResult.text = result.toString()
        }

        btDiv.setOnClickListener {
            if (etNumber1.text.toString() == "") {
                number1 = 0.0
            } else {
                number1 = etNumber1.text.toString().toDouble()
            }

            if (etNumber2.text.toString() == "") {
                number2 = 0.0
            } else {
                number2 = etNumber2.text.toString().toDouble()
            }

            val result = number1 / number2

            tvResult.text = result.toString()
        }


    }
}