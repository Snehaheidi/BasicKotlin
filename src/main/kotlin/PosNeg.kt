import java.util.Scanner

fun main(){
    val p = PosNeg()
    p.findValue()
}
class PosNeg {
    private val input = Scanner(System.`in`)
    fun findValue(){
        var number = input.nextInt()
        if(number>=0){
            println("The given number is Positive")
        }
        else{
            println("The given number is negative")
        }
    }
}
//OUTPUT:
/*
100
The given number is Positive
 */