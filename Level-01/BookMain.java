class Book{
    private String title;
    private String author;
    private final String isbn; // final variable

    // Static variable 
    static String libraryName = "My Library";
    // static method
    static void displayLibraryName(){
        System.out.println("Library Name: " + libraryName);
    }

    // constructor 
    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    // Instanceof
    public void displayDetails(){
        if(this instanceof Book){
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
        else {
            System.out.println("Invalid instance of object");
        }
    }
}

public class BookMain {
    public static void main(String[] args) {
        Book.displayLibraryName(); // displaying library name
        // object calling
        Book book1 = new Book("Book1", "Author1", "1234567890");
        book1.displayDetails(); // displaying detail
    }
}
