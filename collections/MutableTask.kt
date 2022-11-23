package collections

fun main() {
    var javabatch= mutableListOf<String>("anil","gopal","ankit","manish")
    var kotlinbatch= mutableListOf<String>("ankit","kumar","manish","rahul")

    //combining as one batch
    javabatch.addAll(kotlinbatch)
    println("After combining $javabatch")


    //removing  duplicate
    javabatch.removeAll(kotlinbatch)
    println("After removing duplicate $kotlinbatch")


    //sort data in ascending order
    javabatch.sort()
    kotlinbatch.sort()
    println("Java Batch after sorting: $javabatch")
    println("Kotlin Batch after sorting: $kotlinbatch")

}