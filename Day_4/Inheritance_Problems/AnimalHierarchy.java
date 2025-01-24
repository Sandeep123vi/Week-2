package com.mycompany.inheritance;

class Animal {    //Attrinutes of Animal class

    public String animalName;
    public int animalAge;
    //create Constructor of Animal class 

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;

    }

    //create a method of makeSound
    void makeSound() {
        System.out.println("The sound of Animals are  :");
    }

    //Method to display animal name and age
    public void display() {
        System.out.println("Name " + animalName + " " + "Age" + animalAge);
    }

}

//create Dog class and extends Animal class to inherited  
class Dog extends Animal {

    //creae constructor and calling of Animal class Constructor
    Dog(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    //creat makesound method 
    void makeSound() {
        System.out.println("The sound of Dog is :" + "Bark");
    }

    public void displaydetails() {
        System.out.println("Name is " + animalName + " " + "and age is " + animalAge);
    }

}

class Cat extends Animal {

    public Cat(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    void makeSound() {
        System.out.println("The sound of Cat is :" + "Meow");
    }

    //create displayDetails method to display details about cat
    public void displayDetails() {
        System.out.println("Name is " + animalName + " " + "and age is " + animalAge);
    }
}
//create Bird class and extends Animal class

class Bird extends Animal {     //create constructor of Bird class and calling of Animal class costructor

    public Bird(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    void makeSound() {
        System.out.println("The sound of Bird is :" + "Chirp");
    }
    //Method to display about bird

    public void displaydetails() {
        System.out.println("Name is " + animalName + "" + "and age is " + animalAge);
    }

}
//create AnimalHierarchy as a main class 

public class AnimalHierarchy {

    public static void main(String[] args) {     // created Objects of classes
        Dog dog = new Dog("Rockey", 2);
        Cat cat = new Cat("Mew", 5);
        Bird bird = new Bird("tanu", 5);
        //calling methods of classes by using objects 
        dog.makeSound();
        dog.displaydetails();
        cat.makeSound();
        cat.displayDetails();
        bird.makeSound();
        bird.displaydetails();

    }
}
