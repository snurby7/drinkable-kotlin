package com.ryanbruns.drinkable

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.ryanbruns.drinkable.coffee.CoffeeMainActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @Suppress("UNUSED_PARAMETER")
    fun addCoffeeActivity(v: View) {
        val intent = Intent(this, CoffeeMainActivity::class.java)
        startActivity(intent)
    }
}
