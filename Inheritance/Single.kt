package Inheritance


open class Bird {
    fun fly() {
        println("Birds are flying in sky")
    }
}
class Duck: Bird() {
    fun swim() {
        println("ducks are swimming")
    }
}
fun main(args: Array<String>) {
    val duck = Duck()
    duck.fly()
    duck.swim()
}