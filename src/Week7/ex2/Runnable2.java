package Week7.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Runnable2 {


    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");
        File file4 = new File("file4.txt");
        File file5 = new File("file5.txt");
        File file6 = new File("file6.txt");
        File file7 = new File("file7.txt");
        File file8 = new File("file8.txt");
        File file9 = new File("file9.txt");
        File file10 = new File("file10.txt");

        File[] files = {file1, file2, file3, file4, file5, file6, file7, file8, file9, file10};
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                PrintWriter printWriter = null;
                int j = 1;
                try {
                    printWriter = new PrintWriter(files[i]);
                } catch (FileNotFoundException e) {
                    System.err.println("File not found");
                    Thread.currentThread().interrupt();
                }

                while (!Thread.currentThread().isInterrupted() && j <= 10000) {
                    printWriter.println("abc" + j++);
                }
                if (printWriter != null) {
                    printWriter.close();
                }
            }
        }).run();



    }
}
