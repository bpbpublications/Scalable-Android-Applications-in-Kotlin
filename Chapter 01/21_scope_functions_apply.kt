data class Person1(
    var name: String = "",
    var age: Int = 0
)

val person1 = Person1().apply {
    name = "John"
    age = 25
    // Other property initialisations
}
