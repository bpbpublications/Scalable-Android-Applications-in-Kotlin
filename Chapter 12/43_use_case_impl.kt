private class MarsEstateRentUseCaseImpl(
    private val marsRepository: MarsRepository,
    private val filter: (MarsEstate) -> Boolean
) : MarsEstateUseCase {

    override suspend operator fun invoke(): Result<List<MarsEstate>> =
        marsRepository.fetchMarsData().let { result ->
            result.onSuccess { estates ->
                return Result.success(estates.filter(filter))
            }
            return result
        }
}
