
fun main() {
    val i = Interpolation()
    i.length = 10.2f
    i.breath = 2.2f
    println("The Area of the Rectangle ${i.length} and ${i.breath} is ${i.length * i.breath}")
}
//Interpolation --> ${}
class Interpolation {
        var length :Float = 0.0f
        var breath:Float= 0.0F
}
//OUTPUT :
/*
   The Area of the Rectangle 10.2 and 2.2 is 22.44
 */