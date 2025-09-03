package com.example.fruitiee

import android.os.Bundle
import android.content.Intent
import android.view.View

class EditProfileActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_profile)

        setupBottomMenuNavigation()

        findViewById<View?>(R.id.savebtn)?.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}




