package app

import data.Car

fun main() {
    val bmw = Car("BMW", 2020)
    bmw.sayHello("Toyota")
    bmw.run()
}