package com.dugan.aoc.DayThree

import java.lang.Math.abs

data class WirePath(val instructions: String) {
    var locations: MutableSet<Pair<Int, Int>> = mutableSetOf()
    init {
        val splitInstructions = instructions.split(',')
        var currentX = 0
        var currentY = 0
        splitInstructions.iterator().forEach {
            val distance = it.substring(startIndex = 1).toInt()
            when(it[0]) {
                'R' -> {
                    for (i in 1..distance) {
                        locations.add(Pair(currentX + i, currentY))
                    }
                    currentX += distance
                }
                'L' -> {
                    for (i in 1..distance) {
                        locations.add(Pair(currentX - i, currentY))
                    }
                    currentX -= distance
                }
                'U' -> {
                    for (i in 1..distance) {
                        locations.add(Pair(currentX, currentY + i))
                    }
                    currentY += distance
                }
                'D' -> {
                    for (i in 1..distance) {
                        locations.add(Pair(currentX, currentY - i))
                    }
                    currentY -= distance
                }
            }
            println(locations.joinToString(", ", "[", "]"))
        }
    }

//    fun getIntersections():

    fun getSortedLocations(): MutableSet<Pair<Int, Int>> {
        return locations.sortedWith(Comparator { a,b ->
            val aDist = abs(a.first) + abs(a.second)
            val bDist = abs(b.first) + abs(b.second)
            when {
                aDist > bDist -> 1
                aDist < bDist -> -1
                else -> 0
            }
        }).toMutableSet()
    }


    fun findNearestIntersectionByDistance(otherPath: WirePath): Pair<Int, Int>? {
        return getSortedLocations().find { otherPath.getSortedLocations().contains(it) }
    }

    fun findFirstIntersection(otherPath: WirePath): Pair<Int, Int>? {
        val otherSortedList = otherPath.getSortedLocations()
        return getSortedLocations().firstOrNull { otherSortedList.contains(it) }
    }
}
