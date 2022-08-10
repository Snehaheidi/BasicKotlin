import java.util.*

fun main(){
    val m = PatternModel1()
    m.findPattern()
}
class PatternModel1 {
    val input = Scanner(System.`in`)
    fun findPattern(){
        val n:Int = input.nextInt()
        for(row in 1..n){
            for(space in n downTo row){
                print(" ")
            }
            for(column in 1..row){
                print("*")
            }
            println()
        }
        println("-------------------------------------")
        for(row in 1..n){
            for(space in n downTo row){
                print(" ")
            }
            for(column in 1..row){
                print("$row")
            }
            println()
        }
        println("--------------------------------------")
        for(row in 1..n){
            for(space in n downTo row){
                print(" ")
            }
            for(column in 1..row){
                print("$column")
            }
            println()
        }
    }
}
//OUTPUT:
/*
i/p : 5
     *
    **
   ***
  ****
 *****
-------------------------------------
     1
    22
   333
  4444
 55555
--------------------------------------
     1
    12
   123
  1234
 12345

 */