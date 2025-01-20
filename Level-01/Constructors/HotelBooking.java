public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = null;
        this.roomType = null;
        this.nights = 0;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking("Ayushmaan Tiwari", "Deluxe Room", 3);
        HotelBooking booking2 = new HotelBooking("Ananya Tiwari", "Standard Room", 5);

        System.out.println("Booking 1 - Guest: " + booking1.guestName + ", Room: " + booking1.roomType + ", Nights: " + booking1.nights);
        System.out.println("Booking 2 - Guest: " + booking2.guestName + ", Room: " + booking2.roomType + ", Nights: " + booking2.nights);
    }
}
