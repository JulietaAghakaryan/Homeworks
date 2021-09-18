package Week7.ex8;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        SafeImpl<String> safe = new SafeImpl<>();
        UnsafeImpl<String> unsafe = new UnsafeImpl<>();

        List<Thread> listSafe = new ArrayList<>();
        for (int w = 0; w < 20; w++) {
            final int number = w;
            var thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 20; i++) {
                        safe.add(UUID.randomUUID().toString());
                        safe.get(number);
                        safe.getSize();
                    }

                }
            });
            listSafe.add(thread);
        }

        List<Thread> listUnsafe = new ArrayList<>();
        for (int w = 0; w < 20; w++) {
            final int number = w;
            var thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 20; i++) {
                        unsafe.add(UUID.randomUUID().toString());
                        unsafe.get(number);
                        unsafe.getSize();

                    }

                }
            });
            listUnsafe.add(thread);


        }
        for (final Thread thread: listUnsafe) {
            thread.start();
        }
    }
}


