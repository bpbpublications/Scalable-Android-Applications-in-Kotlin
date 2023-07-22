class UserRepository1(private val dataSource: DataSource) {
    fun getUserById(id: String): User {
        TODO("Implementation of fetching user from the data source")
    }
}

class UserService1(private val userRepository: UserRepository1) {
    fun getUserById(id: String): User {
        return userRepository.getUserById(id)
    }
}
