package Week5.Task2;

import java.util.Objects;

public class ImmutablePoint implements Point {

    private final double x;
    private final double y;

    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ImmutablePoint(ImmutablePoint point) {
        this.x = point.x;
        this.y = point.y;
    }


    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    public Point shiftLeft() {
        return new ImmutablePoint(new ImmutablePoint(x - 1, y));
    }

    public Point shiftRight() {
        return new ImmutablePoint(new ImmutablePoint(x + 1, y));
    }

    public Point shiftUp() {
        return new ImmutablePoint(new ImmutablePoint(x, y + 1));
    }

    public Point shiftDown() {
        return new ImmutablePoint(new ImmutablePoint(x, y - 1));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ImmutablePoint)) return false;
        ImmutablePoint that = (ImmutablePoint) o;
        return x == that.x && y == that.y;
    }

    @Override
    public String
    toString() {
        return "ImmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
