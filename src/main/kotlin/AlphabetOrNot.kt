import java.util.*

fun main(){
    val input = Scanner(System.`in`)
    println("Enter the Character : ")
    var c:Char = input.next().single()
    if((c in 'a'..'z') || (c in 'A'..'Z')){
        println("Is Alphabet")
    }
    else{
        println("Is not Alphabet")
    }
}

//OUTPUT:
/*
Enter the Character :
a
Is Alphabet

Enter the Character :
2
Is not Alphabet
 */