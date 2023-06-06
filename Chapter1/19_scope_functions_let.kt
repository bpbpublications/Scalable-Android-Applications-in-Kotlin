val complicated_expression = ""
fun doSomethingWith(it: String) = null

val test = (complicated_expression).let {
    doSomethingWith(it)
}
