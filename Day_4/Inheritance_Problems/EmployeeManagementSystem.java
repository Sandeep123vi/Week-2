package com.mycompany.inheritance;

class Employee {

    //Attributes
    private String name;
    private int id;
    private int salary;

    Employee() {
    }

    ;

    //Constructor
    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //Method to display details
    public void displayEmployeeDetails() {

        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {

    //Manager Attributes
    private int teamSize;

    Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    //Method to display manager details
    @Override
    public void displayEmployeeDetails() {
        System.out.println("Manager Details: ");
        super.displayEmployeeDetails();
        System.out.println("Team Size: " + teamSize);
    }

}

class Developer extends Employee {

    //Developer Attributes
    private String programmingLanguage;

    Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    //Method to display developer details
    @Override
    public void displayEmployeeDetails() {
        System.out.println("Developer Details: ");
        super.displayEmployeeDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }

}

class Intern extends Employee {

    //Intern Attributes
    private int timePeriod;

    Intern(String name, int id, int salary, int timePeriod) {
        super(name, id, salary);
        this.timePeriod = timePeriod;
    }

    //Method to display intern details
    @Override
    public void displayEmployeeDetails() {
        System.out.println("Intern Details: ");
        super.displayEmployeeDetails();
        System.out.println("Time Period (in weeks): " + timePeriod);
    }

}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        //Manager class object
        Manager manager = new Manager("Rishi", 1001, 80000, 12);
        manager.displayEmployeeDetails();

        //Developer class object
        Developer developer = new Developer("Arpit", 1002, 80000, "Java");
        developer.displayEmployeeDetails();

        //Intern class object
        Intern intern = new Intern("Mohit", 1004, 50000, 4);
        intern.displayEmployeeDetails();
    }
}
