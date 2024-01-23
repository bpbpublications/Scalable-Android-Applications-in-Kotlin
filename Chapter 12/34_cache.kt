// Domain module
interface MarsRepository {
    suspend fun fetchMarsData(
        isStale: Boolean = false
    ): Result<List<MarsEstate>>
}

// Data module
class MarsRepositoryImpl(
    ...
) : MarsRepository {

    // local variable where cache will be stored
    private var marsCache: List<MarsEstate>? = null

    override suspend fun fetchMarsData(
        isStale: Boolean
    ): Result<List<MarsEstate>> ...

    // ... only fetch if marsCache is null or isStale is true
