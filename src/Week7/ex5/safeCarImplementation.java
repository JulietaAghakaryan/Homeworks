package Week7.ex5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class safeCarImplementation implements Car {

    private final int maxNumberOfSeats = 6;
    private final String[] passengerSeats = new String[maxNumberOfSeats];
    private int number;


    @Override
    public synchronized void add(String passengerName) {
        if (number >= maxNumberOfSeats) {
            throw new IndexOutOfBoundsException("There is no more space");
        }
        System.out.println("----------------------------" + number);
        passengerSeats[number] = passengerName;
        number++;
    }

    @Override
    public synchronized void printPassengerNames() {
        for (int i = 0; i < maxNumberOfSeats; i++) {
            if (passengerSeats[i] != null) {
                System.out.println(passengerSeats[i]);
            }
        }
    }
    public static void main(String[] args) {

        safeCarImplementation carImplementation = new safeCarImplementation();
        List<Thread> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            var thread = new Thread(new Runnable() {
                int k = 0;

                @Override
                public void run() {
                    for (int j = 0; j < 4; j++) {


                        try {
                            Thread.sleep(3000);
                            carImplementation.add("passenger" + k);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        k++;
                    }
                }
            });
            list.add(thread);
        }
        for (int i = 0; i < 3; i++) {

            var thread = new Thread(new Runnable() {
                int k = 0;

                @Override
                public void run() {
                    for (int j = 0; j < 4; j++) {


                        try {
                            Thread.sleep(3000);
                            carImplementation.printPassengerNames();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        k++;
                    }
                }
            });
            list.add(thread);

        }

        Collections.shuffle(list);
        for (final Thread thread: list) {
            thread.start();
        }

    }
}
