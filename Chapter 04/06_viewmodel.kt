class CartViewModel(
    private val addToCartUseCase: AddToCartUseCase
    // ...
) : ViewModel() {
    // ...
    private fun onAddToCartEvent(prodId: String, qty: Int) =
        viewModelScope.launch {
            addToCartUseCase(prodId, qty)
                .onSuccess { /* trigger some ui */ }
                .onFailure { /* trigger another ui */ }
        }
}