
class Book {
    // Attributes of the Book class (Private fields for encapsulation)
    private String title; // Title of the book
    private String author; // Author of the book
    private double price; // Price of the book
    private boolean isAvailable; // Availability status of the book

    // Constructor to initialize a book object (Abstraction)
    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Getter and Setter methods to access private fields (Encapsulation)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to borrow a book
    public String borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return "You have successfully borrowed the book: " + title;
        } else {
            return "Sorry, the book '" + title + "' is currently unavailable.";
        }
    }

    // Method to return a book
    public void returnBook() {
        isAvailable = true;
    }

    // Method to display book details (Abstraction)
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}

// Main class to demonstrate the Library Book System
public class Library {
    public static void main(String[] args) {
        // Create instances of the Book class (Objects)
        Book book1 = new Book("Java Programming", "James Gosling", 499.99, true);
        Book book2 = new Book("Python Basics", "Guido van Rossum", 399.99, true);

        // Display details of the books
        System.out.println("--- Book Details ---");
        book1.displayBookDetails();
        book2.displayBookDetails();

        // Borrow books and print results (Encapsulation)
        System.out.println("\n--- Borrowing Books ---");
        System.out.println(book1.borrowBook()); // Borrow book1
        System.out.println(book1.borrowBook()); // Try borrowing book1 again

        System.out.println(book2.borrowBook()); // Borrow book2

        // Return a book and check availability
        System.out.println("\n--- Returning Books ---");
        book1.returnBook();
        System.out.println("The book '" + book1.getTitle() + "' is now returned and available: " + book1.isAvailable());

        // Display updated book details
        System.out.println("\n--- Updated Book Details ---");
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
