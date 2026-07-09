package org.example

fun calculate(
    a:Int,
    b:Int,
    calculateFunction: (Int, Int) -> Int): Int {
    return calculateFunction(a,b)
}
fun add(a: Int, b: Int): Int {
    return a + b
}
fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun convertToCaps(string: String?): String? {
    return string?.uppercase()
}

fun exclaim(string: String?): String {
    return "$string!"
}

fun greetWith(string: String?, stringConversion: (String?) -> String?): String? {
    return stringConversion(string)
}