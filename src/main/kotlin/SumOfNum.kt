import java.util.*

fun main(){
    val input = Scanner(System.`in`)
    val s = SumOfNum()
    val number:Int = input.nextInt()
    var result = s.findSum(number)
    println("The Sum Of $number is $result")
}
class SumOfNum {
    fun findSum(n:Int): Int {
        var sum = 0
        for(i in 1..n){
            sum += i
        }
        //sum = n*(n+1)/2
         return sum
    }
}
//OUTPUT:
/*
10
The Sum Of 10 is 55
 */