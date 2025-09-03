package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.view.View

class LiveLocationConfirmActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.live_location_confirm)

        setupBottomMenuNavigation()

        findViewById<View?>(R.id.btnConfirmLocation)?.setOnClickListener {
            startActivity(Intent(this, PaymentOptionsActivity::class.java))
        }
    }
}







