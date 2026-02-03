package syntax.thread;

import java.util.ArrayList;
import lombok.*;


public class SynchronizedSyntax3 {
    @Getter
    static class Counter {
        private static int count = 0;
        public static void increment() {
            count++;
        }
        public static int getCount() {
            return count;
        }
    }

    @Getter
    static class Counter2 extends Counter{
        private static int count = 0;
        private static Object countLock = new Object();
        public static void increment() {
            synchronized (countLock) {
                count++;
            }
        }
        public static int getCount() {
            synchronized (countLock) {
                return count;
            }
        }
    }

    private static void exampleCommon(Boolean useSynchronized) {
        ArrayList<Thread> threadList = new ArrayList<Thread>();
        for (int i = 0; i < 1000; i++) {
            Thread t1 = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    if (!useSynchronized) {
                        Counter.increment();
                    }else {
                        Counter2.increment();
                    }

                }
            }, "t1");
            threadList.add(t1);
        }
        for (Thread t:threadList) {
            t.start();
        }
        try {
            for (Thread t:threadList) {
                t.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (!useSynchronized) {
                System.out.println(Counter.getCount());
            }else {
                System.out.println(Counter2.getCount());
            }
        }
    }

    private static void conflictExample() {
        Counter counter = new Counter();
        exampleCommon(false);
    }

    private static void nonConflictExample() {
        exampleCommon(true);
    }

    public static void main(String[] args) {
        //小于预期值
        conflictExample();
        // 等于预期值
        nonConflictExample();
    }
}
