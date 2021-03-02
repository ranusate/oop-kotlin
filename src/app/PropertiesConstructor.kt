package app

import data.User

fun main() {
    val user1 = User("Admin", "secret")
    user1.usernme = "budi"
    println(user1.usernme)
    println(user1.password)
}