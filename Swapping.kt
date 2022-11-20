fun main()
{
    var first = 2.34f
    var second = 5.67f

    println("Before swapping")
    println("First number = $first")
    println("Second number = $second")


    val temp = first


    first = second

    // Value of temp
    second = temp

    println("After swapping")
    println("First number = $first")
    println("Second number = $second")
}

//

