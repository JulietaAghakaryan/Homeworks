package Week7.ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.UUID;

public class Runnable4 {
    public static void main(String[] args) {



            for (int w = 0; w < 10; w++) {

                File file = new File(String.format("file %d", w));
                final String fileName = String.format("file %d", w);
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
                        printWriter.println(UUID.randomUUID().toString() + " " + i++);
                    }

                    if (printWriter != null) {
                        printWriter.close();
                    }
                    try {
                        long count = Files.lines(Path.of(fileName)).filter(s->s.contains("ab")).count();
                        System.out.println(fileName+  " contains " + count + " ab");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }).run();
            }
    }

}
