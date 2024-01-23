val homeDiModule = module {
    single<MarsEstateSaleUseCase> {
        MarsEstateSaleUseCase(MarsRepositoryImpl())
    }
    single<MarsEstateRentUseCase> {
        MarsEstateRentUseCase(MarsRepositoryImpl())
    }
}
