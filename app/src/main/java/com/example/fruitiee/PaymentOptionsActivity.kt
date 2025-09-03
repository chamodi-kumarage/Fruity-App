package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.view.View

class PaymentOptionsActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment_options)

        setupBottomMenuNavigation()

        findViewById<View?>(R.id.btnCashOnDelivery)?.setOnClickListener {
            startActivity(Intent(this, CheckoutPaymentActivity::class.java))
        }
        findViewById<View?>(R.id.btnConfirmOrder)?.setOnClickListener {
            startActivity(Intent(this, PaymentOptionsActivity::class.java))
        }
    }
}







