package problems.employee;
class FullTimeEmployee extends Employee
{
      private String department;

    public FullTimeEmployee(int employeeId,String name,int baseSalary,String department)
    {
        super(employeeId,name,baseSalary);
        assignDepartment(department);
    }
    double calculateSalary()
    {
        return getBaseSalary();
    }
     public void assignDepartment(String department)
     {
         this.department=department;
     }
     public String getDepartmentDetails()
     {
         return department;
     }
    void displayDetails()
    {
        super.displayDetails();
        System.out.println("The salary is :"+getBaseSalary());
        System.out.println("Department "+getDepartmentDetails());
    }


}