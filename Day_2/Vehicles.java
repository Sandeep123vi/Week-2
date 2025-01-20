class Vehicle {

    private static double registrationFee = 1000.0;

    // Instance variables
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor to initialize vehicle details
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

    // Method to display vehicle details
    public void displayVehicleDetails(Object obj) {
        if (obj instanceof Vehicle) { // Check if the object is an instance of the Vehicle class
            System.out.println("Vehicle Registration Details:");
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid object. The provided object is not a Vehicle instance.");
        }
    }
}

public class Vehicles {
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("MH12AB1234", "John Doe", "Car");
        Vehicle vehicle2 = new Vehicle("KA05CD5678", "Jane Smith", "Bike");

        // Displaying vehicle details
        vehicle1.displayVehicleDetails(vehicle1);
        vehicle2.displayVehicleDetails(vehicle2);

        // Updating the registration fee
        Vehicle.updateRegistrationFee(1500.0);

        // Displaying updated details
        vehicle1.displayVehicleDetails(vehicle1);

        // Trying to display details with an invalid object
        String notAVehicle = "This is not a vehicle";
        vehicle1.displayVehicleDetails(notAVehicle);
    }
}
