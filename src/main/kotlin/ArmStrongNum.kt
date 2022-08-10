import java.util.*
import kotlin.math.pow

fun main(){
    val a = ArmStrongNum()
    a.findNumber()
}
class ArmStrongNum {
    val input = Scanner(System.`in`)
    fun findNumber(){
//      println("Enter the number of Digit in our number: ")
//      val digit:Int = input.nextInt()
        println("Enter the three-digit number : ")
        val number:Int =input.nextInt()
        var n = number
        var result = 0
        while(n!=0){
            var rem = n %10
            result += rem * rem * rem
            n /= 10
        }
        if (number==result){
            println("The number $number is ArmStrong Number ")
        }
        else{
            println("Not ArmStrong Number")
        }
    }
}
//OUTPUT:
/*
Enter the three-digit number :
153
The number 153 is AramStrong Number
 */