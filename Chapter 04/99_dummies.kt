class Order {
    fun validate() {
        TODO("Not yet implemented")
    }

    var items: String = ""
}

interface Product

class OrderRepository {
    fun saveOrder(order: Order) {}
}

interface Cart {
    fun addItem(product: Product, quantity: Int)
}

interface ViewModel
