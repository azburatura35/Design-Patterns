package prototype.kotlin

fun main(args: Array<String>) {

    var department = Department("IT")
    var employee = Employee(1, "Bob", department)
    var otheEmployee = employee.copy(id = 2, employeeName = "Mark")
    var anotherEmployee = employee.copy()
    println(employee)
    println(otheEmployee)
    println(anotherEmployee)

}

data class Employee(val id: Int, val employeeName: String, val department: Department)
data class Department(val name: String)