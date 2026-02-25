package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOCharWriteExample {
    public static void main(String[] args) {
        String writePath = "./write-test.txt";
        try (FileWriter writer = new FileWriter(writePath)) {
            String content = "write test \nnew content";
            writer.write(content);
            System.out.println("内容已成功写入： " + content);
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
