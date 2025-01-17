public class MovieTicketBookingSystem {

    static class MovieTicket {
        private String movieName;
        private int seatNumber;
        private double price;

        // Constructor to initialize MovieTicket attributes
        public MovieTicket(String movieName, int seatNumber, double price) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
        }

        // Method to book a ticket
        public void bookTicket(String movieName, int seatNumber, double price) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
        }

        // Method to display ticket details
        public void displayDetails() {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
    }

    // Main method to demonstrate ticket booking and details
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("NULL", -1, 0.0); // Placeholder initialization
        ticket.bookTicket("Inception", 42, 12.50); // Book a ticket
        ticket.displayDetails(); // Display the ticket details
    }
}
