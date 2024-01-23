class MarsRepositoryImpl(
    private val ktorClient: HttpClient
) : MarsRepository {

    override suspend fun fetchMarsData(): Result<List<MarsEstate>> =
        Result.success(
            listOf(MarsEstate(450000, true, "some/url"))
        )
}
