fun main() {
    println(addition(a = 2, b = 3))         // calls Int version -> 5
    println(addition(b = 2.3, a = 3.5))     // calls Double version -> 5.8
}

fun addition(a: Int, b: Int): Int = a + b

fun addition(a: Double, b: Double): Double = a + b