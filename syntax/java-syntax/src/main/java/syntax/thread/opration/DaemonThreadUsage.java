package syntax.thread.opration;

// 定时监控任务
public class DaemonThreadUsage {
    public static void main(String[] args) {
        // 创建内存监控守护线程
        Thread memoryMonitor = new Thread(() -> {
            while (true) {
                Runtime runtime = Runtime.getRuntime();
                long usedMemory = runtime.totalMemory() - runtime.freeMemory();
                long maxMemory = runtime.maxMemory();

                System.out.printf("内存使用: %.2fMB/%.2fMB%n",
                        usedMemory / (1024.0 * 1024.0),
                        maxMemory / (1024.0 * 1024.0));

                try {
                    Thread.sleep(5000); // 每5秒检查一次
                } catch (InterruptedException e) {
                    System.out.println("监控线程被中断");
                    break;
                }
            }
        });

        memoryMonitor.setDaemon(true);
        memoryMonitor.start();

        // 模拟主程序工作
        for (int i = 0; i < 10; i++) {
            System.out.println("主程序工作: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("主程序结束");
    }
}
