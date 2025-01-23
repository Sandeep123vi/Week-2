package selfproblems;

import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private List<Doctor> doctors;
    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this); //Establish bidirectional association
        }
    }
    public List<Doctor> getDoctors() {
        return doctors;
    }
}
class Doctor {
    private String name;
    private List<Patient> patients;
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); //Establish bidirectional association
        }
    }
    public void consult(Patient patient) {
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
    }
    public List<Patient> getPatients() {
        return patients;
    }
}
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }
    public void displayDetails() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName());
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println(patient.getName());
        }
    }
}

public class HospitalDoctorsPatients{
    public static void main(String[] args) {
        //Create doctors
        Doctor doctor1 = new Doctor("Rakesh");
        Doctor doctor2 = new Doctor("Hemant");

        //Create patients
        Patient patient1 = new Patient("Raju");
        Patient patient2 = new Patient("Shyam");

        //Establish consultations
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient1);

        //Perform consultations
        doctor1.consult(patient1);
        doctor2.consult(patient1);

        //Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        //Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        //Display hospital details
        hospital.displayDetails();
    }
}

