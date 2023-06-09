fun greet(name: String, age: Int) {
    println("Hello, $name! You are $age years old.")
}

fun main(args: Array<String>) {
    greet(age = 30, name = "John") // Output: Hello, John! You are 30 years old.
    greet(name = "John", age = 30)  // Output same as above
}
