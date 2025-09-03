package com.example.fruitiee

import android.os.Bundle
import android.content.Intent
import android.view.View

class PapayaDetailActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.papaya_detail)

        setupBottomMenuNavigation()

        findViewById<View?>(R.id.btnAddToCart)?.setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }
    }
}




