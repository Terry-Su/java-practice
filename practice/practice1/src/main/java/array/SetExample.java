package array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // #创建
        Set<String> s1 = new HashSet<>();

        // #添加元素
        s1.add("foo");
        s1.add("bar");
        s1.add("zoo");
        s1.add(null);

        // #获取个数
        System.out.println("size: " + s1.size());

        // #判断元素是否存在
        System.out.printf("contain foo:%b\n",s1.contains("foo"));
        System.out.printf("contain foo1:%b\n",s1.contains("foo1"));

        // #删除元素
        System.out.println("before delete: " + s1);
        s1.remove(null);
        s1.remove("zoo");
        s1.remove("zoo1");
        System.out.println("after delete: " + s1);


        // #遍历
        // ##方式1-for循环（最常用）
        for (String item: s1) {
            System.out.println(item);
        }
        // ##方式2-迭代器
        Iterator<String> it = s1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // ##方式3-forEach方法
        s1.forEach(item -> System.out.println(item));
        s1.forEach(System.out::println);

        // #清空集合
        s1.clear();
        System.out.println("after clear: " + s1);


    }
}
