package Week4.Polymorphism;

public class CheckShape {

    public static void main(String[] args) {
        Shape square = new Square(2);
        Shape rectangle = new Rectangle(2, 3);
        Shape rightTriangle = new RightTriangle(4, 4);
        Shape circle = new Circle(3);

        System.out.println(square.calculateArea());
        System.out.println(square.getName());

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.getName());

        System.out.println(rightTriangle.calculateArea());
        System.out.println(rightTriangle.getName());

        System.out.println(circle.calculateArea());
        System.out.println(circle.getName());
    }
}
