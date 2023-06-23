internal class AddToCartUseCaseImpl(
    private val cartRepository: CartRepository,
    private val productRepository: ProductRepository
) : AddToCartUseCase {

    override suspend fun invoke(productId: String, quantity: Int) {
        val product = productRepository.getProductById(productId)
        val cart = cartRepository.getCart()
        // Perform business logic and update the cart
        val updatedCart = cart.addItem(product, quantity)
        cartRepository.updateCart(updatedCart)
    }
}
