
class Student {
    
    public int rollNumber; // Roll number of the student

    // Protected instance variable 
    protected String name; 

    
    private double CGPA; 

    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA 
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) { 
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Please enter a value between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}


class PostgraduateStudent extends Student {
    private String specialization; // Specialization field for postgraduate student

    // Constructor to initialize postgraduate student details
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA); // Call to the superclass constructor
        this.specialization = specialization;
    }

    // Method to display postgraduate student details
    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails(); // Call to the superclass method
        System.out.println("Specialization: " + specialization);
    }
}

// Main class to demonstrate the University Management System
public class University {
    public static void main(String[] args) {
        // Create an instance of Student class
        Student student = new Student(101, "Alice Johnson", 8.5);

        // Display student details
        System.out.println("--- Student Details ---");
        student.displayStudentDetails();

        // Update and display the CGPA of the student
        student.setCGPA(9.0);
        System.out.println("\nUpdated CGPA: " + student.getCGPA());

        // Create an instance of PostgraduateStudent class
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob Smith", 9.2, "Data Science");

        // Display postgraduate student details
        System.out.println("\n--- Postgraduate Student Details ---");
        pgStudent.displayStudentDetails();
    }
}
