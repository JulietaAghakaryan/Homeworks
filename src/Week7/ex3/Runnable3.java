package Week7.ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Runnable3 {
    public static void main(String[] args) {

        File file11 = new File("file11.txt");
        File file12 = new File("file12.txt");
        String[] array = {
                "random 1", "random 2", "random 3", "random 4"
        };

        new Thread(() -> {
            PrintWriter printWriter11 = null;
            PrintWriter printWriter12 = null;
            int i = 1;
            try {
                printWriter11 = new PrintWriter(file11);
                printWriter12 = new PrintWriter(file12);

            } catch (FileNotFoundException e) {
                System.err.println("File not found");
                Thread.currentThread().interrupt();
            }

            printWriter11.println("random 1");
            printWriter11.println("random 2");
            printWriter12.println("random 3");
            printWriter12.println("random 4");

            if (printWriter11 != null) {
                printWriter11.close();
            }

            if (printWriter12 != null) {
                printWriter12.close();
            }

            try {
                Scanner scanner = new Scanner(file11);
                int lineNum = 0;
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    lineNum++;
                    for (int k = 0; k < 4; k++) {
                        if (line.equals(array[k])) {
                            System.out.println(file11 + " contains " + array[k]);
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                System.err.println("File not found");
            }

            try {
                Scanner scanner = new Scanner(file12);
                int lineNum = 0;
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    lineNum++;
                    for (int k = 0; k < 4; k++) {
                        if (line.equals(array[k])) {
                            System.out.println(file12 + " contains " + array[k]);
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                System.err.println("File not found");
            }
        }).run();
    }
}
