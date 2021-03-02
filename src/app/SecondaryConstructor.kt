package app

import data.Address

fun main() {
    val address1 = Address("jl Beteng", "Kalasan")
    val address2 = Address("jl Beteng", "Kalasan", "Indonesia")

    println(address1.street)
    println(address2.street)
    println(address2.country)
}