import java.util.*

fun main(){
    val v = VowelConst()
    v.findVowel()
}
class VowelConst {
    private val input = Scanner(System.`in`)
    fun findVowel(){
        val c:Char = input.next().single()
        if(c =='a' || c=='e'|| c=='i' || c=='o' || c=='u' || c =='A' || c=='E'|| c=='I' || c=='O' || c=='U'){
            println("$c is Vowel")
        }
        else{
            println("$c is Constant")
        }
    }
}
//OUTPUT:
/*
x
x is Constant

U
U is vowel
 */