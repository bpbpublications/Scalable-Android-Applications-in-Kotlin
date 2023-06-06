fun getFoo(): String? = null
fun String.toBar(): String? = null

val bar = getFoo()?.let {
    it.toBar()
}
