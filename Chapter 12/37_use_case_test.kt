@Test
fun `GIVEN two types WHEN invoked THEN only buy returned`() = runTest {
    // Given
    val expected = MarsEstate(456, isBuy = true, "")
    coEvery { repo.fetchMarsData() } returns Result.success(listOf(
        MarsEstate(123, isBuy = false, ""),
        expected
    ))

    // When
    sut()
}
