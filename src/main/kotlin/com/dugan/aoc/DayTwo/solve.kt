package com.dugan.aoc.DayTwo


import java.io.File

class Instructions {
  companion object {
    val ADD = 1
    val MULT = 2
    val HALT = 99
  }
}

fun solve(): Int {
    val fileName = "src/main/kotlin/com/dugan/aoc/DayTwo/input.txt"
    var currentPosition = 0
    val memory: MutableList<Int> = File(fileName).readText().split(",").map { it.toInt() }.toMutableList()
    memory[1] = 12
    memory[2] = 2
//    val memory: MutableList<Int> = "1,1,1,4,99,5,6,0,99".split(",").map { it.toInt() }.toMutableList()

    // Process Memory
    while (memory[currentPosition] !== Instructions.HALT) {
        print("processing: ")
        println(currentPosition)
        println(memory)
        val val1 = memory[memory[currentPosition + 1]]
        val val2 = memory[memory[currentPosition + 2]]
        val target = memory[currentPosition + 3]
        val result = when (memory[currentPosition]) {
            Instructions.ADD -> val1 + val2
            Instructions.MULT -> val2 * val2
            else -> throw RuntimeException("Instruction not recognized")
        }
        memory[target] = result
        currentPosition = currentPosition + 4
    }

    return memory[0]
}
