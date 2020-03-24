package staff;

public class Employee {

    // instance variables

    private String name;
    private int nINumber;
    private int salary;

    // Constructor

    public Employee(String name, int nINumber, int salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    // Getter

    public String getName() {
        return name;
    }

    public int getnINumber() {
        return nINumber;
    }

    public int getSalary() {
        return salary;
    }

    // Methods

    public int raiseSalary(double increment){
         return (int) (salary += increment);
    }

    public int payBonus(){
        return (int) (0.01 * salary);
    }


}
