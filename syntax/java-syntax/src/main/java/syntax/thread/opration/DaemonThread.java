package syntax.thread.opration;

public class DaemonThread {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
           while (true) {
               System.out.println("守护线程正在运行");
               try {
                   Thread.sleep(1000);
               }catch(InterruptedException e){
                   e.printStackTrace();
               }
           }
        });

        // 设置为守护线程
        daemonThread.setDaemon(true);
        daemonThread.start();

        // 主线程（用户线程）运行
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束，JVM退出");
    }
}
