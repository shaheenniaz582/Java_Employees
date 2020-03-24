package management;

public class Director extends Manager{

    // Instance Variables
    private double budjet;

    // Constructor
    public Director(String name, int nINumber, int salary, String departmentName,double budjet) {
        super(name, nINumber, salary, departmentName);
        this.budjet = budjet;
    }

    // Getter

    public double getBudjet() {
        return budjet;
    }
}
