package com.dugan.aoc.DayThree

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.ints.shouldBeExactly



class WirePathIntersectionsTest : StringSpec({
  "should be the correct values for nearest distance" {
    findDistancetoNearestIntersection("R8,U5,L5,D3", "U7,R6,D4,L4") shouldBeExactly 6
    findDistancetoNearestIntersection(
            "R75,D30,R83,U83,L12,D49,R71,U7,L72",
            "U62,R66,U55,R34,D71,R55,D58,R83"
    ) shouldBeExactly 159
      findDistancetoNearestIntersection(
              "R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51",
              "U98,R91,D20,R16,D67,R40,U7,R15,U6,R7"
    ) shouldBeExactly 135
  }

  "should be the correct values for first intersection" {
    findDistancetoNearestIntersection("R8,U5,L5,D3", "U7,R6,D4,L4") shouldBeExactly 30
    findDistancetoNearestIntersection(
            "R75,D30,R83,U83,L12,D49,R71,U7,L72",
            "U62,R66,U55,R34,D71,R55,D58,R83"
    ) shouldBeExactly 610
      findDistancetoNearestIntersection(
              "R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51",
              "U98,R91,D20,R16,D67,R40,U7,R15,U6,R7"
    ) shouldBeExactly 410
  }

})