package keywords;

class Book {


    private static String libraryName;


    private String title;
    private String author;
    
    private final String isbn; 


    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to set the library name
    public static void setLibraryName(String name) {
        libraryName = name;
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayBookDetails() {

    	System.out.println("**************************************");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

public class Library {
    public static void main(String[] args) {
    	// Set and display library name
        Book.setLibraryName("BridgeLabz Library");
        Book.displayLibraryName();

        // Create book objects
        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "978-0132350884");
        Book book3 = new Book("Java: The Complete Reference", "Herbert Schildt", "978-1260440232");

        // Display book information
        book1.displayBookDetails();
        book2.displayBookDetails();
        book3.displayBookDetails();
    }
}
