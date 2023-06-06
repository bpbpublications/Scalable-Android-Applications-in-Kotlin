import kotlin.reflect.KProperty

class Example {
    var myValue: String by MyDelegate()
}

class MyDelegate {
    operator fun getValue(
        thisRef: Any?,
        property: KProperty<*>
    ): String {
        // Custom logic for property get
        return "Custom value"
    }

    operator fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        value: String
    ) {
        // Custom logic for property set
        println("Setting value: $value")
    }
}
