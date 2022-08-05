import java.util.*

fun main(){
   val s = Swapping()
    s.swap()
}
class Swapping {
    val input = Scanner(System.`in`)
    fun swap(){
        println("Enter the A Value:")
        var a:Int = input.nextInt()
        println("Enter the B Value :")
        var b:Int = input.nextInt()
        b += a
        a = b - a
        b -= a
        println("Now A value is $a")
        println("Now B value is $b")
    }
}

/*
 5 + 10 = 15   a + b = b
 15 - 5 = 10   b - a = a
 15 - 10 = 5   b - a = b
---------------------------------------
OUTPUT:
Enter the A Value :
5
Enter the B Value :
10
Now A value is 10
Now B value is 5
 */