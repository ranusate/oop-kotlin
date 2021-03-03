package data

interface Interaction {
    val name: String
    fun hi(name: String)
}
interface Go{
    fun go(){
        println("Goo!")
    }
}

class Human(override val name: String) : Interaction,Go {
    override fun hi(name: String) {
        println("hi $name my name is ${this.name}")
    }

}