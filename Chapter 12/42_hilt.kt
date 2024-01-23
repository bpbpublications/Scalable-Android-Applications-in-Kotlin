@Module
@InstallIn(SingletonComponent::class)
class Module {

    @Provides
    fun provideMarsEstateSaleUseCase(): MarsEstateSaleUseCase =
        MarsEstateSaleUseCase(MarsRepositoryImpl())

    @Provides
    fun provideMarsEstateRentUseCase(): MarsEstateRentUseCase =
        MarsEstateRentUseCase(MarsRepositoryImpl())
}
