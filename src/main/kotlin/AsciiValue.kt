import java.util.*

fun main(){
    val a = AsciiValue()
    a.ascii()
}
class AsciiValue {
    val input = Scanner(System.`in`)
    fun ascii(){
        val c:Char = input.next().single()
        val ascii:Int = c.code //convert to int to char
        println("$c Ascii Value is $ascii")
    }
}
//OUTPUT:
/*
a
a Ascii Value is 97
 */