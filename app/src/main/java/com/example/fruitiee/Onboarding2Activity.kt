package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView

class Onboarding2Activity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_screen_2)

        findViewById<ImageView>(R.id.imageView17)?.setOnClickListener {
            startActivity(Intent(this, Onboarding3Activity::class.java))
        }
    }
}
