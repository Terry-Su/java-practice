package string;

public class StringFormat {
    public static void main(String[] args) {
        System.out.printf("hello %s\n", "world");
        System.out.println(
                String.format("hello %s", "world")
        );
    }
}
