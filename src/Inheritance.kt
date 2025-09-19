fun main (){
    val objChild = Child()
    objChild.myMethod()
    objChild.myMethod2()

}

open class Parent {
    val name : String = "Muhammad Yousaf"
    fun myMethod(){
        println("$name I am Parent")
    }

}

class Child : Parent(){
    val name2 : String = "Aamer Shahzad"
    fun myMethod2 (){
        println("$name2 I am child")
    }
}