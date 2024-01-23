class MarsEstateSaleUseCase(
    private val marsRepository: MarsRepository
) {

    suspend operator fun invoke(): Result<List<MarsEstate>> =
        marsRepository.fetchMarsData().let { result ->
            result.onSuccess { estates ->
                return Result.success(
                    estates.filter { estate -> estate.isBuy }
                )
            }
            return result
        }
}
