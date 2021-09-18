package Week7.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Runnable1 {

    public static void main(String[] args) {
        File file = new File("file");
        new Thread(() -> {
            PrintWriter printWriter = null;
            int i = 1;
            try {
                printWriter = new PrintWriter(file);
            } catch (FileNotFoundException e) {
                System.err.println("File not found");
                Thread.currentThread().interrupt();
            }

            while (!Thread.currentThread().isInterrupted() && i <= 10000) {
                printWriter.println("abc" + i++);
            }
            if (printWriter != null) {
                printWriter.close();
            }
        }).run();
    }
}
