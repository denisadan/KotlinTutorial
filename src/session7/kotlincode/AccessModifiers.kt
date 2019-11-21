package kotlincode

fun main() {
    val emp = Employee("Denisa")
    val emp2 = Employee("Denisa", false)
    println(emp2.fullTime)

    println(Dummy().dummy)
    val emp3 = Employee("Denisa", false)
    emp3.fullTime = false

    println(emp3.fullTime)
}

//class Employee constructor(val firstName: String) {
class Employee(
    val firstName: String,
    fullTime: Boolean = false
) {

    var fullTime = fullTime
        get() {
            println("Running the custom get")
            return field

        }
}

//    var fullTime: Boolean = true
//
//    constructor(firstName: String, fullTime: Boolean) : this(firstName) {
//        this.fullTime = fullTime
//    }


// first way
//    val firstName: String
//
//    init {
//        this.firstName = firstName
//    }

//second way
//    val firstName: String = firstName

class Dummy {
    val dummy: String

    constructor() {
        dummy = "Hello"
    }
}