interface AddToCartUseCase {
    suspend operator fun invoke(productId: String, quantity: Int)
}
