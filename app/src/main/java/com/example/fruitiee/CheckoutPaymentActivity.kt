package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.view.View

class CheckoutPaymentActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout_payment)

        setupBottomMenuNavigation()

        findViewById<View?>(R.id.btnConfirmPayment)?.setOnClickListener {
            startActivity(Intent(this, CheckoutSuccessActivity::class.java))
        }
    }
}







