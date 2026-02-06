package string;


import org.apache.commons.lang3.StringUtils;

/*
"空" 在 String 中有两种情况：
null：变量未指向任何对象（引用为空）
空字符串：变量指向了对象，但内容为空（""）
空白字符串：变量内容只有空格 / 制表符等空白字符（" "）
* */
public class StringIfEmpty {
    public static void main(String[] args) {
        String a;
        String b = null;
        String c = "";
        String d = " ";
        String e = "    ";
//        System.out.println(String.format("a %b",a.isEmpty()));
        System.out.println(String.format("b %b",b == null));
        System.out.println(String.format("c %b",c.isEmpty()));
        System.out.println(String.format("d %b",d.isBlank()));
        System.out.println(String.format("e %b",e.isBlank()));
        System.out.println(String.format("%b %b %b %b",ifEmptyBlank(b),ifEmptyBlank(c),ifEmptyBlank(d),ifEmptyBlank(e)));
        System.out.println(String.format("%b %b %b %b", StringUtils.isEmpty(b),StringUtils.isEmpty(c),StringUtils.isBlank(d),StringUtils.isBlank(e)));
        // hasText：判断是否包含非空白的有效字符（等价于 !isBlank）
        System.out.println(String.format("%b %b %b %b",
                !org.springframework.util.StringUtils.hasText(b),
                !org.springframework.util.StringUtils.hasText(c),
                !org.springframework.util.StringUtils.hasText(d),
                !org.springframework.util.StringUtils.hasText(e)
                ));
    }

    static Boolean ifEmptyBlank(String s) {
        return s == null || s.isEmpty() || s.isBlank();
    }
    static Boolean ifEmptyBlank2(String s) {
        // strip 比 trim 更通用，支持**全角空格**
        return s == null || s.strip().isEmpty();
    }
}
