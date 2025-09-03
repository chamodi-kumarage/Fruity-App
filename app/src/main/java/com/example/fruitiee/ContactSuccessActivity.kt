package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.view.View

class ContactSuccessActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contact_success)

        setupBottomMenuNavigation()

        findViewById<View?>(R.id.btnBackToHome)?.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
        findViewById<View?>(R.id.btnViewOrders)?.setOnClickListener {
            startActivity(Intent(this, MyOrderActivity::class.java))
        }
    }
}



