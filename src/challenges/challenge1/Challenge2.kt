fun main() {

    // 1. declare a non nullable float
    // 2. change to nullable  - add ?
    val firstVariable: Float? = 847.7f
    val secondVariable: Float? = -38.2F
    val thirdVariable: Float? = 555.toFloat()

    // 3. Declare an array of short, non-nullable
    val arrayOfShorts1: Array<Short> = arrayOf(1, 2, 3, 4, 5)
    val arrayOfShorts2 = shortArrayOf(1, 2, 3, 4, 5)

    // 4. Declare an array of nullable ints, and initialize it 5, 10, 15 ..200
    // nullable Int = Int?
    val arrayOfInts = Array<Int?>(40) { i -> (i + 1) * 5 }
    for (i in arrayOfInts) {
        println(i)
    }

    // 5. specialized array that we can pass to a Java method
    var arrayOfChars = charArrayOf('a', 'b', 'c')

    // 6.
    val x: String? = "I AM AN UPPERCASE"
    val y = x?.toLowerCase() ?: "I am null."
    println("y$y")

    //or

    val z: String = if (x != null) {
        x.toLowerCase()
    } else {
        "I am null"
    }
    println("z$z")

    // 7.
    // if x!= null change it to lower case and replace m with am not
    // LET = if x!= null do something
    x?.let { println( it.toLowerCase().replace("am", "am not")) }

    // 8.
    val myNonNullVariable : Int? = null
    myNonNullVariable!!.toDouble()

}
