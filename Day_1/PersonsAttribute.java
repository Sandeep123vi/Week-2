public class PersonsAttribute {
    public static void main(String[] args) {
        // Creating object of Person class
        Person men1 = new Person("Rishi", "Male", 6, 50);
        men1.displayDetails();
        System.out.println("---------------------");
        // calling copy constructor
        Person men2 = new Person(men1);
        men2.displayDetails();
    }
}

class Person {
    // Person's Attributes
    String name;
    String gender;
    int height;
    int weight;

    // Constructor
    public Person(String name, String gender, int height, int weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    // Copy Constructor
    public Person(Person same) {
        this.name = same.name;
        this.gender = same.gender;
        this.height = same.height;
        this.weight = same.weight;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }
}
