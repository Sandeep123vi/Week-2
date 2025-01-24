package com.mycompany.inheritance;

class Vehicle {

    // attributes
    String model = null;
    int maxSpeed = -1;

    // constructor
    Vehicle(String model, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // default constructor
    Vehicle() {
    }

    ;

    // display
    void display() {
        System.out.println("Model is : " + model + " and max speed is : " + maxSpeed);
    }
}

// Create an interface Refuelable with a method refuel().
interface Refuelable {

    void refuel();
}

interface Chargeable {

    void charge();
}

// Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
class ElectricVehicle extends Vehicle implements Chargeable {

    @Override
    public void charge() {
        System.out.println("Charging the vehicle");
    }

    // constructor
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    void display() {
        super.display();
    }

}

// similarly we create PetrolVehicle but we change the interface
class PetrolVehicle extends Vehicle implements Refuelable {

    @Override
    public void refuel() {
        System.out.println("refuling the vehicle");
    }

    // constructor
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    void display() {
        super.display();
    }
}

public class VehicleManagementSystemWithHybridInheritance {

    public static void main(String[] args) {
        PetrolVehicle petrolVehicle1 = new PetrolVehicle("xyz", 200);
        ElectricVehicle electricVehicle1 = new ElectricVehicle("Abc", 100);

        petrolVehicle1.display();
        petrolVehicle1.refuel();

        electricVehicle1.display();
        electricVehicle1.charge();
    }

}
