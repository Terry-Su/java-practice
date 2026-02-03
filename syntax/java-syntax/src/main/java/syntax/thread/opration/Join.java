package syntax.thread.opration;

/* 线程等待 */
public class Join {
    public static void main(String[] args) {
        Thread worker1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Worker 1 完成工作");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread worker2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Worker 2 完成工作");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        worker1.start();
        worker2.start();

        System.out.println("主线程等待工作线程完成...");

        try {
            // 等待worker1完成，最多等待多少毫秒
            worker1.join(5000);
            System.out.println("Worker1 join完成");

            // 等待worker2完成
            worker2.join();
            System.out.println("Worker2 join完成");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("所有工作完成，主线程继续");
    }
}
