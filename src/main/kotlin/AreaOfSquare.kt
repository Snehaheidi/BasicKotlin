fun main(){
    val area = AreaOfSquare()
    var a : Int = 10
    area.areaSquare(a)
}
class AreaOfSquare{
    fun areaSquare(a: Int) {
        var result:Int = a * a
        println("The Area of Square : $result")
    }
}

//OUTPUT:
/*
 The Area of Square : 100
 */