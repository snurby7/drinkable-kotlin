package com.ryanbruns.drinkable.coffee

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import com.ryanbruns.drinkable.R


class AddCoffeeDialogFragment : DialogFragment() {
    private var dialogView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialogView = inflater.inflate(R.layout.fragment_coffee_add, container)
        return dialogView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setUpButtonClickListeners()
    }

    private fun setUpButtonClickListeners() {
        view!!.findViewById<Button>(R.id.button_cancel_coffee).setOnClickListener { dismiss() }
        view!!.findViewById<Button>(R.id.button_save_coffee).setOnClickListener { sendCoffeeSaveRequest() }
    }

    private fun sendCoffeeSaveRequest() {
        val coffeeRequest = CoffeeRequest()
        CoffeeRequest.setTryAgain(coffeeRequest, view!!.findViewById<Switch>(R.id.coffee_try_again).isChecked)
        CoffeeRequest.setCoffeeName(coffeeRequest, view!!.findViewById<EditText>(R.id.text_coffee_name).text.toString())
        CoffeeRequest.setRoasterName(
            coffeeRequest,
            view!!.findViewById<EditText>(R.id.text_roaster_name).text.toString()
        )
    }

}