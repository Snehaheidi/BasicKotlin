import java.util.*

fun main(){
    val input = Scanner(System.`in`)
    val n:Int = input.nextInt()
    for(row in 1..n){
        for(column in 1..row){
//          print("$row ")
            print("$column ")
        }
        println()
    }
}
//OUTPUT:
/*
 5 (ROW)
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5
---------------------------
 5  (COLUMN)
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5

 */