package Week4.Interface;

import java.util.Scanner;

public class PaperBook implements Book {
    private int numberOfPages;
    private String author;
    private Scanner genre;

    @Override
    public void open() {
        System.out.println("The book is open");
    }

    @Override
    public void close() {
        System.out.println("The book is now closed");
    }

    @Override
    public void browsePage() {
        System.out.println("You cannot browse page");
    }
}
