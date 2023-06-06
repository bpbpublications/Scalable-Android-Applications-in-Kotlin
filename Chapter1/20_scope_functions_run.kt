data class Person(
    val name: String, val surname: String, val address: String
)

val person: Person? = Person("John", "Smith", "somewhere...")

val totalLength = person?.run {
    name.length + surname.length + address.length
} ?: 0
