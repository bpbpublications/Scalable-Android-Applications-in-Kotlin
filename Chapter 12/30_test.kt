@Test
fun `GIVEN a single estate WHEN fetched THEN data parsed`() = runTest {
    ...
    // Then
    assertTrue(result.isSuccess)
    result.getOrThrow().first().let {
        assertEquals(price, it.price)
        assertTrue(it.isBuy)
        assertEquals(imgSrc, it.imgSrc)
    }
}
