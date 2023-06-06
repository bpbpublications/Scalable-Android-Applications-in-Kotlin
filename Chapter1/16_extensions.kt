fun String.addExclamationMark(): String {
    return "$this!"
}

fun myFun() {
    val text = "Hello"
    val modifiedText = text.addExclamationMark()
    println(modifiedText) // Output: Hello!
}
