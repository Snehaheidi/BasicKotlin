import java.util.*

fun main(){
    val i = InvertNumberPattern()
    i.findPattern()
}
class InvertNumberPattern {
    val input = Scanner(System.`in`)
    fun findPattern(){
        val n:Int = input.nextInt()
        for(row in n downTo 1){
            for(space in n downTo row){
                print(" ")
            }
            for(column in 1..row){
//                print("$row ")
                print("$column ")
            }
            println()
        }
    }
}
//OUTPUT:
/*
5    ROW
 5 5 5 5 5
  4 4 4 4
   3 3 3
    2 2
     1
-------------------------------------------
5   COLUMN
 1 2 3 4 5
  1 2 3 4
   1 2 3
    1 2
     1
 */