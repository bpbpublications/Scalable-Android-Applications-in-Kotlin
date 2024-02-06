internal class ProductRepositoryImpl(
    private val dataSource: ProductDataSource
): ProductRepository {
    override fun getProductById(productId: String): Product {
        TODO("Not yet implemented")
    }
}
