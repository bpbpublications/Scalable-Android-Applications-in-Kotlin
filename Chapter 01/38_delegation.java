class CalculatorWithLogging1 implements Calculator {
    private Calculator calculator;

    public CalculatorWithLogging1(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        int result = calculator.add(a, b);
        System.out.println("Adding " + a + " and " + b + " = " + result);
        return result;
    }

    @Override
    public int subtract(int a, int b) {
        return calculator.subtract(a, b);
    }
}
