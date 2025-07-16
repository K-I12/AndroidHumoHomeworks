fun homework2() {
    // Задача 1
    print("Лутфан, як адад ворид кунед: ")
    val number = readln().toIntOrNull()

    if (number != null) {
        if (number > 0) {
            println("Адад мусбат аст.")
        } else if (number < 0) {
            println("Адад манфӣ аст.")
        } else {
            println("Адад сифр аст.")
        }
    } else {
        println("Лутфан, адади бутун ворид кунед.")
    }

    // Задача 2
    print("Лутфан, синни худро ворид кунед: ")
    val age = readln().toIntOrNull()

    if (age != null && age >= 0) {
        when (age) {
            in 18..Int.MAX_VALUE -> println("Шумо калонсол ҳастед.")
            in 7..17 -> println("Шумо хонанда ҳастед.")
            in 0..6 -> println("Шумо кӯдак ҳастед.")
            else -> println("Синни воридшуда берун аз диапазони муқаррарӣ аст.")
        }
    } else {
        println("Лутфан, синни дуруст (адади мусбат) ворид кунед.")
    }

    // Задача 3
    print("Лутфан, адади якумро ворид кунед: ")
    val num1 = readln().toIntOrNull()

    print("Лутфан, адади дуюмро ворид кунед: ")
    val num2 = readln().toIntOrNull()

    if (num1 != null && num2 != null) {
        if (num1 > num2) {
            println("Адади ${num1} калонтар аст.")
        } else if (num2 > num1) {
            println("Адади ${num2} калонтар аст.")
        } else {
            println("Ду адад баробаранд: ${num1}.")
        }
    } else {
        println("Лутфан, ду адади бутун ворид кунед.")
    }

    //Задача 4
    print("Лутфан, рақами рӯзи ҳафтаро ворид кунед (аз 1 то 7): ")
    val dayNumber = readln().toIntOrNull()

    if (dayNumber != null) {
        when (dayNumber) {
            1 -> println("Душанбе")
            2 -> println("Сешанбе")
            3 -> println("Чоршанбе")
            4 -> println("Панҷшанбе")
            5 -> println("Ҷумъа")
            6 -> println("Шанбе")
            7 -> println("Якшанбе")
            else -> println("Рақами нодуруст. Лутфан, рақамро аз 1 то 7 ворид кунед.")
        }
    } else {
        println("Лутфан, адади бутун ворид кунед.")
    }

    // Задача 5
    print("Лутфан, як ҳарфро ворид кунед: ")
    val input = readln()

    if (input.length == 1) {
        when (input[0]) {
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U', -> println("Ин ҳарф садонок аст.")
            else -> println("Ин ҳарф садонок нест.")
        }
    } else {
        println("Лутфан, танҳо як ҳарф ворид кунед.")
    }
}