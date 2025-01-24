package com.mycompany.inheritance;

class Book {

    //Attributes
    private String title;
    private int publicationYear;
    // Constructor of Book class 

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    // Method to display  details about Book 

    void display() {
        System.out.println("Title :" + title);
        System.out.println("Publication Year :" + publicationYear);

    }
}
// create class Author extends Book

class Author extends Book {
    // Attributes of class

    private String name;
    private String bio;
    //Method to display details about Author

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.bio = bio;
        this.name = name;
    }

    void display() {
        super.display();//callling of superclass method
        System.out.println("Name :" + name);
        System.out.println("Bio:" + bio);

    }

}

public class LibraryManagementWithBooksAndAuthors {

    public static void main(String[] args) {
        Book book = new Author("c++", 2021, "Sandeep", "writter");
        book.display();

    }

}
