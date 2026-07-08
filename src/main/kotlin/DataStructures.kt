package org.example

fun printHelloMessages(names: List<String?>): List<Any>? {
    if (names.isEmpty()) {
        return null
    }
    return names.map{
        println("Hello $it")
    }
}
fun getAllNumberSigns(numbers2: List<Int?>): List<Any>? {
    if (numbers2.isEmpty()) {
        return null
    }
    return numbers2.map{
        println(getNumberSignWhen(it))
    }
}