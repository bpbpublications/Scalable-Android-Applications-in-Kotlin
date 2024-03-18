interface MarsEstateUseCase {
    suspend operator fun invoke(): Result<List<MarsEstate>>

    companion object {
        fun rent(marsRepository: MarsRepository): MarsEstateUseCase =
            MarsEstateRentUseCaseImpl(marsRepository) { estate ->
                !estate.isBuy
            }

        fun buy(marsRepository: MarsRepository): MarsEstateUseCase =
            MarsEstateRentUseCaseImpl(marsRepository) { estate ->
                estate.isBuy
            }
    }
}
