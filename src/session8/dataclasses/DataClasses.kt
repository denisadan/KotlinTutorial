package session8.dataclasses


const val MY_CONSTANT = 100

fun main() {
    println(MY_CONSTANT)
    val myCar1 = Car("blue", "Toyota", 2000)
    val myCar2 = Car("blue", "Toyota", 2000)
    println(myCar1)

    println(myCar1 == myCar2)  //true

    val employee1 = Employee("Denisa")
    val employee2 = Employee("Denisa")
    println(employee1 == employee2)  // false because equals is not overridden and it is class not data class

    val car3 = myCar2.copy()
    val car4 = myCar2.copy(year = 2018)
    println(car3)
    println(car4)
}

data class Car(val color: String, val model: String, val year: Int)

class Employee(val name: String)
