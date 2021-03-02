package data

import java.util.*

class Student(paramFirstName: String, private val name: String = "Joni") {
    private var firstName: String = paramFirstName
    var middleName: String = ""
    var lastName: String = ""


    /**
     * method overloading
     */
    fun sayHello(name: String) {
        println("Hello $name, my name is ${this.firstName}")

    }

    /**
     * method overloading
     */
    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName, my name is ${this.name}")

    }

}