package session2

typealias EmployeeSet = Set<Employee>

fun main() {
    val number1 = 25
    val number2: Int
    var number3: Int = 25

    number3 = 4
    number2 = 10;

    // employee1 = Employee("Bla Bla", 1) - not possible
    val employee4: Employee

    if (number1 > number2) {
        employee4 = Employee("Jane Doe", 2)
    } else {
        employee4 = Employee("John Doe", 1)
    }

    var employees: EmployeeSet;
    val names = arrayListOf("Jane, John");
    //  println(names[1])

    var employee1 = Employee("Dan Denisa", 100)
    val employee2 = Employee("Dan Denisa", 100)
    employee1 = employee2
    val employee3 = Employee("Dan Denisa Adriana", 200)
    employee1.name = "Dan Denisa Adriana"
    println(employee1 == employee2)
    println(employee2 == employee3)
    println(employee2.equals(employee3))

    println(employee1 === employee2)
    println(employee1 === employee2)
    println(employee1 != employee2)
    println(employee1 !== employee2)

    val x = 0x0111010101;
    val y = 0x0111010101;

    var something: Any = employee4
    if (something is Employee) {
        println(something)
        something = "bla"
//        println(something.name) not possible

        // this is not necesary
        // val newEmployee = something as Employee
        //  println(newEmployee)


        val num = 10.99
        val den = 20

        println("$num divided by $den is ${num / den}")
    }
}

class Employee(var name: String, var id: Int) {
    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }
        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }

}