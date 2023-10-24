interface Calculator {
    fun add(a: Int, b: Int): Int
    fun subtract(a: Int, b: Int): Int
}

class BasicCalculator : Calculator {
    override fun add(a: Int, b: Int): Int = a + b
    override fun subtract(a: Int, b: Int): Int = a - b
}

class CalculatorWithLogging(
    private val calculator: Calculator
) : Calculator by calculator {

    override fun add(a: Int, b: Int): Int = calculator.add(a, b).also {
        println("Adding $a and $b = $it")
    }
}