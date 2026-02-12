package error;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ErrorExample {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("./test.txt");
            char[] buf = new char[1024];
            int length = reader.read(buf);
            System.out.println("content: " + new String(buf));
        } catch(FileNotFoundException e) {
            System.err.println("file not found error: " + e.getMessage());
        } catch(IOException e) {
            System.err.println("io error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("error: " + e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
