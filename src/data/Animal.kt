package data

abstract class Animal {
    abstract val name: String
    abstract fun run(): Unit
}

class Cat : Animal() {
    override val name: String
        get() = "Ranus"

    override fun run() {
        println("Cat run")
    }
}

class Dog : Animal() {
    override val name = "Ranus"

    override fun run() {
        println("Dog is running")
    }
}