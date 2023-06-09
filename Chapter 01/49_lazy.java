class ExpensiveObject {}

class MyClass1 {
    private volatile ExpensiveObject expensiveObject;

    public ExpensiveObject getExpensiveObject() {
        if (expensiveObject == null) {
            synchronized(this) {
                if (expensiveObject == null) {
                    expensiveObject = new ExpensiveObject ();
                }
            }
        }
        return expensiveObject;
    }
}
