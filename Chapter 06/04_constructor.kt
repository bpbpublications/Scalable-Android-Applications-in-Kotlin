val dataSource = SomeDataSource()
val userRepository = UserRepository1(dataSource)
val userService = UserService1(userRepository)

val user = userService.getUserById("123")
