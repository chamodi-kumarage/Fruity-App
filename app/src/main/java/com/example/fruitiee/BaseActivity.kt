package com.example.fruitiee

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    protected fun View.setSafeClickListener(action: () -> Unit) {
        setOnClickListener { action() }
    }

    protected fun setupBottomMenuNavigation() {
        // These ids live in include_bottom_menu.xml. They may or may not be present in a given layout
        findViewById<View?>(resources.getIdentifier("navCart", "id", packageName))?.setSafeClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }
        findViewById<View?>(resources.getIdentifier("navWishlist", "id", packageName))?.setSafeClickListener {
            startActivity(Intent(this, FavouriteActivity::class.java))
        }
        findViewById<View?>(resources.getIdentifier("navHome", "id", packageName))?.setSafeClickListener {
            startActivity(Intent(this, AllActivity::class.java))
        }
        findViewById<View?>(resources.getIdentifier("navChat", "id", packageName))?.setSafeClickListener {
            startActivity(Intent(this, MyOrderActivity::class.java))
        }
        findViewById<View?>(resources.getIdentifier("navProfile", "id", packageName))?.setSafeClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}







