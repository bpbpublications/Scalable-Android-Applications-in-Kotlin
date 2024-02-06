fun addToCartUseCaseImplementation(
    cartRepo: CartRepository,
    productRepo: ProductRepository
) : AddToCartUseCase = AddToCartUseCaseImpl(cartRepo, productRepo)
