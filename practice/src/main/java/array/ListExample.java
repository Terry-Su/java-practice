package array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {
        // #创建
        List<Integer> numList = new ArrayList<>();
        numList.add(100);
        numList.add(200);

        List<Integer> emptyList = new ArrayList<>();

        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");


        // #插入元素
        numList.add(1, 150);
        System.out.println("numList: " + numList);

        System.out.println("size:" + numList.size());


        // #遍历
        // ##方式1
        for (int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));
        }
        // ##方式2
        for(Integer num : numList){
            System.out.println(num);
        }
        // ##lambda表达式
        numList.forEach(num -> System.out.println(num));

        // #过滤/转换
        List<String> newStrList = strList.stream()
                .filter(str -> str.startsWith("H"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("newStrList: " + newStrList);

        // #判空
        System.out.printf("whether empty:%b\n", numList.isEmpty());
        System.out.printf("whether empty:%b\n", emptyList.isEmpty());

        // #删除元素
        numList.remove(1);
        System.out.println("after remove " + numList);

        strList.remove("Hello");
        System.out.println("after remove " + strList);

    }
}
