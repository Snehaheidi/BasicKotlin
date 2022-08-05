import java.util.Scanner

fun main(){
    val d = TypeCasting()
    d.intData()
    d.floatInt()
    d.shortByte()
}

class TypeCasting {
   private val input = Scanner(System.`in`)
    fun intData() {
        println("Integer to Character")
        val i:Int = input.nextInt()
        val c : Char = i.toChar() //Number to Char
        println("$i number is convert to Character $c")
    }
    fun floatInt() {
        println("Float to Integer")
        val f:Float = input.nextFloat()
        val a:Int = f.toInt() // value convert float to integer
        println("$f number is convert to Integer $a")
    }
    fun shortByte(){
        println("Short to Byte")
        val s:Short = input.nextShort()
        val b:Byte = s.toByte() // number is convert -> Short to byte
        println("$s number is convert to Byte $b")
    }
}
//OUTPUT:
/*
Integer to Character
97
97 number is convert to Character a
-----------------------------------------
Float to Integer
12.5
12.5 number is convert to Integer 12
-----------------------------------------
Short to Byte
32536
32536 number is convert to Byte 24
 */