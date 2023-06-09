data class Customer2(
    val name: String = "",
    val email: String = ""
)

class CustomerRepository {
    fun save(customer: Customer) {
        // Code to save the customer to a database
    }
}

class EmailService {
    fun sendEmail(to: String, message: String) {
        // Code to send an email
    }
}

class DiscountCalculator {
    fun calculateDiscount(customer: Customer) {
        // Code to calculate the discount for the customer
    }
}
