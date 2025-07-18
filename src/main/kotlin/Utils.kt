/**
 * Безопасная универсальная функция для чтения и преобразования пользовательского ввода.
 *
 * Повторяет запрос ввода до тех пор, пока введённая строка не будет успешно
 * преобразована в требуемый тип `T` с помощью функции `parse`.
 *
 * Также позволяет настроить сообщение об ошибке (`errorPrompt`), которое будет
 * отображаться при каждом некорректном вводе.
 *
 * ## Пример использования:
 * ```kotlin
 * val number = readValue("Введите целое число: ") { it.toIntOrNull() }
 * val price = readValue("Введите цену: ", "Введите корректное число!") { it.toDoubleOrNull() }
 * ```
 *
 * @param prompt Сообщение, отображаемое пользователю перед вводом.
 * @param errorPrompt Сообщение, выводимое при некорректном вводе (по умолчанию: "Неправильные данные! Повторите ввод.").
 * @param parse Лямбда-функция, которая принимает строку и пытается преобразовать её в тип `T`.
 *              Должна возвращать `null`, если преобразование невозможно.
 *
 * @return Значение типа `T`, успешно считанное и преобразованное.
 */
fun <T> readValue(
    prompt: String,
    errorPrompt: String = "Неправильные данные! Повторите ввод.",
    parse: (String) -> T?
): T {
    while (true) {
        print(prompt)
        val input = readln()
        val result = parse(input)
        if (result != null) return result
        println(errorPrompt)
    }
}
