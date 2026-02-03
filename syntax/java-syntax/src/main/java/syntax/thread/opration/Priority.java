package syntax.thread.opration;

public class Priority {
    public static void main(String[] args) {
        // 优先级示例
        Thread highPriority = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("高优先级线程: " + i);
            }
        });
        highPriority.setPriority(Thread.MAX_PRIORITY); // 10


        Thread lowPriority = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("低优先级线程: " + i);
            }
        });
        lowPriority.setPriority(Thread.MIN_PRIORITY);  // 1

        highPriority.start();
        lowPriority.start();

        System.out.println("高优先级: " + highPriority.getPriority());
        System.out.println("低优先级: " + lowPriority.getPriority());
        System.out.println("主线程优先级: " + Thread.currentThread().getPriority());

        // 主线程结束，守护线程会自动终止
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束");
    }
}
