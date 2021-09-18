package Week7.ex7;

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

public class Runnable7 {
        private int counter =500;

        public synchronized int getCounter() {
            return counter;
        }


        public synchronized void increment() {
            this.counter++;
        }


    public static void main(String[] args) {

        Runnable7 number = new Runnable7();
        List<Thread> list=new ArrayList<>();
        for (int w = 0; w < 100; w++) {
            var thread = new Thread(() -> {
               number.increment();

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
        System.out.println(number.getCounter());
    }

}
