package Staff.Management;

import Staff.Employee;

public class Director extends Employee {

    private int budget;
    private String deptName;
    private double salary;

    public Director(String name, String NI, double salary, String deptName, int budget) {
        super(name, NI, salary);
        this.deptName = deptName;
        this.budget = budget;
        this.salary = salary;
    }

    public String getDeptName() {
        return deptName;
    }

    public int getBudget() {
        return budget;
    }

    public double payBonus(){
        return salary * 0.02;
    }
}
