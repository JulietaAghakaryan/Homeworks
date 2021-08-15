package Week5.Task3.Task3;

public class ArmProcessor implements Processor {

    @Override
    public void calculateBinary(long decimal) {
        long printMillis = System.currentTimeMillis();
        while (true) {
            long delta = System.currentTimeMillis() - printMillis;

            if (delta > 1000) {
                for (long i = 1 << 10; i > 0; i = i / 2) {
                    if ((decimal & i) != 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
                break;
            }
        }

        System.out.println("");
    }
}
