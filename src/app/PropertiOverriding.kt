package app

import data.Rectangle
import data.Shape
import data.Triangle

fun main() {
    val shape = Shape()
    println(shape.corner)

    val shape2 = Rectangle()
    print(shape2.corner)


    val shape3 = Triangle()
    print(shape3.corner)
}