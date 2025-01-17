public class StudentDetails {
    class Student {
        private String name;
        private int rollNumber;
        private int marks;

        public Student(String name, int rollNumber, int marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }

        public String calculateGrade() {
            if (marks >= 90) return "A";
            else if (marks >= 75) return "B";
            else if (marks >= 50) return "C";
            else return "F";
        }

        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + calculateGrade());
        }
    }

    public static void main(String[] args) {
        StudentDetails studentDetails = new StudentDetails();
        Student student = studentDetails.new Student("John Doe", 101, 85);
        student.displayDetails();
    }
    
}