package app

import data.Action

fun action(action : Action){
    action.action()
}
class SampleAction:Action{
    override fun action() {
        println("This is sample action")
    }
}
fun main() {

    action(SampleAction())
}