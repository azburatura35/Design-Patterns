package prototype.deep;

// Deep Copy of an Object
public class Employee implements Cloneable {

    private int empoyeeId;
    private String employeeName;
    private Department department;

    public Employee(int id, String name, Department dept) {
        this.empoyeeId = id;
        this.employeeName = name;
        this.department = dept;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.setDepartment((Department) cloned.getDepartment().clone());
        return cloned;
    }

    public int getEmpoyeeId() {
        return empoyeeId;
    }

    public void setEmpoyeeId(int empoyeeId) {
        this.empoyeeId = empoyeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empoyeeId=" + empoyeeId +
                ", employeeName='" + employeeName + '\'' +
                ", department=" + department +
                '}';
    }
}
