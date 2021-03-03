package app

import data.Human

fun main() {
    val human = Human("Ranus")
    println(human.name)
    human.hi("Jar")
    human.go()
}