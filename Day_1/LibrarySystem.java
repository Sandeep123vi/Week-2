
class Book {
    public String ISBN;

    protected String title; // Title of the book

    private String author; // Author of the book

    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to access the author
    public String getAuthor() {
        return author;
    }

    // Public method to modify the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    private double fileSize;

    // Constructor to initialize ebook details
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author); // Call to the superclass constructor
        this.fileSize = fileSize;
    }

    // Method to display ebook details
    @Override
    public void displayBookDetails() {
        super.displayBookDetails(); // Call to the superclass method
        System.out.println("File Size: " + fileSize + " MB");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // Create an instance of Book class
        Book book = new Book("123-456-789", "Java Programming", "Alice Johnson");

        // Display book details
        System.out.println("--- Book Details ---");
        book.displayBookDetails();

        // Update and display the author of the book
        book.setAuthor("John Doe");
        System.out.println("\nUpdated Author: " + book.getAuthor());

        // Create an instance of EBook class
        EBook eBook = new EBook("987-654-321", "Advanced Java", "Bob Smith", 2.5);

        // Display ebook details
        System.out.println("\n--- EBook Details ---");
        eBook.displayBookDetails();
    }
}
