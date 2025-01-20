class Patient {
    // Static variable shared among all patients
    private static String hospitalName = "CityCare Hospital";
    private static int totalPatients = 0;
    // Instance variables
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    // Constructor to initialize patient details
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details
    public void displayPatientDetails(Object obj) {
        if (obj instanceof Patient) { // Check if the object is an instance of the Patient class
            System.out.println("Patient Details:");
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid object. The provided object is not a Patient instance.");
        }
    }
}

public class Hospital {
    public static void main(String[] args) {
        // Creating patient objects
        Patient patient1 = new Patient(101, "John Doe", 45, "Fever");
        Patient patient2 = new Patient(102, "Jane Smith", 30, "Migraine");

        // Displaying patient details
        patient1.displayPatientDetails(patient1);
        patient2.displayPatientDetails(patient2);

        // Displaying total patients
        System.out.println("Total patients admitted: " + Patient.getTotalPatients());

        // Trying to display details with an invalid object
        String notAPatient = "This is not a patient";
        patient1.displayPatientDetails(notAPatient);
    }
}
