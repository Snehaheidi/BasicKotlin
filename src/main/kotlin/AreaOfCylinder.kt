import java.util.Scanner
//Area of Cylinder --> 2*pi*rh + 2*pi*r2
fun main(){
    val a = AreaOfCylinder()
    a.findArea()
}
class AreaOfCylinder{
    val input = Scanner(System.`in`)
    fun findArea(){
        var r = input.nextInt()
        var h = input.nextInt()
        val result = 2*Math.PI*(r*h) + 2*Math.PI*(r*r)
        println("Area of Cylinder $result")
    }
}
//OUTPUT:
/*

5
5
Area of Cylinder 314.1592653589793

 */