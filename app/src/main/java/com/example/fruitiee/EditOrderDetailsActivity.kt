package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.view.View

class EditOrderDetailsActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_order_details)

        setupBottomMenuNavigation()

        findViewById<View?>(R.id.liveloc)?.setOnClickListener {
            startActivity(Intent(this, LiveLocationActivity::class.java))
        }
        findViewById<View?>(R.id.btnConfirmOrder)?.setOnClickListener {
            startActivity(Intent(this, PaymentOptionsActivity::class.java))
        }
    }
}







