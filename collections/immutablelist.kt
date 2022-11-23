package collections

fun main(){


    var marks :List<Int> =listOf<Int>(10,20,30,45)
    println(marks)

    for (mark:Int in marks)
        print(mark)

    println()
    println("size ${marks.size}")
    println(marks[0])
    println("first element ${marks.first()}")
    println("last element ${marks.last()}")


}