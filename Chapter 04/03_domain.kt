import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

val cartRepo = object :CartRepository{
    override fun getCart(): Cart {
        TODO("Not yet implemented")
    }

    override fun updateCart(updatedCart: Unit) {
        TODO("Not yet implemented")
    }
}

val productRepo = object : ProductRepository {
    override fun getProductById(productId: String) {
        TODO("Not yet implemented")
    }
}


fun main(args: Array<String>) {

    GlobalScope.launch {
        val addToCartUseCase = addToCartUseCaseFactory(cartRepo, productRepo)
        addToCartUseCase("productId", 3)
    }
}
