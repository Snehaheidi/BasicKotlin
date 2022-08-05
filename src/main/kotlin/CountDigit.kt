import java.util.Scanner

fun main(){
    val c = CountDigit()
    c.findDigit()
}
class CountDigit {
    fun findDigit(){
        val input = Scanner(System.`in`)
        var number:Int = input.nextInt()
        var count = 0
        while(number!=0){
            number /=10
            count++
        }
        println("Number of digit in given number is $count")
    }
}
//OUTPUT:
/*
10823821
Number of digit in given number is 8
 */