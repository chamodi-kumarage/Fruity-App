package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.view.View

class OrganicActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organic)

        setupBottomMenuNavigation()

        findViewById<View?>(R.id.allbtn)?.setOnClickListener { startActivity(Intent(this, AllActivity::class.java)) }
        findViewById<View?>(R.id.organicbtn)?.setOnClickListener { startActivity(Intent(this, OrganicActivity::class.java)) }
        findViewById<View?>(R.id.saladbtn)?.setOnClickListener { startActivity(Intent(this, SaladActivity::class.java)) }
        findViewById<View?>(R.id.juicebtn)?.setOnClickListener { startActivity(Intent(this, JuiceActivity::class.java)) }

        findViewById<View?>(R.id.plus1)?.setOnClickListener { startActivity(Intent(this, CartActivity::class.java)) }
        findViewById<View?>(R.id.seepapaya)?.setOnClickListener { startActivity(Intent(this, PapayaDetailActivity::class.java)) }
        findViewById<View?>(R.id.btnStar)?.setOnClickListener { startActivity(Intent(this, FruitBasketActivity::class.java)) }
        findViewById<View?>(R.id.bell)?.setOnClickListener { startActivity(Intent(this, NotificationsActivity::class.java)) }
    }
}







