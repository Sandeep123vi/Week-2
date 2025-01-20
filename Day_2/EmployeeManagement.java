public class EmployeeManagement {
    public static void main(String[] args) {
        Employee employee = new Employee("Sandeep", 01, "HR");
        if (employee instanceof Employee) {
            System.out.println("This is object of Employee class");
        }
        Employee.displayTotalEmployees();
        employee.displayDetails();

    }
}

class Employee {
    static int totalEmployees;
    static String companyName;
    String name;
    final int id;
    String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;

    }

    public static void displayTotalEmployees() {
        System.out.println("Total number of employees :" + totalEmployees);
    }

    public void displayDetails() {
        System.out.println("The name of Employee is :" + name);
        System.out.println("The id is :" + id);
        System.out.println("The designation is " + designation);

    }
}
