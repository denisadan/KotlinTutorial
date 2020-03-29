package sda.inheritance

import java.time.Year

object CompanyCommunications {
    private val currentYear = Year.now().value

    fun getTagLine() = "Garmin rocks!"
    fun getCopyRightLIne() = "Copyright\u00A9 $currentYear Garmin. All rights reserved."
}

class SomeClass {
    companion object SomeCommpanion {
        private val privateVar = 6
        fun accessPrivilege() = "I'm accessing privateVar: $privateVar"
    }
}

// todo factory
//class SomeNewClass private constructor(val someNewString: String) {
//    private constructor(str: String) {
//        someNewString = str
//    }
//
//    fun justAssign(str: String);
//
//    fun upperOrLowerCAse(str: String, myBoolean: Boolean) {
//        if (myBoolean) {
//            someNewString = str.toLowerCase()
//        } else {
//            someNewString = str.toUpperCase()
//        }
//    }
//}


interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInf(si: SomeInterface) {
    println("Stupid interface wants something ${si.mustImplement(22)}")
}

fun main() {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyRightLIne())
    println(SomeClass.accessPrivilege())

    var thisIsMutable = 45;
    wantsSomeInf(object : SomeInterface {
        //      thisIsMutable ++
        override fun mustImplement(num: Int) = "This is from mustImplement: ${num * 100}"
    })

    println(Department.ACCOUNTING.getDepInfo())

}

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human resources", 5),
    IT("Information Technology", 20),
    SALES("Sales", 3),
    ACCOUNTING("Accounting", 2);

    fun getDepInfo() = "The $fullName has $numEmployees employees."
}