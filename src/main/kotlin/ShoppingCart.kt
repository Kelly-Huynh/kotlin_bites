package org.example

class ShoppingCart{

    val items= ArrayList<Item>()

    fun addItem(newItem: Item) {
        items.add(newItem)
    }

    fun getTotalPrice(price: Double): List<Item> {
        return items.filter { it.price == price }.toList()
    }
}