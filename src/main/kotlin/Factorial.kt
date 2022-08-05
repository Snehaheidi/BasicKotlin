import java.util.*

fun main(){
    val f = Factorial()
    f.findFact()
}
class Factorial {
    private val input = Scanner(System.`in`)
    var result = 1
    fun findFact(){
        var number = input.nextInt()
        for(i in 1..number){
            result *= i
        }
        println("The Factorial of $number is $result")
    }
}
//OUTPUT:
/*
10
The Factorial of 10 is 3628800
 */