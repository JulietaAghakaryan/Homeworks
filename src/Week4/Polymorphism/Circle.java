package Week4.Polymorphism;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
