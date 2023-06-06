interface Shape2 {
    fun area(): Int
}

class Rectangle2(val width: Int, val height: Int) : Shape2 {
    override fun area(): Int {
        return width * height
    }
}

class Square1(val side: Int) : Shape2 {
    override fun area(): Int {
        return side * side
    }
}
