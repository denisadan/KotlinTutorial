package session2

fun main() {
    var student1 = Student("Denisa", 26)
    val student2 = Student("Denisa", 26)
    val student3 = Student("Denisa", 24)
    val student4 = Student("Denisa", 25)


    // == sau equals
    println(student1 == student2)
    println(student1.equals(student2))

    // referinta
    student1 = student2
    println(student1 === student2)

    println(student3 != student4)
    println(student3 !== student4)
}

class Student(var name: String, var age: Int) {
    override fun equals(obj: Any?): Boolean {
        if (this === obj) return true
        if (obj is Student) {
            return name == obj.name && age == obj.age
        }
        return false
    }
}