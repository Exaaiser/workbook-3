public class Employee {
    private String employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    // Constructor
    public Employee(String employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    // Getter methods
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getGrossPay() {
        return hoursWorked * payRate;
    }
}
