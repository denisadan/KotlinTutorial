package session8.functions

fun main() {
    println(labelMultiply(22, 4, "The result is:"))
    println(labelMultiply2(22, 4))
    println(labelMultiply2(label = "here is the result", operand2 = 22, operand1 = 4))

    val emp = Employee("Denisa")
    println(emp.upperCaseFirstName())

    val car1 = Car("pink", "Audi", 2018)
    val car2 = Car("black", "Audi", 2015)
    val car3 = Car("blue", "Audi", 2013)
    val car4 = Car("red", "Audi", 2011)

    printColors(car1, car3, car4, str = "Colors: ")

    val myCars = arrayOf(car1, car2, car3, car4)
    val myMoreCars = arrayOf(car1, car2)
    printColors2(*myCars)
    val car5 = car2.copy(color = "gold")
    val lotsOfCars = arrayOf(*myCars, *myMoreCars, car5)
    println(printColors2(*lotsOfCars))

    // extension functions
    println(Utils().upperFirstANdLast("this is all in la"))
    val s = "this is all in lowercase"
    println(s.upperFirstAndLast())

}

fun String.upperFirstAndLast(): String {
    val upperFirst = this.substring(0, 1).toUpperCase() + this.substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) + upperFirst.substring(
        upperFirst.length - 1,
        upperFirst.length
    ).toUpperCase()
}

fun labelMultiply(operand1: Int, operand2: Int, label: String) = ("$label ${operand1 * operand2}")
fun labelMultiply2(operand1: Int, operand2: Int, label: String = "The result is:") = ("$label ${operand1 * operand2}")


fun whatever() = 3 * 4

class Employee(val firstName: String) {
    fun upperCaseFirstName() = firstName.toUpperCase()
}

data class Car(val color: String, val model: String, val year: Int)

fun printColors(vararg cars: Car, str: String) {
    for (car in cars) {
        println(car.color)
    }
}

fun printColors2(vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}