fun main(args: Array<String>){
    val words = arrayOf("cpp","python","kotlin","angular","c","java")
    val l = Lexicographical()
    l.findOrder(words)
}
class Lexicographical {
    fun findOrder(words:Array<String>){
        val n = words.size
        for (i in 0 until n-1){
            for (j in i+1 until n){
                if(words[i] > words[j]){
                    val temp = words[i]
                    words[i] = words[j]
                    words[j] =temp
                }
            }
        }
        println("The Lexicographical Order :")
        for (i in 0 until n-1){
            println(words[i]+" ")
        }
    }
}
//OUTPUT:
/*
The Lexicographical Order :

angular
c
cpp
java
kotlin

 */