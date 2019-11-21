package inheritance

import java.time.Year

object CompanyCommunications {
    private val currentYear = Year.now().value

    fun getTagLine() = "Garmin rocks!"
    fun getCopyRightLIne() = "Copyright\u00A9 $currentYear Garmin. All rights reserved."
}


fun main() {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyRightLIne())
}