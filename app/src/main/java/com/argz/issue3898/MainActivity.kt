package com.argz.issue3898

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkFCMToken()
    }

    private fun checkFCMToken() {
        FirebaseMessaging.getInstance().token.addOnCompleteListener {
            if(it.isSuccessful) {
                println("->> token: ${it.result}")
                Toast.makeText(this, "Token: ${it.result}", Toast.LENGTH_LONG).show()
            } else {
                println("->> error: ${it.exception}")
                Toast.makeText(this, "Error: ${it.exception}", Toast.LENGTH_LONG).show()
            }
        }
    }
}