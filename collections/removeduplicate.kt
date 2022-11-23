package collections

fun main(){
    var num1:MutableList<Int> = mutableListOf<Int>(1,2,3,1,2)
    println(num1)

    var numswithoutduplicate:Set<Int> = num1.toSet()
    println(numswithoutduplicate)

}