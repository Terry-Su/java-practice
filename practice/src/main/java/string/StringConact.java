package string;

public class StringConact {
    public static void main(String[] args) {
        String a = "hello";
        String b = "ai";
        int c = 100;

        // 加号拼接 （ String 是不可变对象，这意味着每次拼接本质上都是创建新对象）
        System.out.println(a + " " + b + " " + c);

        // StringBuilder（推荐，适合大量 / 循环拼接，StringBuilder 是可变字符序列，专门用于高效拼接字符串，非线程安全（性能更高），是日常开发的首选）
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(" ");
        sb.append(b);
        sb.append(" ");
        sb.append(c);
        System.out.println(sb.toString());

        // StringBuffer（线程安全版 StringBuilder）
        // 与 StringBuilder 功能几乎一致，但所有方法都加了 synchronized，保证线程安全，性能略低
        StringBuffer sbu = new StringBuffer();
        sbu.append(a);
        sbu.append(" ");
        sbu.append(b);
        sbu.append(" ");
        sbu.append(c);
        System.out.println(sbu.toString());



    }
}