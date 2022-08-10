fun main(){
    var str = " hi hello    everyone .... !!"
    println("Original String : $str")
    str = str.replace("\\s".toRegex(),"")
    println("After remove WhiteSpace : $str")
    str = str.replace("h".toRegex(),"H")
    println("$str")
}
//OUTPUT
/*
Original String :  hi hello    everyone .... !!
After remove WhiteSpace : hihelloeveryone....!!
HiHelloeveryone....!!
 */