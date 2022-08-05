fun main()
{
    val a = 10
    val b = 20

//    if(a>b)
//       println("A value $a is greater than B ")
//    else
//        println("B value $b is greater than A")
    var maxvalue : Int = if(a>b)
        a
    else
        b
    println("The Max value is $maxvalue")

    //WHEN Conditional Statement
    //Like Switch Case
//    when(a){
//        10 -> println("a is 10")
//        20 -> println("a is 20")
//        else ->{
//                 println("none")
//                 println("Check the a value")
//            }
//    }

    var str:String =when(a){
                       in 1..10 -> "a is 10"
                        20 -> "a is 20"
                        else -> {
                            "none"
//                            println("...........")   throw error msg
                        }
    }
    println(str)
}
//OUTPUT:
/*
The Max value is 20
a is 10
 */