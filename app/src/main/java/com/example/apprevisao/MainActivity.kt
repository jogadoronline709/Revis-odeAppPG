package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener{
            comparingNum()
        }
    }
    private fun comparingNum(){
        val result = findViewById<TextView>(R.id.textResult)

        val num1 = findViewById<EditText>(R.id.val1)
        val num2 = findViewById<EditText>(R.id.val2)

        val valor1 = Integer.parseInt(num1.text.toString())
        val valor2 = Integer.parseInt(num2.text.toString())

        when{
            valor1>valor2 -> {
                result.text = String.format("%d é maior que %d",valor1, valor2)
            }
            valor1<valor2 -> {
                result.text = String.format("%d é menor que %d",valor1, valor2)
            }
            else->{
                result.text = String.format("%d é igual a %d",valor1, valor2)
            }
        }
    }
}