package session8

val MY_CONSTANT = 100

fun main() {
    println(MY_CONSTANT)
    val myCar = Car("blue", "Toyota", 2000)
    println(myCar)
}

data class Car(val color: String, val model: String, val year: Int)

Session 8

CONSTANTS
- can be declared outside classes

DATA CLASSES
- classes that stores state (getters, setters)
- has some predefined methods that we can override
-