package Week4.Polymorphism;

public class RightTriangle implements Shape {

    private double oppositeSide;
    private double adjacentSide;

    public RightTriangle(double oppositeSide, double adjacentSide) {
        this.oppositeSide = oppositeSide;
        this.adjacentSide = adjacentSide;
    }

    @Override
    public double calculateArea() {
        return oppositeSide * adjacentSide / 2;
    }

    @Override
    public String getName() {
        return "Right Triangle";
    }
}
