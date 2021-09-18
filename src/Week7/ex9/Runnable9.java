package Week7.ex9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import java.util.Scanner;

public class Runnable9 {
    public static void main(String[] args) throws InterruptedException {
        File file = new File("fileBinary");
        Random random= new Random();
        var thread = new Thread(() -> {
            PrintWriter printWriter = null;
            int i = 0;
            try {
                printWriter = new PrintWriter(file);
            } catch (FileNotFoundException e) {
                System.err.println("File not found");
                Thread.currentThread().interrupt();
            }

            while (!Thread.currentThread().isInterrupted() && i <= 1) {
                int a= random.nextInt(20);
                System.out.println(a);
                printWriter.println(Integer.toBinaryString(a));
                i++;
            }

            if (printWriter != null) {
                printWriter.close();
            }

        });

        thread.start();

        BufferedReader reader;
        int number=0;
        for(int i=0; i<=1; i++) {

            try {
                reader = new BufferedReader(new FileReader(
                        "fileBinary"));
                String line = reader.readLine();
                while (line != null) {

                    line = reader.readLine();

                    if(line!=null) {
                        int decimal = Integer.parseInt(line, 10);
                        number += decimal;
                    }

                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        PrintWriter p=null;
        try {
            p = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            Thread.currentThread().interrupt();
        }
        p.println((Integer.toBinaryString(number)));
        p.close();
        Thread.sleep(1000);

    }
}
