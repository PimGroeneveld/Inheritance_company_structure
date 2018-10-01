package Staff;

public abstract class Employee {

    private String name;
    private String NI;
    private double salary;

    public Employee(String name, String NI, double salary){
        this.name = name;
        this.NI = NI;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double raise) {
        if (raise > 0) {
            return raise * this.salary;
        } else {
            return this.salary;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
