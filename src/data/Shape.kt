package data

open class Shape {
    open val corner: Int = -1
}

class Rectangle : Shape() {
    override val corner: Int = 4
    val parentCorner = super.corner
}

class Triangle : Shape() {
    override val corner: Int = 6
}