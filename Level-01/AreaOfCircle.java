
public class AreaOfCircle {

    private double radius;

    public AreaOfCircle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayProperties() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
    public static void main(String[] args) {
        AreaOfCircle circle = new AreaOfCircle(5.0); // Example radius
        circle.displayProperties();
    }
}
