
class Employee {

    public int employeeID;

    protected String department;

    private double salary;

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to access the salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) { // Validation for positive salary
            this.salary = salary;
            System.out.println("Updated salary: $" + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass representing a Manager
class Manager extends Employee {
    private String team; // Team managed by the manager

    // Constructor to initialize manager details
    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary); // Call to the superclass constructor
        this.team = team;
    }

    // Method to display manager details
    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails(); // Call to the superclass method
        System.out.println("Team: " + team);
    }
}

// Main class to demonstrate the Employee Records Management System
public class EmployeRecords {
    public static void main(String[] args) {
        // Create an instance of Employee class
        Employee employee = new Employee(1001, "HR", 50000.00);

        // Display employee details
        System.out.println("--- Employee Details ---");
        employee.displayEmployeeDetails();

        // Update and display the salary of the employee
        employee.setSalary(55000.00);
        System.out.println("\nUpdated Employee Details:");
        employee.displayEmployeeDetails();

        // Create an instance of Manager class
        Manager manager = new Manager(2001, "IT", 80000.00, "Development Team");

        // Display manager details
        System.out.println("\n--- Manager Details ---");
        manager.displayEmployeeDetails();
    }
}
