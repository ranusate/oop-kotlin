package app

import data.Minus
import data.Operation
import data.Plus

fun operation(a: Int, b: Int, C: Operation): Int {
    return when (C) {
        is Plus -> a + b
        is Minus -> a - b
    }
}

fun main() {
    println(operation(12,12,Plus()))
    println(operation(12,12,Minus()))
}