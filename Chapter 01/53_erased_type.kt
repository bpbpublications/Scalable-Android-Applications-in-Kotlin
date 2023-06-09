inline fun <reified T> printType() {
    println(T::class.simpleName)
}

fun main(args: Array<String>) {
    printType<String>()
}