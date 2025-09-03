package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.view.View

class LiveLocationActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.live_location)

        setupBottomMenuNavigation()

        findViewById<View?>(R.id.btnAllowOnce)?.setOnClickListener {
            startActivity(Intent(this, LiveLocationConfirmActivity::class.java))
        }
        findViewById<View?>(R.id.btnAllowWhileUsing)?.setOnClickListener {
            startActivity(Intent(this, LiveLocationConfirmActivity::class.java))
        }
        findViewById<View?>(R.id.btnDontAllow)?.setOnClickListener {
            startActivity(Intent(this, EditOrderDetailsActivity::class.java))
        }
    }
}







