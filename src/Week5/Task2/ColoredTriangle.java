package Week5.Task2;


import javax.swing.table.TableRowSorter;
import java.util.Objects;

public class ColoredTriangle extends Triangle {

    private Color color;


    public ColoredTriangle(Point point1, Point point2, Point point3) {
        super(point1, point2, point3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)){ return false;
        }
        if(o.getClass() == Triangle.class) return o.equals(this);

        ColoredTriangle that = (ColoredTriangle) o;
        return color == that.color;
    }

    @Override
    public String toString() {
        return "ColoredTriangle{" +
                "color=" + color +
                '}';
    }

    public static void main(String[] args) {
        Point p1=new ImmutablePoint(2,3);
        Point p2=new ImmutablePoint(4,5);
        Point p3=new ImmutablePoint(6,7);

        ColoredTriangle c1=new ColoredTriangle(p1,p2,p3);

        ColoredTriangle c2=new ColoredTriangle(p1,p2,p3);

        Triangle t1=new Triangle(p1,p2,p3);
        Triangle t2 =new Triangle(p1, p2, p2);
        assertEquals(c1);
        assertEquals(c2);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(t1 ));
        System.out.println(c1.equals(t2));
    }
}
