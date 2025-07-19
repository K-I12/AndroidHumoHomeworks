package homework5.models

class Car(
    private val brand: String,
    private val year: Int
) {
    fun isOldCar(): Boolean = year < 2010
}