package app

import data.Student

// function overloading adalah
//function yang sama tapi dengan parameter yang berbeda

fun main() {
    val ranus = Student("Ranus")
    ranus.sayHello("Budi")
    ranus.sayHello("Raba", "Ate")
}
