import java.util.Scanner

fun main()
{
    val input = Scanner(System.`in`)
    println("Enter the number ")
    var number:Int =input.nextInt()
    if(number%2==0)
        println("The given number $number is Even")
    else
        println("The given number $number is Odd")
}