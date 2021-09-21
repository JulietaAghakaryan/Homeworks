package Week7.ex10;

import java.util.Random;

public class Runnable10 {

    public static void main(String[] args) {
        Random random = new Random();
        Cartesian xy = new Cartesian();
        int[] arr ={1, -1};

        var thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    int a = arr[random.nextInt(2)];
                    xy.setXY(a,a);
                    xy.getXY();
                }

            }

        });
        var thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    int a = arr[random.nextInt(2)];
                    xy.setXY(a,a);
                    xy.getXY();
                }
            }
        });

            thread.start();
            thread2.start();

    }
}
