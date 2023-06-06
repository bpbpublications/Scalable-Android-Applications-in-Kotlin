class PrinterUser1 implements Printer {
    private Printer printer = new ConsolePrinter();

    @Override
    public void print(String message) {
        printer.print(message);
    }
}
