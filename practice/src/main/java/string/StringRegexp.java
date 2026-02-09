package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegexp {
    public static void main(String[] args) {
        // # 是否匹配
        System.out.println(Pattern.matches("[1-9]+","1"));

        // # 提取匹配内容
        Matcher matcher1 = Pattern.compile("[1-9]+").matcher("a1b23c456d");
        while(matcher1.find()) {
            // group()获取当前匹配内容
            String matched = matcher1.group();
            System.out.printf("%s length:%d\n", matched, matched.length());
        }

        // # 替换匹配内容
        System.out.println("hello world".replaceAll("worl\\S","ai"));
        System.out.println("hello world".replaceAll("\s",""));

        // # 分割字符串
        String str1 = "hello world";
        String[] strArr1 = str1.split("\s");
        for (String str : strArr1) {
            System.out.println(str);
        }
    }
}
