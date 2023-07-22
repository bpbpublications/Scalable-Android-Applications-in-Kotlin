interface UserRepository2 {
    fun getUserById(id: String): User
}

class UserService2(private val userRepository: UserRepository2) {
    fun getUserById(id: String): User {
        return userRepository.getUserById(id)
    }
}
