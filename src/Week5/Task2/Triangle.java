package Week5.Task2;

import java.util.Objects;

public class Triangle extends AssertionUtils {

    private final Point point1;
    private final Point point2;
    private final Point point3;


    public Triangle(Point point1, Point point2, Point point3) {
        assertEquals(point1);
        this.point1 = point1;
        assertEquals(point2);
        this.point2 = point2;
        assertEquals(point3);
        this.point3 = point3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return point1.equals(triangle.point1) &&
                point2.equals(triangle.point2) &&
                point3.equals(triangle.point3);
    }

    @Override
    public String
    toString() {
        return "Triangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                '}';
    }
}
