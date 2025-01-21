class Patient {
    // Static variable and method
    static String hospitalName = "ABC Hospital";
    private static int totalPatient = 1;
    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatient);
    }

    // patient details variables
    private String name;
    private int age;
    private String ailment;

    private final int patientID; // final keyword

    // constructor for initialization of object
    public Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = totalPatient++;
    }

    // method for displaying patient details
    void displayDetails() {
        System.out.println("Patient Details");
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        // object initialization
        Patient patient1 = new Patient("Shyam", 25, "Fever");
        patient1.displayDetails();
    }
}
