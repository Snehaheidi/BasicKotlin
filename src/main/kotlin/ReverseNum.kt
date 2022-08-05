import java.util.Scanner

fun main(){
    val r = ReverseNum()
    r.reverse()
}
class ReverseNum {
    val input = Scanner(System.`in`)
    fun reverse(){
        val number = input.nextInt()
        var n = number
        var result = 0
        while(n!=0){
            var rem = n%10
            result = result*10 + rem
            n/=10
        }
        println("The given number is Reversed : $result")
    }
}
//OUTPUT:
/*
1235
The given number is Reversed : 5321

987654321
The given number is Reversed : 123456789
 */