package data

/**
 * Class and Constructor
 */
class Car(brandParam: String, yearParam: Int = 0) {
    var brand: String = brandParam
    var year: Int = yearParam

    /**
     * otomatis dipanggil jika constructor dijalankan
     */

    init {
        println("Ini function initializer block")
        println("Car $brandParam dibuat")
    }

    fun sayHello(name: String) {
        println("Hello $name, my name is $brand")
    }

    fun run() {
        println("Im Run")
    }
}