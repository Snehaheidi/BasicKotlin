fun main()
{
    //val name ="sneha"          //like member variable declaration
    val create = CreateClass()   //create a object in class --> no use the "new" keyword
    create.display()
    create.name ="heidi"
    println("Name is ${create.name}")
    create.display()
}
class CreateClass{
    var name ="sneha"
    fun display() {
        println("The name is $name")
    }
}
//OUTPUT
/*
// object use --> name called the name is change
Name is heidi
The name is heidi

//1st the class fun called --> the value doesn't change
The name is sneha
Name is heidi
The name is heidi
 */