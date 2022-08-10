import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)
    val n:Int = input.nextInt()
    for (row in n downTo 1){
        for (space in n downTo row){
            print(" ")
        }
        for (column in 1..row){
            print("$column ")
        }
        println()
    }
    println("--------------------------------------")
    for (row in n downTo 1) {
        for (space in n downTo row) {
            print(" ")
        }
        for(column in row downTo 1){
            print("$column ")
        }
        println()
    }
    println("--------------------------------------")
    for (row in n downTo 1) {
        for (space in n downTo row) {
            print(" ")
        }
        for (column in 1..row) {
            print("$row ")
        }
        println()
    }
}
//OUTPUT:
/*
5
 1 2 3 4 5
  1 2 3 4
   1 2 3
    1 2
     1
--------------------------------------
 5 4 3 2 1
  4 3 2 1
   3 2 1
    2 1
     1
--------------------------------------
 5 5 5 5 5
  4 4 4 4
   3 3 3
    2 2
     1
 */