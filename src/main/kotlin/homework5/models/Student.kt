package homework5.models

class Student(
    private val name: String,
    private var age: Int,
    private var grade: Double
) {
    fun printInfo() {
        println("Ном: $name")
        println("Синну сол: $age")
        println("Хол: $grade")
    }
}