class Vehicle {
    // Instance variables for Vehicle class
    private String ownerName;
    private String vehicleType;

    // Class variable to represent the registration fee
    private static double registrationFee = 100.00;

    // Constructor to initialize a vehicle object
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class Registration {
    public static void main(String[] args) {
        // Create instances of the Vehicle class (Objects)
        Vehicle vehicle1 = new Vehicle("Alice Johnson", "Car");
        Vehicle vehicle2 = new Vehicle("Bob Smith", "Bike");

        // Display details of each vehicle before updating the registration fee
        System.out.println("--- Vehicle Details Before Updating Registration Fee ---");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();

        // Update the registration fee for all vehicles
        Vehicle.updateRegistrationFee(150.00);

        // Display details of each vehicle after updating the registration fee
        System.out.println("\n--- Vehicle Details After Updating Registration Fee ---");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}
