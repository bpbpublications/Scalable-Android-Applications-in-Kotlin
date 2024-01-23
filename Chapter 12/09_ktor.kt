suspend fun fetchMarsData(): Result<List<MarsData>> = try {
    val ktorClient = HttpClient {
        install(ContentNegotiation) { json() }
    }
    val response: HttpResponse = ktorClient.get(marsUrl)

    if (response.status.isSuccess()) {
        Result.success(response.body<List<MarsData>>())
    } else {
        Result.failure(IOException(response.status.description))
    }
} catch (e: Exception) {
    Result.failure(e)
}
