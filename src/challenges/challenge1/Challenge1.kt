package challenges.challenge1

fun main() {
    val hello1 = "Hello"
    val hello2 = "Hello"

    println("Referential equality between strings: ${hello1 === hello2}")
    println("Referential equality between strings: ${hello1 == hello2}")
    println("Referential equality between strings: ${hello1.equals(hello2)}")

    var number1 = 2898
    val any: Any = "The Any Type is the root of any type hierarchy"

    if (any is String) {
        println(any.toUpperCase())
    }

    println(""" |    1        
                |   11
                |  111
                | 1111 """.trimMargin())

    println(""" 1    1        
                1   11
                1  111
                1 1111 """.trimMargin("1"))

}