class IntContainer private constructor(val value: Int) {

    companion object {

        fun intContainerFactory(value: Int): IntContainer {
            return IntContainer(value)
        }
    }
}

fun main(args: Array<String>) {
    val container = IntContainer.intContainerFactory(3)
}