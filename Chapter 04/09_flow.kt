fun addToCartUseCaseFactory(
    cartRepo: CartRepository,
    productRepo: ProductRepository
) : AddToCartUseCase = AddToCartUseCaseImpl(cartRepo, productRepo)
