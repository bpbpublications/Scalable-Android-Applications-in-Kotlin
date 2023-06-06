open class Rectangle1(var width: Int, var height: Int) {
    open fun area(): Int {
        return width * height
    }
}

class Square(val side: Int) : Rectangle1(side, side) {
    override fun area(): Int {
        return side * side
    }
}
