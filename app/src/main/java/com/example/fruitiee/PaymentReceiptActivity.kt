package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.view.View

class PaymentReceiptActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment_recipt)

        setupBottomMenuNavigation()

        findViewById<View?>(R.id.reciptbtn)?.setOnClickListener {
            startActivity(Intent(this, OrderTrackingActivity::class.java))
        }
    }
}







