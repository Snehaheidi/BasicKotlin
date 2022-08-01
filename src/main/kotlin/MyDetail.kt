fun main(args : Array<String>)
{
    var detail = MyDetail()
    detail.details()
}
//Data Types --> All are Object
class MyDetail
{
    fun details()
    {
        var name: String = "sneha"
        var age: Int = 21
        var percentage : Float = 80.0f
        var salary: Double = 15000.0
        var gender:Char = 'F'
        var available : Boolean = true
        println("Name : $name")
        println("Age  : $age")
        println("Gender : $gender")
        println("Percentage : $percentage")
        println("Salary : $salary")
        println("Availability : $available")
    }
}
//OUTPUT:
/*
Name : sneha
Age  : 21
Gender : F
Percentage : 80.0
Salary : 15000.0
Availability : true
 */