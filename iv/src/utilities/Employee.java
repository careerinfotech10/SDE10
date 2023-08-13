package utilities;

public class Employee {

    private Long id;
    private String name;
    private Long  salary;

    private  String department;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(Long id, String name, Long salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }


}
