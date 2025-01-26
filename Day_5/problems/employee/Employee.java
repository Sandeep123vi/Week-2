package problems.employee;

abstract class Employee implements Department
{
    private int employeeId;
    private String name;
    private int baseSalary;
    //private String department;
    public Employee(int employeeId,String name,int baseSalary)
    {
        this.baseSalary=baseSalary;
        this.employeeId=employeeId;
        this.name=name;
    }
    abstract double calculateSalary();
    void displayDetails()
    {
        System.out.println("Employee name is:"+name);
        System.out.println("Employee id is :"+employeeId);
        System.out.println("Employee base salary is :"+baseSalary);
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



}