package homework5.models

class BankAccount(
    private val owner: String,
    private var balance: Double
) {
    fun deposit(amount: Double) {
        balance += amount
    }
    fun withdraw(amount: Double) {
        if (balance >= amount) balance -= amount
    }
    fun printBalance() {
        println("Хисоб: $balance сомони.")
    }
}