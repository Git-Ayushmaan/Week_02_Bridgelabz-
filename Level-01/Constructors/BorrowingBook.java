public class BorrowingBook {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    public BorrowingBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public boolean borrowBook() {
        if (availability) {
            availability = false; // Mark as borrowed
            return true; // Successful borrowing
        }
        return false; // Book is not av ailable
    }

    public static void main(String[] args) {
        BorrowingBook book = new BorrowingBook("Godan", "Munsi Premchand", 485.0, true);
        System.out.println("Before borrowing, availability: " + book.availability);
        boolean borrowed = book.borrowBook();
        System.out.println("Borrowed: " + borrowed);
        System.out.println("After borrowing, availability: " + book.availability);
    }
}
