package com.dugan.aoc.DayThree

import java.io.File

fun solvePartOne(): Int {
    val fileName = "src/main/kotlin/com/dugan/aoc/DayThree/input.txt"
    val wireInstructions= File(fileName).readText().split("\n")

    return findDistancetoNearestIntersection(wireInstructions[0], wireInstructions[1])

}

fun solvePartTwo(): Int {
    val fileName = "src/main/kotlin/com/dugan/aoc/DayThree/input.txt"
    val wireInstructions= File(fileName).readText().split("\n")

    return findDistancetoFirstIntersection(wireInstructions[0], wireInstructions[1])

}
