interface AddToCartUseCase {
    suspend operator fun invoke(
        productId: String,
        quantity: Int
    ): Result<Response>

    companion object {
        fun impl(
            cartRepo: CartRepository,
            prodRepo: ProductRepository
        ): AddToCartUseCase =  AddToCartUseCaseImpl (
            cartRepo, prodRepo
        )
    }
}
