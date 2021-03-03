package app

import data.Product

fun main() {
    val product = Product("Indoie",12,"Mie")
    val product2 = product.copy(name = "Super Mie")
    println(product2.name)
}