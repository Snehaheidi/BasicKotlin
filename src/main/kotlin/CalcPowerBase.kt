fun main(){
    val base = 5
    val power = 3
    val result = findPower(base,power)
    println("$base ^ $power = $result")
}
fun findPower(b:Int, p: Int): Int {
    if (p!=0)
         return b * findPower(b , p-1)
    return 1
}

//OUTPUT:
/*
   5 ^ 3 = 125
 */