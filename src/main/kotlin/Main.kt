fun main() {
    //Sting value
    val  str :String = "sneha" //Declare the data types is optional
    println("The name is $str")
    //declare the value in val type --> this doesn't change the value
/*   str = "heidi" --> Throw the error msg change to var
    println("The name is $str")*/

    val a = 50
    val b = 10.0

    //Addition
    println("________________________________")
    println("The Addition ${5+10}")
    println("The Addition ${a+b}")

    //Subtraction
    println("________________________________")
    println("The Subtraction ${20-10}")
    println("The subtraction ${a-b}")

    //Multiplication
    println("________________________________")
    println("The Multiplication ${20*10}")
    println("The multiplication ${a*b}")

    //Division
    println("________________________________")
    println("The Division ${100/5}")
    println("The division ${a/b}")
}

//OUTPUT
/*
The name is sneha
________________________________
The Addition 15
The Addition 60.0
________________________________
The Subtraction 10
The subtraction 40.0
________________________________
The Multiplication 200
The multiplication 500.0
________________________________
The Division 20
The division 5.0

 */