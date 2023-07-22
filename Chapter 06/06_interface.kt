class InMemoryUserRepository : UserRepository2 {
    private val users = mapOf(
        "1" to User1("1", "John"),
        "2" to User1("2", "Jane")
    )

    override fun getUserById(id: String): User =
        users[id] ?: throw IllegalArgumentException("User not found")
}

val userRepository2 = InMemoryUserRepository()
val userService2 = UserService2(userRepository2)

val user1 = userService.getUserById("1")
