package com.dugan.aoc.DayFour

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe


class ValidPasswordTest : StringSpec({
    "should return the correct value method 1" {
        isValidPassword(111111) shouldBe true
        isValidPassword(122455) shouldBe true
        isValidPassword(1234567) shouldBe false
        isValidPassword(223450) shouldBe false
        isValidPassword(123789) shouldBe false
    }
    "should return the correct value method 2" {
        isValidPassword2(112222) shouldBe true
        isValidPassword2(122245) shouldBe false
        isValidPassword2(1234567) shouldBe false
        isValidPassword2(223450) shouldBe false
        isValidPassword2(123789) shouldBe false
    }
})