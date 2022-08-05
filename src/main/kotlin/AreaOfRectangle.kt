import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)
    val rect = AreaOfRectangle()
    var l:Int = input.nextInt()
    var w:Int = input.nextInt()
    rect.findArea(l,w)
}
class AreaOfRectangle {
    fun findArea(l: Int,w:Int){
        val result = l * w
        println("The area of rectangle : $result")
    }
}
//OUTPUT:
/*
10
5
The area of rectangle : 50
 */