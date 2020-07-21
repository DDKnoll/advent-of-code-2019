package com.dugan.aoc.DayThree

import kotlin.math.abs

fun findDistancetoNearestIntersection(path1: String, path2: String): Int {
    val wp1 = WirePath(path1)
    val wp2 = WirePath(path2)
    val coordinate = wp1.findNearestIntersectionByDistance(wp2)
    if(coordinate !== null) {
        return  abs(coordinate.first) + abs(coordinate.second)
    }
    return 0
}

fun findDistancetoFirstIntersection(path1: String, path2: String): Int {
    val wp1 = WirePath(path1)
    val wp2 = WirePath(path2)
    val coordinate = wp1.findFirstIntersection(wp2)
    if(coordinate !== null) {
        return wp1.getSortedLocations().indexOf(coordinate) + wp2.getSortedLocations().indexOf(coordinate)
    }
    return 0
}