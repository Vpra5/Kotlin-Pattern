package Exception
import java.lang.Exception
import java.util.Scanner
fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)

    try {
        print("Enter first number :")
        var num1 =sc.nextInt()
        print("Enter Second number :")
        var num2 =sc.nextInt()
        var div = num1/num2
        println("Divison of $num1 & $num2 is : $div")
    }
    catch (e:ArithmeticException){
        println("Number should be greater than 1")
    }
    catch (e:Exception){
        println("only numbers are accepted")
    }

}

