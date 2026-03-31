package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class IOStreamExample {
    public static void main(String[] args) {
        String sourcePath = "./test-pic.png";
        String targetPath = "./test-pic-copy.png";

        long startTime = System.currentTimeMillis();

        try (
                FileInputStream fis = new FileInputStream(sourcePath);
                FileOutputStream fos = new FileOutputStream(targetPath);
                ) {
            byte[] buffer = new byte[4096]; // 4kb缓冲区（推荐大小，平衡性能和内存）
            int len;

            // 循环读取并写入
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer,0,len);
            }

            long endTime = System.currentTimeMillis();
            System.out.println("文件复制完成！");
            System.out.println("耗时: " + (endTime - startTime) + "毫秒");
        } catch (Exception e) {
            System.err.println("文件复制失败: " + e.getMessage());
        }
        finally {
            System.out.println("finally");
        }
    }
}
