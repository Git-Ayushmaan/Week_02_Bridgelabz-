class Vehicle{
    // static variable and method
    static int registrationFee = 1000;
    static void updateRegistrationFee(int newFee){
        registrationFee = newFee;
    }

    // variable for initialization
    private String ownerName;
    private String vehicleType;
    private final int registrationNumber;

    // constructor for variable initialization
    public Vehicle(String ownerName, String vehicleType, int registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // displaying result
    void displayResult() {
        if (this instanceof Vehicle) { // checking if the object belongs to the class
            System.out.println("Vehicle details");
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        }
        else {
            System.out.println("Invalid object.");
        }
    }
}

public class VehicleRegistrationMain {
    public static void main(String[] args) {
        // creating an object for the class 
        Vehicle vehicle1 = new Vehicle("Ram", "Car", 12345);
        vehicle1.displayResult(); 
        System.out.println();
        Vehicle.updateRegistrationFee(2000); // updating the static variable
        vehicle1.displayResult(); // printing result
    }
}
