package com.ryanbruns.drinkable.coffee

class CoffeeRequest {
    var tryAgain: Boolean = false
    var coffeeName: String = ""
    var roasterName: String = ""

    companion object {
        fun setTryAgain(coffeeRequest: CoffeeRequest, update: Boolean) {
            coffeeRequest.tryAgain = update
        }

        fun setCoffeeName(coffeeRequest: CoffeeRequest, newCoffeeName: String) {
            coffeeRequest.coffeeName = newCoffeeName
        }

        fun setRoasterName(coffeeRequest: CoffeeRequest, roasterName: String) {
            coffeeRequest.roasterName = roasterName
        }

    }
}