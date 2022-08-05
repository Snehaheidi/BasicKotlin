import java.util.Scanner

fun main(){
    val i = ArmStrongInter()
    i.findResult()
}
class ArmStrongInter {
    val input = Scanner(System.`in`)
    fun findResult(){
        var startValue = input.nextInt()
        var endValue = input.nextInt()
        println("$startValue to $endValue ArmStrong Value :")
        for (startValue in startValue..endValue){
            var n = startValue
            var result = 0
            while(n!=0){
                var rem = n %10
                result += rem * rem * rem
                n /= 10
            }
            if(startValue==result){
                println(startValue)
            }
        }
    }
}
//OUTPUT:
/*
100
500
----------------------------------------
100 to 500 ArmStrong Value :
153
370
371
407
 */