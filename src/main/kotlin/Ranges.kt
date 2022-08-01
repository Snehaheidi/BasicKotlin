fun main()
{
    //Ranges

    val value = 1..5  // .. (double dot) represent the range 1 to 5 numbers (1,2,3,4,5)
    println("The Ranges in value $value")

    val v = 5 downTo 1 // downTo is range --> decrease the value one by one (5,4,3,2,1)
    println("The Range is $v")

    val value1 = 10 downTo 1 step 2 // Range decrease step by step (10,8,6,4,2)
    println("$value1")

    var v1 = 'a'..'z' // Range is (a,b,c,d,e,f,g,h,.....x,y,z)
    println(" Range $v1")

    var isPresent = 's' in v1   // given char isPresent in v1 --> use the keyword ->(in) ..true or false
    println("The value $isPresent")

    var countDown = 10.downTo(1)  // consider the value is --> 10 to 1
    println("This Range $countDown")
}