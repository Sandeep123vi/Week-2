

package problems.employee;


import java.util.ArrayList;

public class EmployeeManagementSystem {
public static void main(String [] args)
{
   Employee  partTimeEmployee= new PartTimeEmployee(1001,"Sandeep",2000,"IT");
   Employee  partTimeEmployee1= new PartTimeEmployee(1002,"Sachin",12000,"Mechanical");
   Employee  fullTimeEmployee= new FullTimeEmployee(1003,"Sanket",10000,"IT");
   Employee  fullTimeEmployee1=new FullTimeEmployee(1004,"Sahil",14000,"CSE");
    ArrayList<Employee> employeeList;
    employeeList = new ArrayList<>();
    employeeList.add(partTimeEmployee1);
    employeeList.add(fullTimeEmployee);
    employeeList.add(fullTimeEmployee1);
   for (Employee details:employeeList)
   {
    details.displayDetails();
     }
}
}
