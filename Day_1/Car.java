class CarRental {
    // Attributes of the CarRental class
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Constructor to initialize a car rental object
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Getter and Setter methods
    public String getCustomerName() {
        return customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    // Method to calculate the total rental cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate; // Total cost is days multiplied by the daily rate
    }

    // Method to display rental details (Abstraction)
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}

public class Car {
    public static void main(String[] args) {
        // Create instances of the CarRental class (Objects)
        CarRental rental1 = new CarRental("Alice Johnson", "Toyota Camry", 5, 50.0);
        CarRental rental2 = new CarRental("Bob Smith", "Honda Civic", 3, 40.0);

        // Display details of the car rentals
        System.out.println("--- Rental Details ---");
        rental1.displayRentalDetails();
        System.out.println();
        rental2.displayRentalDetails();
    }
}
