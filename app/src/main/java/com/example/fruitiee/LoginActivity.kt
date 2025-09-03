package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        findViewById<Button>(R.id.signinbtn)?.setOnClickListener {
            startActivity(Intent(this, AllActivity::class.java))
        }
        findViewById<TextView>(R.id.tvForgot)?.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }
        findViewById<TextView>(R.id.tvregester)?.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}
