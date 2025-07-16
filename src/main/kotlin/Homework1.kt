fun homework1() {
    // Задача №1
    println("Введите своё имя \nname = ")
    val name: String = readln()
    println("Привет, $name!")

    // Задача №2
    val a: Int = readValue("Введите первое значение \nа = ") { it.toIntOrNull() }
    val b: Int = readValue("Введите второе значение \nb = ") { it.toIntOrNull() }
    println("Сумма: \n$a + $b = ${a + b}")

    // Задача №3
    println("Введите своё имя \nfirstName = ")
    val firstName: String = readln()

    println("Введите свою фамилию \nlastName = ")
    val lastName: String = readln()

    println("Полное имя: \n$firstName $lastName")

    // Задача №4
    val width: Double = readValue("Введите ширину: \nwidth = ") { it.toDoubleOrNull() }
    val height: Double = readValue("Введите высоту: \nheight = ") { it.toDoubleOrNull() }
    println("Площадь прямоугольника: \n$width * $height = ${width * height}")

    // Задача №5
    val yearOfBirth: Int = readValue("Введите свой год рождения: \nyearOfBirth = ") { it.toIntOrNull() }
    val currentYear: Int = readValue("Введите текущий год: \ncurrentYear = ") { it.toIntOrNull() }
    println("Ваш возраст: \n${currentYear - yearOfBirth}")

    // Задача №6
    val heightInCm: Double = readValue("Введите свой рост в сантиметрах: \nheightInCm = ") { it.toDoubleOrNull() }
    println("Ваш рост в метрах: \n${heightInCm / 100}")
}
