package com.ryanbruns.drinkable.coffee

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.ryanbruns.drinkable.R

class CoffeeMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_coffee)
        val fab = findViewById<FloatingActionButton>(R.id.fab_add_coffee)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()
            onAddCoffeeClick()
        }
    }

    fun onAddCoffeeClick() {
        Toast.makeText(this, "waffles", Toast.LENGTH_LONG)
        val fm = supportFragmentManager
        val addCoffeeDialogFragment = AddCoffeeDialogFragment()
        addCoffeeDialogFragment.show(fm, "fragment_edit_name")
    }
}
