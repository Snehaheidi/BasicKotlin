import java.util.*

fun main(){
    val input = Scanner(System.`in`)
    var firstNum : Int = 0
    var secondNum : Int = 1
    var result :Int
    println("Enter the Range of Series")
    var range : Int = input.nextInt()
    println(firstNum)
    println(secondNum)
    for (i in 1..range-2){
        result = firstNum + secondNum
        println(result)
        firstNum = secondNum
        secondNum = result
    }
    input.close()
}