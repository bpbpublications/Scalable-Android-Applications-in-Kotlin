interface ProductDataSource {
    suspend fun getProductById(productId: String): Product
    suspend fun saveProduct(product: Product)
    suspend fun deleteProduct(productId: String)
    // Other methods for data manipulation and retrieval
}
