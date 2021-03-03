package app

import data.Note

fun main() {
    val note = Note("oop-kotlin")
    println(note.title)
    note.title = ""
    println(note.title)

}