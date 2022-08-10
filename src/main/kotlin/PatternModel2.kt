import java.util.*

fun main(){
    val input = Scanner(System.`in`)
    val n:Int = input.nextInt()
    val p = PatternModel2()
    p.findPattern(n)
}
class PatternModel2 {
    fun findPattern(n:Int){
        var result = 1
        for(row in 0..n){
            for (space in 1..n-row){
                print(" ")
            }
            for (column in 0..row){
                result = if(column == 0 || row == 0)
                    1
                else
                    result * (row - column + 1) / column
               print("$result ")
            }
            println()
        }
    }
}
//OUTPUT:
/*
6
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
 1 5 10 10 5 1
1 6 15 20 15 6 1
 */