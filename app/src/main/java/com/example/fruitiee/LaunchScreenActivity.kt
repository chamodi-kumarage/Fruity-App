package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class LaunchScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.launchscreen)

        // Auto-navigate to Onboarding 1 after 5 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, Onboarding1Activity::class.java))
            finish() // don’t come back to splash on back press
        }, 5000)
    }
}
