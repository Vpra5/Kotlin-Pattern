package Inheritance

open class Employee(name: String, age: Int, salary: Float) {
    init {
        println("Name is $name.")
        println("Age is $age")
        println("Salary is $salary")
    }
}
class Programmer(name: String, age: Int, salary: Float):Employee(name,age,salary){
    fun doProgram() {
        println("Kotlin Programming is similar to java")
    }
}
class Salesman(name: String, age: Int, salary: Float):Employee(name,age,salary){
    fun fieldWork() {
        println("I love to hangout with my friends")
    }
}
fun main(args: Array<String>){
    val obj1 = Programmer("prathyu", 21, 1000f)
    obj1.doProgram()
    val obj2 = Salesman("usha", 16, 30000f)
    obj2.fieldWork()
}