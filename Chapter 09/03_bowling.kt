package com.example.chapter9

class BowlingGame1 {
    private var rolls = IntArray(21) // max number of possible rolls
    private var currentRoll = 0

    fun roll(pins: Int) {
        rolls[currentRoll++] = pins
    }

    fun score(): Int {
        var score = 0
        var rollIndex = 0

        repeat(10) {
            if (isStrike(rollIndex)) {
                score += 10 + strikeBonus(rollIndex)
                rollIndex++
            } else if (isSpare(rollIndex)) {
                score += 10 + spareBonus(rollIndex)
                rollIndex += 2
            } else {
                score += rolls[rollIndex] + rolls[rollIndex + 1]
                rollIndex += 2
            }
        }

        return score
    }

    private fun isStrike(rollIndex: Int): Boolean =
        rolls[rollIndex] == 10

    private fun isSpare(rollIndex: Int): Boolean =
        rolls[rollIndex] + rolls[rollIndex + 1] == 10

    private fun strikeBonus(rollIndex: Int): Int =
        rolls[rollIndex + 1] + rolls[rollIndex + 2]

    private fun spareBonus(rollIndex: Int): Int =
        rolls[rollIndex + 2]
}
