package collections

class Employee(id:Int,name:String,dept:String,salary:Int,age:Int)
{
    var id:Int=id
    var name:String=name
    var dept:String=dept
    var salary:Int=salary
    var age:Int=age
}

fun main(){

    var employ: MutableList<Employee> = mutableListOf<Employee>()
    employ.add(Employee(1,"prathyu","hr",30000,21))
    employ.add(Employee(2,"usha","marketing",25000,22))
    employ.add(Employee(3,"geetha","hr",2400,23))

    for(employee:Employee in employ)
        println("${employee.id}  ${employee.name}  ${employee.dept}  ${employee.salary}  ${employee.age}")
}