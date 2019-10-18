fun main() {
    val str: String = "This is not null"
    val str1: String? = null

    if (str != null) {
        str.toUpperCase();
    }
    // or
    str1?.toUpperCase()

    // short hand
    // val countryCode: String? = ceva?.address?.country?.countryCode

    // elvis operator: assign a default value when something is null  ?:
    val str3 = str1 ?: "Default Value"
    println(str3)

    // val countryCode = oAdresa?.address?.country?.countryCode ?: "US"


    val something: Any = arrayOf(1, 2, 3, 4)
    // val str4 = something as String   classcastexception

    val str4 = something as? String   //null
    str4?.toUpperCase()
    println(str4)

    //  val str5 = str1!!.toUpperCase() // it forces NPE to be thrown

    val str0: String? = null
    //  val str2 = str0!!
    //val str6 = str2.toUpperCase()

    //  ceva!!.address!!.country!!.countryCode  - not a good idea because we won't see which one caused npe

    val str7: String? = "not null"
    // printText(str7) // this may be null so we cannot do it - nullable string
    if (str7 != null) {
        printText(str7)
    }
    // or
    str7?.let { printText(it) }

    val str8 = str7!!
    val str9 = str8.toUpperCase()

    val str10: String? = null
    val str11: String = "This is not nullable"

    println(str10 == str11) // equals is null safe; it already null checks

    /// arrays of null
    val nullableInts = arrayOfNulls<Int>(5)
    for (i in nullableInts) {
        println(i)
    }
    nullableInts[3]?.toBigDecimal()
}

fun printText(text: String) {
    println(text)
}
