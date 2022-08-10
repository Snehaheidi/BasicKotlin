import java.util.Scanner

fun main(){
    val i = SimpleCalculator()
    i.calculator()
}

class SimpleCalculator {
    val input = Scanner(System.`in`)
   fun calculator(){
       println("Enter the 1st number : ")
       val num1 = input.nextDouble()
       println("Enter any one Operator : '+' , '-' , '*' , '/' , '%' ")
       val op = input.next().single()
       println("Enter the 2nd Number : ")
       val num2 = input.nextDouble()
       var result = 0.0
       when(op){
           '+' -> result = num1 + num2
           '-' -> result = num1 - num2
           '*' -> result = num1 * num2
           '/' -> {
               try {
                   result = num1 / num2
               }
               catch (e:ArithmeticException){
                   println("$num2 is Zero ")
               }
           }
           '%' -> result = num1 % num2
           else -> println("Enter the valid Operator :-( ")
       }
       println("The Result is : $result")
   }
}
//OUTPUT:
/*
Enter the 1st number :
10
Enter any one Operator : '+' , '-' , '*' , '/' , '%'
/
Enter the 2nd Number :
0
The Result is : Infinity
-------------------------------------------------------
Enter the 1st number :
10
Enter any one Operator : '+' , '-' , '*' , '/' , '%'
*
Enter the 2nd Number :
5
The Result is : 50.0

 */