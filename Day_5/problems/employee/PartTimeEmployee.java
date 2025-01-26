package problems.employee;
class PartTimeEmployee extends Employee

{
    private int workHours;
    //private int hourRate;
    private String department;
    public PartTimeEmployee(int employeeId,String name ,int baseSalary,String department)
    {
        super(employeeId,name,baseSalary);
        assignDepartment(department);
       // this.hourRate=hourRate;
        this.workHours=workHours;
    }

    @Override
    public void assignDepartment(String department) {

    }

    @Override
    public String getDepartmentDetails() {
       return department;
    }

    @Override
    double calculateSalary() {
        return workHours*getBaseSalary();
    }
    void displayDetails()
    {
        super.displayDetails();
        System.out.println("The Part time salary is :"+calculateSalary());
        System.out.println("Department "+getDepartmentDetails());
    }
}