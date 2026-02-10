package array;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // #创建
        Map<Integer, Integer> m = new HashMap<>();
        Map<Integer, Integer> emptyMap = new HashMap<>();

        // #添加元素
        m.put(0, 100);
        m.put(2, 200);

        System.out.println("m: " + m);

        // #取值
        Integer get1 = m.get(0);
        Integer get2 = m.get(100);
        Integer get3 = m.getOrDefault(100, 100);
        System.out.printf("get1:%d, get2:%d, get3:%d\n",get1, get2, get3);

        // #遍历
        // ##方式1：遍历key
        for (Integer num: m.keySet()) {
            System.out.printf("key:%d value:%d\n", num,m.get(num));
        }
        // ##方式2：遍历entry（推荐，效率高）
        for (Map.Entry<Integer, Integer>entry: m.entrySet()) {
            System.out.printf("entry key:%d entry value:%d\n", entry.getKey(),entry.getValue());
        }
        // ##方式3: lambda遍历
        m.forEach((k,v) -> System.out.printf("%d: %d\n",k,v));

        // #判断包含key
        System.out.printf("has key 0:%b  has key 100:%b  whether empty1:%b,whether empty2:%b\n", m.containsKey(0), m.containsKey(100), m.isEmpty(), emptyMap.isEmpty());

        // #删除元素
        m.remove(0);
        System.out.println(m);

    }
}
