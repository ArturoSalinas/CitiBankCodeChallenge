package com.example.myapplication2

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    private lateinit var buttonProduct1: Button
    private lateinit var buttonProduct2: Button
    private lateinit var buttonProduct3: Button

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        sharedPreferences.edit().putString("firstProduct", "water").apply()
//        sharedPreferences.edit().putString("secondProduct", "salt").apply()
//        sharedPreferences.edit().putString("thirdProduct", "milk").apply()

        buttonProduct1 = findViewById(R.id.buttonProduct1)
        buttonProduct2 = findViewById(R.id.buttonProduct2)
        buttonProduct3 = findViewById(R.id.buttonProduct3)

        buttonProduct1.setOnClickListener {

            val intent = Intent(this, MainActivityTaxes::class.java)
                intent.putExtra("value", 1)
                intent.putExtra("firstProduct", "water")
                intent.putExtra("priceFirstProduct", "30")

            startActivity(intent)
        }

        buttonProduct2.setOnClickListener {
            val intent2 = Intent(this, MainActivityTaxes::class.java)
                intent.putExtra("value", 2)
                intent.putExtra("secondProduct", "salt")
                intent.putExtra("priceSecondProduct", "40")

            startActivity(intent2)
        }

        buttonProduct3.setOnClickListener {
            val intent3 = Intent(this, MainActivityTaxes::class.java)
                intent.putExtra("value", 3)
                intent.putExtra("thirdProduct", "milk")
                intent.putExtra("priceThirdProduct", "50")

            startActivity(intent3)
        }
    }
}