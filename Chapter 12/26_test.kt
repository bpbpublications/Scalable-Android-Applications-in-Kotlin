class MarsRepositoryTest {

    private var jsonString = ""

    private val mockEngine = MockEngine { request ->
        /* test request object to match expected api call */
        respond(
            content = ByteReadChannel(jsonString),
            status = HttpStatusCode.OK,
            headers = headersOf(ContentType, "application/json")
        )
    }

    private val ktorClient = HttpClient(mockEngine) {
        install(ContentNegotiation) { json() }
    }

    private val sut: MarsRepository = MarsRepositoryImpl(ktorClient)
}
