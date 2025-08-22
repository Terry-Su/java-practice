import java.io.*;


public class main {
    public static void main(String[] args) {

    }

    void history1() {
        FileReader reader = null;
        try {
            // 可能抛出 FileNotFoundException (检查型异常)
            reader = new FileReader("./test1");
            char[] buffer = new char[1024];
            int length = reader.read(buffer);
            System.out.println("读取内容: " + new String(buffer, 0, length));

        } catch (FileNotFoundException e) {
            // 文件未找到异常
            System.err.println("错误：文件未找到 - " + e.getMessage());

        } catch (IOException e) {
            // 输入输出异常
            System.err.println("错误：读取文件时发生IO异常 - " + e.getMessage());

        } catch (Exception e) {
            // 捕获其他所有异常
            System.err.println("错误：发生未知异常 - " + e.getMessage());

        } finally {
            // 无论是否发生异常，都会执行 finally 块
            System.out.println("执行finally块...");

            // 关闭资源
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("文件已关闭");
                } catch (IOException e) {
                    System.err.println("关闭文件时发生错误: " + e.getMessage());
                }
            }
        }
    }
}


