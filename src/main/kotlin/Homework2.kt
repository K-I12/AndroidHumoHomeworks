fun homework2() {
    // Задача 1
    val number = readValue("Лутфан, як адад ворид кунед: ") { it.toIntOrNull() }
    when {
        number > 0 -> println("Адад мусбат аст.")
        number < 0 -> println("Адад манфӣ аст.")
        else -> println("Адад сифр аст.")
    }

    // Задача 2
    val age = readValue("Лутфан, синни худро ворид кунед: ") {
        it
            .toIntOrNull()
            ?.takeIf { value ->
                value >= 0
            }
    }
    when (age) {
        in 18..Int.MAX_VALUE -> println("Шумо калонсол ҳастед.")
        in 7..17 -> println("Шумо хонанда ҳастед.")
        in 0..6 -> println("Шумо кӯдак ҳастед.")
    }

    // Задача 3
    val num1 = readValue("Лутфан, адади якумро ворид кунед: ") { it.toIntOrNull() }
    val num2 = readValue("Лутфан, адади дуюмро ворид кунед: ") { it.toIntOrNull() }

    if (num1 > num2) {
        println("Адади $num1 калонтар аст.")
    } else if (num2 > num1) {
        println("Адади $num2 калонтар аст.")
    } else {
        println("Ду адад баробаранд: $num1.")
    }

    // Задача 4
    val dayNumber = readValue("Лутфан, рақами рӯзи ҳафтаро ворид кунед (аз 1 то 7): ") {
        it
            .toIntOrNull()
            ?.takeIf { value ->
                value in 1..7
            }
    }

    val dayName = when (dayNumber) {
        1 -> "Душанбе"
        2 -> "Сешанбе"
        3 -> "Чоршанбе"
        4 -> "Панҷшанбе"
        5 -> "Ҷумъа"
        6 -> "Шанбе"
        7 -> "Якшанбе"
        else -> "Рӯз номаълум"
    }
    println(dayName)

    // Задача 5
    val ch = readValue("Лутфан, як ҳарфро ворид кунед: ") {
        it.lowercase().takeIf { s -> s.length == 1 }
    }

    when (ch) {
        "a", "e", "i", "o", "u" -> println("Ин ҳарф садонок аст.")
        else -> println("Ин ҳарф садонок нест.")
    }
}
