package com.gtech.prachi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
submitButton=findViewById(R.id.submitBtn)
submitButton.setOnClickListener {
    Toast.makeText(baseContext,"Submit is successfull",Toast.LENGTH_SHORT).show()
}

    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onPause() {
        super.onPause()
    }

}


