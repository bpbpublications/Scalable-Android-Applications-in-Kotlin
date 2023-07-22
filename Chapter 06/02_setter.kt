fun userRepositoryTest() {
    val userRepository = UserRepository()
    val userService = UserService()
    userService.setUserRepository(userRepository)

    val user = userService.getUserById("123")
}
