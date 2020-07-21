package com.dugan.aoc.DayThree

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.ints.shouldBeExactly
import io.kotest.matchers.shouldBe


class WirePathTest : StringSpec({
  "should create a list of locations" {
    val wp = WirePath("R3,U2,L5,D3")
    wp.locations.size shouldBeExactly 13
  }

  "startsWith should test for a prefix" {
    val wp1 = WirePath("R3,U2,L5,D3")
    val wp2 = WirePath("D1,R4,U3,L1")
    wp1.findNearestIntersectionByDistance(wp2) shouldBe Pair(3,2)
  }
})