package data

class Television {
    lateinit var name: String

    fun initTelevision(name:String) {
        this.name = name
        println(this.name)
    }
}