package sda.inheritance

abstract class Printer(val modelName: String) {
    open fun printModel() = println("The model name of this printer is: $modelName")
    abstract fun bestSellingPrice(): Double

}

open class LaserPrinter(modelName: String) : Printer(modelName) {

    final override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice(): Double = 1299.99
}

class SpecialLaserPrinter(modelName: String) : LaserPrinter(modelName)

open class Something : MySubInterface {
    override val number = 25
    val someProperty: String

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I am in the parent structure")

    }

    override fun myFunction(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun mySubFunction(num: Int): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class SomethingELse : Something {
    constructor(someOtherParam: String) : super(someOtherParam) {
        println("I am in the child structure")
    }
}


interface MyInterface {
    val number: Int
    val number2: Int
        get() = number * 10

    fun myFunction(str: String): String
}

interface MySubInterface : MyInterface {
    fun mySubFunction(num: Int): Int
}

fun main() {
    val laserPrinter = LaserPrinter("Strings")
    laserPrinter.printModel()

    SomethingELse("whatever")
}