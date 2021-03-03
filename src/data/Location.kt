package data

abstract class Location(name: String)
class City(name: String) : Location(name)
class Country(name: String) : Location(name)