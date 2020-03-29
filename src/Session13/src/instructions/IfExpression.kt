package instructions

fun main() {
    val someCondition = 26 < 30
    val x = if (someCondition) 10 else 20

    println(
        "This is a dummy condition:  ${
        if (someCondition) {
            println("X")
        } else {
            println("y")
        }}"
    )


}