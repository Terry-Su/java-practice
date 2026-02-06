package string;

public class StringSplit {
    public static void main(String[] args) {
        String str1 = "a,b,c,d,e";
        String[] strs = str1.split(",");
        for (String s : strs) {
            System.out.println(s);
        };
    }
}
