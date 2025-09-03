package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class AllActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.all) // your “home” screen after sign in

        setupBottomMenuNavigation()

        // Top tabs
        findViewById<View?>(R.id.allbtn)?.setOnClickListener { startActivity(Intent(this, AllActivity::class.java)) }
        findViewById<View?>(R.id.organicbtn)?.setOnClickListener { startActivity(Intent(this, OrganicActivity::class.java)) }
        findViewById<View?>(R.id.saladbtn)?.setOnClickListener { startActivity(Intent(this, SaladActivity::class.java)) }
        findViewById<View?>(R.id.juicebtn)?.setOnClickListener { startActivity(Intent(this, JuiceActivity::class.java)) }

        // Specific actions in all.xml
        findViewById<View?>(R.id.plus1)?.setOnClickListener { startActivity(Intent(this, CartActivity::class.java)) }
        findViewById<View?>(R.id.seepapaya)?.setOnClickListener { startActivity(Intent(this, PapayaDetailActivity::class.java)) }
        findViewById<View?>(R.id.btnStar)?.setOnClickListener { startActivity(Intent(this, FruitBasketActivity::class.java)) }
        findViewById<View?>(R.id.bell)?.setOnClickListener { startActivity(Intent(this, NotificationsActivity::class.java)) }
    }
}
