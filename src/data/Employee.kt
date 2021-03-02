package data

open class Employee(val name: String) {
    fun hi(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

    open fun syHi(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

open class Manager(name: String) : Employee(name) {
    final override fun syHi(name: String) {
        println("Hello $name, my name is manager ${this.name}")

    }
}

/**
 * error
 */
//class SuperManager(name: String) : Manager(name) {
//    override fun syHi(name: String) {
//        println("Hello $name, my name is super manager ${this.name}")
//
//    }
//
//}

class VicePresident(name: String) : Employee(name)