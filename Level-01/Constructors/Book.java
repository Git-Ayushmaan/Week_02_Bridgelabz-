class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = null;
        this.author = null;
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book book = new Book("Do Bailo Ki Katha", "Munsi Premchand", 9.99);
        System.out.println("Title: " + book.title + ", Author: " + book.author + ", Price: $" + book.price);
    }
}