open class UserRepository {
    fun getUserById(id: String): User? = null
}

interface User
data class User1(val id: String, val name: String): User
interface DataSource
class SomeDataSource: DataSource
interface UserRepository2
class InMemoryUserRepository : UserRepository2
