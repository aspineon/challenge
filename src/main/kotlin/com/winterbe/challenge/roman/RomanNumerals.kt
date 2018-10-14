package com.winterbe.challenge.roman

val nums = mapOf(
    "I" to 1,
    "V" to 5,
    "X" to 10,
    "L" to 50,
    "C" to 100,
    "D" to 500,
    "M" to 1000
)

fun sumRomanNumerals(romanNumerals: String): Int {
    val nums = romanNumerals
        .reversed()
        .map { nums[it.toString()]!! }
    var result = 0
    var summand = 0
    nums.forEach { num ->
        if (num >= summand) {
            summand = num
            result += summand
        } else {
            result -= num
        }
    }
    return result
}