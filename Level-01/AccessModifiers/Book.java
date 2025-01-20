public class Book {
    public static void main(String[] args) {
        // Create an instance of EBook
        EBook ebook = new EBook();

        // Set values for attributes
        ebook.ISBN = "978-3-16-148410-0";
        ebook.title = "Introduction to Java";

        // Display book details
        ebook.displayBookDetails();
    }

    // Public member for ISBN
    public String ISBN;

    // Protected member for title
    protected String title;

    // Private member for author
    private String author;

    // Public setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public getter for author
    public String getAuthor() {
        return author;
    }

    // Subclass of Book demonstrating access to public and protected members
    public static class EBook extends Book {

        public void displayBookDetails() {
            System.out.println("ISBN: " + ISBN); // Accessing public member
            System.out.println("Title: " + title); // Accessing protected member
        }
    }
}
