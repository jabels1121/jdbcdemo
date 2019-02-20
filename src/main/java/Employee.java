public class Employee {

    private String lastName;
    private String firstName;
    private String email;
    private String department;
    private float salary;

    public Employee(String lastName, String firstName, String email, String department, float salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Float.compare(employee.salary, salary) == 0 &&
                lastName.equals(employee.lastName) &&
                firstName.equals(employee.firstName) &&
                email.equals(employee.email) &&
                department.equals(employee.department);
    }

}
