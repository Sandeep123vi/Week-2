package com.mycompany.inheritance;

// Define a superclass Person with attributes like name and id.
class Person {

    // attributes
    String name;
    int id;

    // constructor
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // default constructor
    Person() {
    }

    ;

    // display function
    void display() {
        System.out.println("Name of the person is : " + name + " id is : " + id);
    }

}

// Create an interface Worker with a method performDuties().
interface Worker {

    void performDuties();
}

// Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
class Chef extends Person implements Worker {

    @Override
    public void performDuties() {
        System.out.println("Working on making food");
    }
    // constructor

    Chef(String name, int id) {
        super(name, id);
    }

    // invoking superClass display
    void display() {
        super.display();
    }

}

// similarly to chef class we can make waiter class
class Waiter extends Person implements Worker {

    @Override
    public void performDuties() {
        System.out.println("Serving food");
    }

    // constructor
    Waiter(String name, int id) {
        super(name, id);
    }

    // calling super display
    void display() {
        super.display();
    }
}

public class RestaurantManagementSystemWithHybridInheritance {

    public static void main(String[] args) {
        Chef chef1 = new Chef("Rahul", 9574);

        Waiter waiter1 = new Waiter("abcd", 9572);

        chef1.display();
        chef1.performDuties();

        waiter1.display();
        waiter1.performDuties();
    }
}
