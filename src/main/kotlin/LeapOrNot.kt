import java.util.*

fun main(){
 val l = LeapOrNot()
    l.leap()
}
class LeapOrNot {
   private val input = Scanner(System.`in`)
    fun leap(){
        val year = input.nextInt()
        if((year%4==0) &&(year%100!=0) || (year%400==0)){
            println("$year is Leap Year")
        }
        else{
            println("$year is not Leap Year")
        }
    }
}
//OUTPUT:
/*
2004
2004 is Leap Year
 */