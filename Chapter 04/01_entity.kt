data class ProductEntity(
    val id: String,
    val name: String,
    val price: Double,
    val quantity: Int
) {
    internal fun increaseQuantity(amount: Int): ProductEntity {
        require(amount > 0) { "Amount must be positive" }
        return copy(quantity = quantity + amount)
    }

    internal fun decreaseQuantity(amount: Int): ProductEntity {
        require(amount > 0) { "Amount must be positive" }
        require(amount <= quantity) { "Insufficient quantity" }
        return copy(quantity = quantity - amount)
    }
}
