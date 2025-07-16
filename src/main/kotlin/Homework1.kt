
fun homework1() {
    // Задача №1
    println("Введите своё имя \nname = ")
    val name: String = readLine().toString()

    println("Привет, $name!")


    // Задача №2
    println("Введите первое значение \nа = ")
    val a: Int = readLine().toString().toInt()

    println("Введите второе значение \nb = ")
    val b: Int = readLine().toString().toInt()

    val c: Int = a + b

    println("Сумма: \n$a + $b = $c")


    // Задача №3
    println("Введите своё имя \nfirstName = ")
    val firstName: String = readLine().toString()

    println("Введите свою фамилию \nlastName = ")
    val lastName: String = readLine().toString()

    println("Полное имя: \n$firstName $lastName")


    // Задача №4
    println("Введите ширину: \nwidth = ")
    val width:Double = readLine().toString().toDouble()

    println("Введите высоту: \nheight = ")
    val height:Double = readLine().toString().toDouble()

    val perimeter: Double = width * height

    println("Площадь прямоугольника: \n$width * $height = $perimeter")

    // Задача №5
    println("Введите свой год рождения: \nyearOfBirth = ")
    val yearOfBirth: Int = readLine().toString().toInt()

    println("Введите текущий год: \nyearOfBirth = ")
    val currentYear: Int = readLine().toString().toInt()

    val res: Int = currentYear - yearOfBirth

    println("Ваш возраст: \n$res")


    //Задача №6
    println("Введите свой рост в сантиметрах")
    val heightInCm: Double = readLine().toString().toDouble()

    val heightInM: Double = heightInCm / 100

    println("Ваш рост в метрах: \n$heightInM")
}