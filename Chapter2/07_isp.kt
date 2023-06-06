interface Printer {
    fun printDocument(document: String)
    fun scanDocument(document: String)
    fun faxDocument(document: String)
}

class SimplePrinter : Printer {
    override fun printDocument(document: String) {
        // Code to print the document
    }

    override fun scanDocument(document: String) {
        // Code to scan the document
    }

    override fun faxDocument(document: String) {
        // Code to fax the document
    }
}
