package instructions

import instructions.Season.*
import java.math.BigDecimal

fun main() {
    var num = 100

    val y = 10

    when (num) {
        y + 80 -> println("90")
        y + 90 -> println("100")
        in 100..199 -> println("in range 100...199")
        200 -> println("200")
        201, 600 -> println("600")
        300 -> println("300")
        else -> println("Nothing matches")
    }

    val obj: Any = "I'm a string"
    val obj2: Any = BigDecimal(25.2)
    val something: Any = obj2
//    if (something is String) {
//        println(something.toUpperCase())
//    } else if (something is BigDecimal) {
//        println(something.remainder(BigDecimal(10.5)))
//
//    } else if (something is Int) {
//        println("${something - 22}")
//
//    }
// replace it with when:

    val myWhenResult = when (something) {
        is String -> {
            println(something.toUpperCase())
            1
        }
        is BigDecimal -> {
            println(something.remainder(BigDecimal(10.5)))
            2
        }
        is Int -> {
            println("${something - 22}")
            3
        }
        else -> {
            "Default: no idea what type is"
            0
        }
    }

    println(myWhenResult)

    val timeOfYear = WINTER

    val str = when (timeOfYear) {
        SPRING -> {
            println("Flowers are blooming")
            num += 5
        }
        SUMMER -> println("It's hot")
        FALL -> println("It's getting cooler")
        WINTER -> {
            num = 22 - 55
            println("I need a coat")
        }
    }
    val num2 = 50
    when {
        num < num2 -> println("mai mic")
        num > num2 -> println("mai mare")
        else -> println("egal")
    }
    println(str)
}

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}