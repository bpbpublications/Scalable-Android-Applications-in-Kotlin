import javax.xml.transform.Result

class AddToCartUseCase(
    private val cartRepository: CartRepository,
    private val productRepository: ProductRepository
) {

    suspend operator fun invoke(
        productId: String,
        quantity: Int
    ): Result<Response> {
        val product = productRepository.getProductById(productId)
        val cart = cartRepository.getCart()
        // Perform business logic and update the cart
        val updatedCart = cart.addItem(product, quantity)
        return cartRepository.updateCart(updatedCart)
    }
}
