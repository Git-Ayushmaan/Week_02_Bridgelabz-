import java.util.ArrayList;
import java.util.List;

class Students{
    private int rollNumber;
    private String name;
    private List<Courses> enrollInCourse;

    public Students(int rollNumber,String name){
        this.rollNumber=rollNumber;
        this.name=name;
        this.enrollInCourse=new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    //Adding Courses
    public void enrollInCourse(Courses course){
        enrollInCourse.add(course);
    }

    //Display all courses
    public void showAllCourses(){
        System.out.println(name +"All Courses: ");
        for(Courses  course : enrollInCourse){
            System.out.println(course.getCourseName());
        }
    }
}


class Professor{
    private String name;
    private int id;
    private List<Courses> assignedCourses;

    public Professor(String name, int id) {
        this.name = name;
        this.id = id;
        this.assignedCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void assignCourse(Courses course) {
        assignedCourses.add(course);
        course.assignProfessor(this);
    }

    public void displayCourses() {
        System.out.println(name + " is teaching the following courses:");
        for (Courses course : assignedCourses) {
            System.out.println(course.getCourseName());
        }
    }
}

class Courses{
    private String courseName;
    private int courseCode;
    private Professor professor;
    private List<Student> enrolledStudents;

    public Courses(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void assignProfessor(Professor professor) {

        this.professor = professor;
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void displayDetails() {
        System.out.println("Course: " + courseName + " (Code: " + courseCode + ")");
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }
}


public class UniversityManagementSystem {
    public static void main(String[] args) {
        Students student1 = new Students(101, "anki");
        Students student2 = new Students(102, "rahul");

        // Creating Professors
        Professor professor1 = new Professor("Dr. Smith", 201);
        Professor professor2 = new Professor("Dr. Johnson", 202);

        // Creating Courses
        Courses course1 = new Courses("Computer Science", 301);
        Courses course2 = new Courses("Mathematics", 302);

        // Assign Professors to Courses
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        // Enroll Students in Courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // Displaying Student Course Information
        student1.showAllCourses();
        student2.showAllCourses();

        // Displaying Professor Course Information
        professor1.displayCourses();
        professor2.displayCourses();

        // Displaying Course Details
        course1.displayDetails();
        course2.displayDetails();
    }
}
