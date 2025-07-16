
fun sumNumbers(a: Int, b: Int): Int = a + b

fun greet(name: String): Unit {
    println("Салом, $name!")
}

fun isEven(num: Int): Boolean = num % 2 == 0

fun average(numbers: Array<Int>): Double {
    val sum = numbers.sum()
    return sum.toDouble() / numbers.size
}