import java.util.Scanner

fun main(){
    val q = QuotientRemin()
    q.result()
}
class QuotientRemin {
    val input = Scanner(System.`in`)
    fun result(){
        println("Dividend")
        val a:Float = input.nextFloat()
        println("Divisor")
        val b:Float = input.nextFloat()
        findResult(a,b)
    }
    fun findResult(a: Float, b:Float){
        val q = a / b
        val r = a % b
        println("Quotient $q")
        println("Reminder $r")
    }
}
//OUTPUT:
/*
Dividend
10
Divisor
5
Quotient 2.0
Reminder 0.0
 */