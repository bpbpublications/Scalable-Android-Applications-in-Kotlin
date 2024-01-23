class MarsRepositoryImpl(
    private val ktorClient: HttpClient = HttpClient {
        install(ContentNegotiation) { json() }
    }
) : MarsRepository {

    override suspend fun fetchMarsData(): Result<List<MarsEstate>> = try {
        val response: HttpResponse = ktorClient.get(marsUrl)

        if (response.status.isSuccess()) {
            Result.success(
                response.body<List<MarsData>>().map {
                    MarsEstate(it.price, it.type == "buy", it.imgSrc)
                }
            )
        } else {
            Result.failure(IOException(response.status.description))
        }
    } catch (e: Exception) {
        Result.failure(e)
    }
}
