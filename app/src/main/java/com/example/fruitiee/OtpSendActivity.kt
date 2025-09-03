package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class OtpSendActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.otp_send)

        // Button id 'verify' exists in otp_send.xml
        findViewById<Button>(R.id.verify)?.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
