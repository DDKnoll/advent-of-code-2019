package com.dugan.aoc.DayOne


import java.io.File

fun massCalculator(masses: List<Int>) : List<Int> {
    return masses.map { it / 3 - 2 }
}


fun solve(): Int {
    val fileName = "src/main/kotlin/com/dugan/aoc/DayOne/input.txt"
    val inputs: List<String> = File(fileName).readLines()
    val parsedInputs = inputs.map {it.toInt()}

    return massCalculator(parsedInputs).sum()
}
