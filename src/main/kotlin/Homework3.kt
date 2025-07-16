fun homework3() {
    // Задача №1
    var numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    for (num in numbers) {
        println(num)
    }

    // Задача №2
    numbers = arrayOf(3, 8, 5, 12, 7, 4)

    for (number in numbers) {
        if (number % 2 == 0) {
            println(number)
        }
    }

    // Задача №3
    numbers = arrayOf(5, 10, 15, 20)

    var sum = 0
    for (number in numbers) {
        sum += number
    }

    println("Ҷамъбасти ҳамаи элементҳо: $sum")

    // Задача №4
    val names: Array<String> = arrayOf("Али", "Мунира", "Фирӯз", "Ситора")

    for (name in names) {
        println("Салом, $name")
    }
}