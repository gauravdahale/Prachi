package com.gtech.prachi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    lateinit var submitButton: Button

    val mAuth = FirebaseAuth.getInstance()    //FirebaseAuth Instance

    lateinit var mEmail: EditText
    lateinit var mPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitButton = findViewById(R.id.submitBtn)


        mEmail = findViewById(R.id.email)                  // View Initialisation for email
        mPassword = findViewById(R.id.password)          // View Initialisation for passsword


//        val intent = Intent(this,OrderActivity::class.java)
//        startActivity(intent)
        submitButton.setOnClickListener {
            if (mEmail.text.toString().isNotEmpty() && mPassword.text.toString().isNotEmpty())
            //If email and password is not empty
            {
                mAuth.createUserWithEmailAndPassword(
                    mEmail.text.toString(),
                    mPassword.text.toString()
                ).addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(baseContext, "Successfully Login", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, OrderActivity::class.java)
                        startActivity(intent)
                    }
                    else if(!task.isSuccessful){
                        Toast.makeText(baseContext, "Error" +
                                "", Toast.LENGTH_SHORT).show()

                    }
                }

            } else {
                Toast.makeText(this, "Please enter a valid email and password", Toast.LENGTH_SHORT)
                    .show()
            }

//            Toast.makeText(baseContext, "Submit is successfull", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this, OrderActivity::class.java)
//            startActivity(intent)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onPause() {
        super.onPause()
    }

}


