import java.util.Scanner

// 1 miles is equal to 1.609344 kilometer
// 1 kilometer is equal to 0.621371 miles
fun main(){
    val convert = Conversion()
    convert.convertKm()
}
class Conversion{
    private val input = Scanner(System.`in`)
    private val one = 1.609344;
    fun convertKm(){
        println("Enter the Miles : ")
        var miles:Int = input.nextInt()
        var result:Double = miles * one
        println("Miles to Kilometer : $result")
    }
}
//OUTPUT:
/*
Enter the Miles :
12
Miles to Kilometer : 19.312128
*/