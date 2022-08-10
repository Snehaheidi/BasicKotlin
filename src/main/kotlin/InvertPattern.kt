import java.util.*

fun main(){
    val input = Scanner(System.`in`)
    val n:Int = input.nextInt()
    for(row in n downTo 1){
        for(space in n downTo row){
            print(" ")
        }
        for (column in 1..row){
            print("* ")
        }
        println()
    }
}
//
/*
5
 * * * * *
  * * * *
   * * *
    * *
     *
 */