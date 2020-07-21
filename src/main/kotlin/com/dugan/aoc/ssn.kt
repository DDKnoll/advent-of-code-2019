package com.dugan.aoc

val socialRegex = "^\\d{3}-\\d{3}-\\d{4}$".toRegex()

fun validateSocial(ssn: String): Boolean = socialRegex.matches(ssn)