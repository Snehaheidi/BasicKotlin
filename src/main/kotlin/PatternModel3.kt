import java.util.*

fun main(){
    val input = Scanner(System.`in`)
    val n:Int = input.nextInt()
    val p = PatternModel3()
    p.findPattern(n)
}
class PatternModel3 {
    fun findPattern(n:Int){
        var number = 1
        for (row in 1..n){
            for (column in 1..row){
                print("$number ")
                number++
            }
            println()
        }
    }
}
//OUTPUT:
/*
5
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */