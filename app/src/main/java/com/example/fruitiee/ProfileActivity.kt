package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.view.View

class ProfileActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        setupBottomMenuNavigation()

        findViewById<View?>(R.id.order)?.setOnClickListener { startActivity(Intent(this, MyOrderActivity::class.java)) }
        findViewById<View?>(R.id.editprofilt)?.setOnClickListener { startActivity(Intent(this, EditProfileActivity::class.java)) }
        findViewById<View?>(R.id.notification)?.setOnClickListener { startActivity(Intent(this, NotificationsActivity::class.java)) }
        findViewById<View?>(R.id.privacy)?.setOnClickListener { startActivity(Intent(this, PrivacyPolicyActivity::class.java)) }
        findViewById<View?>(R.id.contactus)?.setOnClickListener { startActivity(Intent(this, ContactUsActivity::class.java)) }
        findViewById<View?>(R.id.profileanalis)?.setOnClickListener { startActivity(Intent(this, ProfileAnalyticsActivity::class.java)) }
        findViewById<View?>(R.id.basket)?.setOnClickListener { startActivity(Intent(this, FruitBasketActivity::class.java)) }
        findViewById<View?>(R.id.logout)?.setOnClickListener { startActivity(Intent(this, LoginActivity::class.java)) }
    }
}






