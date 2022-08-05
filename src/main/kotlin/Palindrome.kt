import java.util.Scanner

//Number Palindrome
fun main(){
    val palin = Palindrome()
    palin.findPalindrome()
}
class Palindrome {
    fun findPalindrome() {
        val input = Scanner(System.`in`)
        var originalNum: Int = input.nextInt()
        var number = originalNum
        var result :Int = 0
        while (number!=0){
            var rem = number % 10
            result = result * 10 + rem
            number/=10
        }
        if(originalNum==result){
            println("The given number $originalNum is Palindrome ")
        }
        else{
            println("The given number $originalNum is Not Palindrome")
        }
    }
}
//OUTPUT:
/*
121
The given number 121 is Palindrome

34231
The given number 34231 is Not Palindrome
 */