package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignUpActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        findViewById<Button>(R.id.signupbutton)?.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        findViewById<TextView>(R.id.tvSignIn)?.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
