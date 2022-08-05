import java.util.Scanner

fun main(){
    val f = Factor()
    f.findFactor()
}
class Factor {
    val input = Scanner(System.`in`)
    fun findFactor(){
        val number = input.nextInt()
        for (i in 1..number){
            if(number%i==0){
                print("$i  ")
            }
        }
    }
}
//OUTPUT:
/*
10
1  2  5  10
 */