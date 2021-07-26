package Week4.StaticFields;

import com.sun.security.jgss.GSSUtil;

public class Laptop {
    public String str;
    public Boolean bool;
    static int numberOfPublicObjects;
    static double numberOfProtectedObjects;

    public Laptop(String str) {
        numberOfPublicObjects++;
    }


    protected Laptop(Boolean bool) {
        numberOfProtectedObjects++;

    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("hey");
        Laptop l2 = new Laptop("hello");
        Laptop l3 = new Laptop(false);
        System.out.println(numberOfPublicObjects);
        System.out.println(numberOfProtectedObjects);
    }

}
