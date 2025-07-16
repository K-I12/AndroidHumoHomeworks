
fun homework4() {
    /*
    1. Функсия чист?
    Функсия блоки коди аст, ки вазифаи мушаххасро иҷро мекунад ва метавонад чанд маротиба истифода шавад.

    2. Фарқи байни fun sum(a: Int, b: Int) ва fun sum(a: Int, b: Int): Int дар чист?
    fun sum(a: Int, b: Int) – функсия чизе барнамегардонад (return надорад).
    fun sum(a: Int, b: Int): Int – функсия натиҷа (integer) бармегардонад.

    3. Барои чӣ параметрҳо дар функсия лозиманд?
    Параметрҳо имкон медиҳанд, ки функсия бо маълумоти гуногун кор кунад ва умумитар бошад.

    4. Фарқи байни функсия бо return ва бе return чист?
    Бо return: натиҷаро бармегардонад, ки метавонад дар дигар ҷойҳо истифода шавад.
    Бе return: танҳо амал иҷро мекунад, вале арзиш намедиҳад.
     */

    // Задача №5
    sumNumbers(5, 12)

    // Задача №6
    greet("Сумая")

    // Задача №7
    val num = isEven(15)

    if (num) {
        println("Ина адад ҷуфт аст")
    } else {
        println("Ина адад ҷуфт нест")
    }

    // Задача №8
    val nums: Array<Int> = arrayOf(10, 20, 30, 40, 50)

    val result = average(nums)

    println("Миёнаи ададҳо: $result")
}

fun sumNumbers(a: Int, b: Int): Int = a + b

fun greet(name: String) {
    println("Салом, $name!")
}

fun isEven(num: Int): Boolean = num % 2 == 0

fun average(numbers: Array<Int>): Double {
    val sum = numbers.sum()
    return sum.toDouble() / numbers.size
}