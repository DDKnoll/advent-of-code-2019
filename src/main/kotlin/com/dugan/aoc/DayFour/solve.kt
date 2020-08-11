package com.dugan.aoc.DayFour

import java.io.File

fun solve(): Int {
    val beginningOfRange = 145852
    val endOfRange = 616942
    var numberOfPasswords = 0
    var currentPassword = beginningOfRange
    while(currentPassword < endOfRange) {
        if(isValidPassword(currentPassword)) {
            numberOfPasswords += 1
        }
        currentPassword += 1
    }

    return numberOfPasswords
}


fun solve2(): Int {
    val beginningOfRange = 145852
    val endOfRange = 616942
    var numberOfPasswords = 0
    var currentPassword = beginningOfRange
    while(currentPassword < endOfRange) {
        if(isValidPassword2(currentPassword)) {
            numberOfPasswords += 1
        }
        currentPassword += 1
    }

    return numberOfPasswords
}