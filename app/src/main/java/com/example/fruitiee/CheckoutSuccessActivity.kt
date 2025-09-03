package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.view.View

class CheckoutSuccessActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout_succsess)

        setupBottomMenuNavigation()

        findViewById<View?>(R.id.btnContinueOrdering)?.setOnClickListener {
            startActivity(Intent(this, PaymentReceiptActivity::class.java))
        }
    }
}







