package com.example.chapter9

import org.junit.Test

import org.junit.Assert.*

class BowlingGameTest {
    @Test
    fun `GIVEN bowling WHEN all gutter balls THEN score 0`() {
        // Given
        val game = BowlingGame()
        // When
        repeat(20) { game.roll(0) }
        // Then
        assertEquals(0, game.score())
    }
}