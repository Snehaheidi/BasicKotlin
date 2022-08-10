import java.util.*

fun main(){
    val input = Scanner(System.`in`)
    val n = input.nextInt()
    var j = 1
    var space = 1
    for(i in 1..n){
        for (space in space..n-i){
            print(" ")
        }
        for (j in j..i){
            print("* ")
        }
        println()
    }
}
//OUTPUT:
/*
5
    *
   * *
  * * *
 * * * *
* * * * *
 */