// Data module
interface MarsRepository {
    suspend fun fetchMarsData(): Result<List<MarsEstate>>
}

// Domain module
class MarsRepositoryImpl(
    private val ktorClient: HttpClient
) : MarsRepository {

    override suspend fun fetchMarsData(): Result<List<MarsEstate>>  =
        Result.failure(Throwable())
}
