package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView

class Onboarding1Activity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_screen_1)

        findViewById<ImageView>(R.id.imageView14)?.setOnClickListener {
            startActivity(Intent(this, Onboarding2Activity::class.java))
        }
    }
}