package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Ranus")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Raba Ate", 1_000_000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}