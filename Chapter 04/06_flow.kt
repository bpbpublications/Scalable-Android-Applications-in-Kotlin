interface CartRepository {
    fun getCart(): Cart
    fun updateCart(updatedCart: Unit)
}

interface ProductRepository {
    fun getProductById(productId: String): Product
}