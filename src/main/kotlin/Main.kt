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
    println(superify(superify(superify(superify("cat")))))
    var secret = revealSecret("Hi")
    println(secret)
    var secret2 = revealSecret("HUNGRY")
    println(secret2)
    test(1)
    println(getNumberSignIf(3))
    println(getNumberSignIf(0))
    println(getNumberSignIf(-5))
    println(getNumberSignIf("not a number"))
    println(getNumberSignWhen(3))
    println(getNumberSignWhen(0))
    println(getNumberSignWhen(-5))
    println(getNumberSignWhen("not a number"))
    printHelloMessages(listOf("Jake", "Olga", "Pat"))
    val numbers2 = listOf(2, -3, 5, 0)

    val signs = getAllNumberSigns(numbers2)
    println(calculate(2,3, ::add))
    println(calculate(2,4, ::multiply))
    println(convertToCaps("kelly"))
    println(exclaim("Kelly"))
}

fun findAddress(name: String?): String? {
    return null
}
// Functions Intro

// Conditions

// Data Structures

// Functions 2

