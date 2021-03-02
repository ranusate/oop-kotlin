package data

class Address {

    /**
     * Properties
     */
    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    /**
     * Constructor tanpa primary constructor
     */
    constructor(paramStreet: String, paramCity: String) {
        println("Constructor")
        street = paramStreet
        city = paramCity
    }

    constructor(paramStreet: String, paramCity: String, paramCountry: String) :
            this(paramStreet, "") {
        country = paramCountry
    }
}