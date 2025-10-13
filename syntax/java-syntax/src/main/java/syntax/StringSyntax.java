package syntax;

import java.util.Arrays;

public class StringSyntax {
    public static void main(String[] args) {
        // # 创建字符串
        String str1 = "Hello";  // 字符串常量池
        String str2 = new String("Hello");  // 堆中新建对象
        String str3 = "Hello";

        System.out.println(str1 == str2);         // false（不同对象）
        System.out.println(str1 == str3);         // true（同一常量）
        System.out.println(str1.equals(str2));    // true（内容相同）



        // # 常用方法
        String text = "Hello World Java";
        System.out.println("长度：" + text.length());
        System.out.println("转大写：" + text.toUpperCase());
        System.out.println("转小写：" + text.toLowerCase());
        System.out.println("截取：" + text.substring(0, 1));
        System.out.println("替换：" + text.replace("Java", "Python"));
        System.out.println("分割：" + Arrays.toString(text.split(" ")));
        System.out.println("包含：" + text.contains("World"));
        System.out.println("索引：" + text.indexOf("Java"));
        System.out.println("去除前后空格：" + " hello ".trim());

        // ## 字符串连接
        String result = str1.concat(" ").concat("World");
        System.out.println("字符串拼接：" + result);

        // 格式化
        String formatted = String.format("姓名：%s, 年龄：%d", "Alice", 25);
        System.out.println("格式化：" + formatted);
    }
}
