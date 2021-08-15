package Week5.Task3.Task2;

import Week5.Task2.ColoredTriangle;
import Week5.Task2.ImmutablePoint;
import Week5.Task2.Point;
import Week5.Task3.Task1.User;
import Week5.Task3.Task1.UserGroup;


public class Printer {
    static void specialPrinter(Object obj) {
        System.out.println("****************************");
        System.out.println("[ " + obj.toString() + " ]");
        System.out.println("****************************");
    }


    public static void main(String[] args) {
        User user1 = new User("Aasd", "asds", "sdxcds", "dsd");
        User user2 = new User("Aasd", "asds", "sdxcds", "dsd");
        UserGroup users = new UserGroup();
        users.addUser(user1);
        users.addUser(user2);

        ImmutablePoint p1 = new ImmutablePoint(2, 3);
        ImmutablePoint p2 = new ImmutablePoint(1, 3);
        ImmutablePoint p3 = new ImmutablePoint(2, 6);
        Point p4 = new ImmutablePoint(4, 5);
        ColoredTriangle c = new ColoredTriangle(p1, p2, p3);

        specialPrinter(user1);
    }
}
