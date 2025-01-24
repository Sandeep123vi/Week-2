package com.mycompany.inheritance;

class Vehicle {

    //Vehicle Attributes
    private int maxSpeed;
    private String fuelType;

    //Default Constructor
    Vehicle() {
    }

    //Parameterized Constructor
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    //Method to display vehicle details
    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }

}

class Car extends Vehicle {

    //Car Attributes
    private int seatCapacity;

    //Car Constructor
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    //Method to display car details
    @Override
    void displayInfo() {
        System.out.println("Car Details:");
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);

    }
}

class Truck extends Vehicle {

    //Truck Attributes
    private int loadCapacity;

    //Truck Constructor
    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    //Method to display truck details
    @Override
    void displayInfo() {
        System.out.println("Truck Details:");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " Tons");

    }
}

class Motorcycle extends Vehicle {

    //Motorcycle Attributes
    private int mileage;

    //Motorcycle Constructor
    Motorcycle(int maxSpeed, String fuelType, int mileage) {
        super(maxSpeed, fuelType);
        this.mileage = mileage;
    }

    //Method to display motorcycle details
    @Override
    void displayInfo() {
        System.out.println("Motorcycle Details:");
        super.displayInfo();
        System.out.println("Mileage: " + mileage + " KMPL");

    }
}

public class VehicleTransportSystem {

    public static void main(String[] args) {
        Vehicle car = new Car(260, "Diesel", 5);
        Vehicle truck = new Truck(160, "Diesel", 500);
        Vehicle motorcycle = new Motorcycle(160, "Petrol", 65);

        //Array of Vehicle type
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = truck;
        vehicles[2] = motorcycle;

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}
