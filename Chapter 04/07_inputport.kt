interface CartRepository {
    fun getCart(): Cart
    fun updateCart(updatedCart: Any): Result<Response> =
        Result.success(object : Response{})
}

interface ProductRepository {
    fun getProductById(productId: String): Product
}