package org.example

fun findAddress(name: String?): String? {
    return null
}

fun superify(string: String?): String? {
    return "super$string"
}

fun revealSecret(passcode: String?): String? {
    val correctPasscode: String = "HUNGRY"
    if (passcode === correctPasscode) {
        return "The cookies are in the desk drawer"
    } else {
        return null
    }
}
