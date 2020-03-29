fun main() {
    println(getNumber("bla") ?: "I can't print the result")
}

fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("I am finally")
    }
}

fun notImplementedException(something: String): Nothing {
    throw IllegalArgumentException("I am not implemented")
}