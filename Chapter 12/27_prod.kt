// Domain module
interface MarsRepository

// Data module
class MarsRepositoryImpl(
    private val ktorClient: HttpClient
) : MarsRepository
