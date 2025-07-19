package homework5

import homework5.models.BankAccount
import homework5.models.Car
import homework5.models.Student

fun homework5() {
    val student = Student("Беназир", 19, 4.5)
    student.printInfo()

    val newCar = Car("BMW", 2020)
    println(newCar.isOldCar())
    val oldCar = Car("BMW", 2000)
    println(oldCar.isOldCar())

    val benazirBankAccount = BankAccount(
        "Olimova Benazir",
        10_000.01
    )

    benazirBankAccount.printBalance()
    benazirBankAccount.deposit(1.99)
    benazirBankAccount.printBalance()
    benazirBankAccount.withdraw(1_001.0)
    benazirBankAccount.printBalance()
    benazirBankAccount.withdraw(1_000_000.0)
    benazirBankAccount.printBalance()
}