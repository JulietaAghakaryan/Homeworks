package Week5.Task3.Task2;

import Week5.Task3.Task2.Clock;

public class SlowClock implements Clock {

    private int second;
    private int minute;

    @Override
    public void start() {
        System.out.println("00:00");
        long printMillis = System.currentTimeMillis();
        while (true) {
            long delta = System.currentTimeMillis() - printMillis;
            if (delta > 2000) {
                second++;
                if (second == 60) {
                    second = 0;
                    minute++;
                }
                if (second < 10) {
                    if (minute < 10) {
                        System.out.println("0" + minute + ":" + "0" + second);
                    } else {
                        System.out.println(minute + ":0" + second);
                    }
                } else {
                    if (minute < 10) {
                        System.out.println("0" + minute + ":" + second);
                    } else {
                        System.out.println(minute + ":" + second);
                    }
                }
                printMillis = System.currentTimeMillis();

            }
        }
    }
}
