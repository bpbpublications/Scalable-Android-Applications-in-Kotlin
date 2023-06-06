interface Printer {
    fun print(message: String)
}

class ConsolePrinter : Printer {
    override fun print(message: String) {
        println(message)
    }
}

class PrinterUser(
    private val printer: Printer = ConsolePrinter()
) : Printer by printer
