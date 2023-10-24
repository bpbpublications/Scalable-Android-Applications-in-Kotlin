fun main() {
    val basicCalculator = BasicCalculator()
    val calculatorWithLogging = CalculatorWithLogging(basicCalculator)

    calculatorWithLogging.add(5, 3)
    calculatorWithLogging.subtract(10, 7)
}
