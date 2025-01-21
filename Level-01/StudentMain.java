class Student{
    // variables
    private static String universityName = "RGPV"; // static keyword
    private static int totalStudents = 0;; // final keyword

    private String name;
    private int rollNumber;
    private String grade;

    // constructors for initialization of object.
    Student(String name, int rollNumber, String grade){
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    // static method to update discount
    static void displayTotalStudents(){
        System.out.println("Total students: " + totalStudents);
    }

    // printing result
    void displayResult(){
        if(this instanceof Student) { // instanceod Keyword
            System.out.println("University name: " + universityName);
            System.out.println("Product Name: " + name);
            System.out.println("Product Roll no.: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
        else {
            System.out.println("Invalid instance of object");
        }
    }
}

public class StudentMain {
    public static void main(String[] args) {
        // object initialization
        Student student1 = new Student("Rahul", 1, "A");
        student1.displayResult();
        Student.displayTotalStudents();
    }
}
