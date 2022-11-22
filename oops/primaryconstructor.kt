fun main(args: Array<String>) {

    var employee=Employee(2,"sachin")
    employee.displayEmployeeInfo()
}


class Employee(id:Int=1,name:String="",dept:String="bench")
{
    var id:Int=id
    var name:String=name
    var dept:String=dept

    fun displayEmployeeInfo()
    {
        println("$id $name $dept")
    }
}