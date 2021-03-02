package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Ranus")
    manager.hi("Ken")
    manager.syHi("Jo")

    val vicePresident = VicePresident("Raba Ate")
    vicePresident.hi("Ran")
}