fun homework1() {
    // Задача №1
    println("Введите своё имя \nname = ")
    val name: String = readln()

    println("Привет, $name!")

    // Задача №2
    println("Введите первое значение \nа = ")
    val a: Int? = readln().toIntOrNull()

    println("Введите второе значение \nb = ")
    val b: Int? = readln().toIntOrNull()

    if (a != null && b != null) {
        println("Сумма: \n$a + $b = ${a + b}")
    } else {
        println("Неправильные данные!")
    }

    // Задача №3
    println("Введите своё имя \nfirstName = ")
    val firstName: String = readln()

    println("Введите свою фамилию \nlastName = ")
    val lastName: String = readln()

    println("Полное имя: \n$firstName $lastName")

    // Задача №4
    println("Введите ширину: \nwidth = ")
    val width: Double? = readln().toDoubleOrNull()

    println("Введите высоту: \nheight = ")
    val height: Double? = readln().toDoubleOrNull()

    if (width != null && height != null) {
        println("Площадь прямоугольника: \n$width * $height = ${width * height}")
    } else {
        println("Неправильные данные!")
    }

    // Задача №5
    println("Введите свой год рождения: \nyearOfBirth = ")
    val yearOfBirth: Int? = readln().toIntOrNull()

    println("Введите текущий год: \nyearOfBirth = ")
    val currentYear: Int? = readln().toIntOrNull()

    if (currentYear != null && yearOfBirth != null) {
        println("Ваш возраст: \n${currentYear - yearOfBirth}")
    } else {
        println("Неправильные данные!")
    }


    //Задача №6
    println("Введите свой рост в сантиметрах")
    val heightInCm: Double? = readln().toDoubleOrNull()

    if (heightInCm != null) {
        println("Ваш рост в метрах: \n${heightInCm / 100}")
    } else {
        println("Неправильные данные!")
    }
}