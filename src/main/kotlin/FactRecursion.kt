import java.util.*

fun main(){
    val f = FactRecursion()
    f.recursion()
}
class FactRecursion {
    val input = Scanner(System.`in`)
    fun recursion(){
        val number = input.nextInt()
        val result = findResult(number)
        println("The Factorial of $number is $result")
    }
    private fun findResult(n:Int) :Int {
        var sum = 0
        if(n>=1){
            sum = n * findResult(n - 1)
            return sum
        }
        return 1
    }
}
//OUTPUT:
/*
5
The Factorial of 5 is 120
 */