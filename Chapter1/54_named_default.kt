fun greet(name: String = "Guest") {
    println("Hello, $name!")
}

fun main(args: Array<String>) {
    greet()       // Output: Hello, Guest!
    greet("John") // Output: Hello, John!
}
