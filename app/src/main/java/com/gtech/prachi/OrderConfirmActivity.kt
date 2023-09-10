package com.gtech.prachi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class OrderConfirmActivity : AppCompatActivity() {
    lateinit var view: TextView
    var amount = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_confirm)
        amount = intent.getStringExtra("total_amount").toString()

        view = findViewById<TextView>(R.id.showamount)

        view.text = "Your total bill amount is $amount"

    }
}