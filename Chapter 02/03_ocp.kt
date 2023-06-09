class Shape(private val type: String) {
    fun calculateArea(): Double {
        return when (type) {
            "circle" -> {
                TODO("Code to calculate the area of a circle")
            }
            "rectangle" -> {
                TODO("Code to calculate the area of a rectangle")
            }
            "triangle" -> {
                TODO("Code to calculate the area of a triangle")
            }
            else -> throw IllegalArgumentException("Unsupported shape")
        }
    }
}
