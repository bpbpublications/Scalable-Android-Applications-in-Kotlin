class UserService {
    private var userRepository: UserRepository? = null

    fun setUserRepository(userRepository: UserRepository) {
        this.userRepository = userRepository
    }

    fun getUserById(id: String): User = userRepository?.getUserById(id)
            ?: throw IllegalStateException("UserRepository not set")
}
