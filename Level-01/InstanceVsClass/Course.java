public class Course {
    private String courseName;
    private int courseDuration;
    private static int totalCourses = 0;

    public Course(String courseName, int courseDuration) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        totalCourses++;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + courseDuration + " weeks");
    }

    public static void displayTotalCourses() {
        System.out.println("Total Courses: " + totalCourses);
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 10);
        Course course2 = new Course("Data Structures", 8);

        course1.displayCourseDetails();
        course2.displayCourseDetails();
        Course.displayTotalCourses();
    }
}
