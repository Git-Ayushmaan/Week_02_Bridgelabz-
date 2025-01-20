class Circle {
    private double radius;

    public Circle() {
        this(1.0); // Default radius is set to 1.0
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(); // Create instance with default radius
        System.out.println("Circle radius: " + circle.radius); // Display radius

        Circle circle2 =  new Circle(20.0);
        System.out.println("Circle radius: " + circle2.radius);
    }
}