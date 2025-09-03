package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.view.View

class BasketCartActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.basket_cart)

        setupBottomMenuNavigation()

        findViewById<View?>(R.id.btnCheckout)?.setOnClickListener {
            startActivity(Intent(this, EditOrderDetailsActivity::class.java))
        }
    }
}



