package prototype.deep;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Department department = new Department("IT");
        Employee employee = new Employee(1, "Alex", department);

        Employee otherEmployee = (Employee) employee.clone();

        System.out.println(employee);
        System.out.println(otherEmployee);
        System.out.println();
        otherEmployee.getDepartment().setName("HR");

        System.out.println(employee);
        System.out.println(otherEmployee);

    }

}
