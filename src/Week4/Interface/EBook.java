package Week4.Interface;

import java.util.Scanner;

public class EBook implements Book {
    private double mb;
    private String author;
    private String genre;

    @Override
    public void open() {
        System.out.println("You have opened the book in your gadget");
    }

    @Override
    public void close() {
        System.out.println("You have closed the book in your gadget");
    }

    @Override
    public void browsePage() {
        System.out.println("Which page do you want?");
    }
}
