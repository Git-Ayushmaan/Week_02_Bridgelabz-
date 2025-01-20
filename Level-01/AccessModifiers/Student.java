public class Student {
    // Attributes
    public int rollNumber; // Public
    protected String name; // Protected
    private double CGPA; // Private

    // Public getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public setter for CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

// Subclass demonstrating use of protected member
class PostgraduateStudent extends Student {
    public void displayStudentName() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        // Create an instance of PostgraduateStudent
        PostgraduateStudent student = new PostgraduateStudent();

        // Set values for attributes
        student.rollNumber = 101;
        student.name = "Alice";
        student.setCGPA(3.8);

        // Display student details
        student.displayStudentName();
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("CGPA: " + student.getCGPA());
    }

}
