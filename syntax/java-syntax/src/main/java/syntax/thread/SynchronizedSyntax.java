package syntax.thread;
import lombok.*;

import java.util.ArrayList;



public class SynchronizedSyntax {
    @Getter
    static class Counter {
        private int count = 0;
        public void increment() {
            count++;
        }
        public int getCount() {
            return count;
        }
    }

    @Getter
    static class Counter2 extends Counter {
        private int count = 0;
        public synchronized void increment() {
            count++;
        }
        public int getCount() {
            return count;
        }
    }

    private static void exampleCommon(Counter counter) {
        ArrayList<Thread> threadList = new ArrayList<Thread>();
        for (int i = 0; i < 1000; i++) {
            Thread t1 = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
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
            System.out.println(counter.getCount()); //小于预期值
        }
    }

    private static void conflictExample() {
        Counter counter = new Counter();
        exampleCommon(counter);
    }

    private static void nonConflictExample() {
        Counter counter2 = new Counter2();
        exampleCommon(counter2);
    }

    public static void main(String[] args) {
        //小于预期值
        conflictExample();
        // 等于预期值
        nonConflictExample();
    }
}
