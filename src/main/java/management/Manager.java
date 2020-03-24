package management;

import staff.Employee;

public class Manager extends Employee {

    // Instance Variables
    private String departmentName;

    // Constructor
    public Manager(String name, int nINumber, int salary, String departmentName) {
        super(name, nINumber, salary);
        this.departmentName = departmentName;
    }

    // Getter
    public String getDepartmentName() {
        return departmentName;
    }

}
