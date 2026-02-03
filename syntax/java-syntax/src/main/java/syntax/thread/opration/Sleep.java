package syntax.thread.opration;

public class Sleep {
    public static void main(String[] args) {
        Thread timerThread = new Thread(() -> {
            for (int i = 5; i > 0; i--) {
                System.out.println("倒计时: " + i);
                try {
                    Thread.sleep(1000); // 睡眠1秒
                } catch (InterruptedException e) {
                    System.out.println("计时器被中断");
                    return; // 中断后退出
                }
            }
            System.out.println("时间到！");
        });

        timerThread.start();

        // 3秒后中断计时器
        try {
            Thread.sleep(3000);
            timerThread.interrupt(); // 发送中断信号
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
