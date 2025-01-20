public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental() {
        this.customerName = null;
        this.carModel = null;
        this.rentalDays = 0;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * 50.0;
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Ayushmaan Tiwari", "Toyota Fortuner", 5); // Example usage
        double totalCost = rental.calculateTotalCost();
        System.out.println("Customer: " + rental.customerName);
        System.out.println("Car Model: " + rental.carModel);
        System.out.println("Rental Days: " + rental.rentalDays);
        System.out.println("Total Cost: $" + totalCost);
    }
}

