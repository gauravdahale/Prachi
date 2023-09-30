package com.gtech.prachi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitButton = findViewById(R.id.submitBtn)

        val intent = Intent(this, OrderActivity::class.java)
        startActivity(intent)
        submitButton.setOnClickListener {
            Toast.makeText(baseContext, "Submit is successfull", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, OrderActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onPause() {
        super.onPause()
    }

}


