interface AddToCartUseCase2 {
    suspend operator fun invoke(
        productId: String,
        quantity: Int
    ): Result<Response>
}

internal class AddToCartUseCaseImpl(
    private val cartRepository: CartRepository,
    private val productRepository: ProductRepository
) : AddToCartUseCase2 {

    override suspend operator fun invoke(
        productId: String,
        quantity: Int
    ): Result<Response> {
        ...
    }
}
