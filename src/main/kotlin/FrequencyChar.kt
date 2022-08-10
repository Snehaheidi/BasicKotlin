import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)
    val str = input.nextLine()
    val ch = input.next().single()
    var count = 0
    val n = str.length
    for (i in 0 until n){
        if(ch==str[i]){
            count++
        }
    }
    println("Frequency of $ch : $count")
}
//OUTPUT:
/*
  hi hello everyone
  e
  Frequency of e : 4
 */