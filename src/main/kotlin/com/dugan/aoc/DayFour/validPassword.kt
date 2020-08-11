package com.dugan.aoc.DayFour

fun isValidPassword(password: Int): Boolean {
    val passwordString = password.toString()
    if (passwordString.length !== 6) {
        return false
    }
    var doubleMatched = false
    for (i in 0..4) {
        if (passwordString[i] == passwordString[i + 1]) {
            doubleMatched = true
        }
        if (passwordString[i] > passwordString[i + 1])
            return false
    }
    if (!doubleMatched) return false

    return true
}

fun isValidPassword2(password: Int): Boolean {
    val passwordString = password.toString()
    if (passwordString.length !== 6) {
        return false
    }
    var doubleMatched = false
    for (i in 0..4) {
        if (
                passwordString[i] == passwordString[i + 1]
                && (i == 4 || passwordString[i] != passwordString[i + 2])
                && (i == 0 || passwordString[i] != passwordString[i - 1])
        ) {
            doubleMatched = true
        }
        if (passwordString[i] > passwordString[i + 1])
            return false
    }
    if (!doubleMatched) return false

    return true
}
