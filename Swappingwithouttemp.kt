fun main()
{
    var first = 24.9f
    var second = 124.7f

    println("Before swapping")
    println("First number = $first")
    println("Second number = $second")

    //logic
    first = first - second
    second = first + second
    first = second - first

    println("After swapping")
    println("First number = $first")
    println("Second number = $second")
}
