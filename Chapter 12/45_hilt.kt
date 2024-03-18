@Module
@InstallIn(SingletonComponent::class)
class Module {

    @Provides
    @MarsRent
    fun provideMarsEstateRent(): MarsEstateUseCase =
        MarsEstateUseCase.rent(MarsRepo.impl())

    @Provides
    @MarsBuy
    fun provideMarsEstateBuy(): MarsEstateUseCase =
        MarsEstateUseCase.buy(MarsRepo.impl())
}

