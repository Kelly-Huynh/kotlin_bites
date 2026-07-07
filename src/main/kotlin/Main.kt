package org.example

fun main() {
    val personName: String = "Anna"
    val otherName = "Sandy"
    val a = 20
    val isOverdue = true
    val test = "Some text"
    var mutableText = "This text can be changed"
    mutableText = "This text has been changed"
    val name = "Ollie"
    println(name.length)
    println(name.uppercase())
    println(name.reversed())
    val input: String? = null
    println(input?.length)
    val numbers: List<Number> = listOf(1, 3, 5)
    val names: List<String> = listOf("Kat", "Marc", "Sophie")
//    val otherNames: List<String?> = listOf("Kat", "Marc", null)
    val message: String = "Hiya"
    val reversedMessage = message.reversed()
    println(reversedMessage)

    val otherNames: List<String?> = listOf("Kat", "Marc", null)

// Loop on each name in the list
    for (name in otherNames) {
        // Print the length
        println(name?.length)
    }
    val number = "3".toInt()

    val listOfThings: List<Any> = listOf(3, "Hello", 4)
    println(findAddress("Kelly"))
}

fun findAddress(name: String?): String? {
    return null
}

