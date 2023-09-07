package com.gtech.prachi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class OrderConfirmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_confirm)
        findViewById<TextView>(R.id.showamount).text =
            "Your total bill amount is "+ intent.getStringExtra("total_amount")

    }
}