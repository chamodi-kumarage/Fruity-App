package com.example.fruitiee

import android.os.Bundle
import android.content.Intent
import android.view.View

class ContactUsActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contact_us)

        setupBottomMenuNavigation()

        findViewById<View?>(R.id.sendmsg)?.setOnClickListener {
            startActivity(Intent(this, ContactSuccessActivity::class.java))
        }
    }
}




