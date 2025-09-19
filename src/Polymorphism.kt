import javax.print.attribute.standard.Sides
fun main (){
val circle : Shape = Shape.Circle(9.0) //parent can hold a reference to its child
    val square : Shape = Shape.Square(4.0)

    println(circle.area()) //parent can call method of child classes
    println(square.area())
}

open class Shape () {
    open fun area () : Double {
        return 0.00
    }
    class Circle (val radius : Double) : Shape() {
        override fun area () : Double {
            return Math.PI * radius * radius
        }

    }
    class Square (val side: Double) : Shape (){
        override fun area () : Double {
            return side * side
        }
    }
}