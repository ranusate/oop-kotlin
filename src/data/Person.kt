package data

class Person(firstNameParam: String, middleNameParam: String, lastNameParam: String) {
    var firstName: String = firstNameParam
    var middleName: String = middleNameParam
    var lastName: String = lastNameParam

    /**
     * Secondary Constructor
     */
    constructor(firstNameParam: String, lastNameParam: String) :
            this(firstNameParam, "", lastNameParam) {
        println("Constructor Secondary")
    }

    /**
     * Secondary constructor
     */
    constructor(firstNameParam: String) :
            this(firstNameParam, "") {
        println("Secondary constructor 2")
    }

}
