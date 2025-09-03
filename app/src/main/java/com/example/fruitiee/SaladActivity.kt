package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.view.View

class SaladActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.salad)

        setupBottomMenuNavigation()

        findViewById<View?>(R.id.allbtn)?.setOnClickListener { startActivity(Intent(this, AllActivity::class.java)) }
        findViewById<View?>(R.id.organicbtn)?.setOnClickListener { startActivity(Intent(this, OrganicActivity::class.java)) }
        findViewById<View?>(R.id.saladbtn)?.setOnClickListener { startActivity(Intent(this, SaladActivity::class.java)) }
        findViewById<View?>(R.id.juicebtn)?.setOnClickListener { startActivity(Intent(this, JuiceActivity::class.java)) }
    }
}







