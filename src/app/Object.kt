package app

import data.Person

fun main() {
    /**
     * membuat object Person
     */
    val objectPerson = Person("Ranus", "Raba", "Ate")
    val joko = Person("Joko")
    println(joko.firstName)
    print(objectPerson.firstName)
}