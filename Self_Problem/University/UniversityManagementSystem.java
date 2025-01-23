package selfproblems2;
import java.util.ArrayList;
import java.util.List;
class Course {
    private String courseName;
    private Professor professor;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: " + professor.getName());
        } else {
            System.out.println("No professor assigned yet.");
        }
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }
}
class Professor {
    private String name;
    private List<Course> courses;
    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void teachCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this);
    }
    public void displayProfessorDetails() {
        System.out.println("Professor: " + name);
        System.out.println("Courses Taught:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}
class Student{
    private String name;
    private List<Course> courses;
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }
    public void displayStudentDetails() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled Courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

public class UniversityManagementSystem{
    public static void main(String[] args) {
        //Create professors
        Professor professor1 = new Professor("Raju");
        Professor professor2 = new Professor("Shyam");

        //Create students
        Student student1 = new Student("Rishi");
        Student student2 = new Student("Rohan");

        //Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Physics");

        //Assign professors to courses
        professor1.teachCourse(course1);
        professor2.teachCourse(course2);

        //Enroll students in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        //Display details
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        professor1.displayProfessorDetails();
        professor2.displayProfessorDetails();
        student1.displayStudentDetails();
        student2.displayStudentDetails();
    }
}

