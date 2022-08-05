fun main()
{
    println("For Loop")
    println("Even Number")
    //For Loop
    for(i in 1..10) {
        if(i%2==0)
            println(i)
    }
    println("Reverse Order ")
    for(i in 10 downTo 1) {
        if(i%2==0)
            println(i)
    }
    println("-------------------------")
    for (i in 10 until 20 step 2) {
        println(i)
    }
     println()
    //While Loop
    println("While Loop")
    var i = 0
    while(i<=10) {
        if(i%2==0)
            println(i)
        i++
    }

    //Do..While Loop
    println("Do..While Loop")
    var j = 0
    do {
       if(j%2==0)
           println(j)
       j++
    }
    while (j<=10)
    println("Break Statement")
    //single for loop --> break statement
    for (s in 1..5)
    {
        println(s)
        if(s==3)
            break
    }
   println("----------------------------------")
   //more than for loop --> Break Statement
   breakLoop@ for(i in 1..3) {
        for(j in 1..3) {
            println("$i $j")
            if(i==2 && j==2)
                break@breakLoop
        }
    }
    println("Continue Statement")
    //single for loop --> continue statement
    for (s in 1..5)
    {
        if(s==3)
            continue
        println(s)
    }
    println("----------------------------------")
    //more than for loop --> Continue Statement
    breakLoop@ for(i in 1..3) {
        for(j in 1..3) {
            if((i==2 && j==2) || (i==3 && j==3))
                continue@breakLoop
            println("$i $j")
        }
    }
}
//OUTPUT:
/*
For Loop
Even Number
2
4
6
8
10
Reverse Order
10
8
6
4
2
-------------------------
10
12
14
16
18

While Loop
0
2
4
6
8
10
Do..While Loop
0
2
4
6
8
10
Break Statement
1
2
3
----------------------------------
1 1
1 2
1 3
2 1
2 2
Continue Statement
1
2
4
5
----------------------------------
1 1
1 2
1 3
2 1
3 1
3 2

 */