package selfproblems;

import java.util.ArrayList;
import java.util.List;

class School{
    //Attributes
    List <Student> studentList;
     String schoolName ;

    //Constructor
    public School(String schoolName){
        this.schoolName = schoolName;
        studentList = new ArrayList<>();
    }
    //Method to add student in studentList
    public void addStudent(Student student){
        studentList.add(student);
    }

    //Method to display school name and students
    public void displaySchool(){
        System.out.println("School: "+schoolName);
        for(Student stu : studentList){
            System.out.println(stu.getName()+" "+stu.getStudentId());
        }
    }
}
class Student{
    //Attributes
    private String name;
    private int studentId;

    //Constructor
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {

        return name;
    }

    public int getStudentId() {

        return studentId;
    }

}
class Courses{
    //Attributes
    private String courseName;
    private List<Student> studentList;
    //Constructor
    public Courses(String courseName) {
        this.courseName = courseName;
        studentList = new ArrayList<>();

    }
    //Method to display all courses
    public void addStudent(Student student){
        studentList.add(student);
    }

    //Method to display all students in courses
    public void displayStudents(){
        System.out.println("Student having course: "+courseName);
        for(Student stu : studentList){
            System.out.println(stu.getName()+" "+stu.getStudentId());
        }
    }

}

public class SchoolStudentCourses{
    public static void main(String[] args) {
        School school = new School("TIT School");
        Courses courses = new Courses("BTech");
        Courses courses1 = new Courses("Pharmacy");

        Student student = new Student("Raju",101);
        Student student1 = new Student("Shyaam",102);
        Student student2 = new Student("Baburao",103);
        //Display school and students
        school.addStudent(student);
        school.addStudent(student1);
        school.addStudent(student2);
        school.displaySchool();

        //Display students in courses
        courses.addStudent(student);
        courses.displayStudents();
        courses1.addStudent(student1);
        courses1.addStudent(student2);
        courses1.displayStudents();



    }
}
