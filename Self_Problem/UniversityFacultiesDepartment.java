package selfproblems;

import java.util.ArrayList;
import java.util.List;

class University{
    private String universityName;
    private List<Department> departmentList;

    //Constructor
    public University(String universityName){
        this.universityName = universityName;
        departmentList = new ArrayList<>();
    }

    //Method to add department
    public void addDepartment(Department department){
        departmentList.add(department);
    }
    //Method to display departments
    public void displayDepartments(){
        System.out.println("Departments in "+ universityName);
        for (Department dep : departmentList){
            System.out.println(dep.getDepartmentName());
        }
    }
    //Method to delete departments
    public void deleteDepartments(){
        System.out.println("Departments in "+universityName);
        for (Department department : departmentList){
            department.cleanup();
        }
        departmentList.clear();
        System.out.println(universityName+" and its Department is Deleted");
    }
}
class Faculty{
    private String name;
    private String specialization;
    private List<Faculty> facultyList;

    //Constructor
    public Faculty(String name, String specialization){
        this.name = name;
        this.specialization = specialization;
        facultyList = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public String getSpecialization(){
        return specialization;
    }
    //Method to add faculty in facultyList
    public void addFaculty(Faculty faculty){
        facultyList.add(faculty);
    }
    //Method to add faculty in facultyList
    public void displayFaculty(){
        System.out.println("Faculties of:"+name+" "+specialization);
        for(Faculty faculty: facultyList){
            System.out.println(faculty.getName()+" "+faculty.getSpecialization());
        }
    }
}
class Department{
    private String departmentName;
    private List<Faculty> faculties;

    //Constructor
    public Department(String departmentName){
        this.departmentName = departmentName;
        faculties = new ArrayList<>();
    }
    public String getDepartmentName(){
        return departmentName;
    }

    //Method to add faculty in facultyList
    public void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }
    //Method to add faculty in facultyList
    public void displayFaculty(){
        System.out.println("Faculties of "+departmentName);
        for(Faculty faculty: faculties){
            System.out.println(faculty.getName());
        }
    }
    //Method to delete departments
    public void cleanup(){
        System.out.println("Deleting Departments: "+departmentName);
    }
}

public class UniversityFacultiesDepartment {
    public static void main(String[] args) {
        //Object for university name
        University university = new University("SAGE University");
        Department department1 = new Department("CSE Department");

        //Adding department in university
        university.addDepartment(department1);
        Department department2 = new Department("AIML Department");

        //Adding department in university
        university.addDepartment(department2);

        //Adding faculties in department
        Faculty faculty = new Faculty("Raju", "Data Structures");
        department1.addFaculty(faculty);
        Faculty faculty2 = new Faculty("Shyam", "Artificial Intelligence");
        department2.addFaculty(faculty);

        //Display university details
        university.displayDepartments();
        department1.displayFaculty();

        //Calling delete departments
        university.deleteDepartments();

        //Calling display departments after deleting departments
        university.displayDepartments();
    }
}
