import java.util.*

fun main(){
   val p = PrimeNot()
   p.findPrime()
}

class PrimeNot {
   private val input = Scanner(System.`in`)
   var flag:Boolean = false
   fun findPrime(){
      var number = input.nextInt()
      for(i in 2..number/2){
         if(number%i==0){
            flag = true
            break;
         }
      }
      if(flag){
         println("$number isn't a Prime Number")
      }
      else{
         println("$number is Prime Number")
      }
   }
}
//OUTPUT:
/*
11
11 is Prime Number
 */