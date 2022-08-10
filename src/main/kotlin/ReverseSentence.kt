import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val sentence = input.nextLine()
    val reverseWord = reverse(sentence)
    println("Given String is Reversed : $reverseWord")
}
    fun reverse(sentence:String): String {
        if (sentence.isEmpty())
            return sentence

        return reverse(sentence.substring(1)) + sentence[0]
    }
//OUTPUT
/*
hi hello
Given String is Reversed :  olleh ih
 */