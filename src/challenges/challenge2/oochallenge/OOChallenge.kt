package academy.learnprogramming.oochallenge

// we set the default value of gear to 10; but it's not propagated to the child classes
open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {
    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() = println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.");
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int) : KotlinBicycle(cadence, speed, gear) {
    override fun printDescription()  {
        super.printDescription();
        println("The mountain bike has a seat height of $seatHeight.")
    }
}

// when we have val it means it is immutable; no setter
class KotlinRoadBike(cadence: Int, speed: Int, gear: Int, val tireWidth: Int) : KotlinBicycle(cadence, speed, gear){
    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }
}

fun main() {
//    val b = KotlinBicycle(1, 2, 3)
//    b.printDescription()
//
//    val mb = KotlinMountainBike(1, 2, 3, 4)
//    mb.printDescription()
//
//    val rb = KotlinRoadBike(1, 2, 3, 4)
//    rb.printDescription()


    val b2 = KotlinBicycle(1, 2)
    b2.printDescription()

    val mb2 = KotlinMountainBike(1, 2, 3, 100)
    mb2.printDescription()

    val rb2 = KotlinRoadBike(1, 2, 3, 4)
    rb2.printDescription()


}