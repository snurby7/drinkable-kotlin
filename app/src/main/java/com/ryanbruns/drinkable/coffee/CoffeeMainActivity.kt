package com.ryanbruns.drinkable.coffee

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import com.ryanbruns.drinkable.R

class CoffeeMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_coffee)
        val fab = findViewById<FloatingActionButton>(R.id.fab_add_coffee)
        fab.setOnClickListener {
            onAddCoffeeClick()
        }
    }

    private fun onAddCoffeeClick() {
        val fm = supportFragmentManager
        val addCoffeeDialogFragment = AddCoffeeDialogFragment()
        addCoffeeDialogFragment.show(fm, "fragment_edit_name")
    }
}
