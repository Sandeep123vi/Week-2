public class Book1{

    public static void main(String[] args) {
        // create an object of Book class
        Book book = new Book();// Calling default constructor
        // calling for parameterized constructor
        Book book1 = new Book("C++", "Astha", 250);

    }

}

class Book {
    // Attributes
    private String title;
    private String author;
    private int price;

    // create a default constructor
    public Book() {
        title = "Rich dad Poor dad";
        author = "Robert";
        price = 250;
        System.out.println("The default constructor is called...");
    }

    // Parameterized constructor to initilize object
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("The parameterized constructor is called...");

    }
}
