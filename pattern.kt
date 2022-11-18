//pattern 1
fun main() {
    val rows = 3
    for (i in 1..rows) {
        for (j in 1..i) {
            print("$j")

        }
        println()

    }
}

//pattern 2
/*fun main(args: Array<String>) {
    val rows = 3

    for (i in 1..rows) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}*/

//pattern 3

/*fun main() {
    val rows = 3
    for (i in 1..rows) {
        for (j in 1..i) {
            print("$i")

        }
        println()

    }
}*/

//pattern 4
/*fun main(){
    val last='C'
    var alphabet='A'
    for(i in 1..last - 'A' + 1)
    {
        for(j in 1..i){
            print("$alphabet")
        }
        ++alphabet
        println()
    }
}*/

//pattern 5
/*fun main(){
    var len = 5
    var breadth = 5
    for (i in 1.. len){

        for(j in 1.. breadth){

            if(i == 1 || i == len || j == 1 || j== breadth)
                print("*")
            else
                print(" ")
        }
        println()
    }
}*/





