import java.util.*

fun main(){
    val m = MultiplicationTable()
    m.table()
}
class MultiplicationTable {
    private val input = Scanner(System.`in`)
    fun table(){
        val number = input.nextInt()
        for(i in 1..10){
            var result = number * i
            println("$i * $number = $result")
        }
    }
}
//OUTPUT:
/*
5
1 * 5 = 5
2 * 5 = 10
3 * 5 = 15
4 * 5 = 20
5 * 5 = 25
6 * 5 = 30
7 * 5 = 35
8 * 5 = 40
9 * 5 = 45
10 * 5 = 50
 */