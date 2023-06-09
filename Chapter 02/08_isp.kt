interface Printer1 {
    fun printDocument(document: String)
}

interface Scanner {
    fun scanDocument(document: String)
}

interface FaxMachine {
    fun faxDocument(document: String)
}

class SimplePrinter1 : Printer1 {
    override fun printDocument(document: String) {
        // Code to print the document
    }
}
