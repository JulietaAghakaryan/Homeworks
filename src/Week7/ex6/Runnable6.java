package Week7.ex6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Runnable6 {
    public static void main(String[] args) {


        List<Thread> list=new ArrayList<>();
        for (int w = 0; w < 10; w++) {

            File file = new File(String.format("files %d", w));
            final String fileName = String.format("files %d", w);
            var thread = new Thread(() -> {
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
                    long count = Files.lines(Path.of(fileName)).filter(s -> s.contains("ab")).count();
                    System.out.println(fileName + " contains " + count + " ab");
                } catch (IOException e) {
                    e.printStackTrace();
                }

            });
            list.add(thread);
        }
        for (Thread thread: list) {
            thread.start();
            try
            {
                thread.join();
            }

            catch(Exception e)
            {
                System.out.println("Exception has been" +
                        " caught" + e);
            }
        }
    }

}
