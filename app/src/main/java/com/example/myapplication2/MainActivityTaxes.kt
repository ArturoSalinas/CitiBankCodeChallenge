package com.example.myapplication2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivityTaxes : Activity() {
    private lateinit var productOne: TextView
    private lateinit var productOnePrice: TextView
    private lateinit var product : String
    private lateinit var price : String
    private var value : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_taxes)
        val bundle: Bundle? = intent.extras

        productOne = findViewById(R.id.product1)
        productOnePrice = findViewById(R.id.product1Price)

        when (bundle?.get("value")) {
            firstProduct -> {
                product = bundle.get("firstProduct").toString()
                price = bundle.get("priceFirstProduct").toString()
            }
            secondProduct -> {
                product = bundle.get("secondProduct").toString()
                price = bundle.get("priceSecondProduct").toString()
            }
            thirdProduct -> {
                product = bundle.get("thirdProduct").toString()
                price = bundle.get("priceThirdProduct").toString()
            }
        }

        productOne.text = product
        productOnePrice.text = price
    }

    companion object Values{
        const val firstProduct : Int = 1
        const val secondProduct : Int = 2
        const val thirdProduct : Int = 3
    }

}