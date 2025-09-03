package com.example.fruitiee

import android.os.Bundle
import android.content.Intent
import android.view.View

class FruitBasketActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fruit_basket)

        setupBottomMenuNavigation()

        findViewById<View?>(R.id.plus)?.setOnClickListener {
            startActivity(Intent(this, BasketCartActivity::class.java))
        }
    }
}




