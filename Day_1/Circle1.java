public class Circle1 {
    public static void main(String[] args) {
        // create an object for Circle class
        Circle circle = new Circle();
        Circle circle1 = new Circle(4);

    }
}

class Circle {
    // Attributes
    private int radius;

    // Default constructor for default value
    public Circle() {
        radius = radius;
        System.out.println("Default value for radius is :" + radius);
    }

    // Parameterized constructor for user provided value
    public Circle(int radius) {
        this.radius = radius;
        System.out.println("user provide value for radius is :" + radius);
    }

}