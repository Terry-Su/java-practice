package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOCharReadExample {
    public static void main(String[] args) {
        String readPath = "./read-test.txt";
        try (FileReader reader = new FileReader(readPath)) {
            char[] buffer = new char[1024]; // 字符缓冲区，减少IO次数
            int len;
            StringBuilder content = new StringBuilder();
            while ((len = reader.read(buffer)) != -1) {
                content.append(buffer, 0, len);
            }
            System.out.println("读取文件内容为： " + content);
        }
        catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Exception: "+ e.getMessage());
        }
        finally {
            System.out.println("finally");
        }
    }
}
