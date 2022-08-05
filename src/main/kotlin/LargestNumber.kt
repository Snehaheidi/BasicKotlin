fun main(){
    val l = LargestNumber()
    l.largeValue(100,50,250)
}
class LargestNumber {
    fun largeValue(a:Int,b:Int,c:Int){
        if(a>b && a>c){
            println("The Number $a is the Largest Value")
        }
        else if(b>a && b>c){
            println("The number $b is the Largest Value")
        }
        else{
            println("The number $c is the Largest value")
        }
    }
}
//OUTPUT:
/*
The number 250 is the Largest value
 */