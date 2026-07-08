package org.example

fun test(x: Any?) {
    if (x is Int) {
        println(x > 0)
    }
}
fun getNumberSignIf(number: Any?): String? {
    if (number !is Number) {
        return null
    }
    val value = number.toDouble()
    return if (value == 0.0) {
        return "zero"
    } else if (value > 0) {
        return "positive"
    } else {
        return "negative"
    }
}
fun getNumberSignWhen(number: Any?): String? {
    return when (number) {
        is Number -> when {
            number.toDouble() == 0.0 -> "zero"
            number.toDouble() > 0 -> "positive"
            else -> "negative"
        }
        else -> null
    }
}