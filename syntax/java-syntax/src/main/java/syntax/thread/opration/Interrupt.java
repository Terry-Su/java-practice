package syntax.thread.opration;

public class Interrupt {
    public static void main(String[] args) {
        Thread longRunningThread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("线程正在运行...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("线程在睡眠时被中断");
                    // 中断状态被清除，需要重新设置
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("线程收到中断信号，准备退出");
        });

        longRunningThread.start();

        // 3秒后中断线程
        try {
            Thread.sleep(3000);
            longRunningThread.interrupt();
            System.out.println("已发送中断信号");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
