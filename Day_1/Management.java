class Course {
    // Instance variables for Course class
    private String courseName;
    private int duration;
    private double fee;

    // Class variable to represent the institute name
    private static String instituteName = "Default Institute";

    // Constructor to initialize a course object (Abstraction)
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

public class Management {
    public static void main(String[] args) {
        // Create instances of the Course class (Objects)
        Course course1 = new Course("Java Programming", 12, 500.00);
        Course course2 = new Course("Python for Data Science", 10, 600.00);
        Course course3 = new Course("Web Development", 8, 400.00);

        // Display details of each course before updating the institute name
        System.out.println("--- Course Details Before Updating Institute Name ---");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();
        course3.displayCourseDetails();

        // Update the institute name for all courses
        Course.updateInstituteName("Tech Institute of Learning");

        // Display details of each course after updating the institute name
        System.out.println("\n--- Course Details After Updating Institute Name ---");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();
        course3.displayCourseDetails();
    }
}
