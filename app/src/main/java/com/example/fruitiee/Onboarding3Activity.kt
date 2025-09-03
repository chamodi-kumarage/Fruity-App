package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Onboarding3Activity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_screen_3)

        findViewById<Button>(R.id.getStartedBtn)?.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}
