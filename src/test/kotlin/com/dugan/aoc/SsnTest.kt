package com.dugan.aoc

import io.kotest.core.spec.style.FunSpec
import io.kotest.inspectors.forAll
import io.kotest.matchers.shouldBe


class SsnTest : FunSpec({

   beforeTest {
      println("Starting test ${it.description}!")
   }

   afterTest {
      println("Finished test ${it.a.description}!")
   }

   test("valid ssns") {
      validateSocial("123-456-1111") shouldBe true
   }

   test("invalid ssn") {
      listOf("a12-456-cccc", "", "123-4561117", "122", "1234567899").forAll {
         validateSocial(it) shouldBe false
      }
   }
})