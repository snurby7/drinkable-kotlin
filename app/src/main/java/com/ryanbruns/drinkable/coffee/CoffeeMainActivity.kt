package com.ryanbruns.drinkable.coffee

import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import com.ryanbruns.drinkable.R

class CoffeeMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_coffee)
    }
}
