package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class ForgotPasswordActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgot_password)

        // Button id 'codesend' exists in forgot_password.xml
        findViewById<Button>(R.id.codesend)?.setOnClickListener {
            startActivity(Intent(this, OtpSendActivity::class.java))
        }
    }
}
