package session1

// tested the java to Kotlin converter
class Mouse @JvmOverloads constructor(
    private val weight: Int,
    private val numTeeth: Int = 16,
    private val numWhiskers: Int = 6
) {

    fun print() {
        println("$weight $numTeeth $numWhiskers")
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val mouse = Mouse(15, 4)
            mouse.print()
        }
    }


}