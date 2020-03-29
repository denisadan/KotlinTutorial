package expressionChallenges

fun main() {
    // printNumbers1()
    // printNumbers2()
    // printFibonacciNumbers()
    //  printNumbers3()
    printNumbers4(1000)
    printNumbers4(1001)
    printNumbers4(999)

}

fun printNumbers1() {
    for (i in 5..5000 step 50) {
        println(i)
    }
}

fun printNumbers2() {
    for (i in -500..0) {
        println(i)
    }
}

fun printFibonacciNumbers() {
    var first = 0
    var second = 1
    println("1: $first")
    println("2: $second")

    var total: Int
    for (i in 0..12) {
        total = first + second
        println("${i + 3}: $total")
        first = second
        second = total

    }
}

// 1  11 100 99 98 2
fun printNumbers3() {
    iloop@ for (i in 1..5) {
        println(i)
        if (i == 2) break
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) continue@iloop
            }
        }
    }
}

// declare a variable num int and a dnum double
// if  num > 1000 -> dnum = 234.567
// if num < 100 -> dnum = -234.567
// if num = 100 -> dnum = 0

fun printNumbers4(num: Int) {
    var dnum = if (num > 1000) {
        234.567
    } else if (num < 1000) {
        -234.567
    } else {
        0.00
    }
    println(dnum)

// OR
    println(
        when {
            num > 1000 -> 234.567
            num < 1000 -> -234.567
            else -> 0.0
        }
    )
}