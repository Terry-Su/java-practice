package syntax;

public class ThreadSyntax {
    public static void main(String[] args) {
        System.out.println("主线程开始执行");
        InheritThread inheritThread = new InheritThread("线程A");
        Thread runnableThread = new Thread(new MyRunnable("线程B"), "MyRunnableThread");
        Thread lamdaThread = new Thread(() -> {
            String threadName = "Lamda线程";
            for (int i = 0; i<3;i++) {
                System.out.println(String.format("%s 执行: %d",threadName, i));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "LamdaThread");

        inheritThread.start();
        runnableThread.start();
        lamdaThread.start();

        System.out.println("主线程继续执行");

        // 等待所有线程执行完
        try {
            inheritThread.join();
            runnableThread.join();
            lamdaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("所有线程执行完成，主线程结束");
    }
}

class InheritThread extends Thread {
    private String threadName;

    public InheritThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 0; i<3;i++) {
            System.out.println(String.format("%s 执行: %d",threadName, i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " 被中断");
            }
        }
        System.out.println(threadName + "执行完成");
    }
}

class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i<3;i++) {
            System.out.println(String.format("%s 执行: %d",threadName, i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " 被中断");
            }
        }
    }
}