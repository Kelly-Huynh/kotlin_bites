package org.example

class ShoppingCart: Any() {

    val items = ArrayList<Item>()

    fun addItem(newItem: Item) {
        items.add(newItem)
    }

    fun getTotalPrice(): Double {
        var totalPrice = 0.0

        if (items.isEmpty()) {
            return totalPrice
        }

        items.forEach {
            totalPrice += it.price
        }

        return totalPrice
    }
}