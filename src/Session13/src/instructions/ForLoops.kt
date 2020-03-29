package instructions

fun main() {
    val range = 1..5
    for (i in range) {
        println(i)
    }

    val charRange = 'a'..'z'
    println('q' in charRange)

    val stringRange = "ABC".."XYZ"
    println("CCCCCC" in stringRange)
    println("ZZZZZZ" in stringRange)
    println("AAAAAA" in stringRange)

    val str = "Hello"
    for (c in str) {
        println(c)
    }
    val bacwardRange = 5.downTo(1)
    println(5 in bacwardRange)

    val r = 5..1
    println(5 in r)

    val stepRange = 3..15
    for (i in stepRange) {
        println(i)
    }
    val stepThree = stepRange.step(3)
    for (i in stepThree) {
        println(i)
    }

    val reverseRange = range.reversed()
    for (i in reverseRange) {
        println(i)
    }

    // int i=0; i<=n; i+4
    for (num in 1..20 step 4) {
        println(num)
    }

    // int i=20; i>=0; i-5
    for (num in 20 downTo 0 step 5) {
        println(num)
    }

    val s = "goodbye"
    //val sRange = 0..s.length

    for (i in 1 until 10) {
        println(i)
    }

    val seasons = arrayOf("summer", "spring", "winter", "fall")
    for (season in seasons) {
        println(season)
    }

    for (index in seasons.indices) {
        println("${seasons[index]} is at index $index")
    }

    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value -> println("$value at index $index") }

    val notASeason = "whatever" !in seasons
    println(notASeason)

    val notInRange = 12 !in 13..20
    println(notInRange)

    val notInStr = "e" !in "Hello"
    println(notInStr)

    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) {
            println("j = $j")
            for (k in 5..10) {
                println("k = $k")
                if (k == 7) {
                   // break@jloop
                    continue@jloop
                }
            }
        }
    }

}