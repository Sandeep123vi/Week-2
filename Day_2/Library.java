public class Library {
    public static void main(String[] args) {
        Book library = new Book("c++", "jordan", 002);
        if (library instanceof Book) {
            System.out.println("library is an instance of Book class");
        }
        Book.displayLibraryName();
        library.displayDetails();
    }
}

class Book {

    static String libraryName = "Keep Learning";
    String title;
    String author;
    final int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayDetails() {
        System.out.println("The title is :" + title);
        System.out.println("The author is:" + author);
        System.out.println("The isbn is :" + isbn);

    }

    public static void displayLibraryName() {
        System.out.println("Library name is :" + libraryName);
    }

}