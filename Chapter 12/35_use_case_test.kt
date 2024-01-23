class MarsEstateSaleUseCaseTest {

    private val repo = mockk<MarsRepository>()
    private val sut: MarsEstateSaleUseCase by lazy {
        MarsEstateSaleUseCase(repo)
    }
}
