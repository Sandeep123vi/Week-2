package com.mycompany.inheritance;

class Device {
    //Attributs

    private int deviceId;
    private String status;

    //Constructor of Device class
    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    // Method to display status about device

    void displayStatus() {
        System.out.println("Devics id :" + deviceId);
        System.out.println("The status :" + status);
    }

}
//create Thermostat class extends with Device class

class Thermostat extends Device {
    //Attributes

    private int tempratureSetting;
//Constructor 

    Thermostat(int deviceId, String status, int tempratureSetting) {
        super(deviceId, status);
        this.tempratureSetting = tempratureSetting;
    }
//Method to display aboout device

    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temprature :" + tempratureSetting);
    }

}

public class SmartHomeDevice {

    public static void main(String[] args) {

        Device device = new Thermostat(122, "On", 41);
        Device device1 = new Thermostat(123, "Off", 51);
        device.displayStatus();
        device1.displayStatus();
    }
}
