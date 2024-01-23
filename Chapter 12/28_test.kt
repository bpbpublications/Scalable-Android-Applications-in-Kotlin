@Test
fun `GIVEN a single estate WHEN fetched THEN data parsed`() = runTest {
    // Given
    val price = 450000
    val imgSrc = "some/url"
    jsonString = """
        [
            {
                "price":$price,
                "id":"424905",
                "type":"buy",
                "img_src":"$imgSrc"
            }
        ]"""

    // When
    val result: Result<List<MarsEstate>> = sut.fetchMarsData()
}
