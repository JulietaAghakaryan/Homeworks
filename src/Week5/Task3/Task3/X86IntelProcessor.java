package Week5.Task3.Task3;

import java.util.ArrayList;

public class X86IntelProcessor implements Processor {

    @Override
    public void calculateBinary(long decimal) {
        long printMillis = System.currentTimeMillis();
        while (true) {
            long delta = System.currentTimeMillis() - printMillis;

            if (delta > 4000) {
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

    public static void main(String[] args) {
        X86IntelProcessor x = new X86IntelProcessor();
        x.calculateBinary(25);
        X8664IntelProcessor x1 = new X8664IntelProcessor();
        ArmProcessor a = new ArmProcessor();
        x1.calculateBinary(884);
        a.calculateBinary(721);
    }
}
